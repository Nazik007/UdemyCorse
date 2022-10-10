package MovieStore.Models;

import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies = new ArrayList<>();

    public Store () {
        this.movies = new ArrayList<>();
    }

    public Movie getMovie (int index) {
        return movies.get(index);
    }

    public Movie getMovie (String name) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().equals(name)) {
                return new Movie(movies.get(i));
            }
        }
        return null;
    }

    public void setMovies (int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie (Movie movie) {
        movies.add(new Movie(movie));
    }

    public void action (String name, String action) {
        if (movies.isEmpty()) {
            throw new IllegalArgumentException("The store is not in a valid form to perform action");
        }
        if (!(action.equals("sell") || action.equals("rent") || action.equals("return"))) {
            throw new IllegalArgumentException("action must be sell, rent or return");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can not be null or blank");
        }
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)) {
                switch (action) {
                    case "sell":
                        if (!(movies.get(i).isAvailable())) {
                            throw new IllegalStateException("can't sell movie that was rented out");
                        }
                        this.movies.remove(i); break;
                    case "rent": this.movies.get(i).setAvailable(false); break;
                    case "return": this.movies.get(i).setAvailable(true); break;
                }
            }
        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
}

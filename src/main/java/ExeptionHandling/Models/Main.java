package ExeptionHandling.Models;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("Ivan", "stocker");
        Employee bartender = new Employee("Peter", "bartender");
        Employee manager = new Employee("Denis", "manager");

        Store store = new Store();
        store.setEmployees(0,stocker);
        store.setEmployees(1,bartender);
        store.setEmployees(2,manager);
        System.out.println(store);
        store.open();
    }

}

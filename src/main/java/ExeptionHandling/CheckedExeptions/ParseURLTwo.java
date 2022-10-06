package ExeptionHandling.CheckedExeptions;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURLTwo {
    public static void main(String[] args) {
        try {
            parseURL("https://www.google.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void parseURL (String link) throws MalformedURLException {
        URL url = new URL(link);
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
    }
}

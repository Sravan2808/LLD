package designPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Delhi", "Agra", "car");
        googleMaps.findPath("Delhi", "Agra", "bike");
    }
}

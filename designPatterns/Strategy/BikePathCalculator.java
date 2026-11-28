package designPatterns.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy {
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Calculating bike path from " + fromLocation + " to " + toLocation);
    }
}

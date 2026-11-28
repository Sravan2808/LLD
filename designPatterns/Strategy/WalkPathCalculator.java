package designPatterns.Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Calculating walking path from " + fromLocation + " to " + toLocation);
    }
}

package designPatterns.Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorForMode(String mode){
        if(mode.equalsIgnoreCase("Car")) return new CarPathCalculator();
        else if(mode.equalsIgnoreCase("Bike")) return new BikePathCalculator();
        else return new WalkPathCalculator();
    }
}

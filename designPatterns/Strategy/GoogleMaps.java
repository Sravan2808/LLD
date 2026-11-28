package designPatterns.Strategy;

public class GoogleMaps {
    public void findPath(String fromLocation,String toLocation,String mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorForMode(mode);
        pathCalculatorStrategy.findPath(fromLocation, toLocation);
    }
}

package designPatterns.factory.Button;

public class IOSButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("This is an IOS Button");
    }
}

package designPatterns.factory.Button;

public class AndriodButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("This is an Android Button");
    }
}

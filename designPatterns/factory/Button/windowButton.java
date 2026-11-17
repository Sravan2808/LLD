package designPatterns.factory.Button;

public class windowButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("This is a Windows Button");
    }
}

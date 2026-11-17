package designPatterns.factory.Menu;

public class IOSMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("This is an IOS Menu");
    }
}

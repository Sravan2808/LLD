package designPatterns.factory;

import designPatterns.factory.Button.Button;
import designPatterns.factory.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatform.IOS);

        Button button = uiFactory.createButton();
        button.clickButton();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}

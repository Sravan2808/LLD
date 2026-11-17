package designPatterns.factory;

import designPatterns.factory.Button.Button;
import designPatterns.factory.Button.IOSButton;
import designPatterns.factory.Menu.IOSMenu;
import designPatterns.factory.Menu.Menu;

public class IOSUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}

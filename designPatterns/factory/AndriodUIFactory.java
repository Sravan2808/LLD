package designPatterns.factory;

import designPatterns.factory.Button.AndriodButton;
import designPatterns.factory.Button.Button;
import designPatterns.factory.Menu.AndriodMenu;
import designPatterns.factory.Menu.Menu;

public class AndriodUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndriodButton();
    }

    @Override
    public Menu createMenu() {
        return new AndriodMenu();
    }
}

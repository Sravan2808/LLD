package designPatterns.factory;

import designPatterns.factory.Button.Button;
import designPatterns.factory.Button.windowButton;
import designPatterns.factory.Menu.Menu;
import designPatterns.factory.Menu.windowMenu;

public class windowUIFactory implements UIFactory{

        @Override
        public Button createButton() {
            return new windowButton();
        }

        @Override
        public Menu createMenu() {
            return new windowMenu();
        }
}

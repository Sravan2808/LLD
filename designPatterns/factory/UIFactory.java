package designPatterns.factory;

import designPatterns.factory.Button.Button;
import designPatterns.factory.Menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}

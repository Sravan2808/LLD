package designPatterns.factory;

public class UIFactoryHelper {
    public static UIFactory getUIFactory(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)) return new AndriodUIFactory();
        else if(platform.equals(SupportedPlatform.IOS)) return new IOSUIFactory();
        else if(platform.equals(SupportedPlatform.WINDOWS)) return new windowUIFactory();
        return null;
    }

}

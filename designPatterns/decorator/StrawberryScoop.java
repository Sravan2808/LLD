package designPatterns.decorator;

public class StrawberryScoop implements Icecream{
    private Icecream icecream;

    public StrawberryScoop(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream!=null) return icecream.getCost() + 30;
        return 0;
    }

    @Override
    public String getDescription() {
         return icecream.getDescription() + " + Strawberry Scoop";
    }
}

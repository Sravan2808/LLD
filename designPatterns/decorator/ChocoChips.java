package designPatterns.decorator;

public class ChocoChips implements Icecream{
    private Icecream icecream;

    public ChocoChips(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream!=null) return icecream.getCost() + 5;
        return 0;
    }

    @Override
    public String getDescription() {
         return icecream.getDescription() + " + Choco Chips";
    }
}

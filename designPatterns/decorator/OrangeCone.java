package designPatterns.decorator;

public class OrangeCone implements Icecream{
    private Icecream icecream;
//    OrangeCone behaves like a baseCone

    public OrangeCone(){}

    public OrangeCone(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    public String getDescription() {
        if(icecream!=null) return icecream.getDescription() + " + Orange Cone";
        return "Orange Cone";
    }

    @Override
    public int getCost(){
        if(icecream!=null) return icecream.getCost() + 10;
        return 10;
    }
}

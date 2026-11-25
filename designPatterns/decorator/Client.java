package designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
//        Icecream ic = new OrangeCone();
//        ic = new ChocoChips(ic);
//        ic = new ChocolateCone(ic);
//
//        ic = new VanillaScoop(ic);
//        ic= new StrawberryScoop(ic);
//        ic = new ChocoChips(ic);
//
//        System.out.println(ic.getCost());
//        System.out.println(ic.getDescription());

        Icecream ic = new ChocoChips(new VanillaScoop(new StrawberryScoop(new ChocolateCone(new ChocoChips(new OrangeCone())))));
        Icecream ic2 = new VanillaScoop(new ChocolateCone(new ChocolateCone(new StrawberryScoop(new ChocolateCone()))));
//        System.out.println(ic.getCost());
//        System.out.println(ic.getDescription());
        System.out.println(ic2.getCost());
        System.out.println(ic2.getDescription());
    }

}

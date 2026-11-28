package designPatterns.Observer;

public class InventoryGenerator implements OnOrderPlacedSubscriber{

    InventoryGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.register(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Inventory generated");
    }

}

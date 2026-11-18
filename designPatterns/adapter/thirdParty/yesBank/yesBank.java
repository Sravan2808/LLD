package designPatterns.adapter.thirdParty.yesBank;

public class yesBank {
    public void transferMoney(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferring " + amount + " from " + fromAccount + " to " + toAccount + " using Yes Bank API.");
    }
}

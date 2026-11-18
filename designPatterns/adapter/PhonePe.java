package designPatterns.adapter;

public class PhonePe {
//     private static BankApi bankApi = new ICICIAdapter();
    private static  BankApi bankApi = new YesBankAdapter();

    public static void main(String[] args) {
        bankApi.sendMoney("John", "Alice", 1000);
    }
}

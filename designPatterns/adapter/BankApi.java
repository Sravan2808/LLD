package designPatterns.adapter;

public interface BankApi {
    void sendMoney(String to, String from, double amount);

    void registerAccount(String accountNumber);
    long getBalance(String accountNumber);
}

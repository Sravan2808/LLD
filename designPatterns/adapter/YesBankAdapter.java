package designPatterns.adapter;

import designPatterns.adapter.thirdParty.yesBank.yesBank;

public class YesBankAdapter implements BankApi{
    private yesBank yesBank = new yesBank();
    @Override
    public void sendMoney(String to, String from, double amount) {
        yesBank.transferMoney(from,to, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}

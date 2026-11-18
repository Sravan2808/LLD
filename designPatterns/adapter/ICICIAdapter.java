package designPatterns.adapter;

import designPatterns.adapter.thirdParty.iciciBank.iciciBank;

public  class ICICIAdapter implements BankApi{
    private iciciBank iciciBank = new iciciBank();

    @Override
    public void sendMoney(String to, String from, double amount) {
        iciciBank.makePayment(to, from, amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}

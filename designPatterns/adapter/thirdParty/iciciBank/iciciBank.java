package designPatterns.adapter.thirdParty.iciciBank;

public class iciciBank {
    public  void makePayment(String to,String From,double amount){
        System.out.println("Payment of "+amount+" made from "+From+" to "+to+" using ICICI Bank");
    }
}

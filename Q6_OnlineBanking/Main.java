package Q6_OnlineBanking;

public class Main {
    public static void main(String[] args) {
        Account account;

        account = new SavingsAccount(101, "Adhirayan", 50000);
        account.displayDetails();

        account = new CurrentAccount(102, "Kumar", 75000);
        account.displayDetails();

        Payment payment = new UPIPayment();
        payment.pay(1500);
        ((SecurePayment) payment).verifyPayment();

        payment = new CardPayment();
        payment.pay(2500);

        System.out.println("UPI is online transaction: " + (payment instanceof OnlineTransaction));
    }
}

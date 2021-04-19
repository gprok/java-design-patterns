package strategy;

public class PaymentCash implements PaymentTypeStrategy {
    @Override
    public boolean getPayment() {
        System.out.println("Paying with cash");
        return true;
    }
}

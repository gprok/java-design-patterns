package strategy;

import java.util.Random;

public class PaymentPayPal implements PaymentTypeStrategy {
    @Override
    public boolean getPayment() {
        System.out.println("Connecting to PayPal service ...");
        Random rnd = new Random();
        int result = rnd.nextInt(100);
        if(result < 60) {
            System.out.println("Payment accepted by PayPal");
            return true;
        }
        else {
            System.out.println("Payment rejected");
            return false;
        }
    }
}

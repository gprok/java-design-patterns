package strategy;

import java.util.Random;

public class PaymentCreditCard implements PaymentTypeStrategy {
    @Override
    public boolean getPayment() {
        System.out.println("Connecting with bank ...");
        Random rnd = new Random();
        int result = rnd.nextInt(100);
        if(result < 80) {
            System.out.println("Transaction completed");
            return true;
        }
        else {
            System.out.println("Transaction failed");
            return false;
        }
    }
}

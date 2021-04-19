package strategy;

import java.util.Scanner;

public class ShoppingCart {
    private Order order;

    public ShoppingCart() {
        order = new Order();
    }

    public void setPayment() {
        boolean paymentOK = false;
        Scanner in = new Scanner(System.in);
        int selection;
        do {
            System.out.println("SELECT PAYMENT TYPE");
            System.out.println("1. Cash");
            System.out.println("2. Credit Card");
            System.out.println("3. PayPal");
            selection = in.nextInt();
            in.nextLine();
            if(selection == 1) {
                order.setPaymentType(new PaymentCash());
            }
            else if(selection == 2) {
                order.setPaymentType(new PaymentCreditCard());
            }
            else if(selection == 3) {
                order.setPaymentType(new PaymentPayPal());
            }
            else {
                System.out.println("Wrong. Try again.");
            }
            paymentOK = order.pay();
        } while(!paymentOK);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPayment();
    }
}

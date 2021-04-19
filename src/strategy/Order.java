package strategy;

public class Order {
    private PaymentTypeStrategy paymentType;

    public Order() {
        paymentType = null;
    }

    public void setPaymentType(PaymentTypeStrategy paymentType) {
        this.paymentType = paymentType;
    }

    public boolean pay() {
        if(paymentType == null) {
            System.out.println("NO PAYMENT TYPE SELECTED");
            return false;
        }
        if(paymentType.getPayment()) {
            System.out.println("ORDER COMPLETED");
            return true;
        }
        else {
            System.out.println("PAYMENT FAILED. PLEASE TRY AGAIN");
            return false;
        }
    }
}

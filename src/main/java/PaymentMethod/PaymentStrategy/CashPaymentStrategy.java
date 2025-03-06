package PaymentMethod.PaymentStrategy;

// CashPaymentStrategy.java
public class CashPaymentStrategy implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Thanh toán bằng Tiền mặt: " + amount);
    }
}

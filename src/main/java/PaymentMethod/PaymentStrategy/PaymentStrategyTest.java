package PaymentMethod.PaymentStrategy;

// PaymentStrategyTest.java (Main)
public class PaymentStrategyTest {
    public static void main(String[] args) {
        PaymentContextStrategy context = new PaymentContextStrategy(new CashPaymentStrategy());
        context.executePayment(1000);

        context.setStrategy(new BankTransferPaymentStrategy());
        context.executePayment(2000);

        context.setStrategy(new MomoPaymentStrategy());
        context.executePayment(3000);

        context.setStrategy(new VNPayPaymentStrategy());
        context.executePayment(4000);
    }
}

package org.example;
import FactoryPattern.PaymentFactory;
import FactoryPattern.PaymentStrategy;
import SingletonPattern.Logger;

public class Main {
    public static void main(String[] args) {
        // 1a. Ví dụ sử dụng Singleton Pattern
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Bắt đầu chương trình...");

        // Kiểm chứng 2 instance có giống nhau không
        System.out.println("Logger1 == Logger2? " + (logger1 == logger2));

        // 1b.Ví dụ sử dụng Factory Method
        PaymentStrategy payment = PaymentFactory.getPaymentMethod("momo");
        payment.pay(1500);
    }
}
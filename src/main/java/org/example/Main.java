package org.example;
import SingletonPattern.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Bắt đầu chương trình...");

        // Kiểm chứng 2 instance có giống nhau không
        System.out.println("Logger1 == Logger2? " + (logger1 == logger2));
    }
}
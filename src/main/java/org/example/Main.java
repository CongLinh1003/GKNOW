package org.example;
import FactoryPattern.PaymentFactory;
import FactoryPattern.PaymentStrategy;
import SingletonPattern.Logger;

public class Main {
    public static void main(String[] args) {
        //1a.Singleton Pattern đảm bảo rằng chỉ có một instance của lớp được tạo ra trong suốt vòng đời của ứng dụng.
        // Ví dụ: lớp Logger dùng để ghi log chung cho toàn ứng dụng.
        //- Mọi thao tác ghi log trong ứng dụng đều được quản lý bởi cùng một đối tượng Logger.
        //  Điều này giúp thống nhất định dạng log, quản lý file log (nếu ghi ra file) và dễ dàng bảo trì.

        //- Nếu sau này cần thay đổi cơ chế ghi log (ví dụ ghi vào file hoặc cơ sở dữ liệu),
        //  chỉ cần chỉnh sửa trong lớp Logger mà không ảnh hưởng đến các phần khác của ứng dụng.

        //- Việc sử dụng Singleton cho phép kiểm soát chặt chẽ việc truy cập đến đối tượng Logger,
        //  tránh tình trạng xung đột khi có nhiều đối tượng cùng thao tác ghi log.
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.log("Bắt đầu chương trình...");

        // Kiểm chứng 2 instance có giống nhau không
        System.out.println("Logger1 == Logger2? " + (logger1 == logger2));

        // 1b.Ví dụ sử dụng Factory Method
        //- Tách biệt quá trình tạo đối tượng khỏi việc sử dụng đối tượng.
        //  Điều này giúp cho client không cần phải biết chi tiết cách khởi tạo hay lớp cụ thể nào đang được tạo ra.

        //- Giảm sự phụ thuộc: Client chỉ cần biết giao diện chung (ví dụ: PaymentStrategy)
        //  mà không cần quan tâm đến cách cài đặt cụ thể của từng phương thức thanh toán.
        //- Khi cần thêm phương thức thanh toán mới, chỉ cần tạo lớp mới và cập nhật Factory,
        //  không ảnh hưởng đến phần code sử dụng Factory.

        // PaymentFactory kiểm tra tham số truyền vào và tạo ra đối tượng tương ứng (như CashPayment,
        // BankTransferPayment, MomoPayment, hoặc VNPayPayment). Điều này cho phép bạn mở rộng hệ
        // thống thanh toán một cách linh hoạt mà không cần thay đổi mã nguồn của client.
        PaymentStrategy payment = PaymentFactory.getPaymentMethod("momo");
        payment.pay(1500);
    }
}
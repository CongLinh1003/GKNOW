package SingletonPattern;

//1a.Singleton Pattern đảm bảo rằng chỉ có một instance của lớp được tạo ra trong suốt vòng đời của ứng dụng.
// Ví dụ: lớp Logger dùng để ghi log chung cho toàn ứng dụng.
//- Mọi thao tác ghi log trong ứng dụng đều được quản lý bởi cùng một đối tượng Logger.
//  Điều này giúp thống nhất định dạng log, quản lý file log (nếu ghi ra file) và dễ dàng bảo trì.

//- Nếu sau này cần thay đổi cơ chế ghi log (ví dụ ghi vào file hoặc cơ sở dữ liệu),
//  chỉ cần chỉnh sửa trong lớp Logger mà không ảnh hưởng đến các phần khác của ứng dụng.

//- Việc sử dụng Singleton cho phép kiểm soát chặt chẽ việc truy cập đến đối tượng Logger,
//  tránh tình trạng xung đột khi có nhiều đối tượng cùng thao tác ghi log.

public class Logger {
    private static Logger instance;

    // Constructor private để ngăn tạo mới từ bên ngoài
    private Logger() {}

    // Phương thức lấy instance duy nhất
    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

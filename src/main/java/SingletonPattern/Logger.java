package SingletonPattern;
//1.Singleton đảm bảo rằng chỉ có một instance của lớp được tạo ra. Ví dụ: lớp Logger dùng để ghi log chung cho toàn ứng dụng.
// Logger.java
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

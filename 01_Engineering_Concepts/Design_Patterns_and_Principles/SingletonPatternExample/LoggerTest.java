package SingletonPatternExample;
public class LoggerTest {
    public static void main(String[] args) {
        // The below statement is not possible because the constructor is private
        // Logger l = new Logger();

        Logger log1 = Logger.getInstance(); // Instance Created
        Logger log2 = Logger.getInstance(); // The already created instance is used

        System.out.println(log1==log2);
    }
}

package SingletonPatternExample;
class Logger{
    //1. Creation of static instance
    private static Logger instance;

    //2. Create a Private Constructor
    private Logger(){
        System.out.println("Constructor Initialized");
    }

    //3. Lazy Instantiation using getters
    public static Logger getInstance(){
        if(instance == null) instance = new Logger();
        return instance;
    }
}
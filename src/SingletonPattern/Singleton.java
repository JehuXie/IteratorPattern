package SingletonPattern;

/**
 * @author JehuXie
 * @Description: ${todo}
 * @date 2018/3/16 0016上午 10:52
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){
        Singleton singleton = new Singleton();
    }
    public static Singleton getSingleton(){
        return singleton;
    }
}

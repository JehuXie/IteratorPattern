package SingletonPattern;

/**
 * @author JehuXie
 * @Description: ${todo}
 * @date 2018/3/16 0016上午 11:31
 */
public class SingletonPatternMain {
    public static void main(String[] args) {
        System.out.println("start.");
        for(int i=0;i<10;i++){
            System.out.println(i + ":" + TicketMaker.getTicketMaker().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}

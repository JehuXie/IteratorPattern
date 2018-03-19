package SingletonPattern;

/**
 * @author JehuXie
 * @Description: ${todo}
 * @date 2018/3/16 0016上午 11:28
 */
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private int ticket = 1000;

    private TicketMaker(){}

    public static TicketMaker getTicketMaker(){
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}

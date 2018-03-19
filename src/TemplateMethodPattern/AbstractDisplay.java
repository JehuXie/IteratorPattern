package TemplateMethodPattern;

/**
 * @author JehuXie
 * @Title: AbstractDisplay
 * @Package TemplateMethodPattern
 * @Description: ${todo}
 * @date 2018/3/19 0019上午 9:42
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

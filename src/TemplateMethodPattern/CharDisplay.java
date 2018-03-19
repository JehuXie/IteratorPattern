package TemplateMethodPattern;

/**
 * @author JehuXie
 * @Title: CharDisplay
 * @Package TemplateMethodPattern
 * @Description: ${todo}
 * @date 2018/3/19 0019上午 9:42
 */
public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char ch){
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}

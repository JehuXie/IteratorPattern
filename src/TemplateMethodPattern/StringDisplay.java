package TemplateMethodPattern;

/**
 * @author JehuXie
 * @Title: StringDisplay
 * @Package TemplateMethodPattern
 * @Description: ${todo}
 * @date 2018/3/19 0019上午 9:50
 */
public class StringDisplay extends AbstractDisplay {
    private String string;

    private int width;

    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}

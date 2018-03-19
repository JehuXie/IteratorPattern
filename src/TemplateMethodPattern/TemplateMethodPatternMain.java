package TemplateMethodPattern;

/**
 * @author JehuXie
 * @Title: TemplateMethodPatternMain
 * @Package TemplateMethodPattern
 * @Description: ${todo}
 * @date 2018/3/19 0019上午 9:54
 */
public class TemplateMethodPatternMain {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay1 = new CharDisplay('H');

        AbstractDisplay abstractDisplay2 = new StringDisplay("Hello JehuXie");

        AbstractDisplay abstractDisplay3 = new StringDisplay("你好，中国");

        abstractDisplay1.display();

        abstractDisplay2.display();

        abstractDisplay3.display();
    }
}

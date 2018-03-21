package PrototypePattern;

import PrototypePattern.framework.Manager;
import PrototypePattern.framework.Product;

/**
 * @author JehuXie
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/21 0021下午 2:51
 */
public class PrototypePatternMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('*');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message",upen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);

        Product p1 = manager.creat("strong message");
        p1.use("hello,world");
        Product p2 = manager.creat("warning box");
        p2.use("hello,world");
        Product p3 = manager.creat("slash box");
        p3.use("hello,world");
    }
}

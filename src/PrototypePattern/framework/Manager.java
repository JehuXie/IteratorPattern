package PrototypePattern.framework;

import java.util.HashMap;

/**
 * @author JehuXie
 * @Title: Manager
 * @Package PrototypePattern.framework
 * @Description: ${todo}
 * @date 2018/3/21 0021上午 11:26
 */
public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name,Product proto){
        showcase.put(name,proto);
    }
    public Product creat(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}

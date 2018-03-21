package PrototypePattern.framework;

/**
 * @author JehuXie
 * @Title: Product
 * @Package PrototypePattern.framework
 * @Description: ${todo}
 * @date 2018/3/21 0021上午 11:30
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}

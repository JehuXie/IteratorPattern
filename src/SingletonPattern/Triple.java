package SingletonPattern;

/**
 * @author JehuXie
 * @Description: ${todo}
 * @date 2018/3/16 0016上午 11:53
 */
public class Triple {
    private int id;

    private Triple(int id){
        this.id = id;
    }
    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(3),
    };
    public static Triple getTriple(int id){
        System.out.println(id+"...........");
        return triples[id];
    }
    public String toString(){
        return "{Triple id =" + id + "}";
    }
}

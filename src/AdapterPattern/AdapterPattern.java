package AdapterPattern;

import java.io.IOException;

/**
 * @author JehuXie
 * @Description: ${todo}
 * @date 2018/3/15 0015下午 3:02
 */
public class AdapterPattern {
    public static void main(String[] args) throws IOException {
        FileIO f = new FileProperties();
        f.readFromFile("file.txt");
        f.setValue("year","2004");
        f.setValue("month","4");
        f.setValue("day","21");
        f.writeToFile("newfile.txt");
    }
}


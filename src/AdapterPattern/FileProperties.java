package AdapterPattern;

import java.io.*;
import java.util.Properties;

/**
 * @author JehuXie
 * @Description: ${todo}
 * @date 2018/3/15 0015下午 2:59
 */
public class FileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename),"written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key,value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key,"");
    }

    @Override
    public synchronized void load(InputStream inStream) throws IOException {
        super.load(inStream);
    }

    @Override
    public void store(OutputStream out, String comments) throws IOException {
        super.store(out, comments);
    }
}

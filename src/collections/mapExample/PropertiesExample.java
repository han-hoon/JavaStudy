package collections.mapExample;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        String path = PropertiesExample.class.getResource("database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));

        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url) ;
    }

}

package TestDrive;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.*;

/**
 * Created by Home on 21.10.2016.
 */
public class FileFinder {

    boolean answer;
    Map<String, String> map = new HashMap<String, String>();

    public void openFile(String code) {

        FileInputStream fis;
        Properties property = new Properties();
        String maps = "src/TestDrive/".concat(code).concat(".properties");

        try {
            fis = new FileInputStream(maps);
            property.load(fis);

            String car = property.getProperty("1.car");
            String home = property.getProperty("2.home");
            String game = property.getProperty("3.game");
            String morning = property.getProperty("4.morning");

            map.put("car", car);
            map.put("home", home);
            map.put("game", game);
            map.put("morning", morning);

        } catch (IOException e) {
            System.out.println("Фаил не найден");
        }
    }
    public boolean gettingKey(String word,String key2){
        //метод получения значения ключа
        String values1=map.get(key2);
        //Проверяем,есть ли такой ключ в коллекции
        if(word.equals(values1)){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }

}

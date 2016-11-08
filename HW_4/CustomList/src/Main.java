import java.awt.*;

/**
 * Created by Home on 30.10.2016.
 */
public class Main {


    public static void main(String[] args){

        CustomList list = new CustomList();
        System.out.println(list.size());
        list.add(1);
        System.out.println(list.size());
        list.add(2);
        System.out.println(list.size());
        list.add(3);
        System.out.println(list.size());
        System.out.println( list.get(5));
        System.out.println(list.contains(5));
        list.remove(0);
        System.out.println(list.get(0));


    }

}

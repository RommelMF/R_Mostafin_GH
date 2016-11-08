/**
 * Created by Home on 31.10.2016.
 */
public class Test {

    public Test(){

    }

    @Read
    public void testAReader(String c){
        System.out.println("Метод A читает"+c);
    }
    @Write
    public void testAWritter(String f){
        System.out.println("Метод A пишет"+f);
    }
    @Read
    public void testBReader(String a){
        System.out.println("Метод B читает"+a);
    }
    @Write
    public void testBWritter(String j){
        System.out.println("Метод B пишет"+j);
    }
}

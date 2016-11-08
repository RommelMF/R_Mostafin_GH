import java.lang.reflect.*;

/**
 * Created by Home on 31.10.2016.
 */
public class AnnotationProcessor {
    Test test=new Test();
    Class clss = Test.class;


    Method[] methods = clss.getDeclaredMethods();


    public void working1(){
        System.out.println("Методы чтения будут выполняться");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Read.class)) {
                try {
                    method.invoke(test," book");
                }catch(Exception e){
                    System.out.println("Not Found");
                }

            }
        }
    }
    public void working2() {
        System.out.println("Методы написания будут выполняться");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Write.class)) {
                try {
                    method.invoke(test," Мемуары");
                }catch(Exception e){
                    System.out.println("Not Found");
                }

            }
        }
    }
}
/**
 * Created by Home on 31.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            String annot = InputAnnotation.getUserKeyInputing("Введите названия аннотаций методов: ");
            AnnotationProcessor an = new AnnotationProcessor();
            String write="write";
            String read="read";
            String exit="exit";
            if(write.equals(annot)) {
                an.working2();
            }
             else if(read.equals(annot)){
                an.working1();
            }
             else if(exit.equals(annot)){
                break;
            } else{
                System.out.println("В данном классе нет таких аннотаций");
            }
        }
    }
}
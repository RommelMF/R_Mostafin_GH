package TestDrive;



/**
 * Created by Home on 21.10.2016.
 */
public class Main {

    public static void main(String[]args) {
        GameHelper helper = new GameHelper();
        boolean isAlive = true;
        FileFinder fileFinder=new FileFinder();
        while (isAlive != false) {
            String guess = helper.getUserInput("введите название языка: ");
            if(guess!=null){
                isAlive=false;
                fileFinder.openFile(guess);
            }
        }

        RandomGenerator randomGenerator=new RandomGenerator();
        int k=0;
        int j=0;

        for(int i=0;i<4;i++) {

            String key = randomGenerator.randomGenerated();
            String wordExit="exit";
            randomGenerator.delete();
            System.out.println(key);
            InputKey inputKey=new InputKey();
            String transfer =inputKey.getUserKeyInputing("Напишите перевод этого слова: ");
            if(transfer.equals(wordExit)){
                break;
            }
            boolean signal=fileFinder.gettingKey(transfer,key);
            if(signal==true){
                System.out.println("Верный ответ.");
                k++;
            }else{
                System.out.println("Неверный ответ.");
                j++;
            }
        }
        System.out.println("Итоги:");
        System.out.println("Число верных ответов: "+ k);
        System.out.println("Число неверных ответов: "+ j);
    }
}

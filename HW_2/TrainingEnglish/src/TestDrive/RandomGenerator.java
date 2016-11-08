package TestDrive;

import java.util.ArrayList;


public class RandomGenerator {
    int n=4;

    ArrayList<String> genModul = new ArrayList<String>();

    int index=(int)(Math.random()*n);

    public String randomGenerated() {

        genModul.add("car");
        genModul.add("home");
        genModul.add("game");
        genModul.add("morning");

        return genModul.get(index);
    }
    public void delete(){
        genModul.remove(index);
        n--;
    }
}
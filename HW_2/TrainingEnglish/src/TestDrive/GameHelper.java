package TestDrive;

import java.io.*;
public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine=null;
        String codeWord="English";

        System.out.print(prompt+"");
        try{
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in)
            );
            inputLine=is.readLine();
            if(inputLine.length()==0|inputLine.equals(codeWord)==false) {
                System.out.println("Нет такого языка(");
                return null;
            }

        }catch(IOException e){
            System.out.println("IOException:"+e);
        }
        return inputLine;
    }
}

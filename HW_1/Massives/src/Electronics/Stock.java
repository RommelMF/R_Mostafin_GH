package Electronics;


public class Stock {

    static void sorting(){
        Stock[] stock=new Stock[4];
        stock[0]=new TV();
        stock[1]=new Microwaves();
        stock[2]=new MusicalPlayers();
        stock[3]=new Computers();

        for(int i=0;i<stock.length;i++){
            TV g=new TV();
         int y= g.getCoast();
            System.out.println(y);



        }








    }
}

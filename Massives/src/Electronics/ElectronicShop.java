package Electronics;


public class ElectronicShop {
    public static void main(String[]args){
        Computers computers=new Computers();
        computers.setCoast(30000);
        computers.setColour("black");
        computers.setMany(10);
        computers.setWeight(5);


        TV tv=new TV();
        tv.setCoast(50000);
        tv.setColour("white");
        tv.setMany(20);
        tv.setWeight(7);

        Microwaves microwaves=new Microwaves();
        microwaves.setCoast(6000);
        microwaves.setColour("green");
        microwaves.setMany(15);
        microwaves.setWeight(3);

        MusicalPlayers musicalPlayers=new MusicalPlayers();
        musicalPlayers.setCoast(15000);
        musicalPlayers.setColour("red");
        musicalPlayers.setMany(7);
        musicalPlayers.setWeight(4);

        Stock stock=new Stock();
        stock.sorting();
    }

}

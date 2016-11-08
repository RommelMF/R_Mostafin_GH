import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args)throws SQLException, ClassNotFoundException  {
        boolean isAlive=true;
       Input input=new Input();
        ConnectServer connectServer=new ConnectServer();

        System.out.println("Вас приветствует тестовая программа склада!!)");
        System.out.println("Текущая версия склада - 1.0");
        System.out.println("В следующей версии будут ДОПИЛЕНЫ расширенные функции для склада,защита от неправильного ввода,обратная связь с методами.");
        System.out.println("Для вызова справки функциям склада наберите команду - help ");

        while(isAlive!=false){
            String word=input.getUserInterTheWord("Пожалуйста введите команду для работы с базой данных: ");
            if(word.equals("ShowProducts")){
                connectServer.theOutputProducts();
            }
            if(word.equals("toCreateAWarehouse")){
                connectServer.toCreateAWarehouse();
            }
            if(word.equals("addTheItemToTheWarehouse")){
                String nameP=input.getUserInterTheWord("Пожалуйста введите наименование товара: ");
                String price=input.getUserInterTheWord("Пожалуйста введите цену товара ");
                String warehouse_id=input.getUserInterTheWord("Пожалуйста введите номер склада,для добавления туда товара: ");
                String quantity=input.getUserInterTheWord("Пожалуйста введите количество товара: ");

                connectServer.addTheItemToTheWarehouse(nameP,price,warehouse_id,quantity);
            }
            if(word.equals("toRemoveTheProducts")){
                String namePr=input.getUserInterTheWord("Пожалуйста введите наименование товара,который нужно удалить: ");
                connectServer.toRemoveTheProducts(namePr);
                System.out.println("ПОТРАЧЕНО(");

            }
            if(word.equals("toRemoveTheWarehouse")){
                String idW=input.getUserInterTheWord("Пожалуйста введите номер склада,который нужно удалить: ");
                connectServer.toRemoveTheWarehouse(idW);
                System.out.println("ПОТРАЧЕНО(");

            }

            if(word.equals("help")){
                System.out.println("Справка по функциям склада:");
                System.out.println("Для вывода информации о всех товарах на складе наберите команду -ShowProducts ");
                System.out.println("Для создания нового склада наберите команду -toCreateAWarehouse");
                System.out.println("Для того чтобы добавить товар на склад наберите команду -addTheItemToTheWarehouse ");
                System.out.println("Для того чтобы удалить товар наберите команду -toRemoveTheProducts ");
                System.out.println("Для того чтобы удалить склад наберите команду -toRemoveTheWarehouse ");
            }
            if(word.equals("exit")){
                isAlive=false;
            }

        }
    }
}
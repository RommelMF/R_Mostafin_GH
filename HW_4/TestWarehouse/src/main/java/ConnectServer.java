/**
 * Created by Home on 07.11.2016.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectServer {
    int i=4;
    int j=5;

    public void theOutputProducts() throws SQLException,ClassNotFoundException{
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://HomeSweetHome:5432/new_database", "postgres", "26091991");
        Statement stmt;

        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select*from stock_item order by id asc;");
        while (rs.next()) {
            int id = rs.getInt("id");
            int price = rs.getInt("price");
            int warehouse_id = rs.getInt("warehouse_id");
            int quantity = rs.getInt("quantity");
            String name = rs.getString("name");
            System.out.print("id= "+id);
            System.out.print(" ,name= ".concat(name));
            System.out.print(" ,price= "+price);
            System.out.print(" ,warehouse_id= "+warehouse_id);
            System.out.print(" ,quantity= "+quantity+";");
            System.out.println();
        }
        rs.close();
        stmt.close();

    }
    public void toCreateAWarehouse()throws SQLException,ClassNotFoundException{
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://HomeSweetHome:5432/new_database", "postgres", "26091991");
        Statement stmt;
        String sql;

        connection.setAutoCommit(false);
        stmt=connection.createStatement();
        sql="insert into warehouse(id,name)values("+i+",'Склад"+i+"');";
        stmt.executeUpdate(sql);
        i++;

        stmt.close();
        connection.commit();

    }
    public void addTheItemToTheWarehouse(String nameP,String price,String warehouse_id,String quantity)throws SQLException,ClassNotFoundException{
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://HomeSweetHome:5432/new_database", "postgres", "26091991");
        Statement stmt;
        String sql;

        connection.setAutoCommit(false);
        stmt=connection.createStatement();
        sql="insert into stock_item(id,name,price,warehouse_id,quantity)values("+j+",'"+nameP+"',"+price+","+warehouse_id+","+quantity+");";
        stmt.executeUpdate(sql);
        j++;

        stmt.close();
        connection.commit();
    }
    public void toRemoveTheProducts(String namePr)throws SQLException,ClassNotFoundException{
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://HomeSweetHome:5432/new_database", "postgres", "26091991");
        Statement stmt;
        String sql;

        connection.setAutoCommit(false);
        stmt=connection.createStatement();
        sql="delete from stock_item where name = '"+namePr+"'";
        stmt.executeUpdate(sql);


        stmt.close();
        connection.commit();

    }
    public void toRemoveTheWarehouse(String idW)throws SQLException,ClassNotFoundException{
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection("jdbc:postgresql://HomeSweetHome:5432/new_database", "postgres", "26091991");
        Statement stmt;
        String sql;

        connection.setAutoCommit(false);
        stmt=connection.createStatement();
        sql="delete from warehouse where id = '"+idW+"'";
        stmt.executeUpdate(sql);


        stmt.close();
        connection.commit();

    }
}
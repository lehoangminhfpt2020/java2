package java2.lad3;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Exercises1 {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root", "");
            Statement stmt = conn.createStatement();)
        {
            String First = "select * from books";
            System.out.println("The First sql statement is "+ First);
            ResultSet rset = stmt.executeQuery(First);
            System.out.println(" Table books: ");
            while (rset.next()){
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + "," + title + "," + author + "," + price + "," + qty);
            }

            String Second = "SELECT title, price FROM books WHERE author = 'CodeLean VN' ";
            System.out.println("The Second sql statement is "+ Second);
            rset = stmt.executeQuery(Second);
            while (rset.next()){
                String price = rset.getString("price");
                String title = rset.getString("title");
                    System.out.println("author book is CodeLean VN with price: " + price +" and title: "+ title );
            }

            String Third = "SELECT title, author, price, qty FROM books WHERE author = 'CodeLean VN' OR price >= 30 ORDER BY price DESC, id ASC";
            System.out.println(" The Third sql statament is " + Third );
            rset = stmt.executeQuery(Third);
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty + ", ");
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

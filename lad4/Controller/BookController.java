package EbookStore.Controller;

import java.sql.*;
import java.util.Scanner;

public class BookController {
    private static String url = "jdbc:mysql://localhost:3306/ebookstore";
    private static String user = "root";
    private static String pass ="";
    private static String SQL;
    private static ResultSet rset;

    public static void top10new(){
        try(Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
        )
        {
            SQL = "SELECT * FROM Book order by years limit 10";
            rset = stmt.executeQuery(SQL);
            System.out.println("Top 10 New book");
            System.out.println("===========================================");
            while (rset.next()){
                int bookID= rset.getInt("BookID");
                String bookname = rset.getString("BookName");
                String author = rset.getString("Author");
                String genre = rset.getString("Genre");
                int qty = rset.getInt("QTY");
                double price = rset.getDouble("Price");
                String years = rset.getString("Years");
                System.out.printf("%d \t %s \t %s \t %d \t %f \t %s \n",bookID,bookname,genre,qty,price,years);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void TopSeller(){
        try (Connection conn = DriverManager.getConnection(url, user,pass);
             Statement stmt = conn.createStatement()) {
            SQL = "select Book.BookID,Book.BookName,Author,Years,Genre,QTY,Book.Price,sum(Orders.Amount) as soldamount from Book inner join Orders on Book.BookID = Orders.BookID" +
                    " where Orders.status != 0 group by Book.bookID,Book.BookName,Author,Years,Genre,QTY,Book.Price order by soldamount DESC limit 10";
            rset = stmt.executeQuery(SQL);
            System.out.println("TOP 10 SELLER:\n" +
                    "====================================================================================================================================");
            System.out.println("BookID\t\t\tBookName\t\t\t\t\t\tAuthor\t\t\t\t\t\tYears\t\t\tGenre\t\tQTY\t\tPrice\tsoldamount");
            while (rset.next()) {
                int id = rset.getInt("BookID");
                String BookName = rset.getString("BookName");
                String author = rset.getString("Author");
                String year = rset.getString("Years");
                String genre = rset.getString("Genre");
                int qty = rset.getInt("QTY");
                double price = rset.getDouble("Price");
                int soldamount = rset.getInt("soldamount");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-10s\t\t%-6d\t%-6.1f\t\t%-6d\n",
                        id, BookName, author, year, genre, qty, price, soldamount);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void FindBookByGenre(){
        try(Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
        )
        {
            Scanner scanner= new Scanner(System.in);
            System.out.println("We have 5 Genre:");
            System.out.println("1 Tư Duy");
            System.out.println("2 Kinh Doanh");
            System.out.println("3 Trinh thám");
            System.out.println("4 Self Help");
            System.out.println("5 English");
            System.out.println("Enter the Genre you wanna Find: ");
            String in = scanner.nextLine();
            SQL = "SELECT BookID,BookName,Author,Genre,QTY,Price,Years FROM Book where Genre like \'%" + in +"%\'";
            rset = stmt.executeQuery(SQL);
            System.out.println("List book with " + in);
            System.out.println("===========================================");
            System.out.println("BookID\t\t\tBookName\t\t\tAuthor\t\t\tGenre\t\t\t\t\t\tQTY\t\tPrice\t\t\tYears\n");
            while (rset.next()){
                int bookID= rset.getInt("BookID");
                String bookname = rset.getString("BookName");
                String author = rset.getString("Author");
                String genre = rset.getString("Genre");
                int qty = rset.getInt("QTY");
                double price = rset.getDouble("Price");
                String years = rset.getString("Years");
                System.out.printf("%d \t %s \t %s \t %s \t %d \t %f \t %s \n",bookID,bookname,author,genre,qty,price,years);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void FindBookByAuthor(){
        try(Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
        )
        {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the Author you wanna Find: ");
            String in = scanner.nextLine();
            SQL = "SELECT BookID,BookName,Author,Genre,QTY,Price,Years FROM Book where Author like \'%" + in +"%\'";
            rset = stmt.executeQuery(SQL);
            System.out.println("List book with " + in);
            System.out.println("===========================================");
            System.out.println("BookID\t\t\tBookName\t\t\tAuthor\t\t\tGenre\t\t\t\t\t\tQTY\t\tPrice\t\t\tYears\n");
            while (rset.next()){
                int bookID= rset.getInt("BookID");
                String bookname = rset.getString("BookName");
                String author = rset.getString("Author");
                String genre = rset.getString("Genre");
                int qty = rset.getInt("QTY");
                double price = rset.getDouble("Price");
                String years = rset.getString("Years");
                System.out.printf("%d \t %s \t %s \t %s \t %d \t %f \t %s \n",bookID,bookname,author,genre,qty,price,years);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void FindBookByID(){
        try(Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
        )
        {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the BookID you wanna Find: ");
            String in = scanner.nextLine();
            SQL = "SELECT BookID,BookName,Author,Genre,QTY,Price,Years FROM Book where BookID like \'%" + in +"%\'";
            rset = stmt.executeQuery(SQL);
            System.out.println("List book with " + in);
            System.out.println("===========================================");
            System.out.println("BookID\t\t\tBookName\t\t\tAuthor\t\t\tGenre\t\t\t\t\t\tQTY\t\tPrice\t\t\tYears\n");
            while (rset.next()){
                int bookID= rset.getInt("BookID");
                String bookname = rset.getString("BookName");
                String author = rset.getString("Author");
                String genre = rset.getString("Genre");
                int qty = rset.getInt("QTY");
                double price = rset.getDouble("Price");
                String years = rset.getString("Years");
                System.out.printf("%d \t %s \t %s \t %s \t %d \t %f \t %s \n",bookID,bookname,author,genre,qty,price,years);
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

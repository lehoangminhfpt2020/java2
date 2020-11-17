package EbookStore.Controller;

import java.sql.*;
import java.util.Scanner;

public class OrderCotroller {
    private static String url = "jdbc:mysql://localhost:3306/ebookstore";
    private static String user = "root";
    private static String pass ="";
    private static String SQL;
    private static ResultSet rset;

    public static void ShowOrdersST(int in){
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {
            System.out.println("enter the status of order you wanna find: ");
            switch (in) {
                case 0:
                    System.out.println("Canceled Order\n" +
                            "===========================================================================================================================");
                    break;
                case 1:
                    System.out.println("New Order\n" +
                            "===========================================================================================================================");
                    break;
                case 2:
                    System.out.println("Pending Order\n" +
                            "===========================================================================================================================");
                    break;
                case 3:
                    System.out.println("Ready Order\n" +
                            "===========================================================================================================================");
                    break;
                case 4:
                    System.out.println("Delivering Order\n" +
                            "===========================================================================================================================");
                    break;
                case 5:
                    System.out.println("Delivered Order\n" +
                            "===========================================================================================================================");
                    break;
                default:
                    break;
            }
            SQL = "Select OrderID,CustomerID,OrderDate,Discount,BookName,BookID,Amount,ToTal,Status from Orders where Status = " + "'" + in +"'";
            rset = stmt.executeQuery(SQL);
            System.out.println("Orders:\n" +
                    "====================================================================================================================================");
            System.out.println("OrderID\t\t\tCustomerID\t\t\tOrderDate\t\t\tDiscount\tBookName\t\t\t\tBookID\t\tAmount\t\tToTal\t\tStatus");
            while (rset.next()) {
                int id = rset.getInt("OrderID");
                String CustomerID = rset.getString("CustomerID");
                String OrderDate = rset.getString("OrderDate");
                int Discount =rset.getInt("Discount");
                String BookName = rset.getString("BookName");
                int BookID = rset.getInt("BookID");
                int Amount = rset.getInt("Amount");
                double ToTal = rset.getDouble("ToTal");
                int Status = rset.getInt("Status");
                System.out.printf("%-8d\t\t%-10s\t\t%-20s\t%-8d\t%-20s\t%-8d\t%-8d\t%-6.1f\t\t%-6d\n",
                        id, CustomerID, OrderDate,Discount, BookName, BookID,Amount, ToTal, Status);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void ShowOrdersbyID(){
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the ID of order you wanna find: ");
            int in = scanner.nextInt();
            SQL = "Select OrderID,CustomerID,OrderDate,Discount,BookName,BookID,Amount,ToTal,Status from Orders where OrderID =" +"'"+ in + "'";
            rset = stmt.executeQuery(SQL);
            System.out.println("Orders with" + in + "ID\n" +
                    "====================================================================================================================================");
            System.out.println("OrderID\t\t\tCustomerID\t\t\tOrderDate\t\t\tDiscount\tBookName\t\t\t\tBookID\t\tAmount\t\tToTal\t\tStatus");
            while (rset.next()) {
                int id = rset.getInt("OrderID");
                String CustomerID = rset.getString("CustomerID");
                String OrderDate = rset.getString("OrderDate");
                int Discount =rset.getInt("Discount");
                String BookName = rset.getString("BookName");
                int BookID = rset.getInt("BookID");
                int Amount = rset.getInt("Amount");
                double ToTal = rset.getDouble("ToTal");
                int Status = rset.getInt("Status");
                System.out.printf("%-8d\t\t%-10s\t\t%-20s\t%-8d\t%-20s\t%-8d\t%-8d\t%-6.1f\t\t%-6d\n",
                        id, CustomerID, OrderDate,Discount, BookName, BookID,Amount, ToTal, Status);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void ShowSTOrdersbyID(){
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the ID of order you wanna find: ");
            int in = scanner.nextInt();
            SQL = "Select OrderID,Status from Orders where OrderID =" +"'"+ in + "'";
            rset = stmt.executeQuery(SQL);
            System.out.println("Orders with" + in + "ID\n" +
                    "====================================================================================================================================");
            System.out.println("OrderID\tStatus");
            while (rset.next()) {
                int id = rset.getInt("OrderID");

                int Status = rset.getInt("Status");
                System.out.printf("%-8d\t%-6d\n",
                        id,  Status);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void ShowOrdersbyCID(){
        try (Connection conn = DriverManager.getConnection(url, user, pass);
             Statement stmt = conn.createStatement()) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the CustomerID of order you wanna find: ");
            int in = scanner.nextInt();
            SQL = "Select OrderID,CustomerID,OrderDate,Discount,BookName,BookID,Amount,ToTal,Status from Orders where CustomerID =" +"'"+ in + "'";
            rset = stmt.executeQuery(SQL);
            System.out.println("Orders with" + in + "CustomerID\n" +
                    "====================================================================================================================================");
            System.out.println("OrderID\t\t\tCustomerID\t\t\tOrderDate\t\t\tDiscount\tBookName\t\t\t\tBookID\t\tAmount\t\tToTal\t\tStatus");
            while (rset.next()) {
                int id = rset.getInt("OrderID");
                String CustomerID = rset.getString("CustomerID");
                String OrderDate = rset.getString("OrderDate");
                int Discount =rset.getInt("Discount");
                String BookName = rset.getString("BookName");
                int BookID = rset.getInt("BookID");
                int Amount = rset.getInt("Amount");
                double ToTal = rset.getDouble("ToTal");
                int Status = rset.getInt("Status");
                System.out.printf("%-8d\t\t%-10s\t\t%-20s\t%-8d\t%-20s\t%-8d\t%-8d\t%-6.1f\t\t%-6d\n",
                        id, CustomerID, OrderDate,Discount, BookName, BookID,Amount, ToTal, Status);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}

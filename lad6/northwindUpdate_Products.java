package Lab06;

import java.sql.*;

public class northwindUpdate_Products {
    public static void main(String[] args) {
        try
                (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind","root","");
                Statement stmt = conn.createStatement())
        {

            String SQL1 = "Update products set UnitPrice = (10/UnitPrice)*100 where CategoryId = 5";
            System.out.println("The sql statement is: " + SQL1 + "\n");
            stmt.executeUpdate(SQL1);

            String SQL2 = "Update products set UnitPrice = (10/UnitPrice)*100 where CategoryId = 7";
            System.out.println("The sql statement is: " + SQL2 + "\n");
            stmt.executeUpdate(SQL2);

            String SQL3 = "Update products set UnitPrice = (10/UnitPrice)*100 where CategoryId = 8";
            System.out.println("The sql statement is: " + SQL3 + "\n");
            stmt.executeUpdate(SQL3);

            System.out.println("Updated");
            ResultSet rSet = stmt.executeQuery("SELECT * FROM products");
            while (rSet.next()){
                System.out.println(rSet.getInt("ProductID") + ", " + rSet.getString("ProductName")+ ", "
                        + rSet.getInt("SupplierID") + ", " + rSet.getInt("CategoryID") + ", "
                        + rSet.getString("QuantityPerUnit") + ", " + rSet.getDouble("UnitPrice"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

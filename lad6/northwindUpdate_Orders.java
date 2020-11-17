package Lab06;

import java.sql.*;

public class northwindUpdate_Orders {
    public static void main(String[] args) {
        try
                (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind","root","");
                Statement stmt = conn.createStatement())
        {
            String SQL = "UPDATE orders set ShipVia = 2 where OrderID = 10313";
            System.out.println("The sql statement is: " + SQL + "\n");
            stmt.executeUpdate(SQL);
            System.out.println("Updated");
            ResultSet rSet = stmt.executeQuery("SELECT * from orders where OrderID = 10313");
            while (rSet.next()){
                System.out.println(rSet.getString("OrderID") + ", " + rSet.getString("CustomerID")+ ", " + rSet.getString("ShipVIa"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

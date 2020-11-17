package Lab06;

import java.sql.*;

public class northwindUpdate_Category {
    public static void main(String[] args) {
        try
                (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind","root","");
                Statement stmt = conn.createStatement())
        {
            String SQL = "Update categories set CategoryName = 'Seafood VN' where CategoryID = 8";
            System.out.println("The sql statement is: " + SQL + "\n");
            stmt.executeUpdate(SQL);
            ResultSet rSet = stmt.executeQuery("SELECT * from categories");
        while (rSet.next()){
            System.out.println(rSet.getInt("CategoryID")+ ", " +rSet.getString("CategoryName") + ", " + rSet.getString("Description") + ", ");
        }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

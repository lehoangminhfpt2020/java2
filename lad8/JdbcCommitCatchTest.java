import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCommitCatchTest {
    public static void main(String[] args) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = conn.createStatement();)
        {
            try{
                conn.setAutoCommit(false);
                stmt.executeUpdate("insert into books values (4001,'Paul Chan', 'Mahjong 101',44.4, 4)");
                stmt.executeUpdate("insert into books values (4001,'Peter Chan', 'Mahjong 102', 44.4,4)");
                conn.commit();
            }
            catch (SQLException ex){
                System.out.println("-- Rolling back changes --");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}

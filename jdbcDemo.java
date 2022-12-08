package advanceJava;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {
    public static void main(String[] args) throws SQLException {
        //creating  the connection
        String url = "jdbc:postgresql://localhost:5432/test";
        Connection conn = null;

        int rollno = 2;
        String name = "Jane";
        int age = 22;

        String sql = "Insert into student(rollno, name, age) " + "values(" + rollno + ",'" + name + "'," + age + ")";
        String sql1 = "Delete from student  where rollno=1";

        try {
            conn = DriverManager.getConnection(url, "postgres", "1234");
            //create statement in db create, update, delete, read
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql1);
            if (m==1)
                System.out.println("inserted successfully: " + sql);
            else
                System.out.println("insertion failed");
        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            conn.close();
        }
    }
}

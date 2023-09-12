
package electricity;
import java.sql.*;
public class Conn {
     Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "723202");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

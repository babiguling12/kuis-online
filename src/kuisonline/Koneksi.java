
package kuisonline;

import java.sql.Connection;
import java.sql.DriverManager;


public class Koneksi {

   private static Connection conn;
   
   public static Connection getConnection() {
       if(conn == null) {
           try {
               String url = "jdbc:mysql://localhost:3306/pbo";
               String user = "root";
               String password = "";
               DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
               conn = (Connection) DriverManager.getConnection(url,user,password);
           } catch(Exception e) {
               e.printStackTrace();
           }
       }
       return conn;
   }
}

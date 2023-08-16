import java.sql.*;

public class que16 {
  public static void main(String[] args) throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/southwind";
    String uname = "root";
    String pass = "root";
    String query = "delete from Student where sid = 2 and sid = 6";
    Connection con = DriverManager.getConnection(url, uname, pass);
    PreparedStatement pst = con.prepareStatement(query);
    int n = pst.executeUpdate();
    System.out.println(n + " rows affected");
  }
}

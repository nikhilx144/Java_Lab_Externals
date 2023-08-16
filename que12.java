import java.sql.*;

public class que12 {
  public static void main(String[] args) throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/southwind";
    String uname = "root";
    String pass = "root";
    String query = "update Student set sname = 'unknown'";
    Connection con = DriverManager.getConnection(url, uname, pass);
    PreparedStatement st = con.prepareStatement(query);
    int n = st.executeUpdate();
    System.out.println(n + " rows affected");
  }
}
import java.sql.*;

public class que8 {
  public static void main(String[] args) throws SQLException, ClassNotFoundException{
    String url = "jdbc:mysql://localhost:3306/southwind";
    String uname = "root";
    String pass = "skadoosh@123";
    String create_query = "create table Student(sid int primary key, sname varchar(40), scourse varchar(10), smarks int, sphno varchar(10))";
    String insert_query = "insert into Student values(1, 'A', 'a', 90, '7680062796'), (2, 'B', 'b', 91, '7680062797'), (3, 'C', 'c', 92, '7680062798'), (4, 'D', 'd', 94, '7680062799'), (6, 'F', 'f', 95, '7680062710')";
    
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection con = DriverManager.getConnection(url, uname, pass);
    Statement create_st = con.createStatement();
    create_st.executeUpdate(create_query);
    System.out.println("Table created successfully.");

    PreparedStatement insert_st = con.prepareStatement(insert_query);
    int n = insert_st.executeUpdate();
    System.out.println(n + " rows affected");
  }
}

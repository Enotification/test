
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    
    ResultSet rs;
    Connection con;
    Statement stm;
    PreparedStatement ps;
    
    public Database()
    {
        try{
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost/vijay","root", "");
     stm= con.createStatement();
 System.out.println("connected now"); 
      
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
            
            }
   
    
    
}

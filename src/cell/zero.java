/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell;


/**
 *
 * @author OHM
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.util.Locale;
import javax.swing.JOptionPane;
    
public class zero   
{      
  // main method  
  public static void main(String[] argvs)   
  {      
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tpo","root","root");
        PreparedStatement stmt=con.prepareStatement("insert into date values(?,?)");
        stmt.setString(1,"vikram");
        stmt.setString(2,java.time.LocalDate.now().toString());
        int rs=stmt.executeUpdate();
        if(rs==1)
            JOptionPane.showMessageDialog(null,"NOTICE ADDED SUCCESSFULY!!!");
        else
            JOptionPane.showMessageDialog(null,"Unable to proceed your request!!!");
        con.close();
        }catch(Exception e){System.out.println(e);}
  }      
}  
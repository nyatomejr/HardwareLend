/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardwarehome;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class newdb {
    Connection conn;
    public static Connection ConnectDb(){
        try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware", "root","");
//JOptionPane.showMessageDialog(null, "Success");
return conn;
        }
catch(Exception e){
JOptionPane.showMessageDialog(null,e);
return null;
}
}
}

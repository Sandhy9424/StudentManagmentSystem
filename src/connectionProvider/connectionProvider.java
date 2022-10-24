/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author 91887
 */
public class connectionProvider {
    public static Connection getcon() {
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresultsystem","root","Amit@1234");
        return con;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e.toString());
        return null;
    }
}
}

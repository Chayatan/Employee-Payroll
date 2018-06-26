/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author chayatan
 */
public class db {
    
    Connection conn = null;
    public static Connection java_db(){
        try
        {
            //Class.forName("org.sqlite.JDBC");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/chayatan/NetBeansProjects/trans.sqlite");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/db", "root" , "");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e + " not connected");
            return null;
        }
    }
}

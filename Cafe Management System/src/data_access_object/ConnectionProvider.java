/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access_object;
import java.sql.*;
/**
 *
 * @author kachr
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","Omkar@123");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}

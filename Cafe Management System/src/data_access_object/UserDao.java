/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access_object;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author kachr
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false')";
        DbOperations.setDataorDelete(query, "Registered successfully! wait for Admin Approval!");
    }
    
    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("select * from user where email ='" + email + "'");
            while(rs.next()){
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    
    public static void update(String email , String newPassword){
        String query = "update user set password= '"+newPassword+"' where email='"+email+"'";
        DbOperations.setDataorDelete(query, "Password Changed Successfully");
    }
    
    public static ArrayList<User> getAllRecords(String email){
        ArrayList<User> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from user where email like '%"+email+"%'");
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobilenumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityquestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void changeStatus(String email ,String status){
        String query = "update user set status='"+status+"'where email ='"+email+"'";
        DbOperations.setDataorDelete(query, "Status Changed Successfully");
    }
    
    public static void changePassword(String email , String oldPassword , String newPassword){
        try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"' and password='"+oldPassword+"'");
            if(rs.next()){
                update(email, newPassword);
            }
            else{
                JOptionPane.showMessageDialog(null, "Old Password is Wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void changeSecurityQuestion(String email, String password, String securityQuestion, String answer){
        try{
            ResultSet rs = DbOperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
            if(rs.next()){
                update(email, securityQuestion, answer);
            }
            else{
                JOptionPane.showMessageDialog(null, "Password is Wrong");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void update(String email, String securityQuestion, String answer){
        String query= "update user set securityQuestion='"+securityQuestion+"' ,answer='"+answer+"' where email='"+email+"' ";
        DbOperations.setDataorDelete(query, "Security Question Changed Successfully");
    }
    
}

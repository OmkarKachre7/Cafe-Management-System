/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_access_object;

import javax.swing.JOptionPane;

/**
 *
 * @author kachr
 */
public class tables {
    public static void main(String[] args) {
        try{
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','Admin@gmail.com','7506509193','asalpha','Omkar@123','who is your crush ?','harshita','true')";
            String categoryTable = "create table category (id int AUTO_INCREMENT primary key,name varchar(200))";
            String ProductTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String billTable = "create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200),date varchar(200),total varchar(200),createdby varchar(200))";
            DbOperations.setDataorDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataorDelete(adminDetails, "Admin Detail Added Successfully");
            DbOperations.setDataorDelete(categoryTable, "Category Table Create Successfully");
            DbOperations.setDataorDelete(ProductTable, "product Table Create Successfully");
            DbOperations.setDataorDelete(billTable, "bill table create successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

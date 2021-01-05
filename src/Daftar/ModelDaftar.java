/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ModelDaftar {
    String DBurl = "jdbc:mysql://localhost/responsiperpus";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    public ModelDaftar(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
    
    public void insertDaftar (String user, String pass){
        int jmlData=0;
        try {
           
           
           String query = "Select * from accounts WHERE Username=" +user; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
           
            if (jmlData==0 && user!="" && pass!="") {
                query = "INSERT INTO accounts(Username, Password) VALUES ('"+user+"','"+pass+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else if(user == "" || pass=="" ){
                JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
            }
            else {
                JOptionPane.showMessageDialog(null, "Username Sudah ditambahkan");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
        public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from accounts";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
        public String[][] readDaftar(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][2]; //baris, kolom nya ada 3
            
            String query = "Select * from accounts"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("Username"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("Password");     
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
}

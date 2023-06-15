/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class userController {
    private static final String USER="sa";
    private static final String PASSWORD= "123456789";
    private static final String SERVERNAME="LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB="BHX2";
    private static final int PORT=1433;
    
    
   
    
    private static SQLServerDataSource configDataSource(){
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setEncrypt(false); 
        dataSource.setIntegratedSecurity(false);
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setServerName(SERVERNAME);
        dataSource.setDatabaseName(DB);
        dataSource.setPortNumber(PORT);
        return dataSource;
    }

        
    public static boolean searchAccount (String username,String password) {
        SQLServerDataSource ds = configDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM Customer WHERE username = ? AND password = ?";
           var ps = conn.prepareStatement(sql);
           ps.setString(1, username);
           ps.setString(2, password);
           SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
           if(resultSet.next()){return true;}
        }
       
        catch (SQLException throwables){
            return false;
        }
        return false;
    }
    
     public static boolean searchAccountEmployee (String username,String password) {
        SQLServerDataSource ds = configDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM Employee WHERE username = ? AND password = ?";
           var ps = conn.prepareStatement(sql);
           ps.setString(1, username);
           ps.setString(2, password);
           SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
           if(resultSet.next()){return true;}
        }
       
        catch (SQLException throwables){
            return false;
        }
        return false;
    }

    
    
     public static boolean insertCustomer (Customer customer) {
        SQLServerDataSource ds = configDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "INSERT INTO CUSTOMER(customer_name,phone_number,address,username,password,ANSWER,QUESTION,email)"
                   +"VALUES(?,?,?,?,?,?,?,?)";
           var ps = conn.prepareStatement(sql);
           ps.setString(1, customer.getName());
           ps.setLong(2, customer.getPhone());
           String address = customer.getAddressLine1()+" "+customer.getAddressLine2();
           ps.setString(3, address);
           ps.setString(4, customer.getUsername());
           ps.setString(5, customer.getPassword());
           ps.setString(6, customer.getAnswer());
           ps.setString(7, customer.getQuestion());
           ps.setString(8, customer.getEmail());
           ps.executeUpdate();
           return true;
        }
        catch (SQLServerException throwables) {
            return false;
        }
        catch (SQLException throwables){
            return false;
        }
    }
     
    public static boolean checkUsername (String username) {
        SQLServerDataSource ds = configDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM CUSTOMER WHERE username= ?";
           var ps = conn.prepareStatement(sql);
           ps.setString(1, username);
           SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
           if(resultSet.next()) return false;
        }
        catch (SQLServerException throwables) {
            return true;
        }
        catch (SQLException throwables){
            return true;
        }
        return true;
    }
    
      public static boolean checkInforToGetNewPass (String username,String question,String answer) {
        SQLServerDataSource ds = configDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM CUSTOMER WHERE username= ? AND question=? AND answer=?";
           var ps = conn.prepareStatement(sql);
           ps.setString(1, username);
           ps.setString(2, question);
           ps.setString(3, answer);
           return true;
        }
        catch (SQLServerException throwables) {
            return false;
        }
        catch (SQLException throwables){
            return false;
        }
    }
      
      public static boolean UpdateNewPass (String newPass,String username) {
        SQLServerDataSource ds = configDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "UPDATE CUSTOMER SET password = ? WHERE username= ?";
           var ps = conn.prepareStatement(sql);
           ps.setString(1, newPass);
           ps.setString(2, username);
           ps.executeUpdate();
           return true;
        }
        catch (SQLServerException throwables) {
            return false;
        }
        catch (SQLException throwables){
            return false;
        }
    }
    
     public static void main(String[] args) {
//         boolean x =checkInforToGetNewPass("dackhai242","What are your favorite hobbies?", "oifidosif");
//         System.out.println(x);
            String username= "davidwilson5";
            String password ="password5";
            boolean x = searchAccount(username,password);
            System.out.println(x);
    }
}

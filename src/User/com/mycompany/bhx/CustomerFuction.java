/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User.com.mycompany.bhx;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author My PC
 */
public class CustomerFuction {
    private static final String USER="sa";
    private static final String PASSWORD ="123456789";
    private static final String SERVERNAME  ="LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB ="BHX2";
    private static final int PORT= 1433;
    public static void main (String[] args) throws SQLException{  
       int x = idCustomer("johndoe1");
        System.out.println(x);
        
    }
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
       public static SQLServerDataSource dataSource = configDataSource();
      
    public static void loadTable(JTable tb, String sql){
        try (var c = dataSource.getConnection()){
            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            model.setRowCount(0);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("customer_id"),
                    rs.getString("customer_name"),
                    rs.getString("address"),
                    rs.getString("email"),
                    rs.getString("phone_number"),
                    rs.getString("username"),
                    rs.getString("password")
                };
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }
    public static void addCustomer(String name,String comboAddress, String textAddress, String email, String phone, String username, String password){
        try (var c = dataSource.getConnection()){
            String address = comboAddress + " " + textAddress;
            Statement st = c.createStatement();
            String sql = "INSERT INTO customer (customer_name, phone_number, address, email, username, password)" +
                        "VALUES ('" + name + "','" + phone + "','" + address + "','" + email + "','" + username + "','" + password + "')";
            st.executeQuery(sql);
            
        } catch (Exception e) {
        }
    }
    public static void searchCustomer(JTable tb, int id){
        try(var c = dataSource.getConnection()) {
            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            model.setRowCount(0);
            Statement st = c.createStatement();
            String sql = "select* from customer where customer_id = " + id;
            ResultSet rs = st.executeQuery(sql);  
            while (rs.next()) {
            Object[] row = {
                rs.getInt("customer_id"),
                rs.getString("customer_name"),
                rs.getString("address"),
                rs.getString("email"),
                rs.getString("phone_number"),
                rs.getString("username"),
                rs.getString("password")
            };
            model.addRow(row);
            }
        } catch (Exception e) {
        }
    }
    public static void updateCustomer(int id, String name, String comboAdress, String textAddress, String email, String phone, String password) {
        try (var c = dataSource.getConnection()){
            String address = comboAdress + " " + textAddress;
            String sql = "UPDATE dbo.customer SET customer_name = ?, phone_number = ?, address = ?, email = ?, password = ? WHERE customer_id = ?";
            PreparedStatement statement = c.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, phone);
            statement.setString(3, address);
            statement.setString(4, email);
            statement.setString(5, password);
            statement.setInt(6, id);

            statement.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void deleteCustomer(JTable tb, int id){
        try (var c = dataSource.getConnection()){
            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            Statement st = c.createStatement();
            String sql = "DELETE FROM customer WHERE customer_id = " + id;
            st.executeQuery(sql);
        } catch (Exception e) {
        }
    }
    public static void setText(int id, JTextField name, JComboBox comboBox, JTextField address, JTextField email, JTextField phone, JTextField password){
        try (var c = dataSource.getConnection()){
            Statement st = c.createStatement();
            String sql = "select* from customer where customer_id =" + id;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                name.setText(rs.getString("customer_name"));
                comboBox.setSelectedItem(rs.getString("address").substring(0, 10));
                address.setText(rs.getString("address").substring(11));
                email.setText(rs.getString("email"));
                phone.setText(rs.getString("phone_number"));
                password.setText(rs.getString("password"));
            }
        } catch (Exception e) {
        }
    }
    public static void setUser(int id, JTextField name, JComboBox comboBox, JTextField address, JTextField email, JTextField phone, JTextField username, JTextField password){
        try (var c = dataSource.getConnection()){
            Statement st = c.createStatement();
            String sql = "select* from customer where customer_id = " + id;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                name.setText(rs.getString("customer_name"));
                comboBox.setSelectedItem(rs.getString("address").substring(0, 10));
                address.setText(rs.getString("address").substring(11));
                email.setText(rs.getString("email"));
                phone.setText(rs.getString("phone_number"));
                username.setText(rs.getString("username"));
                password.setText(rs.getString("password"));
            }
        } catch (Exception e) {
        }
    }
    
    public static int idCustomer(String username) {
        try (var c = dataSource.getConnection()) {
            int x = -1;
            Statement st = c.createStatement();
            String sql = "select * from customer where username = '" + username + "'";
            ResultSet rs = st.executeQuery(sql);  
            while (rs.next()) {
                x = rs.getInt(1);
            }
            return x;
        } 
        catch (Exception e) {
            return -1;
        }
    }
    
}

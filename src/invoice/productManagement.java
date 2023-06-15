/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class productManagement {
    private static final String USER="sa";
    private static final String PASSWORD= "123456789";
    private static final String SERVER_NAME="LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB_NAME="BHX2";
    private static final int PORT=1433;
    
    // methods
    
    
    private static SQLServerDataSource configdaDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setPortNumber(PORT);
        dataSource.setServerName(SERVER_NAME);
        dataSource.setDatabaseName(DB_NAME);
        dataSource.setEncrypt(false); // (1)
        dataSource.setIntegratedSecurity(false); // (2)
        //dataSource.setTrustServerCertificate(false); (3)
        return dataSource;
    }
     
    public static product searchProductUsingPrepareStatement(int product_id) {
        SQLServerDataSource ds = configdaDataSource();
        product productt =new product();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM dbo.PRODUCT WHERE product_id = ?";
           var ps = conn.prepareStatement(sql);
            ps.setInt(1, product_id);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            if(resultSet.next()) {
                var id = resultSet.getInt(1);
                var product_name = resultSet.getString(2);
                var decription = resultSet.getString(3);
                var price = resultSet.getFloat(4);
                var categories = resultSet.getString(5);
                var supplier = resultSet.getString(6);
                var experation_date = resultSet.getTimestamp(7);
                productt = new product(product_id, product_name, 
                        decription, price, categories, supplier, experation_date);
            }
        }
        catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
        catch (SQLException throwables){
            throwables.printStackTrace(); 
        }
        return productt;
    }
    
}

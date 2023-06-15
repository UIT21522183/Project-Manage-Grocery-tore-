/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class invoiceDetailManagement {
    private static final String USER="sa";
    private static final String PASSWORD= "123456789";
    private static final String SERVER_NAME="LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB_NAME="BHX2";
    private static final int PORT=1433;
    
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
    
    public static void writeInvoicesDetailUsingPrepareStatement(ArrayList<invoiceDetail> result) {
        SQLServerDataSource ds = configdaDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "INSERT INTO InvoiceDetail(invoice_id,product_id,quantity,price) VALUES (?,?,?,?)";
           var ps = conn.prepareStatement(sql);
           for (invoiceDetail detail : result) {
            //ps.setInt(1, detail.getInvoice_detail_id());
            ps.setInt(1, detail.getInvoice_id());
            ps.setInt(2, detail.getProduct_id());
            ps.setInt(3, detail.getQuantity());
            ps.setFloat(4, detail.getPrice());
            ps.executeUpdate();
        }  
        }
        catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
        catch (SQLException throwables){
            throwables.printStackTrace(); 
        }
    }
}

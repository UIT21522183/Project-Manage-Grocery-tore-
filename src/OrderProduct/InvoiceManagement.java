/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderProduct;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class InvoiceManagement {
    private static final String USER="sa";
    private static final String PASSWORD= "123456789";
    private static final String SERVER_NAME="LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB_NAME="BHX2";
    private static final int PORT=1433;

//    public static void main(String[] args) {
//        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
//        InvoiceManagement im=new InvoiceManagement();
//        Invoice x= new Invoice((float)10.22,"Cash",false,currentTimestamp);
//        im.writeInvoiceUsingPrepareStatement(x);
//        
//    }
    
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

    public static Invoice readInvoicesUsingPrepareStatement(int invoice_id) {
        SQLServerDataSource ds = configdaDataSource();
        Invoice invoicee =new Invoice();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM dbo.INVOICE WHERE invoice_id = ?";
           var ps = conn.prepareStatement(sql);
            ps.setInt(1, invoice_id);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            if(resultSet.next()) {
                var id = resultSet.getInt(1);
                var customer_id = resultSet.getInt(8);
                var total_amount = resultSet.getFloat(2);
                var payment_method = resultSet.getString(3);
                var payment_status = resultSet.getBoolean(4);
                var payment_date = resultSet.getTimestamp(5);
                var employee_id = resultSet.getInt(6);
                var create_at = resultSet.getTimestamp(7);
                invoicee = new Invoice(id,customer_id,total_amount,payment_method,payment_status,payment_date,
                                            employee_id,create_at); }
        }
        catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
        catch (SQLException throwables){
            throwables.printStackTrace(); 
        }
        return invoicee;
    }

   
    private static void showInvoices(Invoice invoice) {
   System.out.printf("%-20s%-25s%-25s%-25s%-25s%-25s%-25s%-25s\n",
           "Invoice ID", "Customer ID", "Total amount", "Payment method", "Payment status",
            "Payment date", "Employee ID", "Created at");
        System.out.printf("%-20d%-25d%-25.2f%-25s%-25b%-25s%-25s%-25s\n",
                invoice.getInvoice_id(), invoice.getCustomer_id(), invoice.getTotal_amount(),
                invoice.getPayment_method(), invoice.isPayment_status(),
                invoice.getPayment_date().toString(), invoice.getEmployee_id(), invoice.getCreated_at().toString());
}


    
    public Invoice searchInvoice (int invoice_id) {
        Invoice result=new Invoice();
        SQLServerDataSource ds = configdaDataSource();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM dbo.INVOICE WHERE invoice_id = ?";
           var ps = conn.prepareStatement(sql);
           ps.setInt(1, invoice_id);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
                result.setInvoice_id(resultSet.getInt(1));
                result.setCustomer_id(resultSet.getInt(8));
                result.setTotal_amount(resultSet.getFloat(2));
                result.setPayment_method(resultSet.getString(3));
                result.setPayment_status(resultSet.getBoolean(4));
                result.setPayment_date(resultSet.getTimestamp(5));
                result.setEmployee_id(resultSet.getInt(6));
                result.setCreated_at(resultSet.getTimestamp(7)); 
        }
        catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
        catch (SQLException throwables){
            throwables.printStackTrace(); 
        }
        return result;
    }
    
   public int writeInvoiceUsingPrepareStatement(Invoice invoice) {
    int x = 0;
    SQLServerDataSource ds = configdaDataSource();
    try (var conn = ds.getConnection()) {
        var sql = "INSERT INTO Invoice(total_amount, payment_method, payment_status, created_at,customer_id) VALUES (?, ?, ?, ?,?)";
        var ps = conn.prepareStatement(sql);
        ps.setFloat(1, invoice.getTotal_amount());
        ps.setString(2, invoice.getPayment_method());
        boolean payment_status = invoice.isPayment_status();
        int paymentStatusInt = payment_status ? 1 : 0;
        ps.setInt(3, paymentStatusInt);
        ps.setTimestamp(4, invoice.getCreated_at());
        ps.setInt(5, invoice.getCustomer_id());
        ps.executeUpdate();

        var sql2 = "SELECT MAX(invoice_id) FROM dbo.Invoice";
        var ps2 = conn.prepareStatement(sql2);
        var resultSet = ps2.executeQuery();
        if (resultSet.next()) {
            x = resultSet.getInt(1);
        }
    } catch (SQLServerException throwables) {
        throwables.printStackTrace();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }
       System.out.println(x);
    return x;
}
   

}

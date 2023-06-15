/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderProduct;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author ASUS
 */
public class productManagement {

    private static final String USER = "sa";
    private static final String PASSWORD = "123456789";
    private static final String SERVER_NAME = "LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB_NAME = "BHX2";
    private static final int PORT = 1433;

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

    // manage invoice 
    public static product searchProductUsingPrepareStatement(int product_id) {
        SQLServerDataSource ds = configdaDataSource();
        product productt = new product();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM dbo.PRODUCT WHERE product_id = ?";
            var ps = conn.prepareStatement(sql);
            ps.setInt(1, product_id);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            if (resultSet.next()) {
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
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productt;
    }

    // mannage order product
    public static ArrayList<String> getCategoryProductUsingPrepareStatement() {
        ArrayList<String> categories = new ArrayList<>();
        SQLServerDataSource ds = configdaDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT DISTINCT category FROM dbo.PRODUCT";
            var ps = conn.prepareStatement(sql);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            while (resultSet.next()) {
                String category = resultSet.getString("category");
                categories.add(category);
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categories;
    }

    public static ArrayList<String> getProductFromCategoryUsingPrepareStatement(String category) {
        ArrayList<String> products = new ArrayList<>();
        SQLServerDataSource ds = configdaDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT *  FROM dbo.PRODUCT WHERE category = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, category);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            while (resultSet.next()) {
                products.add(resultSet.getString("product_name"));
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    public static ArrayList<String> filterProductNameUsingPrepareStatement(String name, String category) {
        ArrayList<String> products = new ArrayList<>();
        SQLServerDataSource ds = configdaDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT *  FROM dbo.PRODUCT WHERE product_name like '%?%' AND category=?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, category);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            while (resultSet.next()) {
                products.add(resultSet.getString("product_name"));
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    public static product getProductName(String name) {
        SQLServerDataSource ds = configdaDataSource();
        product productt = new product();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM dbo.PRODUCT WHERE product_name = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            if (resultSet.next()) {
                var id = resultSet.getInt(1);
                var product_name = resultSet.getString(2);
                var decription = resultSet.getString(3);
                var price = resultSet.getFloat(4);
                var categories = resultSet.getString(5);
                var supplier = resultSet.getString(6);
                var experation_date = resultSet.getTimestamp(7);
                productt = new product(id, product_name,
                        decription, price, categories, supplier, experation_date);
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productt;
    }

    public static BufferedImage getImageProductName(String name)  {
        BufferedImage image = null;
        SQLServerDataSource ds = configdaDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM dbo.PRODUCT WHERE product_name = ?";
            var ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            if (resultSet.next()) {
                byte[] imageData = resultSet.getBytes("img");
                System.out.println("Image data length: " + imageData.length);

                ByteArrayInputStream inputStream = new ByteArrayInputStream(imageData);
                image = ImageIO.read(inputStream);

                System.out.println("Image width: " + image.getWidth());
                System.out.println("Image height: " + image.getHeight());
            } else {
                System.out.println("No image found for the given name.");
            }

            System.out.println("Final image: " + image);
            
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        catch (IOException ex) {
    ex.printStackTrace();
}
        return image;
    }

    public static void main(String[] args) throws IOException {
        var x = getImageProductName("Bread");
        System.out.println(x);
    }
}

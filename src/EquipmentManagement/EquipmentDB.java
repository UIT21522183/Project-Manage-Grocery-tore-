/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EquipmentManagement;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class EquipmentDB {
    private static final String USER="sa";
    private static final String PASSWORD= "123456789";
    private static final String SERVER_NAME="LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB_NAME="BHX2";
    private static final int PORT=1433;
    
    private static int index = 0;
    
    public static SQLServerDataSource configdaDataSource() {
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setUser(USER);
        dataSource.setPassword(PASSWORD);
        dataSource.setPortNumber(PORT);
        dataSource.setServerName(SERVER_NAME);
        dataSource.setDatabaseName(DB_NAME);
        dataSource.setEncrypt(false); // (1)
        dataSource.setIntegratedSecurity(false); // (2)
        dataSource.setTrustServerCertificate(false);// (3)
        return dataSource;
    }
    
    public static int InsertDataUsingPrepareStatement(Equipment equipment) {
        SQLServerDataSource ds = configdaDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "INSERT INTO dbo.Equipment (name, type, price, status, create_By, create_Date) VALUES (?, ?, ?, ?, ?, ?)";
            var prepareStm = conn.prepareStatement(sql);
            prepareStm.setString(1, equipment.getName());
            prepareStm.setString(2, equipment.getType());
            prepareStm.setFloat(3, equipment.getPrice());
            prepareStm.setString(4, equipment.getStatus());
            prepareStm.setString(5, equipment.getCreateBy());
            prepareStm.setTimestamp(6, equipment.getCreateDate());
            return prepareStm.executeUpdate();
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    
    public static Equipment readEquipmentsUsingPrepareStatement(int equipment_id) {
        SQLServerDataSource ds = configdaDataSource();
        Equipment equipmentt =new Equipment();
        try(var conn=ds.getConnection()) {
           var sql = "SELECT * FROM dbo.Equipment WHERE EQUIPMENT_ID = ?";
           var ps = conn.prepareStatement(sql);
            ps.setInt(1, equipment_id);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
            if(resultSet.next()) {
                var id = resultSet.getInt(1);
                var name = resultSet.getString(2);
                var type = resultSet.getString(3);
                var price = resultSet.getFloat(4);
                var status = resultSet.getString(5);
                var create_by = resultSet.getString(6);
                var create_date = resultSet.getTimestamp(7);
                equipmentt = new Equipment(id,name,type, price, status, create_by, create_date); }
        }
        catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
        catch (SQLException throwables){
            throwables.printStackTrace(); 
        }
        return equipmentt;
    }
    
    public static int getNextIndex() {
        return index++;
    }
    
    public static void showEquipments(Equipment equipment) {
        System.out.printf("%-20s%-25s%-25s%-25s%-25s%-25s%-25s\n",
           "Equipment ID", "Name", "Type", "Price", "Status","Create By", "Create Date");
        System.out.printf("%-20d%-25d%-25.2f%-25s%-25b%-25s%-25s\n",
                equipment.getId(), equipment.getName(), equipment.getType(),
                equipment.getPrice(), equipment.getStatus(),
                equipment.getCreateBy(), equipment.getCreateDate().toString());
    }
    
    public Equipment searchEquipment (int equipment_id) {
        Equipment result=new Equipment();
        SQLServerDataSource ds = configdaDataSource();
        try(var conn=ds.getConnection()) {
            var sql = "SELECT * FROM dbo.Equipment WHERE EQUIPMENT_ID = ?";
            var ps = conn.prepareStatement(sql);
            ps.setInt(1, equipment_id);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();
                result.setId(resultSet.getInt(1));
                result.setName(resultSet.getString(2));
                result.setType(resultSet.getString(3));
                result.setPrice(resultSet.getFloat(4));
                result.setStatus(resultSet.getString(5));
                result.setCreateBy(resultSet.getString(6));
                result.setCreateDate(resultSet.getTimestamp(7));
        }
        catch (SQLServerException throwables) {
            throwables.printStackTrace();
        }
        catch (SQLException throwables){
            throwables.printStackTrace(); 
        }
        return result;
    }
    
    public static void displayEquipmentsOnTable(JTable table) {
        SQLServerDataSource ds = configdaDataSource();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        model.setRowCount(0); // Xóa hết dữ liệu hiện có trong bảng

        try (var conn = ds.getConnection()) {
            var sql = "SELECT * FROM dbo.Equipment";
            var ps = conn.prepareStatement(sql);
            SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();

            while (resultSet.next()) {
                var id = resultSet.getInt(1);
                var name = resultSet.getString(2);
                var type = resultSet.getString(3);
                var price = resultSet.getFloat(4);
                var status = resultSet.getString(5);
                var create_by = resultSet.getString(6);
                var create_date = resultSet.getTimestamp(7);
                Object[] rowData = { id, name, type, price, status, create_by, create_date };
                model.addRow(rowData);
            }
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    
    public int UpdateDataUsingPrepareStatement(Equipment equipment) {
    int rowsUpdated = 0;
    SQLServerDataSource ds = configdaDataSource();
    
    try (var conn = ds.getConnection()) {
        String sql = "UPDATE dbo.Equipment SET Name = ?, Type = ?, Price = ?, Status = ?, Create_By = ?, Create_Date = ? WHERE EQUIPMENT_ID = ?";
        var ps = conn.prepareStatement(sql);
        
        // Thiết lập các giá trị cho câu lệnh prepared statement
        ps.setString(1, equipment.getName());
        ps.setString(2, equipment.getType());
        ps.setFloat(3, equipment.getPrice());
        ps.setString(4, equipment.getStatus());
        ps.setString(5, equipment.getCreateBy());
        ps.setTimestamp(6, equipment.getCreateDate());
        ps.setInt(7, equipment.getId());
        
        rowsUpdated = ps.executeUpdate();
    } catch (SQLServerException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return rowsUpdated;
}
        public static int deleteEquipment(int equipmentId) {
        SQLServerDataSource ds = configdaDataSource();
        int rowsDeleted = 0;

        try (var conn = ds.getConnection()) {
            var sql = "DELETE FROM dbo.Equipment WHERE EQUIPMENT_ID = ?";
            var ps = conn.prepareStatement(sql);
            ps.setInt(1, equipmentId);
            rowsDeleted = ps.executeUpdate();
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return rowsDeleted;
    }
        
    public static List<Equipment> searchEquipmentByName(String name) {
    SQLServerDataSource ds = configdaDataSource();
    List<Equipment> resultList = new ArrayList<>();

    try (var conn = ds.getConnection()) {
        var sql = "SELECT * FROM dbo.Equipment WHERE Name LIKE ?";
        var ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        SQLServerResultSet resultSet = (SQLServerResultSet) ps.executeQuery();

        while (resultSet.next()) {
            var id = resultSet.getInt(1);
            var equipmentName = resultSet.getString(2);
            var type = resultSet.getString(3);
            var price = resultSet.getFloat(4);
            var status = resultSet.getString(5);
            var createBy = resultSet.getString(6);
            var createDate = resultSet.getTimestamp(7);

            Equipment equipment = new Equipment(id, equipmentName, type, price, status, createBy, createDate);
            resultList.add(equipment);
        }
    } catch (SQLServerException throwables) {
        throwables.printStackTrace();
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    }

    return resultList;
}
        
    
}

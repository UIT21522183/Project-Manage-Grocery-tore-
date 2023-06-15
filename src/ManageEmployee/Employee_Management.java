package ManageEmployee;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Employee_Management {

    private static final String USER = "sa";
    private static final String PASSWORD = "123456789";
    private static final String SERVERNAME = "LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB = "BHX2";
    private static final int PORT = 1433;

    public static void main(String[] args) throws SQLException {
//        int Employee_id =0;
//        List<Employee> employees = new ArrayList<>();
//        employees.addAll(readEmployeeUsingPrepareStatement());
//        showEmployees(employees);
//        Employee employee = new Employee();
//        int result= InsertDataUsingPrepareStatement(employee);
//        var nhan_vien =getEmployeeById(Employee_id);

//    
//System.out.println(idEmployee("johndoe"));
    }

    private static SQLServerDataSource configDataSource() {
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

    public static void loadTableEmployee(JTable tb, String sql) {

        try (var conn = dataSource.getConnection()) {
            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            model.setRowCount(0);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("employee_id"),
                    rs.getString("full_name"),
                    rs.getString("phone_number"),
                    rs.getString("username"),
                    rs.getString("role"),};
                model.addRow(row);

            }
        } catch (SQLException e) {
        }
    }
//readEmployee

    public static Employee readEmployeeUsingPrepareStatement(int id) throws SQLException {
//        List <Employee> employees =new ArrayList<>();
        SQLServerDataSource dataSource = configDataSource();
        Employee employee = new Employee();
        try (var conn = dataSource.getConnection()) {
            var sql = "SELECT * FROM dbo.Employee WHERE employee_id = ?";
            var ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                var employee_id = resultSet.getInt(1);
                var full_name = resultSet.getString(2);
                var username = resultSet.getString(3);
                var password = resultSet.getString(4);
                var role = resultSet.getString(5);
                var email = resultSet.getString(6);
                var phone_number = resultSet.getString(7);
                var address = resultSet.getString(8);
                var join_date = resultSet.getTimestamp(9);
                var salary = resultSet.getFloat(10);
                var is_active = resultSet.getBoolean(11);
                employee = new Employee(employee_id, full_name, username, password, role, email, phone_number, address, join_date, salary, is_active);

            }

        } catch (SQLServerException throwables) {
        }
        return employee;
    }

    //Insert Employee
    public static int InsertDataUsingPrepareStatement(Employee employee) throws SQLException {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "INSERT INTO dbo.Employee( full_name,username,password,role,email,phone_number,address,join_date,salary,is_active)"
                    + "VALUES ( ?, ?, ?, ?, ?,?,?,?,?,?)";
            var prepareStm = conn.prepareStatement(sql);
            prepareStm.setString(1, employee.getFull_name());
            prepareStm.setString(2, employee.getUsername());
            prepareStm.setString(3, employee.getPassword());
            prepareStm.setString(4, employee.getRole());
            prepareStm.setString(5, employee.getEmail());
            prepareStm.setString(6, employee.getPhone_number());
            prepareStm.setString(7, employee.getAddress());
            prepareStm.setTimestamp(8, employee.getJoin_date());
            prepareStm.setDouble(9, employee.getSalary());
            prepareStm.setBoolean(10, employee.isIs_active());
            return prepareStm.executeUpdate();
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }
    //update Employee

    public static Employee getEmployeeById(int id) {
        Employee employee = new Employee();
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
//            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            var sql = "SELECT * FROM dbo.Employee WHERE employee_id = '" + id + "'";
            var statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                var employee_id = resultSet.getInt(1);
                var full_name = resultSet.getString(2);
                var username = resultSet.getString(3);
                var password = resultSet.getString(4);
                var role = resultSet.getString(5);
                var email = resultSet.getString(6);
                var phone_number = resultSet.getString(7);
                var address = resultSet.getString(8);
                var join_date = resultSet.getTimestamp(9);
                var salary = resultSet.getFloat(10);
                var is_active = resultSet.getBoolean(11);
                employee = new Employee(employee_id, full_name, username, password, role, email, phone_number, address, join_date, salary, is_active);

            }
            return employee;
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return employee;
    }

    public static void searchEmployee(JTable tb, int id) {
        try (var conn = dataSource.getConnection()) {
            DefaultTableModel model = (DefaultTableModel) tb.getModel();
            model.setRowCount(0);
            Statement st = conn.createStatement();
            String sql = "SELECT employee_id, full_name,username,role,phone_number FROM dbo.Employee where employee_id = " + id;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("employee_id"),
                    rs.getString("full_name"),
                    rs.getString("phone_number"),
                    rs.getString("username"),
                    rs.getString("role"),};
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    public static int updateDataUsingStatement(int id, String value1,
            String value2, String value3, String value4, String value5,
            String value6, double value7, boolean value8) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {
            var sql = "UPDATE dbo.Employee SET username =  ? ,password = ?,role = ?,email = ?,phone_number =?,address=?,salary=?,is_active=? WHERE employee_id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, value1);
            statement.setString(2, value2);
            statement.setString(3, value3);
            statement.setString(4, value4);
            statement.setString(5, value5);
            statement.setString(6, value6);
            statement.setDouble(7, value7);
            statement.setBoolean(8, value8);
            statement.setInt(9, id);
            statement.executeUpdate();
        } catch (SQLServerException throwables) {
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
        return 0;
    }

    //deleteEmployee
    public static int deleteUsingStatement(int id) {
        SQLServerDataSource ds = configDataSource();
        try (var conn = ds.getConnection()) {

            var sql = "DELETE FROM dbo.Employee WHERE employee_id = '" + id + "'";
            var statement = conn.createStatement();
            return statement.executeUpdate(sql);
        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
            return -1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return -1;
        }
    }

    public static int idEmployee(String username) {
        try (var c = dataSource.getConnection()) {
            int x = -1;
            Statement st = c.createStatement();
            String sql = "select employee_id from Employee where username = '" + username + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                x = rs.getInt("employee_id");
            }
            return x;
        } catch (Exception e) {
            return -1;
        }
    }

    private static void showEmployees(Employee Employee) {
        System.out.printf("%-20s%-25s%-25s%-25s%-25s%-25s%-25s%-25s%-25s%-25s%-1s\n", "employee_id", "full_name",
                 "username", "password", "role", "email", "phone_number", "address", "join_date", "salary", "is_active");
        System.out.printf("%-20s%-25s%-25s%-25s%-25s%-25s%-25s%-25s%-25s%-25s%-1s\n",
                Employee.getEmployee_id(), Employee.getFull_name(), Employee.getUsername(),
                Employee.getPassword(), Employee.getRole(), Employee.getEmail(), Employee.getPhone_number(),
                 Employee.getAddress(), Employee.getJoin_date(), Employee.getSalary(), Employee.isIs_active());

    }
}

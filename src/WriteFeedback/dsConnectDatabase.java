package WriteFeedback;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dsConnectDatabase {
    private static final String USER = "sa";
    private static final String PASSWORD = "123456789";
    private static final String SERVERNAME = "LAPTOP-TE0U9ASM\\SQLEXPRESS";
    private static final String DB = "BHX2";
    private static final int PORT = 1433;

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

    public static final SQLServerDataSource dataSource = configDataSource();

    public   ResultSet ExcuteQueryGetTable(String sqlQuery) {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement()) {
            return stmt.executeQuery(sqlQuery);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }

    public void executeQueryUpdateDB(String sqlQuery) {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sqlQuery);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
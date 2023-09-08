package Utilities;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtilities {
    static Connection connection;
    static public Statement statement;

    @BeforeTest
    public static void DBConnectionCreate() {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";


        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException e) {
            System.out.println("ex.getMessage() = " + e.getMessage());
        }
    }

    @AfterTest
    public static void DBConnectionClose() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }

    public static List<List<String>> getData(String query) {
        List<List<String>> table = new ArrayList<>();
        DBConnectionCreate();
        ResultSet rs;
        try {
            rs = statement.executeQuery(query);
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                List<String> row = new ArrayList<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnValue = rs.getString(i);
                    row.add(columnValue);
                }
                table.add(row);
            }
        } catch (SQLException e) {
            System.out.println("e.getMessage() = " + e.getMessage());

        }
        DBConnectionClose();
        return table;
    }
}

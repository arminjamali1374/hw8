package org.example.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static java.sql.Connection connection = null;
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String username = "postgres";
    private static final String password = "123456";

    ConnectionUtils() {

    }

    public static java.sql.Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

}


package com.pyruz.singleton.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private final List<Connection> connectionPool;
    private final String url;
    private final String username;
    private final String password;

    private DatabaseConnectionPool(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        connectionPool = new ArrayList<>();
    }

    public static DatabaseConnectionPool getInstance(String url, String username, String password) {
        if (instance == null) {
            instance = new DatabaseConnectionPool(url, username, password);
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        Connection connection = null;
        if (connectionPool.isEmpty()) {
            try {
                connection = DriverManager.getConnection(url, username, password);
                connectionPool.add(connection);
            } catch (SQLException e) {
                System.out.println("Error creating database connection: " + e.getMessage());
            }
        }
        if (connection == null)
            return null;
        return connectionPool.remove(0);
    }

    public synchronized void releaseConnection(Connection connection) {
        connectionPool.add(connection);
    }
}

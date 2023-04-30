package com.pyruz.singleton;

import com.pyruz.singleton.pattern.DatabaseConnectionPool;

import java.sql.Connection;

public class SingletonDemo {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/database";
        String username = "root";
        String password = "password";

        DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance(url, username, password);

        Connection connection1 = pool.getConnection();
        pool.releaseConnection(connection1);

        Connection connection2 = pool.getConnection();
        pool.releaseConnection(connection2);
    }

}

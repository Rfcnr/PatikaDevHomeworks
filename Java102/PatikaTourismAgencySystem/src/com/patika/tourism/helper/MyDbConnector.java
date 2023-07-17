package com.patika.tourism.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDbConnector {

    private Connection myConnection = null;

    private Connection connectDB(){
        try {
            this.myConnection = DriverManager.getConnection(MyDbConstants.DB_URL, MyDbConstants.DB_USER_NAME, MyDbConstants.DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return myConnection;
    }

    public static Connection getInstance(){
        MyDbConnector myDbConnector = new MyDbConnector();
        return myDbConnector.connectDB();
    }
}

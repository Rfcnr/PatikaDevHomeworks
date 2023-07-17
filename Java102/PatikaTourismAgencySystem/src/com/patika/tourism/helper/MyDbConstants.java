package com.patika.tourism.helper;

public class MyDbConstants {

    public static final String DB_URL = "jdbc:mysql://localhost/patika_tourism_agency_system";
    public static final String DB_USER_NAME = "root";
    public static final String DB_PASSWORD = "mysql";
    public static final String DB_TN_HOTEL = "hotel"; //DB_TN -> Database Table Name
    public static final String DB_TN_SEASON = "season";
    public static final String DB_TN_HOTEL_SEASON = "hotel_season";

    private MyDbConstants() {
        //private constructor is created so that no object is created from this class.
    }
}

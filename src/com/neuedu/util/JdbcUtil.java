package com.neuedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUtil {
    private static final String URL=" String url = \"jdbc:mysql://localhost:3306//homework?useUnicode=true&characterEcoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    Connection getConnection(){
        Connection con = null;
        try {
            DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  con;
    }
    /*public static int executepdate(){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        pstmt = con.prepareStatement(sql);
        if(par)
    }*/
}

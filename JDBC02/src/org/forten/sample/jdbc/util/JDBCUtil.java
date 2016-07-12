package org.forten.sample.jdbc.util;

import java.sql.*;

/**
 * Created by Administrator on 2016/7/12.
 */
public interface JDBCUtil {
    static Connection getOracleConnection(){
        return getConnection("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:xe","hr","123456");
    }

    static Connection getConnection(String driverClass,String url,String username,String password){
        Connection conn = null;
        try {
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);// 把默认的数据库自动提交设置为false
        }catch(ClassNotFoundException |SQLException e){
            e.printStackTrace();
        }
        return conn;
    }

    static void close(Connection conn, Statement stat){
        try {
            stat.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    static void close(Connection conn, Statement stat, ResultSet rs){
        try {
            rs.close();
            stat.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

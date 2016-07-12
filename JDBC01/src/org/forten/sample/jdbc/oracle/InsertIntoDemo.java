package org.forten.sample.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2016/7/12.
 */
public class InsertIntoDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载要连接的数据库的主驱动类
        // 通知Java，要连接的数据库是Oracle的
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // 连接数据库用的用户名
        String username = "hr";
        // 连接数据库用的密码
        String password = "123456";
        // 设置连接数据库的URL，通知Java接连哪个数据库：jdbc:oracle:thin:@主机:端口:数据库名
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        // 让Java程序获得对Oracle的数据库连接
        Connection conn = DriverManager.getConnection(url, username, password);

        // 准备执行的SQL语句
        String sql = "INSERT INTO hr.test_person (id,name,email,age) VALUES (1,'Tom','Tom@tom.com',16)";

        // 实例化一个语句对象
        Statement stat = conn.createStatement();
        // 执行sql
        int count = stat.executeUpdate(sql);
        System.out.println("SQL语句执行后影响了" + count + "条数据。");

        // 释放数据库资源
        stat.close();
        conn.close();
    }
}

package org.forten.sample.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2016/7/12.
 */
public class CreateTableDemo {
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
        String sql = "CREATE TABLE hr.test_person(" +
                "    id varchar2(10 char) primary key," +
                "    name varchar2(30 char) not null," +
                "    email varchar2(100 char) unique not null," +
                "    age number(3) DEFAULT 18 not null" +
                ")";

        // 实例化一个语句对象
        Statement stat = conn.createStatement();
        // 执行sql
        boolean flag = stat.execute(sql);
        System.out.println("SQL语句执行结果为：" + flag);

        // 释放数据库资源
        stat.close();
        conn.close();
    }
}

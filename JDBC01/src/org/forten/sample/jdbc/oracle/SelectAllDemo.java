package org.forten.sample.jdbc.oracle;

import java.sql.*;

/**
 * Created by Administrator on 2016/7/12.
 */
public class SelectAllDemo {
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
        String sql = "SELECT * FROM hr.test_person WHERE 1=1 ORDER BY id";

        // 实例化一个语句对象
        Statement stat = conn.createStatement();

        // executeQuery(sql)方法会执行sql语句的查询逻辑，得到数据结果集合（rs）对象
        // rs中是若干记录组成的数据集合，每一行由若干列的值构成（单元格）
        // rs是可以被迭代的，最初指针会指在第一行数据之前的位置
        ResultSet rs = stat.executeQuery(sql);

        // 遍历数据结果集合（rs）对象中的数据，并打印
        // next()方法可以向下移动指针，同时返回是否还有下一行数据的boolean值
        while (rs.next()){
            // 通过rs的getXXX(列索引)方法可以得到某个单元格中的值，注意列的索引值是从1开始，XXX是指返回值的类型
            int id = rs.getInt(1);
            String name = rs.getString(2);
            // 还可以通过rs.getXXX(列名)来得到某个单元素格中的值
            String email = rs.getString("email");
            int age = rs.getInt("age");

            System.out.println(id+":"+name+":"+email+":"+age);
        }

        // 释放数据库资源
        rs.close();
        stat.close();
        conn.close();
    }
}

package org.forten.sample.jdbc.bo;

import org.forten.sample.jdbc.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/13.
 */
public class PersonBo {
    public static int doSave(Person person) throws ClassNotFoundException, SQLException {
        // 获得MySQL数据库的连接
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","123456");

        // 以参数占位符（？）的形式编写要执行的SQL语句，每个参数以一个问号代替
        String sql = "INSERT INTO hr.test_person (id,name,email,age) VALUES (?,?,?,?)";

        // 把使用了参数占位符的SQL语句创建成为JDBC的准备语句对象（PreparedStatement）
        PreparedStatement stat = conn.prepareStatement(sql);

        // 进行参数值与SQL语句中参数占位符之间的绑定
        // 使用准备语句对象的setXXX(index,value)方法来进行参数的绑定，XXX是要绑定参数的类型
        // 其中index是占位符的索引号，从1开始
        // value是参数的值
        stat.setString(1,""+person.getId());
        stat.setString(2,person.getName());
        stat.setString(3,person.getEmail());
        stat.setInt(4,person.getAge());

        // 执行SQL语句，注意，这里不要把sql语句的字符串再以参数的形式传递给executeUpdate()方法了
        int count = stat.executeUpdate();

        // 释放数据库资源
        stat.close();
        conn.close();
        return  count;
    }

    public static int doUpdate(Person p) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","123456");

        String sql = "UPDATE hr.test_person SET name=?,email=?,age=? WHERE id=?";

        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1,p.getName());
        stat.setString(2,p.getEmail());
        stat.setInt(3,p.getAge());
        stat.setString(4,""+p.getId());

        int count = stat.executeUpdate();
        stat.close();
        conn.close();
        return  count;
    }

    public static int doDelete(String id) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","123456");

        String sql = "DELETE FROM hr.test_person WHERE id=?";
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1,id);

        int count = stat.executeUpdate();
        stat.close();
        conn.close();
        return  count;
    }

    public static List<Person> queryByName(String name) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","123456");

        String sql = "SELECT * FROM hr.test_person WHERE id!=1 ";
        if(name!=null&&name.length()>0){
            sql = sql + "AND upper(name) LIKE upper(?)";
        }
        PreparedStatement stat = conn.prepareStatement(sql);
        if(name!=null&&name.length()>0){
            stat.setString(1,"%"+name+"%");
        }

        List<Person> list = new ArrayList<>();
        ResultSet rs = stat.executeQuery();
        while (rs.next()){
            Person p = new Person();
            p.setId(rs.getInt(1));
            p.setName(rs.getString(2));
            p.setAge(rs.getInt(4));
            p.setEmail(rs.getString(3));

            list.add(p);
        }

        rs.close();
        stat.close();
        conn.close();
        return list;
    }
}

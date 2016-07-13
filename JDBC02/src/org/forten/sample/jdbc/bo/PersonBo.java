package org.forten.sample.jdbc.bo;

import org.forten.sample.jdbc.model.Person;
import org.forten.sample.jdbc.util.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
public class PersonBo {
    public static int doSave(Person person) {
        Connection conn = JDBCUtil.getOracleConnection();
        String sql = "INSERT INTO hr.test_person (id,name,email,age) VALUES (" + person.getId() + ",'" + person.getName() + "','" + person.getEmail() + "'," + person.getAge() + ")";
        System.out.println(sql);
        Statement stat = null;
        int count = execute(conn, stat, sql);
        return count;
    }

    public static int doDelete(int id) {
        Connection conn = JDBCUtil.getOracleConnection();
        String sql = "DELETE FROM hr.test_person WHERE id=" + id;
        Statement stat = null;
        int count = execute(conn, stat, sql);
        return count;
    }

    public static int doUpdate(Person person) {
        Connection conn = JDBCUtil.getOracleConnection();
        String sql = "UPDATE hr.test_person SET name='" + person.getName() + "',email='" + person.getEmail() + "',age=" + person.getAge() + " WHERE id=" + person.getId();
        Statement stat = null;
        int count = execute(conn, stat, sql);
        return count;
    }

    public static List<Person> queryAll() {
        Connection conn = JDBCUtil.getOracleConnection();
        String sql = "SELECT * FROM hr.test_person WHERE 1=1";
        Statement stat = null;
        ResultSet rs = null;
        List<Person> personList = new ArrayList<>();
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()){
                Person p = new Person();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setEmail(rs.getString(3));
                p.setAge(rs.getInt(4));

                personList.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stat,rs);
        }

        return personList;
    }

    public static List<Person> queryUser(String name){
        Connection conn = JDBCUtil.getOracleConnection();
        String sql = "SELECT * FROM hr.test_person WHERE id!=1 ";
        if(name!=null&&name.length()>0){
            sql = sql + "AND name LIKE '%"+name+"%'";
        }
        System.out.println(sql);
        Statement stat = null;
        ResultSet rs = null;
        List<Person> personList = new ArrayList<>();
        try {
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()){
                Person p = new Person();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setEmail(rs.getString(3));
                p.setAge(rs.getInt(4));

                personList.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(conn,stat,rs);
        }

        return personList;
    }

    private static int execute(Connection conn, Statement stat, String sql) {
        int count = -1;
        try {
            stat = conn.createStatement();
            count = stat.executeUpdate(sql);
            // 在关闭数据库连接之前，JDBC会自动进行事务的提交
            JDBCUtil.close(conn, stat);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}

package org.forten.sample.jdbc.test;

import org.forten.sample.jdbc.bo.PersonBo;
import org.forten.sample.jdbc.model.Person;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/7/13.
 */
public class PersonBoTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Person p = new Person(5,"吕布","lb@163.com",42);
//        System.out.println(PersonBo.doSave(p));
//        p.setAge(50);
//        p.setName("吕大布");
//        System.out.println(PersonBo.doUpdate(p));
//        System.out.println(PersonBo.doDelete("5"));
        List<Person> list = PersonBo.queryByName("");
        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println("======================");
        list = PersonBo.queryByName("M");
        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println("======================");
        list = PersonBo.queryByName("m");
        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println("======================");
        list = PersonBo.queryByName("' OR '1%'='1");
        for(Person p : list){
            System.out.println(p);
        }
        System.out.println("======================");
    }
}

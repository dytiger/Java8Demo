package org.forten.sample.jdbc.test;

import org.forten.sample.jdbc.bo.PersonBo;
import org.forten.sample.jdbc.model.Person;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
public class PersonBoTest {
    public static void main(String[] args) {
        Person p = new Person(4,"张辽","zl@163.com",40);
        // System.out.println(PersonBo.doSave(p));
        p = new Person(4,"张飞","zf@126.com",43);
        System.out.println(PersonBo.doUpdate(p));
        //System.out.println(PersonBo.doDelete(4));
        List<Person> list = PersonBo.queryAll();
        for (Person person:list) {
            System.out.println(person);
        }
    }
}

package org.forten.sample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/7/5.
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student s1 = new Student("Tom",18,"tom@tom.com");


        System.out.println(s1.getClass().getName());
        System.out.println(s1.getClass().getSimpleName());

        Field[] fields = s1.getClass().getDeclaredFields();
        for (Field f:fields) {
            f.setAccessible(true);
            System.out.println(f.getName()+":"+f.get(s1));
        }

        Method[] methods = s1.getClass().getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m.getName());
        }

        Method m = s1.getClass().getMethod("setName",String.class);
        m.invoke(s1,"Mike");// s1.setName("Mike");
        System.out.println(s1);

        for(Field f : fields){
            Annotation ann = f.getAnnotation(IndexField.class);
            if(ann!=null){
                System.out.println(f.getName());
            }
        }
    }
}

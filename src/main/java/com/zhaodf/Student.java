package com.zhaodf;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student extends Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args){
        try {

            Class clazz = Class.forName("com.zhaodf.Student");
            MyAnnotation clazzAnnotation = (MyAnnotation) clazz.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+clazzAnnotation.value());

//
//            Field field = clazz.getDeclaredField("name");
//            MyAnnotation fieldAnnotation = field.getAnnotation(MyAnnotation.class);
//            System.out.println(clazzAnnotation.desc()+","+fieldAnnotation.value());
//
//
            Constructor constructor = clazz.getConstructor(String.class);
            MyAnnotation constructorDeclaredAnnotation = (MyAnnotation) constructor.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+constructorDeclaredAnnotation.value());
//
//
            Method method = clazz.getMethod("sayHello",String.class);
            MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+methodAnnotation.value());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.zhaodf;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@MyAnnotation(value = "person")
public class Person {
    @MyAnnotation(value = "name")
    private String name;

    @MyAnnotation
    public Person(){

    }

    @MyAnnotation(value = "public Person()")
    public Person(String name){
        this.name = name;
    }

    @MyAnnotation(value = "sayhello")
    public String sayHello(String name){
        return name +" say hello!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        try {

            Class clazz = Class.forName("com.zhaodf.Person");
            MyAnnotation clazzAnnotation = (MyAnnotation) clazz.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+clazzAnnotation.value());


            Field field = clazz.getDeclaredField("name");
            MyAnnotation fieldAnnotation = field.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+fieldAnnotation.value());


            Constructor constructor = clazz.getConstructor(String.class);
            MyAnnotation constructorDeclaredAnnotation = (MyAnnotation) constructor.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+constructorDeclaredAnnotation.value());


            Method method = clazz.getMethod("sayHello",String.class);
            MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+methodAnnotation.value());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

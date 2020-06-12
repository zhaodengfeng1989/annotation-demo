package com.zhaodf;

/**
 * 类：Teacher
 *
 * @author zhaodf
 * @date 2020/6/12
 */
public class Teacher implements IPerson{
    @Override
    public void sayHello() {
        System.out.println("teacher say hello!");
    }


    public static void main(String[] args){
//        Teacher teacher = new Teacher();
//        teacher.sayHello();
        Class clazz = null;
        try {
            clazz = Class.forName("com.zhaodf.Teacher");
            MyAnnotation clazzAnnotation = (MyAnnotation) clazz.getAnnotation(MyAnnotation.class);
            System.out.println(clazzAnnotation.desc()+","+clazzAnnotation.value());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

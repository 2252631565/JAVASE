package com.songqiao;

public class Person {
    public Person(){
        Student student=new Student();
        student.get();
    }
    public static void getp(){
        System.out.println("Person被调用123！");
    }

}

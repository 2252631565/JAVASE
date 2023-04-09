package com.songqiao;

public class mStatic {
    public static void main(String[] args) {
        Student student=new Student();
        student.age=21;

        System.out.println(student.age+student.name);

        Student student1=new Student();
        student1.age=14;

        System.out.println(student1.age+student1.name);
    }
}

package com.songqiao;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("哈哈哈");
        System.out.println(student.getName());
//        用static修饰的变量可以使用类名直接调用
        Integer ag = Student.age;
        System.out.println(ag);
    }
}

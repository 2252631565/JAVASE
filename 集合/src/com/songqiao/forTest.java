package com.songqiao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class forTest {
    public static void main(String[] args) {
        Student s1=new Student(12,"松桥123");
        Student s2=new Student(13,"子旋1234231");
        Student s3=new Student(14,"鹏鹏");
        List<Student> collection= new ArrayList<>();
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);

        Iterator<Student> iterator=collection.iterator();
//                  使用for循环遍历
        for (int i = 0; i < collection.size(); i++) {
//            如果集合是Collection,因为它没有get()方法 所以使用迭代器的next方法，因为是list集合所以可以用Get();
            System.out.println(iterator.next());
//            System.out.println(collection.get(i));
        }
        System.out.println("---------------------------------------");
//                  增强for循环遍历
        for(Student student:collection){
            System.out.println(student);
        }
        System.out.println("---------------------------------------");
//        使用lambda遍历
//        collection.forEach(new Consumer<Student>() {
//            @Override
//            public void accept(Student student) {
//                System.out.println(student);
//            }
//        });
        collection.forEach(student -> System.out.println(student));


    }
}

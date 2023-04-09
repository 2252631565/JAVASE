package com.songqiao;


import java.util.ArrayList;

import java.util.Collections;


public class ArraylistTest {
    public static void main(String[] args) {
//        初始化集合
        ArrayList<String> list =new ArrayList<>();
//        添加集合元素
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("d");
        list.add("e");
//        排序集合元素
        Collections.sort(list);
//        获取指定集合元素
        System.out.println(list.get(1));
//        获取集合大小
        System.out.println(list.size());
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
//        判断是否为空
        System.out.println(list.isEmpty());
//        清空集合元素
        list.clear();
        System.out.println(list);


    }
}

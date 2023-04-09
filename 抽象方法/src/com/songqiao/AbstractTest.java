package com.songqiao;

public class AbstractTest {
    public static void main(String[] args) {
        Dog dog=new Dog("桥哥");
        dog.eat();
        dog.breath();

        IMPL impl=new IMPL();
        impl.eat();
    }
}
abstract class Animal{
    public String name;

    public Animal(String name){
        System.out.println(name);
    }

    public abstract void eat();

    public void breath(){
        System.out.println("呼吸");
    }

}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void eat(){
        System.out.println("狗吃屎");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
}


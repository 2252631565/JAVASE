package com.songqiao;

public interface IMP{
    public void eat();
}

class IMPL implements IMP{
    @Override
    public void eat() {
        System.out.println("我还在吃");
    }
}
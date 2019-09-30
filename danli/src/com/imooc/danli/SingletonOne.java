package com.imooc.danli;

//饿汉式：创建对象实例的时候就初始化。空间换时间。
public class SingletonOne {

//    1创建类中的私有构造方法
private SingletonOne(){
    }

//    2创建该类型的私有静态实例
    private static SingletonOne singletonOne=new SingletonOne();


//    3创建公有静态方法返回静态实例对象
    public static SingletonOne getSingletonOne(){
        return singletonOne;
    }
}

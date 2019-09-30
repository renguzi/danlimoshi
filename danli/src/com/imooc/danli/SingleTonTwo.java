package com.imooc.danli;

//懒汉式，用时间换空间
public class SingleTonTwo {


//    1私有化的构造方法
    private SingleTonTwo(){}

//    2创建当前类的私有静态实例；
    private static SingleTonTwo singleTonTwo=null;

//    3返回当前类的静态实例的公共静态方法
    public static SingleTonTwo getSingleTonTwo(){
//        如果是第一次调用的话，发现其并没有被实例化过，所以调用前面的私有化构造方法来实例化；否则，就直接返回该类的静态实例对象
        if (singleTonTwo == null) {
            singleTonTwo=new SingleTonTwo();
        }
        return singleTonTwo;
    }

}

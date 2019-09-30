package com.imooc.danli;

public class Test {
    public static void main(String[] args) {
        SingletonOne one=SingletonOne.getSingletonOne();
        SingletonOne two=SingletonOne.getSingletonOne();
        System.out.println(one);
        System.out.println(two);


        SingleTonTwo singleTonTwo=SingleTonTwo.getSingleTonTwo();
        SingleTonTwo singleTonTwo1=SingleTonTwo.getSingleTonTwo();

        System.out.println(singleTonTwo);
        System.out.println(singleTonTwo1);


    }
}

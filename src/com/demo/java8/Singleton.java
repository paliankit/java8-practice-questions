package com.demo.java8;

public class Singleton {

    public static volatile Singleton instance;

    public Singleton(){

    }
    public Singleton getInstance(){
        if(instance==null){
            synchronized (this){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}

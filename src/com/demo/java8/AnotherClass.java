package com.demo.java8;

public class AnotherClass extends Constant{

    //this class was created for better understanding of overriding,overloading
    //while extending another class

    public void printThis(int a){
        System.out.println("This is printed from another class");
        super.printThis();
    }

    {
        System.out.println("this is a block");
    }

    static {
        System.out.println("this is a static block");
    }
}

package com;

public class OuterClass {

    private int num = 5;

    class InnerClass{
    }

    public InnerClass initializeInnerClass (){
             return new InnerClass();
    }
}

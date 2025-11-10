package com.heima.extends2;

/**
 * ClassName: Fu
 * Package: com.heima.extends2
 */
public class Fu {
    public void privateMethod(){
        System.out.println("privateMethod");
    }
    void method(){
        System.out.println("method");
    }
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu fu=new Fu();
        fu.privateMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}

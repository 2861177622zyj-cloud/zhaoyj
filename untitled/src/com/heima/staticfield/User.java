package com.heima.staticfield;

/**
 * ClassName: User
 * Package: com.heima.staticfield
 */
public class User {
    private static int count=0;
    public User(){
        count++;
    }
    public static int getCount(){
        return count;
    }

}

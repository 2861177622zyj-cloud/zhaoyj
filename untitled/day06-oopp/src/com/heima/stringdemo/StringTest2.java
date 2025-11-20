package com.heima.stringdemo;

/**
 * ClassName: StringTest2
 * Package: com.heima.stringdemo
 */
public class StringTest2 {
    public static void main(String[] args) {
        //生成验证码
        String code=getCode(4);
        System.out.println(code);

    }
    public static String getCode(int n){
        //创建一个字符串，包含所有字符
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuioplkjhgfdsazxcvbnm0123456789";
        //创建一个字符串，用于保存生成的验证码
        String code = "";
        for(int i=0;i<n;i++){
            int index = (int)(Math.random()*str.length());
            code+=str.charAt(index);
        }
        return code;
    }
}

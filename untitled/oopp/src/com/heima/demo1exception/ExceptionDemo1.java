package com.heima.demo1exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: ExceptionDemo1
 * Package: com.heima.demo1exception
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        show();
        try {
            show2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static  void show2() throws Exception{
        System.out.println("程序开始");
        String str="2024-07-09 11:12:13";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        Date date=sdf.parse(str);
        System.out.println( date);
        System.out.println("程序结束");

        InputStream is=new FileInputStream("D:/meinv.png");
    }
    public static void show(){
        int[] arr={1,2,3,};
        System.out.println(arr[2]);
    }

}

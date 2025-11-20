package com.heima.Generic1;

import java.util.ArrayList;

/**
 * ClassName: GeneriDemo1
 * Package: com.heima.GenericDemo1
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("22");


        //获取数据
        for (int i=0;i<list.size();i++){
      /*      Object re=list.get(i);
            String s=(String)re;
            System.out.println( s);

*/

            String s=list.get(i);
            System.out.println(s);

        }
    }
}

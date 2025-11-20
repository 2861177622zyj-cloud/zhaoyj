package com.heima.lambda;

import java.util.Arrays;

/**
 * ClassName: Demo3
 * Package: com.heima.lambda
 */
public class Demo3 {
    public static void main(String[] args) {
        //英文名字
        String[] names ={"Tom","Jerry","Mike","Mary","Andy","曹操","anan"};

     /*   //Arrays.sort(names);//默认排序
        //忽略大小写
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);// 忽略大小写
            }
        });*/
//
        Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));//忽略大小写

        System.out.println(Arrays.toString(names));//[Andy, Jerry, Mike, Mary, Tom]
    }
}

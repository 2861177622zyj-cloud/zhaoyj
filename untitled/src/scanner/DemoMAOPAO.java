package scanner;

import java.util.Arrays;

/**
 * ClassName: DemoMAOPAO
 * Package: scanner
 */
public class DemoMAOPAO {
    public static void main(String[] args) {
        int[]a={1,3,54,3,653,4,7,32,5};
        int[] sort=sort(a);
        System.out.println(Arrays.toString(sort));
        }
    public static int[]sort(int[] array)
    {
        //临时变量
        int temp=0;
        boolean flag=false;
        // 外层循环：控制排序的轮数
        for (int i = 0; i < array.length-1; i++)
        {
            // 内层循环：控制每轮比较的次数
            // 每轮结束后，最大的元素会"冒泡"到数组末尾，因此下一轮可少比较i次
            // 循环范围：从0到"数组长度-1-i"（减i是因为末尾i个元素已排好序）
            for (int j = 0; j < array.length-1-i; j++)
            {
                if(array[j+1]<array[j])
                {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
        }
        return array;
    }
}

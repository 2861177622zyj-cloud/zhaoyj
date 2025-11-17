package scanner;

import java.util.Scanner;

/**
 * ClassName: Demo02
 * Package: scanner
 */
public class Demo02 {

    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);

        double sum=0;
        int m=0;
        while(scanner.hasNextDouble()){
            double x= scanner.nextDouble();
            m=m+1;
            sum=sum+x;
            System.out.println(m+"个数字的和为："+sum);
        }
        System.out.println(m+"个数字的和为："+sum);
        System.out.println("平均数为"+(sum /m));
    }
}

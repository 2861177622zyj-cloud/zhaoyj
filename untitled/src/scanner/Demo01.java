package scanner;


import java.util.Scanner;

public class Demo01 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next接受");
        if(scanner.hasNext())
        {
            String str=scanner.next();
            System.out.println("输入的内容为"+str);

        }
    }

}

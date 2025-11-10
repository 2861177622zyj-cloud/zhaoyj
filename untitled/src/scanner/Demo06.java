package scanner;

import java.util.Scanner;

/**
 * ClassName: Dome06
 * Package: scanner
 */

    public class Demo06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true; // 控制循环是否继续

        // 循环显示计算器主界面
        while (running) {
            System.out.println("===== 简易计算器 =====");
            System.out.println("1. 加法");
            System.out.println("2. 减法");
            System.out.println("3. 乘法");
            System.out.println("4. 除法");
            System.out.println("5. 退出");
            System.out.print("请选择操作(1-5)：");

            int choice;
            // 处理用户输入的操作选择
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("输入错误，请输入数字！");
                scanner.next(); // 清除错误输入
                continue;
            }

            // 如果选择退出，结束循环
            if (choice == 5) {
                running = false;
                System.out.println("感谢使用，再见！");
                continue;
            }

            // 输入两个运算数
            System.out.print("请输入第一个数字：");
            double num1;
            try {
                num1 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("输入错误，请输入有效的数字！");
                scanner.next(); // 清除错误输入
                continue;
            }

            System.out.print("请输入第二个数字：");
            double num2;
            try {
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("输入错误，请输入有效的数字！");
                scanner.next(); // 清除错误输入
                continue;
            }

            // 使用 switch 语句执行相应的运算
            double result = 0;
            boolean valid = true;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " × " + num2 + " = " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("错误：除数不能为0！");
                        valid = false;
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " ÷ " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("无效的选择，请重新输入！");
                    valid = false;
            }

            if (valid) {
                System.out.println("---------------------");
            }
        }

        scanner.close();
    }
}

package com.heima.demo2;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: com.heima.demo2
 */
public class Test {
    public static void main(String[] args) {
    JD [] jds =new JD[4];
    jds[0]=new TV("小米电视",true);
    jds[1]=new WashMachine("美的洗衣机",false);
    jds[2]=new Lamp("LED灯泡",true);
    jds[3]=new AIR("美的空调",false);

    SmartHomeControl smartHomeControl=new SmartHomeControl();
    //处理电视机
        smartHomeControl.control(jds[0]);
        while (true) {
            smartHomeControl.printAllStatus(jds);
            System.out.println("请选择要控制的设备");
            Scanner sc = new Scanner(System.in);//创建扫描器
            String command = sc.next();//输入命令
            switch (command) {
                case "1":
                    smartHomeControl.control(jds[0]);
                    break;
                case "2":
                    smartHomeControl.control(jds[1]);
                    break;
                case "3":
                    smartHomeControl.control(jds[2]);
                    break;
                case "4":
                    smartHomeControl.control(jds[3]);
                    break;
                case"exit":
                    System.out.println("退出APP");
                    return;
                default:
                    System.out.println("输入有误");
            }
        }
    }
}

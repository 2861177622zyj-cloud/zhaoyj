package com.heima.demo2;

/**
 * ClassName: SmartHomeContral
 * Package: com.heima.demo2
 */
//智能家居控制类
public class SmartHomeControl {
    public void control(JD jd) {
        System.out.println(jd.getName()+"状态目前是："+(jd.isStatus()?"开着":"关着"));
        System.out.println("开始您的操作");
        jd.press();//按一下开关
        System.out.println(jd.getName()+"状态目前是："+(jd.isStatus()?"开着":"关着"));
    }

    public void printAllStatus(JD[] jds) {
        for(int i=0;i<jds.length;i++)
        {
            JD jd=jds[i];
            System.out.println(jd.getName()+"状态目前是："+(jd.isStatus()?"开着":"关着"));
        }
    }
}

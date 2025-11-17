package com.heima.lambda;

import com.heima.interclass3.Student;

import javax.swing.*;
import java.util.Arrays;

/**
 * ClassName: LambdaDemo2
 * Package: com.heima.lambda
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
       test1();
       test2();

    }
    public static void test1(){
        Student[] students = new Student[6];
        students[0] = new Student("殷素素", 35, 171.5, '女');
        students[1] = new Student("杨幂", 28, 168.5, '女');
        students[2] = new Student("张无忌", 25, 181.5, '男');
        students[3] = new Student("小昭", 19, 165.5, '女');
        students[4] = new Student("赵敏", 27, 167.5, '女');
        students[5] = new Student("刘亦菲", 36, 168, '女');


/*  Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                return o2.getAge() - o1.getAge(); // 按照年龄降序！
            }
        });
*/

        Arrays.sort(students, (o1, o2) -> o2.getAge() - o1.getAge() );



        // 遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
    public static void test2(){
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setLocationRelativeTo(null); // 居中显示。
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        win.add(panel);

        JButton btn = new JButton("登录");
        panel.add(btn);



          /* btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录成功！");
            }
        });*/

        btn.addActionListener(e -> System.out.println("登录成功！"));


        win.setVisible(true);
    }
}


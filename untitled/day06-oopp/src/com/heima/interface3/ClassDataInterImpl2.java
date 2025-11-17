package com.heima.interface3;

/**
 * ClassName: ClassDataInterImpl1
 * Package: com.heima.interface3
 */
public class ClassDataInterImpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        int maleCount=0;
        for(int i=0;i<students.length;i++){
            Student s=students[i];
            System.out.println("姓名："+s.getName()+"，性别" + "："+s.getSex()+"，成绩："+s.getScore());
            if(s.getSex()=='男'){
                maleCount++;
            }
        }
        System.out.println("全班男性学生人数为："+maleCount);
        System.out.println("全班女性学生人数为："+(students.length-maleCount));
    }

    @Override
    public void printAverageScore() {
        //平均分（去掉最高分和最低分）
        System.out.println("平均分如下：");
        Student s1=students[0];
        double sum=s1.getScore();//存储所有学生的总分
        double max=s1.getScore();//存储所有学生的最高分
        double min=s1.getScore();//存储所有学生的最低分
        for(int i=1;i<students.length;i++){
            Student s=students[i];
            sum+=s.getScore();
            if(s.getScore()>max){
                max=s.getScore();
            }
            if(s.getScore()<min){
                min=s.getScore();
            }
        }
        System.out.println("去掉最高分和最低分后的总成绩为："+(sum-max-min));
        System.out.println("去掉最高分和最低分后的总人数为："+(students.length-2));
        System.out.println("去掉最高分和最低分后的平均成绩为："+(sum-max-min)/(students.length-2));
    }
}

package com.heima.javabean;

/**
 * ClassName: StudentSOperocter
 * Package: com.heima.javabean
 */
public class StudentSOperator {
    private Student s;//记住将来要操作的学生对象
    public StudentSOperator(Student s){
        this.s=s;
    }
    public void printTotalScore(){
        System.out.println(s.getName()+"的总分是："+(s.getChinese()+s.getMath()));
    }
    public void printAverageScore(){
        System.out.println(s.getName()+"的算数平均分是："+(s.getChinese()+s.getMath())/2);

    }


}

package javase;

/**
 * ClassName: Application
 * Package: javase
 */
public class Application {
    public static void main(String[] args) {
     Student s1=new Student();

     s1.setName("秦");
        System.out.println(s1.getName());
     s1.setAge(900);
        System.out.println(s1.getAge());
    }
}

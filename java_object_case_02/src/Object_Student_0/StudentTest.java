package Object_Student_0;
// static Java 修饰符 可以给变量和方法修饰，修饰后成为静态变量和静态方法
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张三",16,"男");
        Student s2 = new Student("美四",15,"女");
//        静态成员的赋值方式有两种
//        s1.teacher = "三上悠亚";
        Student.teacher = "三上悠亚";

        s2.study();
        s1.sleep();
    }
}

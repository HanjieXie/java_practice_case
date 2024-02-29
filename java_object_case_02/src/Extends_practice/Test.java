package Extends_practice;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.id = 1;
        teacher.id = 2;

        student.name = "海绵宝宝";
        teacher.name = "蟹老板";

        student.age = 14;
        teacher.age = 24;

        student.todo();

        System.out.println("学生的名字："+student.getName());
    }
}

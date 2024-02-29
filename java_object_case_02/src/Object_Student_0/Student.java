package Object_Student_0;
// 一个学生JavaBeans类

public class Student {
    private String name;
    private int age;
    private String sex;

/*
* 静态方法的注意事项：
*   静态方法中没有 this
*   静态方法中只能访问静态变量
*   非静态方法可以访问所有
*
* 静态和非静态的加载方式：
*   静态是随着“类”加载的
*   非静态是随着“对象”加载的
*
* */
    public static String teacher;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void study() {
        System.out.println(name + "在学习");
    }

    public void sleep() {
        System.out.println(teacher + "在巡逻发现" + name + "在打瞌睡");
    }
}

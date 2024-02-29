package Extends_practice;

/*
*
* 继承注意事项：
*   1.构造方法不能继承
*   2.公共和私有成员变量pubilc和private都可以继承
*   3.公共成员方法可以继承
*
*  */

public class People {
    public int id;
    public String name;
    public int age;

    public People() {
    }

    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void todo(){
        System.out.println("他们都会吃喝拉撒睡！！！");
    }
}

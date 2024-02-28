package FinalArrayPractice5;

import java.util.Scanner;

/*
* 定义长度为3的默认学生数据数组，学生属性有：学号，姓名，年龄
*
* 需求1：再次添加学生对象，再添加的时候进行学号唯一性判断是否添加
* 需求2：添加完毕之后显示所有学生数据
* 需求3：可以通过id删除学生数据，如果id存在则进行删除，不存在则提示删除失败，没有查找到学生信息
* 需求4：删除完毕之后刷新数据
* */
public class StudentsTest {
    public static void main(String[] args) {
        Students[] students = new Students[3];
//        默认数据
        students[0] = new Students(000, "孙尚香",24);
        students[1] = new Students(001, "公孙离",22);
        students[2] = new Students(002, "刘备",25);
//        键盘录入新数据信息
//        Scanner sc = new Scanner(System.in);
    }
}

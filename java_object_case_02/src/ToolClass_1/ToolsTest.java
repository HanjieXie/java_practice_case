package ToolClass_1;

import java.util.ArrayList;

/*
 * 需求：编写一个工具类 ArrayUtil
 * 工具类提供printArr和getAerage两个方法，用于返回整数数组内容和返回平均分。
 * */
public class ToolsTest {
    public static void main(String[] args) {
//      第一个工具类，输出整数数组
        int[] arr1 = {1, 2, 3, 4, 5};
        String ArrString = ArrayUtil.printArr(arr1);
        System.out.println(ArrString);
//      第二个工具类，求平均值
        double[] arr2 = {1.5, 3.7, 4.9, 5.8, 6.6};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
//      第三个工具类，获取最大年龄
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("张三",24);
        Student student2 = new Student("李四",25);
        Student student3 = new Student("王五",26);

        list.add(student1);
        list.add(student2);
        list.add(student3);

        int maxValue = ArrayUtil.getMaxAge(list);
        System.out.println("最大值为："+ maxValue);

    }
}

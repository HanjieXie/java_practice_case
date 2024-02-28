package ScannerPractice;
/*
* 定义数组储存三部汽车对象
* 汽车的属性有：品牌，价格，颜色
* 创建三个汽车对象，通过键盘录入，储存数据，并把数据储存到数组中
* */


import java.util.Scanner;

/*
* 键盘录入方法和注意事项：
*
* 第一套体系：遇到空格，回车就回终止接收
* nextInt()：接收整数
* nextDouble()：接收小数
* next()：接收字符串
*
*
*第二套体系：
*
* */
public class ScannerDemo {
    public static void main(String[] args) {
//        第一套录入体系

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一次录入的数据：");
//        int sc1 = sc.nextInt();     // 123 456
//        System.out.println("第一次录入的数据为：" + sc1); // 123
//        /*
//         * 若第一次输入的数据中存在 "空格" 或 "回车" 后面的程序将会默认将第一次录入空格后面的数据默认录入到下次的键盘输入中
//         * */
//        System.out.println("请输入第二次录入的数据：");
//        int sc2 = sc.nextInt();
//        System.out.println("第二次录入的数据为：" + sc2); //456


//        第二套体系
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一次录入的数据：");
        String sc1 = sc.nextLine();     // 123 456
        System.out.println("第一次录入的数据为：" + sc1); // 123 456
        /*
         * 若第一次输入的数据中存在 "空格" 或 "回车" 后面的程序将会默认将第一次录入空格后面的数据默认录入到下次的键盘输入中
         * */
        System.out.println("请输入第二次录入的数据：");
        String sc2 = sc.nextLine();
        System.out.println("第二次录入的数据为：" + sc2); //



    }
}

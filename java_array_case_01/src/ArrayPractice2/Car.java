package ArrayPractice2;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        CarType[] arr = new CarType[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请录入第"+ (i + 1) + "个汽车数据信息：");

//            创建汽车对象
            CarType carType = new CarType();
            System.out.println("请录入汽车品牌：");
            String name = sc.next();
            carType.setName(name);

            System.out.println("请录入汽车颜色：");
            String color = sc.next();
            carType.setColor(color);

            System.out.println("请录入汽车价格：");
            int price = sc.nextInt();
            carType.setPrice(price);
//        将录入的汽车数据存储在汽车信息数组里面
            arr[i] = carType;
        }
//        遍历查看已录入的汽车数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println("已录入的汽车数据有："+ arr[i].getName()+"-颜色-"+arr[i].getColor()+"-价格-"+arr[i].getPrice());
        }

    }
}

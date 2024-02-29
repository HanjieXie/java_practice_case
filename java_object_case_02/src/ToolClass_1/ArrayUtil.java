package ToolClass_1;

import java.util.ArrayList;

public class ArrayUtil {
    //    私有化构造方法，目的是为了不让外界创建它的对象
    private ArrayUtil() {

    }
//    工具方法，需要定义为静态的方法才能方便调用


    //    1.用于返回整数数组内容
    public static String printArr(int[] arr) {
//        StringBuilder用于字符串拼接
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuilder.append(arr[i]);
            } else {
                stringBuilder.append(arr[i]).append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    //    2.用于返回平均数
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

//    获取最大集合中最大的年龄
    public static int getMaxAge(ArrayList<Student> list){
//        对比项,假设它是最大的数字
        int max = list.get(0).getAge();
//        循环遍历对比，假设的最大值
        for (int i = 0; i < list.size(); i++) {
            int tampAge = list.get(i).getAge();
            if (tampAge > max){
                max = list.get(i).getAge();
            }
        }
        return max;
    }



}

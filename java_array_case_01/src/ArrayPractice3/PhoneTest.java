package ArrayPractice3;

/*
 * 定义一个数组储存三部手机对象
 * 手机的属性：品牌，价格，颜色
 * 需求：计算三部手机的平均价格
 * */
public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("IPhone 14", 6899, "深邃黑");
        phones[1] = new Phone("IPhone 14 Pro", 7899, "天空蓝");
        phones[2] = new Phone("IPhone 14 Pro Max", 9899, "暗夜紫");
        int sum = 0;
        for (int i = 0; i < phones.length; i++) {
//        i是索引，phones[i]元素
//            在循环遍历中得到当前遍历的元素
            Phone phone = phones[i];
            sum += phone.getPrice();
        }
//      求手机平均值
        double valuePrice = sum*1.0 / phones.length;
        System.out.println("三台手机的平均值为：" + valuePrice);  //8232.333333333334
//      由于小数是参与运算的导致数据不精确，所以需要使用到 BigDecimal 精确运算
    }
}

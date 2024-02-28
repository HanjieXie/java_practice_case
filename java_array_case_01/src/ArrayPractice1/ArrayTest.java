package ArrayPractice1;

/*
* 定义数组储存三个商品对象
* 商品属性：ID，名称，价格，库存
* 创建三个商品对象，并把商品对象存到数组中
* */
public class ArrayTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("0","手机",5899.0,1);
        Goods g2 = new Goods("1","耳机",899.0,1);
        Goods g3 = new Goods("2","鼠标",599.0,1);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println("对象数组里的商品有："+goods.getName()+"价格："+goods.getPrice());
        }
    }
}

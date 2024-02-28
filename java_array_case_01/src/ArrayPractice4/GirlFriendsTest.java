package ArrayPractice4;

/*
 * 定义数组存储女朋友对象
 * 女朋友属性有：姓名，年龄，性别，爱好
 * 需求1：计算出女朋友们的平均年龄
 * 需求2：统计出比平均年龄低的女朋友，打印她们的信息
 * */
public class GirlFriendsTest {
    public static void main(String[] args) {
        int sum = 0;
        GirlFriends[] girlFriends = new GirlFriends[3];
        girlFriends[0] = new GirlFriends("小美", 24, "萝莉", "打篮球");
        girlFriends[1] = new GirlFriends("小丽", 26, "御姐", "爬山");
        girlFriends[2] = new GirlFriends("小靓", 23, "胖墩", "跑步");
//        1.求女朋友们的年龄总和
        for (int i = 0; i < girlFriends.length; i++) {
            sum += girlFriends[i].getAge();
        }
        System.out.println("女朋友们的年龄总和为：" + sum);
//        2.求平均值
        int valueAge = sum / girlFriends.length;
        System.out.println("女朋友们的平均年龄为：" + valueAge);
        for (int g = 0; g < girlFriends.length; g++) {
            if (girlFriends[g].getAge() < valueAge || girlFriends[g].getAge() == valueAge){
                System.out.println((g+1)+"."+girlFriends[g].getName()+",年龄："+girlFriends[g].getAge()+"，她喜欢"+girlFriends[g].getHobby());
            }
        }


    }
}

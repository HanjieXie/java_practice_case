package FightGame;

import java.util.Random;

public class Role {
    //    私有化变量
    private String name;
    private int blood;


    //    空参
    public Role() {
    }

    //    全参
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    //    生成针对私有化成员变量的Getter 和 Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

//    Methods 定义方法
//    攻击方法,方法调用者攻击被攻击人，参数为被攻击人
    public void attack(Role role) {
//        this为当前调用对象，攻击者
//        实例技能和伤害值
        Weapon[] weapons = new Weapon[3];
        weapons[0] = new Weapon("【一技能】", 10);
        weapons[1] = new Weapon("【二技能】", 20);
        weapons[2] = new Weapon("【三技能】", 30);
//        生成随机伤害值
        Random r = new Random();
        int weaponIndex = r.nextInt(weapons.length);
        Weapon weapon = weapons[weaponIndex];
        int hurt = weapon.getDamage();
//        判断被攻击人血量，当被攻击人的血量小于0，则赋值为0，
        int remainBoold = role.getBlood() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
//        更改被攻击人的血量
        role.setBlood(remainBoold);
        System.out.println(this.getName() + "使用" + weapon.getName() + "攻击了" + role.getName() + "造成了" + hurt + "点伤害" + role.getName() + "还有" + remainBoold + "滴血。");
    }
}

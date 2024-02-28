package FightGame;

public class FightGameTest {
    public static void main(String[] args) {
        Role r1 = new Role("露娜",100);
        Role r2 = new Role("孙悟空",100);

//      因为不知道要循环多少次,使用While(true)开始循环开始决斗
        while (true){
//            r1击回合开始
            r1.attack(r2);
//      攻击完后判断血量，当血量为0则结束
            if (r2.getBlood() == 0){
                System.out.println(r1.getName()+"击败了"+r2.getName());
                break;
            }

//      r2击回合开始
            r2.attack(r1);
//      攻击完后判断血量，当血量为0则结束
            if (r1.getBlood() == 0){
                System.out.println(r2.getName()+"击败了"+r1.getName());
                break;
            }
        }
    }
}

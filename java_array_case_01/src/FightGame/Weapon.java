package FightGame;

public class Weapon {
//    技能名称
    private String name;
//    技能伤害点数
    private int damage;

    public Weapon() {
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

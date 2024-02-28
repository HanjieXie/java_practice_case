package ArrayPractice4;

public class GirlFriends {
    private String name;
    private int age;
    private String sex;
    private String hobby;

    public GirlFriends() {
    }

    public GirlFriends(String name, int age, String sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

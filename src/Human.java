import java.util.Map;

public class Human {
    private String name;
    private int age;
    private Human mother;
    private Human father;



    public Human(String name, int age, Human mother, Human father) {
        this.name = name;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mother=" + mother +
                ", father=" + father +
                '}';
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

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }
}

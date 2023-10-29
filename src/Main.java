import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Human> people = new ArrayList<>();
        Human person1 = new Human("Maria", 29, new Human("Anna", 49, null, null), new Human("David", 52, null, null));
        Human person2 = new Human("Robert", 24, new Human("Paola", 54, null, null), new Human("Sam", 57, null, null));
        Human person3 = new Human("Sara", 38, new Human("Scarlett", 50, null, null), new Human("Tom", 49, null, null));
        Human person4 = new Human("Nick", 31, new Human("Catrin", 45, null, null), new Human("Rob", 59, null, null));

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        List<Human> parents = people.stream()
                .flatMap(person -> Stream.of(person.getMother(), person.getFather()))
                .filter(Objects::nonNull)
                .toList();
        System.out.println(parents);



        List<String> list =  people.stream()
                .filter(person -> person.getAge() > 25)
                .map(person -> person.getMother() != null ? person.getMother().getName() : "Нет информации о матери")
                .toList();

        System.out.println(list);










    }
}
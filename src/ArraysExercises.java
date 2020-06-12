import java.util.Arrays;
public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person person) {

        Person[] newPerson = Arrays.copyOf(array, array.length + 1);
        newPerson[newPerson.length - 1] = person;
        return newPerson;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = {new Person("Kali"), new Person("Tex"), new Person("Mabel")};
//        people[0].setName("Kali");
//        people[1].setName("Tex");
//        people[2].setName("Kali");
        for (Person p : people) {
            System.out.println(p.getName());
        }
        System.out.println(Arrays.toString(addPerson(people, new Person("Aaron"))));
        for (int i = 0; i < Arrays.toString(addPerson(people, new Person("Aaron"))).length(); i++) {
            System.out.println(Arrays.toString(addPerson(people, new Person("Aaron"))));
        }
//        System.out.println(Arrays.toString(people));
    }
}

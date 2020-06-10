public class Person {
    private String name = "Aaron";
    public String getName() {
        return name;
    }
    public void setName(String input) {
        this.name = input;
    }
    public void sayHello() {
        System.out.println("Hello!, " + name + "!");
    }

    public Person(String name) {
        setName(name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Kali");
//        System.out.println(p1.name);
        Person p2 = new Person("Tex");
        Person p3 = new Person("Mabel");
//        p2.sayHello();
//        p3.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}

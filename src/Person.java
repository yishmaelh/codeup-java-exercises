public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The name entered is: " + name);
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

//This is a constructor to set the entered name to the string

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("Lewis");
        System.out.println(person.getName());
        person.sayHello();
        person.setName("Joe");
        System.out.println(person.getName());

        // These should return true
        // EDIT: only one was true; == in java doesn't compare value, but reference

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        // This should be true
        // Is true
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        // Should output John and John, then Jane and Jane
        // Outputs as expected
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }

}

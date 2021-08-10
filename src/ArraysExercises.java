import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] gundamPilots = new Person[3];
        gundamPilots[0] = new Person("Judau");
        gundamPilots[1] = new Person("Domon");
        gundamPilots[2] = new Person("Allenby");
        for (int i = 0; i < gundamPilots.length; i++) {
            System.out.println(gundamPilots[i].getName());
        }

//        System.out.println(Arrays.toString(addPerson(gundamPilots, new Person("Kamille"))));


    }

    public static Person[] addPerson(Person[] people, Person Jerid) {
        //Use copy to create new array equal to array length+1
        //Add parameter to new array
        //Return new array with added parameter
        Person[] newPerson = Arrays.copyOf(people, people.length + 1);
        newPerson[newPerson.length - 1] = Jerid;
        return newPerson;

    }
}


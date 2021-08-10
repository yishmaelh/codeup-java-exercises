import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args){

        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        Person[] gundamPilots = new Person[3];
        gundamPilots[0] = new Person("Judau");
        gundamPilots[1] = new Person("Domon");
        gundamPilots[2] = new Person("Allenby");

    }
}

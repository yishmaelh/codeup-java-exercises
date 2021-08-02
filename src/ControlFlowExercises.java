public class ControlFlowExercises {

    public static void main(String[] args) {

        int startingNumber = 5;
        while (startingNumber <= 15) {
            System.out.println("Current number is: " + startingNumber);
            startingNumber++;


        }

        int addTwos = 0;
        do {
            System.out.println(addTwos);
            addTwos += 2;
        } while (addTwos <= 100);

    }
}

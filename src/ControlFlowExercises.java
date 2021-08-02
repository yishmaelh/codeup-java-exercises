public class ControlFlowExercises {

    public static void main(String[] args) {

//        int startingNumber = 5;
//        while (startingNumber <= 15) {
//            System.out.println("Current number is: " + startingNumber);
//            startingNumber++;
//
//
//        }
//
//        int addTwos = 0;
//        do {
//            System.out.println(addTwos);
//            addTwos += 2;
//        } while (addTwos <= 100);
//
//        int minusFive = 100;
//        do {
//            System.out.println(minusFive);
//            minusFive -= 5;
//        } while (minusFive >= -10);
//
//        int square = 2;
//        do {
//            System.out.println(square);
//            square *= square;
//        } while (square < 1000000 & (square > 1));

        // Refactoring previous code via for loop

        for (int startNumber = 5; startNumber <= 15; startNumber++) {
            System.out.print("\n" + startNumber);
        }

    }
}

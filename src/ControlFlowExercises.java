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

//        for (int startNumber = 5; startNumber <= 15; startNumber++) {
//            System.out.print("\n" + startNumber);
//        }
//
//        for (int plusTwo = 2; plusTwo <= 100; plusTwo += 2){
//            System.out.print("\n" + plusTwo);
//        }
//
//        for (int squared = 2; squared < 1000000 & (squared > 1); squared *= squared) {
//            System.out.print("\n" + squared);
//        }
//
//        for (int lessFive = 100; lessFive >= -10; lessFive -= 5) {
//            System.out.print("\n" + lessFive);
//        }

        int i = 1;
        while (i < 100) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0) {
                System.out.println(" Fizz");
            } else {
                System.out.println(i);
            }
            i++;
        }


    }
}

public class MethodsExercises {

    public static double add(double x, double y) {
        return x + y;

    }


    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiple(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double h, double i) {
        return h / i;
    }

    public static double modulus(double x, double y) {
        return x % y;
    }

    public static void main (String[] args) {

        System.out.println(add(6, 7));
        System.out.println(subtract( 10, 8));
        System.out.println(multiple(5, 20));
        System.out.println(divide( 25, 5));
        System.out.println(modulus(100, 10));

    }



}

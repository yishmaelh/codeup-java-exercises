package util;

public class InputTest {

    public static void main(String[] args){
    Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt());
        System.out.println(input.getDouble(1,15));
        System.out.println(input.getDouble());
    }
}

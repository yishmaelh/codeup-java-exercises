public class Person {

    private String name;
    public String getName(){
        return name;
    }

public void setName(String name){
        this.name = name;
        System.out.println("The name entered is: " + name);
}

public void sayHello(){
        System.out.println("Hello, " + name);
}

//This is a constructor to set the entered name to the string

public Person(String name){
        this.name = name;
}

public static void main(String[] args){

}

}

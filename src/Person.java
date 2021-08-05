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

}

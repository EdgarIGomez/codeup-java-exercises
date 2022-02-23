import java.util.Scanner;

public class Person {

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello from " + name);
    }

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person edgar = new Person("Edgar");
        System.out.println(edgar.getName());
        edgar.setName("Eddy");
        edgar.sayHello();
        System.out.println();
// 1. Understanding References

        //First one will be true as it compares the strings and second will be false cause it is comparing objects
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        //Equal will be true because person2 = person1
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //Person 2 will be Jane and person 1 will be John
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
// Since person 2 = person 1 it probably gets its info from there, so it changes there as well when person 2 is changed


    }
}

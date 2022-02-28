import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    public static Person[] addPerson(String personName, Person[] array){
//        String[] newArray = new String[array.length + 1];
        int newArrayLength = array.length + 1;

        Person[] newArray = Arrays.copyOf(array, newArrayLength);
        Person newPerson = new Person(personName);
        newArray[newArrayLength -1] = newPerson;

        for(Person people : newArray){
            System.out.println(people.getName());
        }
        return newArray;



    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] numbers = {1, 2, 3, 4, 5};
        //Each object has its own toString() methods which prints out its objects class followed by an @ with its hashcode
        //Need Array.toString() to turn it into a readable array- StackOverflow
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));
        Person[] person = new Person[3];
        Person ed = new Person("Edgar");
        person[0] = ed;
        Person danny = new Person("Danny");
        person[1] = danny;
        Person jasper = new Person("Jasper");
        person[2] = jasper;

        for(Person people : person){
            System.out.println(people.getName());
        }

        System.out.println("Give a new Person name");
        String newPerson = scanner.nextLine();
        person = addPerson(newPerson, person);

        System.out.println();
        for(Person people : person){
            System.out.println(people.getName());
        }

    }
}

package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public static String getString(){
        System.out.print("Input your word: ");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        System.out.print("Can you give a confirmation: ");
        scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")
                || input.equalsIgnoreCase("confirm") || input.equalsIgnoreCase("affirmative")
        || input.equalsIgnoreCase("sure")){
            return true;
        }else {
            return false;
        }
    }

    public static int getInt(int min, int max){
        System.out.printf("Give a number between %s and %s: ", min, max);
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input >= min && input <= max){
            return input;
        }else {
            System.out.printf("%nThat's not a number between %s and %s try again.%n", min, max);
           return getInt(min, max);
        }
    }

    public static int getInt(){
        System.out.print("Input a integer number: ");
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public static double getDouble(double min, double max){
        System.out.printf("Give a number with decimals between %s and %s: ", min, max);
        scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        if(input > min && input < max){
            return input;
        }else {
            System.out.printf("%nThat's not a number with a decimal between %s and %s try again.%n", min, max);
            return getDouble(min, max);
        }
    }

    public static double getDouble(){
        System.out.print("Input a number with a decimal: ");
        scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        return input;
    }

    public static String getString(String prompt){
        System.out.println(prompt);
        System.out.print("Can you input a string: ");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean yesNo(String prompt){
        System.out.println(prompt);
        System.out.print("Can you give a confirmation: ");
        scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")
                || input.equalsIgnoreCase("confirm") || input.equalsIgnoreCase("affirmative")
                || input.equalsIgnoreCase("sure")){
            return true;
        }else {
            return false;
        }
    }

    public static int getInt(int min, int max, String prompt){
        System.out.println(prompt);
        System.out.printf("Give a number between %s and %s: ", min, max);
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input > min && input < max){
            return input;
        }else {
            System.out.printf("%nThat's not a number between %s and %s try again.%n", min, max);
            return getInt(min, max);
        }
    }

    public static int getInt(String prompt){
        System.out.println(prompt);
        System.out.print("Input a integer number: ");
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    public static double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
        System.out.printf("Give a number with decimals between %s and %s: ", min, max);
        scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        if(input > min && input < max){
            return input;
        }else {
            System.out.printf("%nThat's not a number with a decimal between %s and %s try again.%n", min, max);
            return getDouble(min, max);
        }
    }

    public static double getDouble(String prompt){
        System.out.println(prompt);
        System.out.print("Input a number with a decimal: ");
        scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        return input;
    }
}

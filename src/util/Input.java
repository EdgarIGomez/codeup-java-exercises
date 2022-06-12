package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public static String getString(){
//        System.out.print("Input your word: ");
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean yesNo(){
//        System.out.print("Can you give a confirmation: ");
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

//        scanner = new Scanner(System.in);
        try{
            System.out.printf("Enter a number between %s and %s: ", min, max);
            String inputString = getString();
            int parsedInput = Integer.valueOf(inputString);
            if(parsedInput >= min && parsedInput <= max){
                return parsedInput;
            }else {
                System.out.printf("%nThat's not a number between %s and %s try again.%n", min, max);
                return getInt(min, max);
            }
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);

        }
        return getInt(min, max);
    }

    public static int getInt(){
//        System.out.print("Input a integer number: ");
//        scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        return input;
        try{
            String inputString = getString();
            int parsedInput = Integer.valueOf(inputString);
            return parsedInput;
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);
        }
        return getInt();
    }

    public static double getDouble(double min, double max){
        try{
            System.out.printf("Give a number with decimals between %s and %s: ", min, max);
            double input = Double.valueOf(getString());
            if(input > min && input < max){
                return input;
            }else {
                System.out.printf("%nThat's not a number with a decimal between %s and %s try again.%n", min, max);
                return getDouble(min, max);
            }
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);
        }
//        scanner = new Scanner(System.in);
//        double input = scanner.nextDouble();
        return getDouble(min, max);
    }

    public static double getDouble(){
        try{
            System.out.print("Input a number with a decimal: ");
            scanner = new Scanner(System.in);
//            double input = scanner.nextDouble();
            double input = Double.valueOf(getString());
            return input;
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);
        }
        return getDouble();
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
//        System.out.printf("Give a number between %s and %s: ", min, max);
//        scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        if(input > min && input < max){
//            return input;
//        }else {
//            System.out.printf("%nThat's not a number between %s and %s try again.%n", min, max);
//            return getInt(min, max);
//        }
       return getInt(min, max);
    }

    public static int getInt(String prompt){
        System.out.println(prompt);
//        System.out.print("Input a integer number: ");
//        scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        return input;
        return getInt();
    }

    public static double getDouble(double min, double max, String prompt){
        System.out.println(prompt);
//        System.out.printf("Give a number with decimals between %s and %s: ", min, max);
//        scanner = new Scanner(System.in);
//        double input = scanner.nextDouble();
//        if(input > min && input < max){
//            return input;
//        }else {
//            System.out.printf("%nThat's not a number with a decimal between %s and %s try again.%n", min, max);
//            return getDouble(min, max);
//        }
        return getDouble(min, max);
    }

    public static double getDouble(String prompt){
        System.out.println(prompt);
//        System.out.print("Input a number with a decimal: ");
//        scanner = new Scanner(System.in);
//        double input = scanner.nextDouble();
//        return input;
        return getDouble();
    }

    public static int getBinary(){
        try{
            String inputString = getString();
            int parsedInput = Integer.valueOf(inputString, 2);
            return parsedInput;
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);
        }
        return getBinary();
    }

    public static int getBinary(String prompt){
        System.out.println(prompt);
        try{
            String inputString = getString();
            int parsedInput = Integer.valueOf(inputString, 2);
            return parsedInput;
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);
        }
        return getBinary();
    }

    public static int getHexadecimal(){
        try{
            String inputString = getString();
            int parsedInput = Integer.valueOf(inputString, 16);
            return parsedInput;
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);
        }
        return getHexadecimal();
    }

    public static int getHexadecimal(String prompt){
        System.out.println(prompt);
        try{
            String inputString = getString();
            int parsedInput = Integer.valueOf(inputString, 16);
            return parsedInput;
        }catch(NumberFormatException numberFormatException){
            System.out.println("You did not enter a number");
            System.out.println("numberFormatException = " + numberFormatException);
        }
        return getHexadecimal();
    }
}

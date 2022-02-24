import jdk.jshell.Snippet;

import java.util.Scanner;

import java.util.Random;

public class MethodsExercises {
    public static int add (int numberOne, int numberTwo){
        int added = numberOne + numberTwo;
//        System.out.println(added);
        return added;
    }
    public static int subtract(int numberOne, int numberTwo){
        int subtracted = numberOne - numberTwo;
        return subtracted;
    }

    public static int multiply(int numberOne, int numberTwo){
        int multiplied = numberOne * numberTwo;
        return multiplied;
    }

    public static float divide(int numberOne, int numberTwo){
        float divided = (float) numberOne / numberTwo;
        return divided;
    }

    public static int modulus(int numberOne, int numberTwo){
        int leftOver = numberOne % numberTwo;
        return leftOver;
    }

    public static int multiplyWithoutStar(int numberOne, int howManyTimes){
        int base = numberOne;
        for(int i = 1; i < howManyTimes; i++){
            numberOne = add(base, numberOne);
            if(i == howManyTimes - 1){
                return numberOne;
            }
        }
        return numberOne;
    }

    public static int multiplyWithRecursion(int numberOne, int numberTwo){
        if(numberTwo <= 1){
            return numberOne;
        }

        return numberOne + multiplyWithRecursion(numberOne, numberTwo - 1);
    }

    public static String getInt(int min, int max){
       Scanner scanner = new Scanner(System.in);
       int userNum = scanner.nextInt();
        if(userNum <= 10 && userNum >= 1){
            return "Your number is between 1 and 10!";
        }else {
            System.out.println("That number is not between 1 and 10 try again.");
            return getInt(1, 10);
        }

    }

    public static long factorialLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number between 1 and 20: ");
        long userNum = scanner.nextInt();
        long startPoint = 1;
        String response = "yes";
        do{
            if(userNum >= 1 && userNum <= 20){
                for(int i = 1; i <= userNum; i++){
                    startPoint = startPoint * i;
                    if(i == userNum){
                        System.out.printf("The factorial of %s is: %s%n", userNum, startPoint);
                        System.out.print("Do you wish to continue?: [Yes/No] ");
                        response = scanner.next();
                        if(response.equalsIgnoreCase("yes")) {
                            System.out.print("Input new higher number: ");
                            userNum = scanner.nextInt();
                            startPoint = 1;
                            break;
                        }

                    }
                }
            }else {
                System.out.println("That's not between 1 and 20 try again");
                factorialLoop();

            }


        } while(response.equalsIgnoreCase("yes"));


        return startPoint;
    }


    public static long factorialRecursion(long num) {
        Scanner scanner = new Scanner(System.in);
        long result = 0;
        if (num >= 1 && num <= 20) {
            result = num * factorialRecursion(num - 1);
            System.out.println(result);
            return result;
        } else{

            return 1;

        }
    }

    public static void dicePrompter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many sides does your dice have: ");
        int diceSides = scanner.nextInt();
        System.out.print("Would you like to roll the dice? [Y/N] ");
        String confirmation = scanner.next();
        if(confirmation.equalsIgnoreCase("Y")){
            diceRoller(diceSides);
        }
        System.out.print("Okay then maybe next time.");

    }
    public static int diceRoller(int diceSides) {
        Scanner scanner = new Scanner(System.in);
        int rollOne = diceRoll(diceSides);
        int rollTwo = diceRoll(diceSides);
        System.out.printf("You're first roll was a %s and you're second one was a %s%n", rollOne, rollTwo);
        System.out.print("Would you like to roll again? [Y/N] ");
        String response = scanner.next();
        if (response.equalsIgnoreCase("Y")){
            System.out.print("Would you like to roll the same dice? [Y/N] ");
            String confirmation = scanner.next();
            if(confirmation.equalsIgnoreCase("Y")){
                diceRoller(diceSides);
            }else {
                System.out.print("How many sides does the new dice have?: ");
                int newDice = scanner.nextInt();
                diceRoller(newDice);
            }
        }
        return rollOne;
    }

    public static int diceRoll(int diceSides){
        Random roll = new Random();
        int randomSide = diceSides + 1;
        int rollResult = roll.nextInt(randomSide);
        if(rollResult == 0){
            return diceRoll(diceSides);
        }
        return rollResult;
    }
    public static void main(String[] args){
//        System.out.println(add(10, 20));
//        System.out.println(subtract(30, 10));
//        System.out.println(multiply(5, 20));
//        System.out.println(divide(90, 20));
//        System.out.println(modulus(450, 32));
//        System.out.println(multiplyWithoutStar(4, 9));
//        System.out.println(multiplyWithRecursion(4, 4));
//
//        System.out.print("Choose a number between 1 and 10: ");
//        String userInput = getInt(1, 10);
//        System.out.println(userInput);
//        factorialLoop();
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input a number between 1 and 20: ");
//        long userNum = scanner.nextInt();
//        factorialRecursion(userNum);
        dicePrompter();
    }
}

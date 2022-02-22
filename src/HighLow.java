import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static int randomNum(){
        Random random = new Random();
        int upperLimit = 101;
        return random.nextInt(upperLimit);

    }

    public static int validateUserInput(int userNum){
        Scanner scanner = new Scanner(System.in);
        if (userNum < 1 || userNum > 100) {
            System.out.print("Please input a number between 1 - 100: ");
            userNum = scanner.nextInt();
        }
        return userNum;
    }

    public static void guessingGame(int userNum, int randomNum){
        Scanner scanner = new Scanner(System.in);
        String userResponse = "Y";
        int counter = 0;
        int triesLeft = 10;
        do {
            if(userNum > randomNum){
                triesLeft--;
                System.out.println("LOWER");
                System.out.printf("Guess lower you have %s tries left: ", triesLeft);
                int newNum = scanner.nextInt();
                userNum = validateUserInput(newNum);
                counter++;
            }else if(userNum < randomNum){
                triesLeft--;
                System.out.println("HIGHER");
                System.out.printf("Guess higher you have %s guesses left: ", triesLeft);
                int newNum = scanner.nextInt();
                userNum = validateUserInput(newNum);
                counter++;
            }else{
                System.out.println("GOOD GUESS!");
                System.out.printf("It took you only %s tries would you like to play again [Y/N]: ",counter);
                userResponse = scanner.next();
                if (userResponse.equalsIgnoreCase("Y")) {
                    highLowGame();
                }else{
                    triesLeft = 0;
                }
            }
        }while(triesLeft != 0);



    }

    public static void highLowGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Let's play a guessing game choose a number between 1 - 100 you have 10 tries: ");
        int userNum = scanner.nextInt();
        int validatedUserNum = validateUserInput(userNum);
        int randomNumber = randomNum();
        guessingGame(validatedUserNum, randomNumber);

    }


    public static void main(String[] args) {
        highLowGame();
    }
}

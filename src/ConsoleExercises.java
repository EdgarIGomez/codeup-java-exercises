import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("%.2f%n", pi);
//
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter an integer: ");
        int userInputNum = scanner.nextInt();
        System.out.println("You have entered --> \"" + userInputNum + "\" <--");
//        //If an Integer is not inputted it will give an error of Exception in thread "main" java.util.InputMismatchException.
//
        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next(); //can use nextLine() to grab last word to use next line for rest of exercise
//
        System.out.printf("First Word: %s" + "\n" + "Second Word: %s" + "\n" + "Third Word: %s" + "\n", firstWord, secondWord, thirdWord);
//        //If less than 3 words are put will keep asking for input until 3 words are inputted.
//        //If more than 3 words are inputted it will only grab the first three and then drop the rest.
//
          Scanner scan = new Scanner(System.in); //Have to make new scanner because it just skips over entering new sentence
          scan.useDelimiter("\n");
        System.out.print("Enter a sentence: ");//Has to do with the other scanner usage as when does are commented out it works
        String sentence = scan.nextLine(); //next() doesn't make a new line so nextLine() takes the rest of the line then starts a new one
        System.out.printf("Your sentence was: %s \n", sentence);
//        //scanner.useDelimiter("\n");


        System.out.print("Enter width and length of room: ");
        String width = scan.nextLine();
        String length = scan.nextLine();
        String height = scan.nextLine();
        System.out.printf("The width is %s, the length is %s , and the height is %s \n", width, length, height);

        int perimeter = (Integer.parseInt(width) + Integer.parseInt(length)) * 2;
        System.out.printf("The perimeter is %s \n", perimeter);
        int area = Integer.parseInt(width) * Integer.parseInt(length);
        System.out.printf("The area is %s \n", area);
        int volume = Integer.parseInt(width) * Integer.parseInt(length) * Integer.parseInt(height);
        System.out.printf("The volume is %s %n", volume);

//        double perimeter = (Double.parseDouble(width) + Double.parseDouble(length)) * 2;
//        System.out.printf("The perimeter is %s \n", perimeter);
//        Double area = Double.parseDouble(width) * Double.parseDouble(length);
//        System.out.printf("The area is %s \n", area);
//        double volume = Double.parseDouble(width) * Double.parseDouble(length) * Double.parseDouble(height);
//        System.out.printf("The volume is %s %n", volume);

//        System.out.print("Enter width and length of room: ");
//        int width = scan.nextInt();
//        int length = scan.nextInt();
//        int height = scan.nextInt();
//        System.out.printf("The width is %s, the length is %s , and the height is %s %n", width, length, height);
//
//        int perimeter = (width + length) * 2;
//        System.out.printf("The perimeter is %s %n", perimeter);
//        int area = width * length;
//        System.out.printf("The area is %s %n", area);
//        int volume = width * length * height;
//        System.out.printf("The volume is %s %n", volume);




    }
}

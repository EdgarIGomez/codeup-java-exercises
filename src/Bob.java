import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bob says hi to you.");
        String keepTalking;
        do{
            System.out.print("What do you say to Bob: ");
            String userResponse = scanner.nextLine();
            if(userResponse.isEmpty()){
                System.out.println("Bob: \"Fine. Be that way!\"");
                System.out.print("Say something to Bob? [Yes/No]");
                keepTalking = scanner.nextLine();
            }else {
                int userResponseLastIndex = userResponse.length();
                char punctuation = userResponse.charAt(userResponseLastIndex - 1);
                if(punctuation == '?'){
                    System.out.println("Bob: \"Sure\"");
                    System.out.print("Keep talking to Bob? [Yes/No]");
                    keepTalking = scanner.nextLine();
                }else if(punctuation == '!'){
                    System.out.println("Bob: \"Whoa chill out!\"");
                    System.out.print("Keep talking to Bob? [Yes/No]");
                    keepTalking = scanner.nextLine();
                }else {
                    System.out.println("Bob: \"Whatever.\"");
                    System.out.print("Keep talking to Bob? [Yes/No]");
                    keepTalking = scanner.nextLine();
                }
            }

        }while(keepTalking.equalsIgnoreCase("Yes"));

        System.out.println("Bob: Bye");
    }
}

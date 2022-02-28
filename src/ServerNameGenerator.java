public class ServerNameGenerator {

    public static String serverName(String[] first, String[] second){
        int firstNum = (int) ((Math.random() * (9)) + 0);
        int secondNum = (int) ((Math.random() * (9)) + 0);
        System.out.println(firstNum);
        System.out.println(secondNum);
        String serverName = first[firstNum] + "-" + second[secondNum];
//        System.out.println(serverName);
        return serverName;


    }

    public static void main(String[] args) {
        String[] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Tasty", "Dedicated"};
        String[] nouns = {"Dog", "Cat", "Fish", "Monkey", "Lion", "Tiger", "Bear", "Wolf", "Bird", "Rabbit"};
        String newServerName = serverName(adjectives, nouns);
        System.out.println(newServerName);
    }
}
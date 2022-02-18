import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        1a.
//        int a = 5;
//        while(a <= 15) {
//            System.out.printf("%s ", a);
//            a++;
//    }

//        1b.
//        int zero = 0;
//        do{
//            System.out.println(zero);
//            zero += 2;
//        }while(zero <= 100);
//
//        int hundred = 100;
//        do{
//            System.out.println(hundred);
//            hundred -= 5;
//        }while(hundred >= -10);
//
//        long two = 2;
//        do{
//            System.out.println(two);
//             two *= two;
//        }while(two < 1000000);
//
////        1c.
//        for(int i = 0; i <= 100; i +=2){
//            System.out.println("i is at: " + i);
//        }
//
//        for(int i = 5; i <= 15; i++){
//            System.out.println("i is currently at: " + i);
//        }
//
//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//
//        for(long i = 2; i < 1000000; i *=i) {
//            System.out.println(i);
//        }

//        2.
//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

//        3.
        Scanner scanner = new Scanner(System.in);
//        Makes new table
//        System.out.print("What number would you like to go up to: ");
//        long num = scanner.nextLong();
//        System.out.println("Here is you table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for(long i = 1; i <= num; i++){
//            long squared = i * i;
//            long cubed = i * i * i;
//            System.out.printf("%s       | %s       | %s    %n", i, squared, cubed);
//            if(i == num){
//                System.out.println("Do you wish to continue: [Yes/No]");
//                String response = scanner.next();
//                if(response.equalsIgnoreCase("Yes")){
//                     i = 0;
//                    System.out.print("Enter another number: ");
//                     num = scanner.nextLong();
//                     continue;
//                } else{
//                    System.out.println("Until next time!");
//                    break;
//                }
//            }
//        }

//        Doesn't make new table
//        System.out.print("What number would you like to go up to: ");
//        long num = scanner.nextLong();
//        System.out.println("Here is you table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for(long i = 1; i <= num; i++){
//            long squared = i * i;
//            long cubed = i * i * i;
//            System.out.printf("%s       | %s       | %s    %n", i, squared, cubed);
//            if(i == num){
//                System.out.println("Do you wish to continue: [Yes/No]");
//                String response = scanner.next();
//                if(response.equalsIgnoreCase("Yes")){
//                    System.out.print("Enter another number: ");
//                    num = scanner.nextLong();
//                    continue;
//                } else{
//                    System.out.println("Until next time!");
//                    break;
//                }
//            }
//        }

//        4.
        String response;
        do {
            System.out.print("What is your grade ");
            int grade = scanner.nextInt();
            if (grade <= 59) {
                System.out.println("You got an F let's try a little harder next time.");
                System.out.println("Do you wish to input another grade? [Yes/No]");
                response = scanner.next();
            } else if(grade <= 66){
                if(grade <= 62){
                    System.out.println("You got a D- you almost passed keep trying.");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else if(grade <=64){
                    System.out.println("You got a D you almost passed keep trying.");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else{
                    System.out.println("You got a D+ you almost passed keep trying.");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }

            } else if(grade <= 79){
                if(grade <= 70){
                    System.out.println("You got a C- you passed.");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else if(grade <= 75){
                    System.out.println("You got a C you passed.");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else{
                    System.out.println("You got a C+ you passed.");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }

            }else if(grade <= 87){
                if(grade <=82){
                    System.out.println("You got a B- good job!");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else if(grade <= 85){
                    System.out.println("You got a B good job!");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else{
                    System.out.println("You got a B+ good job!");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }

            }else {
                if(grade <= 91){
                    System.out.println("You got an A- congratulations!");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else if(grade <= 95){
                    System.out.println("You got an A congratulations!");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }else{
                    System.out.println("You got an A+ congratulations!");
                    System.out.println("Do you wish to input another grade? [Yes/No]");
                    response = scanner.next();
                }

            }
        }while(response.equalsIgnoreCase("Yes"));

    }
}

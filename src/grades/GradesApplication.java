package grades;

import java.util.HashMap;

import util.Input;

public class GradesApplication {



    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student ed = new Student("Edgar");
        ed.addGrade(100);
        ed.addGrade(90);
        ed.addGrade(85);
        Student ramon = new Student("Ramon");
        ramon.addGrade(88);
        ramon.addGrade(95);
        ramon.addGrade(100);
        Student tomas = new Student("Tomas");
        tomas.addGrade(99);
        tomas.addGrade(89);
        tomas.addGrade(95);
        Student jorge = new Student("Jorge");
        jorge.addGrade(88);
        jorge.addGrade(84);
        jorge.addGrade(100);

        students.put("EdEddOrEddy", ed);
        students.put("RamenNoodles", ramon);
        students.put("TommyCoder", tomas);
        students.put("JorgeOfTheJungle", jorge);

        gradeApplicationMenu(students);
    }

    public static void gradeApplicationMenu(HashMap<String, Student> students){
            System.out.printf("Welcome to our app!%nHere are the GitHub Usernames of all our students.%n");
        for(String key : students.keySet()){
            System.out.printf("| %s | ", key);
            }
        System.out.printf("%nWhich student would you like to see.%n");
        String student = Input.getString();
        if(students.containsKey(student)){
            System.out.printf("Name: %s | GitHub Username: %s | Grade Average: %.2f%n", students.get(student).getName(), student, students.get(student).gradeAverage());
            System.out.printf("Would you like to see another student.%n");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                gradeApplicationMenu(students);
            }
        }else{
            System.out.println("There is not a student with that name here. Would you like to see a student");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                gradeApplicationMenu(students);
            }
        }
    }
}

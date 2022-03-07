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
        ed.recordAttendance("2022-01-03", "P");
        ed.recordAttendance("2022-01-04", "P");
        ed.recordAttendance("2022-01-05", "P");
        ed.recordAttendance("2022-01-06", "A");
        Student ramon = new Student("Ramon");
        ramon.addGrade(88);
        ramon.addGrade(95);
        ramon.addGrade(100);
        ramon.recordAttendance("2022-01-03", "A");
        ramon.recordAttendance("2022-01-04", "A");
        ramon.recordAttendance("2022-01-05", "P");
        ramon.recordAttendance("2022-01-06", "P");
        Student tomas = new Student("Tomas");
        tomas.addGrade(99);
        tomas.addGrade(89);
        tomas.addGrade(95);
        tomas.recordAttendance("2022-01-03", "P");
        tomas.recordAttendance("2022-01-04", "P");
        tomas.recordAttendance("2022-01-05", "P");
        tomas.recordAttendance("2022-01-06", "P");
        Student jorge = new Student("Jorge");
        jorge.addGrade(88);
        jorge.addGrade(84);
        jorge.addGrade(100);
        jorge.recordAttendance("2022-01-03", "A");
        jorge.recordAttendance("2022-01-04", "A");
        jorge.recordAttendance("2022-01-05", "A");
        jorge.recordAttendance("2022-01-06", "P");

        students.put("EdEddOrEddy", ed);
        students.put("RamenNoodles", ramon);
        students.put("TommyCoder", tomas);
        students.put("JorgeOfTheJungle", jorge);

        gradeApplicationMenu(students);
    }

    public static void gradeApplicationMenu(HashMap<String, Student> students){
        System.out.println("Welcome to our app!");
        System.out.printf("1: Check Individual students%n2: Check Overall grade average%n3: Get CSV report of all students%n");
        int choice = Input.getInt(1, 3);
        if(choice == 1){
            System.out.printf("Here are the GitHub Usernames of all our students.%n");
            for(String key : students.keySet()){
                System.out.printf("| %s | ", key);
            }
            System.out.printf("%nWhich student would you like to see.%n");
            String student = Input.getString();
            if(students.containsKey(student)){
                System.out.printf("Name: %s | GitHub Username: %s | Grade Average: %.2f | Attendance: %s%n Here is a list of their grades: %s%n ", students.get(student).getName(), student, students.get(student).gradeAverage(), students.get(student).attendancePercentage() ,students.get(student).getGrades());
                System.out.printf("Would you like to see another student.%n");
                boolean confirmation = Input.yesNo();
                if(confirmation){
                    gradeApplicationMenu(students);
                }
            }else {
                System.out.println("There is not a student with that name here. Would you like to see a student");
                boolean confirmation = Input.yesNo();
                if (confirmation) {
                    gradeApplicationMenu(students);
                }
            }
        }else if(choice == 2){
            double total = 0;
            for(String key : students.keySet()){
                total += students.get(key).gradeAverage();
            }
            double totalAverage = total / students.size();
            System.out.printf("The overall grade average of all the students is: %.2f", totalAverage);
            System.out.printf("Would you like to keep using the add?%n");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                gradeApplicationMenu(students);
            }
        }else if(choice == 3){
            System.out.println("CSV Reports:");
            for(String key : students.keySet()){
                System.out.printf("%s, %s, %.2f, %s%n", students.get(key).getName(), key, students.get(key).gradeAverage(), students.get(key).attendancePercentage());
            }

            System.out.printf("Would you like to keep using the app?.%n");
            boolean confirmation = Input.yesNo();
            if(confirmation){
                gradeApplicationMenu(students);
            }
        }
    }
}

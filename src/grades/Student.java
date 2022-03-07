package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    private HashMap<String, String> attendance;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
        attendance = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double gradeAverage(){
        double total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        double average = total / grades.size();
        return average;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

    public void recordAttendance(String date, String value){
        if(value.toUpperCase(Locale.ROOT).equals("P") || value.toUpperCase(Locale.ROOT).equals("A")){
            attendance.put(date, value.toUpperCase(Locale.ROOT));
        }else{
            System.out.println("Wrong values were inputted.");
        }
    }

    public String attendancePercentage(){
        double daysPresent = 0;
        for(String key : attendance.keySet()){
           if(attendance.get(key).equalsIgnoreCase("P")){
               daysPresent += 1;
           }
        }
        String percentage = ((daysPresent / attendance.size()) * 100) + "%";
        return percentage;
    }

    public ArrayList<String> absentDates(){
        ArrayList<String> absentDays = new ArrayList<>();
        for(String key : attendance.keySet()){
            if(attendance.get(key).equals("A")){
                System.out.println(key);
                absentDays.add(key);
            }
        }
        return absentDays;
    }

    public static void main(String[] args) {
        Student ed = new Student("Edgar");
        ed.addGrade(100);
        ed.addGrade(90);
        ed.recordAttendance("2022-01-03", "A");
        ed.recordAttendance("2022-01-04", "P");
        System.out.println(ed.getName());
        System.out.println("ed.gradeAverage() = " + ed.gradeAverage());
        System.out.println("ed.getGrades() = " + ed.getGrades());
        System.out.println("ed.attendancePercentage() = " + ed.attendancePercentage());
        System.out.println("ed.absentDates() = " + ed.absentDates());
    }

}

package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
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

    public static void main(String[] args) {
        Student ed = new Student("Edgar");
        ed.addGrade(100);
        ed.addGrade(90);
        System.out.println(ed.getName());
        System.out.println("ed.gradeAverage() = " + ed.gradeAverage());
    }
}

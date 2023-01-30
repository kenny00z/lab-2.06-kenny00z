package classes;

import java.util.Random;

public class Student {

    private String name;

    private int grade;


    public Student(String name) {

        this.name = name;
        this.grade = (int) (Math.random()*100+0);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

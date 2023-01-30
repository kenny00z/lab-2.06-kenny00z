package main;

import classes.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String, Student> myMap = new HashMap<>();
        Student juan = new Student("Juan");
        Student yisus = new Student("Yisus");
        Student eva = new Student("Eva");
        Student mork = new Student("Mork");
        myMap.put(juan.getName(),juan);
        myMap.put(yisus.getName(),yisus);
        myMap.put(eva.getName(),eva);
        myMap.put(mork.getName(),mork);

       // Map<String, Student> myMapReturn = incremental(myMap);
    }

    public static Map<String, Student> incremental (Map<String, Student> m){

        Map<String, Student> mynewMap = new HashMap<>();
        for( Student s:m.values()){

            s.setGrade(s.getGrade()+(s.getGrade()*100/10));
            mynewMap.put(s.getName(),s);
        }

        return mynewMap;
    }

}

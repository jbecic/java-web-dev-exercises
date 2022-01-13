package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student jasmin = new Student("Jasmin", 1, 1, 4.0);
    }

    public class Course {
        String teacher;
        String course;
        ArrayList<String> students = new ArrayList<>();

        public Course(String teacher, String course, ArrayList<String> students) {
            this.teacher = teacher;
            this.course = course;
            this.students = students;
        }


    }

}
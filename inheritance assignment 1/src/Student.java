//Constructor: student id
//Array list of course student take
//Methods: add/change/delete courses

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{
    private int StudentID;
    private int num;
    private String course;
    private ArrayList<String> courses = new ArrayList<>();
    private Scanner input;

    Student(Student s){
        super(s.firstName, s.lastName);
        StudentID = num;
        num ++;
    }

    Student(int StudentID, String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.StudentID = StudentID;
        this.courses = courses;
    }

    public void addCourses(String course) {
        for (int q = 0; q <= courses.size(); q++) {
            if (courses.contains(course)) {
                System.out.println("This course is has been already added");
            }
            else {
                courses.add(course);
                break;
            }
        }
    }

    public void deleteCourses(String course) {
        for (int q = 0; q <= courses.size(); q++) {
            if (courses.contains(course)) {
                courses.remove(course);
                break;
            }
            else {
                System.out.println("This course is has been already added");
            }
        }
    }


    public void changeCourses(String courseRemove, String courseChangeTo) {
        for (int q = 0; q <= courses.size(); q++) {
            if (courses.contains(courseRemove)) {
                int i = courses.indexOf(courseRemove);
                courses.remove(courseRemove);
                courses.add(i,courseChangeTo);
                break;
            }
            else {
                System.out.println("This course does not exist");
            }
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + StudentID + "\nFirst name: " + firstName.toUpperCase() + "\nLast name: " + lastName.toUpperCase() + "\nCourses: " + courses;
    }

}

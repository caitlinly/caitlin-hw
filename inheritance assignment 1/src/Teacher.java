//Constructor: Employee id
//Array list of course they teach
//Methods: add/change/delete courses from array

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person {
    private int EmployeeID;
    private int num;
    private String course;
    private ArrayList<String> courses = new ArrayList<>();
    private Scanner input;

    Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        EmployeeID = num;
        num++;
    }

    Teacher(int EmployeeID, String firstName, String lastName) {
        this.EmployeeID = EmployeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }

    public void addCourses(String course) {
        for (int q = 0; q <= courses.size(); q++) {
            if (courses.contains(course)) {
                System.out.println("This course is has been already added");
            } else {
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
            } else {
                System.out.println("This course is has been already added");
            }
        }
    }


    public void changeCourses(String courseRemove, String courseChangeTo) {
        for (int q = 0; q <= courses.size(); q++) {
            if (courses.contains(courseRemove)) {
                int i = courses.indexOf(courseRemove);
                courses.remove(courseRemove);
                courses.add(i, courseChangeTo);
                break;
            } else {
                System.out.println("This course does not exist");
            }
        }
    }

    @Override
    public String toString() {
        return "Student ID: " + EmployeeID + "\nFirst name: " + firstName.toUpperCase() + "\nLast name: " + lastName.toUpperCase() + "\nCourses: " + courses;
    }
}

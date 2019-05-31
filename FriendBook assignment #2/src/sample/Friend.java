package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend{
    private String name;
    private int age;

    //Make first and last name into one field ~~~~~~~~~~~~
    //Your code in the friends class can split it up
    //into two strings if you prefer or keep it
    //as a single string

    //Make sure that every new entry has a first ~~~~~~~~~~
    // and last name

    //Make sure the age is an integer ~~~~~~~~~~~~~~
    // that is greater than a number of your choosing

    //Create 2 sort buttons that sorts the names ~~~~~~`````````````````
    // either by age or by last name
    Friend(){
        name = name;
        age = age;
    }

    public Friend(String n, int a) {
        this.name = n;
        this.age = a;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("Friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name + ", \r");
        bw.write("; \r");
        bw.close();
    }

    public boolean compareFriends(Friend f){
        if(this.name.equals(f.name) && this.age == f.age){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        return name + " " + age;
    }
}

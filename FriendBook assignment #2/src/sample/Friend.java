package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend{
    private String name;
    private int age;

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

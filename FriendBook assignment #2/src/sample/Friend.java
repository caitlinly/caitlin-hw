package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend{
    private String firstName;
    private String lastName;

    Friend(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public void writeToFile() throws IOException {
        FileWriter fw = new FileWriter("Friends.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(firstName + ", \r");
        bw.write(lastName + "\r");
        bw.write("; \r");
        bw.close();
    }

    public boolean compareFriends(Friend f){
        if(this.firstName.equals(f.firstName) && this.lastName.equals(f.lastName)){
            return true;
        }
        else{
            return false;
        }
    }
}

package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Controller {
    public TextField textGetName;
    public TextField textGetAge;
    public ListView<Friend> friendList = new ListView();
    public Label labelFirstName;
    public Label labelLastName;
    public Label labelAge;
    public Button removeFriendButton;
    public LinkedHashSet<Friend> LHSfriend = new LinkedHashSet<>();

    public void addFriend(ActionEvent actionEvent) {
        String n = textGetName.getText();
        int a = Integer.parseInt(textGetAge.getText());
        Friend temp = new Friend (n,a);
        friendList.getItems().add(temp);
        textGetName.clear();
        textGetAge.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        if (String.valueOf(temp.getName()).contains(" ")) {
            String[] s = temp.getName().split(" ");
            labelFirstName.setText(s[0]);
            labelLastName.setText(s[1]);
        }
        labelAge.setText(String.valueOf(temp.getAge()));
    }

    public void removeFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(temp);
        labelFirstName.setText("");
        labelLastName.setText("");
        labelAge.setText("");
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = friendList.getItems();
        for(Friend f : myList){
            f.writeToFile();
        }
        friendList.getItems().clear();
    }

    //fix this one
    public void loadFriend(ActionEvent actionEvent) throws IOException {
        friendList.getItems().clear();
        ArrayList<Friend> friends = CreateFriend.createAllFriends("Friends.txt");
        for(Friend f : friends){
            friendList.getItems().add(f);
        }
    }

    public void sortName(ActionEvent actionEvent) {
        for(int x=0; x< friendList.getItems().size(); x++){
            LinkedHashSet friendList.getItems().get(x);
        }

    }

    public void sortAge(ActionEvent actionEvent) {
    }
}
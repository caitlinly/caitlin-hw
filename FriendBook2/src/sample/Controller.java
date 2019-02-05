
package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {

    public TextField textGetLastName;
    public TextField textGetFirstName;
    public ListView<Friend> friendList = new ListView();
    public Label labelFirstName;
    public Label labelLastName;
    public Button removeFriendButton;

    public void addFriend(ActionEvent actionEvent) {
        Friend temp = new Friend (textGetFirstName.getText(), textGetLastName.getText());
        friendList.getItems().add(temp);
        textGetFirstName.clear();
        textGetLastName.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        labelFirstName.setText(temp.getFirstName());
        labelLastName.setText(temp.getLastName());
    }

    public void removeFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(temp);
        labelFirstName.setText("");
        labelLastName.setText("");
    }

    public void saveFriend(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> myList = friendList.getItems();
        for(Friend f : myList){
            f.writeToFile();
        }
    }


    public void loadFriend(ActionEvent actionEvent) throws IOException {
        ArrayList<Friend> friends = CreateFriend.createAllFriends("Friends.txt");
        for(Friend f : friends){
            friendList.getItems().add(f);
        }
    }
}
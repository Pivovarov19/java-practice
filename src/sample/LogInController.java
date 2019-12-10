package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LogInController {

    @FXML
    Label logId;

    @FXML
    TextArea logIn;

    @FXML
    Label passId;

    @FXML
    PasswordField password;

    @FXML
    public void onLogInClicked(Event event) {
        System.out.println(logId.getText() + ":   " + logIn.getText());
        System.out.println(passId.getText() + ":   " + password.getText());
        String userLogin = "pipipi";
        String userPass = "123123";
        if(logIn.getText().equals(userLogin) && password.getText().equals(userPass)) {
            System.out.println("Regular password");
        } else {
            System.out.println("Irregular password/login");
        }
    }

}

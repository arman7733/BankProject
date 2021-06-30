/**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    @FXML // fx:id="UserText"
    private TextField UserText; // Value injected by FXMLLoader

    @FXML // fx:id="PassText"
    private TextField PassText; // Value injected by FXMLLoader

    @FXML // fx:id="resaultKey"
    private Button resaultKey; // Value injected by FXMLLoader

    @FXML // fx:id="ShowResault"
    private Label ShowResault; // Value injected by FXMLLoader

    @FXML
    void userPassCheck(ActionEvent event) {

        String username = "arshia" ;
        String password = "1234";
        String userInput = UserText.getText();
        boolean userIsCorrect = false;

        ShowResault.setText(UserText.getText());
        System.out.println(UserText);
        //if the username is correct
        if ( username.equals(UserText) ) {
            userIsCorrect = true;

            //if pass is correct
            //if (password.equals(PassText))
             //   ShowResault.setText("access granted");
        }//else
           // ShowResault.setText("password is wrong");


    }

}

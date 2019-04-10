/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfans;

//import fitfans.Database;
import java.io.IOException;
import java.sql.ResultSet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author jacob
 */
public class SignupScreenController {

    @FXML
    private Label loginOutput;

    @FXML
    private TextField username;
    @FXML
    private TextField email;
    @FXML
    private PasswordField pword;
    @FXML
    private TextField gender;
    @FXML
    private TextField dob;
    @FXML
    private Button nextBtn;

    Database d = new Database();

    PageSwitchHelper pageSwitcher = new PageSwitchHelper();

    @FXML
    private void handleConfirmAction(ActionEvent event) {
        String tusername = username.getText().trim();

        String temail = email.getText();
        String tpword = pword.getText();
        String tgender = gender.getText();
        String tdob = dob.getText();

        try {
            String insertQuery = ("INSERT INTO User VALUES ("
                    + tusername + "," + temail + "," + tpword + "," + tgender + "," + tdob + ")");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void handleNextButtonAction(ActionEvent event) throws IOException {
        pageSwitcher.switcher(event, "LoginScreen.fxml");
    }

    @FXML
    public void initialize() {
        System.out.println("calling init");
        loginOutput.setVisible(false);
        nextBtn.setVisible(false);
    }

}

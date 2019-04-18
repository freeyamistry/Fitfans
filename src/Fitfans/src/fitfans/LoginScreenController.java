/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfans;

//import Week7Solutions.Resources.Database;
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
public class LoginScreenController {

    @FXML
    private Label loginOutput;

    @FXML
    private TextField username;

    @FXML
    private PasswordField pword;

//    @FXML
//    private Button nextBtn;

    @FXML
    private Button signupbtn;
    @FXML
    private Button loginbtn;

    Database d = new Database();

    PageSwitcherHelper pageSwitcher = new PageSwitcherHelper();

    @FXML
    private void handleLoginButton(ActionEvent event) throws IOException {
        String tusername = username.getText().trim();
        String tpword = pword.getText();
        try {
            ResultSet rs = d.getResultSet("SELECT * FROM User WHERE "
                    + "USERNAME = '" + tusername + "' "
                    + "AND PASSWORD = '" + tpword + "'");
            if (!rs.next()) {
                System.out.println("Incorrect username or password");
              //  loginOutput.setText("Incorrect username or password");
              //  loginOutput.setVisible(true);
            } else {
                System.out.println("Login successful");
                //loginOutput.setText("Login successful");
               // loginOutput.setVisible(true);
                pageSwitcher.switcher(event, "FXMLDocument.fxml");
                
                //nextBtn.setVisible(true);
            }
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void handleSignupButton(ActionEvent event) throws IOException {
        pageSwitcher.switcher(event, "SignupScreen.fxml");
    }

    @FXML
    public void initialize() {
        System.out.println("calling init");
        //loginOutput.setVisible(false);
        //nextBtn.setVisible(false);
    }

}

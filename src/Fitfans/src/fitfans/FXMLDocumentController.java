/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author SOPHIA
 */
public class FXMLDocumentController implements Initializable {

    PageSwitcherHelper pageSwitcherHelper = new PageSwitcherHelper();

    @FXML
    private Label label;
    @FXML
    private Button button_one;
    @FXML
    public Label test_label;

    @FXML
    public ChoiceBox choiceEx;
    @FXML
    public ChoiceBox choiceRes;

    @FXML
    public Button done_button;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @Override //when scene starts 
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        button_one.setText("FUCK YEA THE BOYS");
        test_label.setText("Default text value");

    }

    public void choiceb(MouseEvent event) {
        System.out.println("working");
    }

    public void pressButtonOne(MouseEvent event) {
        System.out.println("Button one clicked");
        test_label.setText("Button one pressed");
    }

    public void pressButtonTwo(MouseEvent event) {
        System.out.println("Button two clicked");
        test_label.setText("Sophia is gay");
    }

    public void pressButtonThree(ActionEvent event) {
        System.out.println("Button three clicked");
        test_label.setText("Button three pressed");
    }

    public void pressDoneButton(ActionEvent event) {
        System.out.println("Button Done clicked");
        test_label.setText("Button Done pressed");
    }

    public void pressButtonHome(MouseEvent event) throws IOException {
        System.out.println("Button Home clicked");
        test_label.setText("Button Home pressed");
        pageSwitcherHelper.switcher(event, "FXMLDocument.fxml");
    }

    public void pressButtonAreobicsEx(MouseEvent event) throws IOException {
        System.out.println("Button AreobicsEx clicked");
        test_label.setText("Button AreobicsEx pressed");
        pageSwitcherHelper.switcher(event, "AreobicsPage.fxml");
    }

    public void pressButtonResistance(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "FoodPage.fxml");
    }

}

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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author SOPHIA
 */
public class AreobicsPageController extends FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    ObservableList<String> exerciseChoice = FXCollections.observableArrayList("Running", "Swimming", "Jogging");
    ObservableList<String> exerciseRes = FXCollections.observableArrayList("Boxing", "hello", "yo");
//
//    PageSwitcherHelper pageSwitcherHelper = new PageSwitcherHelper();
//    

    @Override
    public void initialize(URL url, ResourceBundle rb) {

// TODO
        choiceEx.setItems(exerciseChoice);
        choiceRes.setItems(exerciseRes);

    }

    public void pressButtonAreobicsEx(MouseEvent event) throws IOException {
        System.out.println("Button AreobicsEx clicked");
        test_label.setText("Button AreobicsEx pressed");
        pageSwitcherHelper.switcher(event, "AreobicsPage.fxml");
    }

}

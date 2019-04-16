/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author SOPHIA
 */
public class HomePageController extends FXMLDocumentController implements Initializable{

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     public void pressButtonHome(MouseEvent event) throws IOException {
        System.out.println("Button Home clicked");
        test_label.setText("Button Home pressed");
        pageSwitcherHelper.switcher(event, "FXMLDocument.fxml");
    }
}

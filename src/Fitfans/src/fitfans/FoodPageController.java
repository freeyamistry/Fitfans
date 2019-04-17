/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfans;

import static fitfans.Database.conn;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author SOPHIA
 */
public class FoodPageController extends FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    PageSwitcherHelper pageSwitcherHelper = new PageSwitcherHelper();
    @FXML
    private DatePicker date;
    @FXML
    private TextField kj;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void pressButtonResistance(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "Food.fxml");
    }
  
      public void presssubmitBtn(MouseEvent event) throws IOException {
        System.out.println("food intake submitted");
       String tdate = date.getText().trim();
       String meal;
       String tkj = date.getText();


        try {
            String insertQuery = ("INSERT INTO Food VALUES ("
                    + tusername + "," + temail + "," + tpword + "," + tgender + "," + tdob + ")");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        pageSwitcherHelper.switcher(event, "Food.fxml");
} 


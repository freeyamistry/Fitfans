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
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
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
    @FXML
    private ChoiceBox<String> foodgroup;

    PageSwitcherHelper pageSwitcherHelper = new PageSwitcherHelper();
    @FXML
    private DatePicker date;

    @FXML
    private TextField kj;

    ObservableList<String> foodgroupList = FXCollections.observableArrayList("Fruit", "Dairy");

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        foodgroup.setItems(foodgroupList);
        // TODO

    }

    public void pressButtonHome(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "HomePage.fxml");
    }

    public void pressButtonExercise(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "AreobicsPage.fxml");
    }

    public void pressButtonFood(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "Food.fxml");
    }

    public void pressButtonMedical(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "Food.fxml");
    }

    public void pressButtonSleep(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "Food.fxml");
    }

    public void pressButtonWellness(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "Food.fxml");
    }

    public void pressButtonSetting(MouseEvent event) throws IOException {
        System.out.println("Button food clicked");
        test_label.setText("UserName");
        pageSwitcherHelper.switcher(event, "Food.fxml");
    }

    public void presssubmitBtn(MouseEvent event) throws IOException, SQLException {
        LocalDate tdate = date.getValue();
        String tfoodgroup = foodgroup.getValue();
        String tkj = kj.getText();
        System.out.println("Thankyou for submitting your food intake.");

        Statement st = conn.createStatement();

        try {
            String insertQuery = ("INSERT INTO Food VALUES ('"
                    + tdate + "','" + tfoodgroup + "','" + tkj + "')");

            String query = "select * from Food";

            ResultSet rs = st.executeQuery(query);
            System.out.println("The food is " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //pageSwitcherHelper.switcher(event, "Food.fxml");
}

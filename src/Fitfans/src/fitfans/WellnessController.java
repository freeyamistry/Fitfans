/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfans;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import static fitfans.Database.conn;

/**
 * FXML Controller class
 *
 * @author jenneyle
 */
public class WellnessController implements Initializable {

    private TextField emotion;
    @FXML
    private TextArea journal;
    @FXML
    private TextField meditation;
    
    private Database d = new Database();

    PageSwitchHelper pageSwitcher = new PageSwitchHelper();

    @FXML
    private void handleConfirmAction(ActionEvent event) {
        String temotion = emotion.getText().trim();
        String tjournal = journal.getText();
        String tmeditation = meditation.getText();
       

        try {
            Statement st = conn.createStatement();

            String insertDatabase = "INSERT INTO Wellness(EMOTION, JOURNAL, MEDITATION) VALUES('"
                    + temotion 
                    + "','" 
                    + tjournal 
                    + "','" 
                    + tmeditation
                    + "');";

            st.execute(insertDatabase);

            String query = "Select * from Wellness";

            ResultSet rs = st.executeQuery(query);
            
            System.out.println("The user has practised " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfans;


import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import static fitfans.Database.conn;

/**
 * FXML Controller class
 *
 * @author SOPHIA
 */


public class ExerciseController extends FXMLDocumentController implements Initializable {

    //PageSwitcherHelper pageSwitcherHelper = new PageSwitcherHelper();  
    private TextField running;
    @FXML
    private TextField swimming;
    @FXML
    private TextField cycling;
    @FXML
    private TextField squats;
    @FXML
    private TextField lunge;
    @FXML
    private TextField bicepcurls;
    @FXML
    private TextField steps;
    @FXML
    private TextField gym;
    @FXML
    private Button insertData;

    private Database d = new Database();

    @FXML
    private void submit(ActionEvent event) {
        String trunning = running.getText();
        String tswimming = swimming.getText();
        String tcycling = cycling.getText();
        String tsquats = squats.getText();
        String tlunge = lunge.getText();
        String tbicepcurls = bicepcurls.getText();
        String tsteps = steps.getText();
        String tgym = gym.getText();

        try {
            Statement st = conn.createStatement();

            String insertDatabase = "INSERT INTO Exercise(RUNNING, SWIMMING, CYCLING, SQUATS, LUNGE, BICEPSCURLS, STEPS, GYM) VALUES('"
                    + trunning 
                    + "','" 
                    + tswimming 
                    + "','" 
                    + tcycling 
                    + "','"
                    + tsquats 
                    + "','" 
                    + tlunge 
                    + "','" 
                    + tbicepcurls 
                    + "','" 
                    + tsteps 
                    + "','" 
                    + tgym 
                    + "');";

            st.execute(insertDatabase);

            String query = "Select * from Exercise";

            ResultSet rs = st.executeQuery(query);
            
            System.out.println("The user has exercised " + rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8));

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
/*
@FXML 
public void intialise(){
running.setCellValueFactory( 
cellData --> cellData.getValue().getArtistPRoperty());

swimming.setCellValueFactory( 
cellData --> cellData.getValue().getArtistPRoperty());

cycling.setCellValueFactory( 
cellData --> cellData.getValue().getArtistPRoperty());

squats.setCellValueFactory( 
cellData --> cellData.getValue().getArtistPRoperty());

}

running.setCellValueFactory( 
cellData --> cellData.getValue().getArtistPRoperty());


 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASS2;
<<<<<<< HEAD

=======
>>>>>>> aa3ed9380d2b7790e14e02741b08ca8a28fc8c31


import java.sql.SQLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jacob
 */
public class LoginScreen extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        loadDatabase();
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

<<<<<<< HEAD
    private void loadDatabase() {
       Database.createLoginTable();
       Database.createMusicTable();
=======
   
    
    private void loadDatabase() throws SQLException {
       Database.createUserTable();
       Database.createFoodTable();
       Database.createGoalsTable();
       Database.createWeightTable();
       Database.createGymTable();
>>>>>>> aa3ed9380d2b7790e14e02741b08ca8a28fc8c31
    }
    
}

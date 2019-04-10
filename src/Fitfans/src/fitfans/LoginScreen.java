/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitfans;




import java.sql.SQLException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LoginScreen extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        loadDatabase();
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    
    private void loadDatabase() throws SQLException {
       Database.createUserTable();
       Database.createFoodTable();
       Database.createGoalsTable();
       Database.createWeightTable();
       Database.createGymTable();
       
        System.out.println("woohooo");
        System.out.println("i hate acct");
        System.out.println("hi i hate my life ");
        System.out.println("yo");
        System.out.println("hiiii");

    }
    
}

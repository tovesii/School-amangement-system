package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AdminDashboard extends Application {
    public void start (Stage stage){
        try{
            stage.initStyle(StageStyle.UNDECORATED);
            Parent root= FXMLLoader.load(getClass().getResource("adminDashboard.fxml"));
            stage.setScene(new Scene(root,1300,650));
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Student extends Application {
    public void start(Stage stage){
        try{
            stage.initStyle(StageStyle.UNDECORATED);
            Parent root= FXMLLoader.load(getClass().getResource("student.fxml"));
            stage.setScene(new Scene(root,800,670));
            stage.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

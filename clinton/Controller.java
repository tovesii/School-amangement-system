package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Controller {
    Stage stage;
    Scene scene;
    public void studentOperation(ActionEvent actionEvent) throws IOException {
        Stage stage=new Stage();
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root= FXMLLoader.load(getClass().getResource("student.fxml"));
        stage.setScene(new Scene(root,986,540));
        stage.setX(346);
        stage.setY(105);
        stage.show();
    }
    //Exit method
    public void exitMain(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void exitStudent(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("student.fxml"));
        stage=(Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}

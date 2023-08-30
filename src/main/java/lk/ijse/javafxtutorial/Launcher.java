package lk.ijse.javafxtutorial;

/*
    @author DanujaV
    @created 8/30/23 - 5:05 PM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(rootNode);

        stage.setTitle("Dashboard");
        stage.centerOnScreen();
        stage.setScene(scene);


        stage.show();
    }
}

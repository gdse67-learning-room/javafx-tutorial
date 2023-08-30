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
        //load fxml file to Java application
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        //set node hierarchy to the scene
        Scene scene = new Scene(rootNode);

        stage.setTitle("Dashboard");
        stage.centerOnScreen();

        //set scene to the stage
        stage.setScene(scene);


        //show the stage after run the program
        stage.show();
    }
}

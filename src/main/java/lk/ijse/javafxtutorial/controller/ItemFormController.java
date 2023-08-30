package lk.ijse.javafxtutorial.controller;

/*
    @author DanujaV
    @created 8/30/23 - 6:25 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemFormController {

    @FXML
    private AnchorPane itemRootNode;

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.itemRootNode.getScene().getWindow();

        stage.setTitle("Dashboard");
        stage.centerOnScreen();

        stage.setScene(scene);
    }
}

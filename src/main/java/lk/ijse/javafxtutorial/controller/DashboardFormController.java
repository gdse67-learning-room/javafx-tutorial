package lk.ijse.javafxtutorial.controller;

/*
    @author DanujaV
    @created 8/30/23 - 5:09 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        // open Customer Form

        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = new Stage();
        stage.setTitle("Customer Form");

        stage.setScene(scene);
        stage.show();

    }
}

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {

    @FXML
    private AnchorPane rootNode;

    @FXML
    private AnchorPane pane;

    @FXML
    private Label title;

    @FXML
    private Button btnCustomer;

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

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.rootNode.getScene().getWindow();

        stage.setTitle("Item Form");
        stage.setScene(scene);
    }

    @FXML
    void btnSupplierOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));

        this.pane.getChildren().clear();
        this.pane.getChildren().add(rootNode);
    }
}

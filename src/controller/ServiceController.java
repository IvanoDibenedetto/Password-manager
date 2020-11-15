package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import model.ServiceModel;

import java.net.URL;
import java.util.ResourceBundle;

public class ServiceController implements Initializable {

    @FXML
    private JFXButton button1;

    @FXML
    private Label label1;

    @FXML
    private JFXTextField textview1;
    private ServiceModel serviceModel;

    public ServiceController(ServiceModel serviceModel) {
        this.serviceModel = serviceModel;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        label1.setText(serviceModel.getServiceByName("facebook").getName());

        button1.setOnAction(event -> {
            label1.setText(textview1.getText());
        });
    }

}

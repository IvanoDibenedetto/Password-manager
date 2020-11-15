package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private JFXButton button1;

    @FXML
    private Label label1;

    @FXML
    private JFXTextField textview1;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label1.setText("initialized");
        button1.setOnAction(event -> {label1.setText(textview1.getText());});
    }


}

package view;

import controller.ServiceController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Service;
import model.ServiceModel;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainUI.fxml"));


        ServiceModel serviceModel = new ServiceModel();
        ServiceController controller = new ServiceController(serviceModel);
        fxmlLoader.setController(controller);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Password manager");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

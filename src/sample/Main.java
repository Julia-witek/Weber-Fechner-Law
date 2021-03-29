package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MainScreen.fxml"));
        StackPane stackPane = loader.load();
        Scene scene = new Scene(stackPane, 1266, 668);


        stage.setScene(scene);
        stage.setTitle("Projekt");
        stage.setFullScreen(true);
        stage.show();
        FirstController firstController = new FirstController();
        SecondController secondController = new SecondController();
        ThirdController thirdController = new ThirdController();


    }
}

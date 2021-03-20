package sample;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class MenuController {

    private MainController mainController;
    private FirstController firstController;
    private int info=0;

    @FXML
    public void Continue (){

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FirstScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        timer timer = new timer(pane);
        timer.startTimer();

            mainController.setScreen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(14, 15, pane);


        FirstController firstController = loader.getController();
        firstController.setMenuController(this);

}

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setNewScreen(Pane pane) {
       mainController.mainStackPane.getChildren().clear();
       mainController.mainStackPane.getChildren().add(pane);
    }

}

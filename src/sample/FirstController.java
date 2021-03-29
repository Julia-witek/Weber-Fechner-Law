package sample;

import javafx.animation.PauseTransition;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FirstController {
    private MenuController menuController;

    String ans="";


    @FXML
    public void pressLeftButton(){
        ans= menuController.name + "L ";

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SecondScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            timer timer = new timer(pane);
            timer.startTimer();

            menuController.setNewScreen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        SecondController secondController = loader.getController();
        secondController.setFirstController(this);


    }

    public void pressRightButton(){
        ans= menuController.name + "P ";
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SecondScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }
            timer timer = new timer(pane);
            timer.startTimer();

            menuController.setNewScreen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        SecondController secondController = loader.getController();
        secondController.setFirstController(this);


    }

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    public void setNew2Screen(Pane pane) {
        menuController.setNewScreen(pane);
    }

}





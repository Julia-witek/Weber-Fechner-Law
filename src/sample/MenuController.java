package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.io.IOException;


public class MenuController {

    private MainController mainController;

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

            mainController.setScreen(pane);

            anotherScreen screen = new anotherScreen();
            screen.createCircle(pane);

        FirstController firstController = loader.getController();
        firstController.setMenuController(this);
        //setNewScreen(pane);
        mainController.setScreen(pane);
        }


    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setNewScreen(Pane pane) {
       mainController.mainStackPane.getChildren().clear();
       mainController.mainStackPane.getChildren().add(pane);
    }
}

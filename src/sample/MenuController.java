package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

import static sample.DrawingCircles.*;

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

        /*for (int i = 0; i < 20; i ++){
            DrawingCircles.drawLeftCircles();
        }*/

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}

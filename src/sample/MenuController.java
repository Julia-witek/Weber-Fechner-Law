package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

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

        float c = (float) (Math.random() * 200);
        float v = (float) (Math.random() * 200);
        Circle circlee = new Circle(10+c, 200 + v, 6, Color.BLACK);
        pane.getChildren().add(circlee);

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}

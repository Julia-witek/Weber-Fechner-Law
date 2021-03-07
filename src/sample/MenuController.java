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

        for(int i=0; i<20; i++) {
            float x = (float) (Math.random() * 400);
            float y = (float) (Math.random() * 350);
            Circle leftCircle = new Circle(100 + x, 100 + y, 8, Color.BLACK);

            pane.getChildren().add(leftCircle);
        }

        for(int i=0; i<22; i++) {
            float x = (float) (Math.random() * 400);
            float y = (float) (Math.random() * 350);
            Circle rightCircle = new Circle(700 + x, 100 + y, 8, Color.BLACK);

            pane.getChildren().add(rightCircle);
        }
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}

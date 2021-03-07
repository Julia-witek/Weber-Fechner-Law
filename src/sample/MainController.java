package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {
    @FXML
    private StackPane mainStackPane;

    @FXML
    public void initialize (){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("MenuScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
            for (int i = 0; i < 20; i ++){
                DrawingCircles.drawLeftCircles();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        MenuController menuController = loader.getController();
        menuController.setMainController(this);
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        mainStackPane.getChildren().clear();
        mainStackPane.getChildren().add(pane);
    }
}

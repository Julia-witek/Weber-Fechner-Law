package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.io.IOException;


public class FirstController {
    private MenuController menuController;

    @FXML
    public void pressButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SecondScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();

        }
        catch (IOException e){
            e.printStackTrace();
        }

        menuController.setNewScreen(pane);

        }
    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }
}





package sample;

import javafx.fxml.FXML;

public class FirstController {

    @FXML
    public void initialize (){
        for (int i = 0; i < 20; i ++){
            DrawingCircles.drawLeftCircles();
        }
        for (int i = 0; i < 20; i ++){
            DrawingCircles.drawRightCircles();
        }
    }

}

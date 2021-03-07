package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class FirstController {

Pane layout = new Pane();
    public void setLayout(Pane layout) {
        this.layout = layout;
        layout.setLayoutX(400);
        layout.setLayoutY(400);
        float c = (float) (Math.random() * 200);
        float v = (float) (Math.random() * 200);
        Circle circle = new Circle(10+c, 200 + v, 6, Color.BLACK);
        layout.getChildren().add(circle);
    }


    @FXML
    public void initialize (){

    }


}

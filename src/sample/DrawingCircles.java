package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class DrawingCircles {

    public static void drawLeftCircles(){
        Circle circle;
        float x = (float) (Math.random() * 200);
        float y = (float) (Math.random() * 200);
        circle = new Circle (x, 200 + y, 8, Color.BLACK);

    }

    public static void drawRightCircles (){
        Circle circle;
        float x = (float) (Math.random() * 200);
        float y = (float) (Math.random() * 200);
        circle = new Circle (200 + x, 200 + y, 8, Color.BLACK);
    }
}

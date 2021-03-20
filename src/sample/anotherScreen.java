package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class anotherScreen {

    public void createCircle(int leftNumber, int rightNumber, Pane pane) {

        for (int i = 0; i < leftNumber; i++) {
            double a = 0.4 * (double)leftNumber;
            double x = (double) (Math.random()*400);
            double y = (double) (Math.random()*350);
            Circle leftCircle = new Circle(100 + x, 100 + y, 8, Color.CADETBLUE);

            pane.getChildren().add(leftCircle);
        }

        for (int i = 0; i < rightNumber; i++) {
            float x = (float) (Math.random() * 400);
            float y = (float) (Math.random() * 350);
            Circle rightCircle = new Circle(700 + x, 100 + y, 8, Color.CADETBLUE);

            pane.getChildren().add(rightCircle);
        }
    }
}

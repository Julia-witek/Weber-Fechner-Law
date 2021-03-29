package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class ThirdController {
    private SecondController secondController;

    String ans3 ="";

    @FXML
    public void pressLeftButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FourthScreen.fxml"));
        Pane pane = null;

        ans3 =  secondController.ans2 + "L ";


        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            timer timer = new timer(pane);
            timer.startTimer();

            secondController.setNew3Screen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        FourthController fourthController = loader.getController();
        fourthController.setThirdController(this);
    }

    public void pressRightButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FourthScreen.fxml"));
        Pane pane = null;

        ans3 =  secondController.ans2 + "P ";


        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }
            timer timer = new timer(pane);
            timer.startTimer();

            secondController.setNew3Screen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(20,21,pane);

        FourthController fourthController = loader.getController();
        fourthController.setThirdController(this);
    }

    public void setSecondController(SecondController secondController) {
        this.secondController = secondController;
    }
    public void setNew4Screen(Pane pane) {
        secondController.setNew3Screen(pane);
    }

}

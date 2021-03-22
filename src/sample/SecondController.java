package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class SecondController {
    private FirstController firstController;
    String ans2 ="";


    @FXML
    public void pressLeftButton(){

        ans2 = "L ";
        ans2 +=  firstController.ans;


        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ThirdScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }
            timer timer = new timer(pane);
            timer.startTimer();

            firstController.setNew2Screen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        ThirdController thirdController = loader.getController();
        thirdController.setSecondController(this);
    }

    public void pressRightButton(){
        ans2 = "P ";
        ans2 +=  firstController.ans;


        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ThirdScreen.fxml"));
        Pane pane = null;


        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            timer timer = new timer(pane);
            timer.startTimer();

            firstController.setNew2Screen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(18,19,pane);

        ThirdController thirdController = loader.getController();
        thirdController.setSecondController(this);
    }

    public void setFirstController(FirstController firstController) {
        this.firstController = firstController;
    }

    public void setNew3Screen(Pane pane) {
        firstController.setNew2Screen(pane);
    }

    public void setFirstController(Runnable runnable) {
    }
}

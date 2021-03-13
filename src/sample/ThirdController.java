package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class ThirdController {
    private SecondController secondController;

    @FXML
    public void pressLeftButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FourthScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            secondController.setNew3Screen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        FourthController fourthController = loader.getController();
        fourthController.setThirdController(this);
    }

    public void pressRightButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FourthScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            secondController.setNew3Screen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(20,21,pane);

        FourthController fourthController = loader.getController();
        fourthController.setThirdController(this);
    }

    public void setSecondController(SecondController secondController) {
        this.secondController = secondController;
    }

}

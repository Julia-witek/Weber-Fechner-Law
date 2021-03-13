package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class SecondController {
    private FirstController firstController;

    @FXML
    public void pressLeftButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ThirdScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            firstController.setNew2Screen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        ThirdController thirdController = loader.getController();
        thirdController.setSecondController(this);
    }

    public void pressRightButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("ThirdScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

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

}

package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class FirstController {
    private MenuController menuController;

    @FXML
    public void pressLeftButton(){

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SecondScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            menuController.setNewScreen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        SecondController secondController = loader.getController();
        secondController.setFirstController(this);

    }

    public void pressRightButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("SecondScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

            menuController.setNewScreen(pane);
            anotherScreen screen = new anotherScreen();
            screen.createCircle(16,17,pane);

        SecondController secondController = loader.getController();
        secondController.setFirstController(this);

    }

    public void setMenuController(MenuController menuController) {
        this.menuController = menuController;
    }

    public void setNew2Screen(Pane pane) {
        menuController.setNewScreen(pane);
    }

}





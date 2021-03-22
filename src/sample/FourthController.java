package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import java.io.IOException;

public class FourthController {
    private ThirdController thirdController;

    String ans4 ="";
    FileWriter file = new FileWriter();
    @FXML
    public void pressLeftButton(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Result.FXML"));
        Pane pane = null;

        ans4 = "L ";
        ans4 +=  thirdController.ans3;
        file.save(ans4);
        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        //timer timer = new timer(pane);
        //timer.startTimer();

        thirdController.setNew4Screen(pane);
       // anotherScreen screen = new anotherScreen();
       // screen.createCircle(16,17,pane);

        ResultController resultController = loader.getController();
        resultController.setFourthController(this);
    }

    public void pressRightButton(){

        ans4 = "P ";
        ans4 +=  thirdController.ans3;
        file.save(ans4);

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Result.fxml"));
        Pane pane = null;
        Person person = new Person();
        System.out.println("osoba " + person.getPropertyName().getValue());

        try {
            pane = loader.load();
        }
        catch (IOException e){
            e.printStackTrace();
        }
       // timer timer = new timer(pane);
        //timer.startTimer();

        thirdController.setNew4Screen(pane);
      //  anotherScreen screen = new anotherScreen();
       // screen.createCircle(20,21,pane);

        ResultController resultController = loader.getController();
        resultController.setFourthController(this);
    }

    public void setThirdController(ThirdController thirdController) {
        this.thirdController = thirdController;
    }
}

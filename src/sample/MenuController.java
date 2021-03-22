package sample;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;


public class MenuController {

    private MainController mainController;
    private FirstController firstController;
    private int info=0;
    @FXML
    private TextField textFieldName;
    @FXML
    private TextField textFieldAge;
    private Person person = new Person();
    @FXML
    private Label textLabel = new Label();

    @FXML
    public void initialize(){
        textFieldName.textProperty().bindBidirectional(person.getPropertyName());
        textLabel.textProperty().bind(person.getPropertyName());
        textFieldAge.textProperty().bindBidirectional(person.getPropertyAge());
    }

    @FXML
    public void Continue () {

        java.io.FileWriter fw = null;

        try {
            fw = new java.io.FileWriter("data.txt");
        } catch (
                IOException e) {
            System.out.println("Blad przy otwieraniu!");
        }

        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(person.getPropertyName().getValue() + " " + person.getPropertyAge().getValue());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Blad przy zapisie!");
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Blad przy zamknieciu!");
        }

        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("FirstScreen.fxml"));
        Pane pane = null;

        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        timer timer = new timer(pane);
        timer.startTimer();

        mainController.setScreen(pane);
        anotherScreen screen = new anotherScreen();
        screen.createCircle(14, 15, pane);


        FirstController firstController = loader.getController();
        firstController.setMenuController(this);
    }


    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setNewScreen(Pane pane) {
       mainController.mainStackPane.getChildren().clear();
       mainController.mainStackPane.getChildren().add(pane);
    }

}

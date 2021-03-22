package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


public class ResultController {
    private FourthController fourthController;
    private Person person = new Person();
    @FXML
    Label nameLabel = new Label();
    @FXML
    public void initialize() {
    nameLabel.textProperty().bind(person.getPropertyName());
    }

    public void setFourthController(FourthController fourthController) {
        this.fourthController = fourthController;
    }
}

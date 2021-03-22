package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import java.net.URL;
import java.util.ResourceBundle;

public class timer  implements Initializable{
    Pane pane = new Pane();
    ProgressBar p = new ProgressBar();
    int info=0;

    timer (Pane pane){
        this.pane = pane;
        Thread th = new Thread(new bg_Thread());
        th.start();
    }


    class bg_Thread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 101; i++) {
                try {
                    p.setProgress(i / 100.0);
                    Thread.sleep(100);
                    info=i;

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int giveInfo(){
        int o = info;
        return o;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    p.setProgress(0.0);
    }

    public void startTimer() {
        pane.getChildren().add(p);
    }
}

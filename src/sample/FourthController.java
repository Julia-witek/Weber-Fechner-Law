package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
//port org.springframework.beans.factory.annotation.Autowired;
//port org.springframework.mail.javamail.JavaMailSender;
//port org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.MessagingException;
import java.io.IOException;

public class FourthController {
    private ThirdController thirdController;
    private MailService mailService;
    //ailApi mailApi = new MailApi(mailService);


    String ans4 ="";
    FileWriter file = new FileWriter();


    @FXML
    public void pressLeftButton() throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Result.FXML"));
        Pane pane = null;

        ans4 =  thirdController.ans3 + "L ";
        file.save(ans4);
      //ailApi.sendMail();


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
        MailService mailService = new MailService(ans4);
        mailService.sendMail("WeberFechner12@gmail.com");
    }

    public void pressRightButton() throws Exception {

        ans4 =  thirdController.ans3 + "P ";
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
        MailService mailService = new MailService(ans4);
            mailService.sendMail("WeberFechner12@gmail.com");

    }

    public void setThirdController(ThirdController thirdController) {
        this.thirdController = thirdController;
    }


}

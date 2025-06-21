package com.ltt.quizapp;


import com.ltt.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("Question.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }
    //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
    public void handlePractice(ActionEvent event){
       MyAlert.getInstance().showMsg("Welcome Quiz");
    }
   
}

package com.dht.quizapp;

import com.dht.utils.MyAlert;
import com.dht.utils.MyStage;
import com.dht.utils.theme.Theme;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;


public class PrimaryController implements Initializable{
    
    @FXML private ComboBox<Theme> cbTheme;
    
    public void changeTheme(ActionEvent event){
        switch(this.cbTheme.getSelectionModel().getSelectedItem()){
            case DARK:
                this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("dark.css").toExternalForm());
                
                break;
            case LIGHT:
                    this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("light.css").toExternalForm());
                break;
            default:
                    this.cbTheme.getScene().getRoot().getStylesheets().clear();
                this.cbTheme.getScene().getRoot().getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
                break;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbTheme.setItems(FXCollections.observableArrayList(Theme.values()));
    }
    
    public void handleQuestionManagement(ActionEvent event) throws IOException {
        MyStage.getInstance().showStage("questions.fxml");
    
    }
    
    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }
    
    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }
    
    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }
    
    public void handleLogin(ActionEvent event) {
        MyAlert.getInstance().showMsg("Comming soon...");
    }

    
}

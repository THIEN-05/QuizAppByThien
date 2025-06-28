module com.ltt.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.ltt.quizapp to javafx.fxml;
    exports com.ltt.quizapp;
}

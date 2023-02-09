module com.example.culkulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.culkulator to javafx.fxml;
    exports com.example.culkulator;
}
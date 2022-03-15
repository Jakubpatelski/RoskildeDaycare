module com.example.daycareroskilde_new {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.daycareroskilde_new to javafx.fxml;
    exports com.example.daycareroskilde_new;
}
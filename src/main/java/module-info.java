module com.example.salonn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salonn to javafx.fxml;
    exports com.example.salonn;
}
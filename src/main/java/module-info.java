module com.example.securityauditprogram {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.securityauditprogram to javafx.fxml;
    exports com.example.securityauditprogram;
}
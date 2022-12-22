module com.example.task0_delegation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task0_delegation to javafx.fxml;
    exports com.example.task0_delegation;
}
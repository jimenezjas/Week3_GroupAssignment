module com.example.week3_groupassignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.week3_groupassignment to javafx.fxml;
    exports com.example.week3_groupassignment;
}
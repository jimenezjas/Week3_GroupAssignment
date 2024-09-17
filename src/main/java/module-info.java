module com.example.week3_groupassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week3_groupassignment to javafx.fxml;
    exports com.example.week3_groupassignment;
}
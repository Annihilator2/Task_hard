module com.example.task_hard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task_hard to javafx.fxml;
    exports com.example.task_hard;
}
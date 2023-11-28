module com.example.zapoznanie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zapoznanie to javafx.fxml;
    exports com.example.zapoznanie;
}
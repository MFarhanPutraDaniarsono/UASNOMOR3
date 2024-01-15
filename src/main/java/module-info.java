module com.example.uasnomor3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uasnomor3 to javafx.fxml;
    exports com.example.uasnomor3;
}
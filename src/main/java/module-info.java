module com.example.ddb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.ddb to javafx.fxml;
    exports com.example.ddb;
}
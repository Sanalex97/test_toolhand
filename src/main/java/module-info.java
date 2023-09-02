module com.example.test_toolhand {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.test_toolhand to javafx.fxml;
    exports com.example.test_toolhand;
}
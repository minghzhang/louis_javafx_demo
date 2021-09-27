module com.louis.louis_javafx_demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires aviator;

    opens com.louis.louis_javafx_demo to javafx.fxml;
    exports com.louis.louis_javafx_demo;
}
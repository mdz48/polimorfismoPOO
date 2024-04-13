module com.mdz.application.poli {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mdz.application.poli.models to javafx.base;
    opens com.mdz.application.poli to javafx.fxml;
    exports com.mdz.application.poli;
    exports com.mdz.application.poli.controllers;
    opens com.mdz.application.poli.controllers to javafx.fxml;
}
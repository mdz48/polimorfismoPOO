package com.mdz.application.poli;

import com.mdz.application.poli.models.BaseDatos2;
import com.mdz.application.poli.models.BaseDatos3;
import com.mdz.application.poli.models.BaseDatos1;
import com.mdz.application.poli.models.BasesDeDatos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private static BaseDatos1 baseDatos1 = new BaseDatos1();
    private static Stage stageView;
    private static Stage stageRoot;
    private static BaseDatos2 baseDatos2 = new BaseDatos2();
    private static BaseDatos3 baseDatos3 = new BaseDatos3();
    private static BasesDeDatos basesDeDatos = new BasesDeDatos();

    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NameApplication - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        System.exit(1);
    }

    public static BaseDatos1 getBaseDatos1() {
        return baseDatos1;
    }

    public static BaseDatos2 getBaseDatos2() {
        return baseDatos2;
    }

    public static BaseDatos3 getBaseDatos3() {
        return baseDatos3;
    }

    public static BasesDeDatos getBasesDeDatos() {
        return basesDeDatos;
    }

    public static void newStage(String fxml, String title) {
        stageView = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(loadFXML(fxml));
            stageView.setTitle(title);
            stageView.setScene(scene);
            stageView.centerOnScreen();
            stageView.initOwner(stageRoot);
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.showAndWait();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stageRoot.getScene().setRoot(pane);
    }

    public static Stage getStageView(){
        return stageView;
    }



    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
}
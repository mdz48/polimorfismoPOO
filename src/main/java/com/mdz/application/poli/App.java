package com.mdz.application.poli;

import com.mdz.application.poli.models.UNACH;
import com.mdz.application.poli.models.UNICACH;
import com.mdz.application.poli.models.UP;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private static UP up = new UP();
    private static Stage stageView;
    private static Stage stageRoot;
    private static UNACH unach = new UNACH();
    private static UNICACH unicach = new UNICACH();

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

    public static UP getUp() {
        return up;
    }

    public static UNACH getUnach() {
        return unach;
    }

    public static UNICACH getUnicach() {
        return unicach;
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
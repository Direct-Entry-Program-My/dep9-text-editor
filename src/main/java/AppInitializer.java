import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        URL splashResource = this.getClass().getResource("/view/SplashForm.fxml");
        Parent splashContainer = FXMLLoader.load(splashResource);
        Scene splashScene = new Scene(splashContainer);
        splashScene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        //Stage stage = new Stage(StageStyle.TRANSPARENT);
        primaryStage.setScene(splashScene);
        primaryStage.show();
        primaryStage.centerOnScreen();


        /*primaryStage.setTitle("Text Editor by Banda");
        primaryStage.centerOnScreen();

        URL resource = this.getClass().getResource("/view/TextEditorForm.fxml");
        Parent container = FXMLLoader.load(resource);
        Scene scene = new Scene(container);
        primaryStage.setScene(scene);
        primaryStage.show();*/

    }
}

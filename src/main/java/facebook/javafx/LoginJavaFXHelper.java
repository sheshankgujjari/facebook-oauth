package facebook.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginJavaFXHelper extends Application {

    private Scene scene;

    public void start(Stage primaryStage) throws Exception {

        // create the scene
        primaryStage.setTitle("Facebook Login Example");
        String appId = getParameters().getRaw().get(0);
        String appSecret = getParameters().getRaw().get(1);
        Browser facebookBrowser = new Browser(appId, appSecret);
        scene = new Scene(facebookBrowser, 900, 600, Color.web("#666970"));
        primaryStage.setScene(scene);
        primaryStage.show();
        facebookBrowser.showLogin();
    }

    public static void main(String[] args) {
        if (args.length != 2)
            throw new IllegalArgumentException("You must provide an App ID and App secret");
        launch(args);
    }
}


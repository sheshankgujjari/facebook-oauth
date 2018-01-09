
package facebook.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RestJavaFXHelper extends Application {

  private Scene scene;
  public static String[] accessTokenAndExpiry;

  public void start(Stage primaryStage) throws Exception {

    // create the scene
    primaryStage.setTitle("Facebook Login Example");
    String appId = getParameters().getRaw().get(0);
    String appSecret = getParameters().getRaw().get(1);
    RestBrowser facebookBrowser = new RestBrowser(appId, appSecret);
    scene = new Scene(facebookBrowser, 900, 600, Color.web("#666970"));
    primaryStage.setScene(scene);
    primaryStage.show();
    accessTokenAndExpiry = facebookBrowser.showLogin();
  }

  public static String[] main(String[] args) {
    if (args.length != 2)
      throw new IllegalArgumentException("You must provide an App ID and App secret");
    launch(args);
    return accessTokenAndExpiry;
  }
}

package webview;

import java.text.MessageFormat;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class Main extends Application implements Runnable {

	private final static String URL="http://www.youtube.com/embed/{0}?autoplay=1";


	public static String NERY_ID = "uQITWbAaDx0";
	public static String THOVEX_ID = "yKP7jQknGjs";

	private static WebView webview;

	@Override
	public void start(Stage primaryStage) {
		try {
			webview = new WebView();
			BorderPane root = new BorderPane(webview);

			// change the id of the video here!
//			String id = getParameters().getRaw().get(0);
			String id = THOVEX_ID;

			webview.getEngine().load(MessageFormat.format(URL, id));

			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();


		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String id = THOVEX_ID;
		launch(id);
	}

	@Override
	public void run() {
		launch();
	}
	
	public static void setID(String id) {
		Platform.runLater(new Runnable(){
            @Override
            public void run(){
            	webview.getEngine().load(MessageFormat.format(URL, id));
            }
        });

	}

}

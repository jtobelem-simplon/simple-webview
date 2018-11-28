package webview;
	
import java.text.MessageFormat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class Main extends Application {
	
	private final static String URL="http://www.youtube.com/embed/{0}?autoplay=1";


	public static String NERY_ID = "uQITWbAaDx0";
	public static String THOVEX_ID = "yKP7jQknGjs";
	
	@Override
	public void start(Stage primaryStage) {
		try {

			BorderPane root = new BorderPane();
			WebView webview = new WebView();
			root.setCenter(webview);
			
			// change the id of the video here!
			String id = getParameters().getRaw().get(0);
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
}

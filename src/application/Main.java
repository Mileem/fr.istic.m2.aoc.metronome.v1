package application;
	
import command.Command;
import command.MarkBar;
import command.MarkTempo;
import invoker.Engine;
import invoker.MetronomeEngine;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import observer.Controller;
import observer.ControllerImplements;
import view.Keyboard;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage primaryStage;
	private BorderPane keyboardLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/*BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();*/
			
			this.primaryStage = primaryStage;
	        this.primaryStage.setTitle("AddressApp");

	        initKeyboardLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void initKeyboardLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/view/KeyboardLayout.fxml"));
			this.keyboardLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(this.keyboardLayout);
            this.primaryStage.setTitle("Métronome");
            this.primaryStage.setScene(scene);
            this.primaryStage.show();
            
            Keyboard controller = loader.getController();
            controller.setMainApplication(this);
            
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		/*Controller controller = new ControllerImplements();
		
		Command markTempo = new MarkTempo(controller);
		Command markBar = new MarkBar(controller);
		
		Engine engine = new MetronomeEngine();
		engine.setMarkTempo(markTempo);
		engine.setMarkBar(markBar);
		
		engine.markTempo();
		engine.markBar();*/
	}
}

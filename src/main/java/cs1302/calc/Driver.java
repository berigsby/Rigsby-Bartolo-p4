import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    } // main

    @Override
	public void start(Stage stage) {

	BorderPane pane = new BorderPane();

	CalcButtons cb = new CalcButtons();
	CalcDisplays cd = new CalcDisplays();

	pane.setTop(cd.getTextArea());
	pane.setRight(cd.getVBoxBits());
	pane.setBottom(cb.getVBox());
	Scene scene = new Scene(pane);

	stage.setTitle("Programmer's Calculator");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        
    } // start

} // Driver
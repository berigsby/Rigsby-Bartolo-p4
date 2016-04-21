package cs1302.calc;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;

/**
 * the driver to the programmer's calculator. 
 * program diaplys a calculator which displays
 * calculated results both in value, and in 
 * binary. uses both recursion and interation
 * to perform calculations
 */
public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    } // main

    @Override
	public void start(Stage stage) {

	BorderPane pane = new BorderPane();

	CalcDisplays cd = new CalcDisplays();
	CalcButtons cb = new CalcButtons(cd);

	pane.setTop(cd.getTextArea());
	pane.setRight(cd.getVBoxBits());
	pane.setBottom(cb.getVBox());
        cd.getTextArea().setAlignment(Pos.TOP_RIGHT);
	Scene scene = new Scene(pane);

	stage.setTitle("Programmer's Calculator"); //title of window
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show(); //make the stage visible to user
        
    } // start

} // Driver
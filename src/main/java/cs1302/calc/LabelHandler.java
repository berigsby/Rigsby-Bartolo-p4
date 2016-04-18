package cs1302.calc;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Label;


public class LabelHandler implements EventHandler<MouseEvent> {

    public void handle(MouseEvent event) {
	Label bit;
	bit = (Label) event.getSource();
	
	if(bit.getText().equals("0")){
	    bit.setText("1");
	}else{
	    bit.setText("0");
	} //else

    } //handle

} //LabelHandler

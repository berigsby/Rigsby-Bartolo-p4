package cs1302.calc;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

/**
 * class CalcDisplays displays the bits of 
 * ones and zeros. Also displays the input of 
 * the user followed by the result
 */

public class CalcDisplays{

    Label l0,l1,l2,l3,l4,l5,l6,l7,l8,l9, //the zeros and ones
	l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,
	l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30;

    Label index0,index15,index30; //the index beneath the bits

    Label [] calcBits = {l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,
	       l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,
	       l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30};
    
    Label [] bitIndex = {index0,index15,index30}; //the index below the bit

    //Fonts for appropriate areas
    Font bitFont;
    Font indexFont;
    Font calcAreaFont;
    Font numAreaFont;

    VBox textArea; //container for calcTextArea and numTextArea
    Label calcTextArea;//the user typed number and operations
    Label numTextArea; //The output number

    HBox hboxBits;
    HBox hbox1,hbox2,hbox3,hbox4,hbox5,hbox6,hbox7,hbox8;
    HBox hboxBitIndex;
    VBox vboxBits;

    String binaryString; //the bits on screen represented as a string

    boolean useRecursion = true;
    boolean showBinary = true;

    public CalcDisplays(){

	//initializes the fonts for appropriate areas
	bitFont = Font.font("Comic Sans MS", FontWeight.BOLD, 20);
	indexFont = Font.font("Comic Sans MS", FontWeight.NORMAL, 13);
	calcAreaFont = Font.font("Comic Sans MS", FontWeight.NORMAL, 25);
	numAreaFont = Font.font("Comic Sans MS", FontWeight.BOLD, 30);

	//default value of string
	binaryString = "0000000000000000000000000000000";

	initializeCalcBits();
	initializeBitIndex();

	//User Input(ex. 9 * 9)
	calcTextArea = new Label();
	calcTextArea.setFont(calcAreaFont);

	//Output(Answer)
	numTextArea = new Label();
	numTextArea.setFont(numAreaFont);
	
	//Puts the calcTextArea and numTextArea into a VBox
	textArea = new VBox();
	textArea.getChildren().addAll(calcTextArea,numTextArea);
	textArea.setPadding(new Insets(5, 10, 5, 0));
	
	//sets each bit to an assigned group bits in an HBox
	hbox1 = new HBox();
	hbox1.getChildren().addAll(calcBits[0],calcBits[1],calcBits[2]);
	hbox2 = new HBox();
        hbox2.getChildren().addAll(calcBits[3],calcBits[4],calcBits[5],calcBits[6]);
	hbox3 = new HBox();
        hbox3.getChildren().addAll(calcBits[7],calcBits[8],calcBits[9],calcBits[10]);
	hbox4 = new HBox();
        hbox4.getChildren().addAll(calcBits[11],calcBits[12],calcBits[13],calcBits[14]);
	hbox5 = new HBox();
        hbox5.getChildren().addAll(calcBits[15],calcBits[16],calcBits[17],calcBits[18]);
	hbox6 = new HBox();
        hbox6.getChildren().addAll(calcBits[19],calcBits[20],calcBits[21],calcBits[22]);
	hbox7 = new HBox();
        hbox7.getChildren().addAll(calcBits[23],calcBits[24],calcBits[25],calcBits[26]);
	hbox8 = new HBox();
        hbox8.getChildren().addAll(calcBits[27],calcBits[28],calcBits[29],calcBits[30]);

	//sets the index beneath the bits to an HBox
	hboxBitIndex = new HBox();
	hboxBitIndex.getChildren().addAll(bitIndex[2],bitIndex[1],bitIndex[0]);
        hboxBitIndex.setSpacing(248);

	//sets all the individual bit HBoxes to a single HBox
	hboxBits = new HBox();
	hboxBits.getChildren().addAll(hbox1,hbox2,hbox3,hbox4,hbox5,hbox6,hbox7,hbox8);
	hboxBits.setPadding(new Insets(15, 0, 0, 12));
	hboxBits.setSpacing(16);

	//add both HBoxes to a VBox
	vboxBits = new VBox();
	vboxBits.getChildren().addAll(hboxBits,hboxBitIndex);

	calcBits[0].setOnMouseClicked(event -> { //the handlers for each individual label
		toggleBit(calcBits[0]);             //displaying an individual bit
		updateBinaryString(0);
	    });

	calcBits[1].setOnMouseClicked(event -> {
                toggleBit(calcBits[1]);
		updateBinaryString(1);
            });
	
	calcBits[2].setOnMouseClicked(event -> {
                toggleBit(calcBits[2]);
		updateBinaryString(2);
            });

	calcBits[3].setOnMouseClicked(event -> {
                toggleBit(calcBits[3]);
		updateBinaryString(3);
            });

	calcBits[4].setOnMouseClicked(event -> {
                toggleBit(calcBits[4]);
		updateBinaryString(4);
            });

	calcBits[5].setOnMouseClicked(event -> {
                toggleBit(calcBits[5]);
		updateBinaryString(5);
            });

	calcBits[6].setOnMouseClicked(event -> {
                toggleBit(calcBits[6]);
		updateBinaryString(6);
            });

	calcBits[7].setOnMouseClicked(event -> {
                toggleBit(calcBits[7]);
		updateBinaryString(7);
            });

	calcBits[8].setOnMouseClicked(event -> {
                toggleBit(calcBits[8]);
		updateBinaryString(8);
            });

	calcBits[9].setOnMouseClicked(event -> {
                toggleBit(calcBits[9]);
		updateBinaryString(9);
            });

	calcBits[10].setOnMouseClicked(event -> {
                toggleBit(calcBits[10]);
		updateBinaryString(10);
            });

       	calcBits[11].setOnMouseClicked(event -> {
                 toggleBit(calcBits[11]);
		 updateBinaryString(11);
            });

	calcBits[12].setOnMouseClicked(event -> {
                toggleBit(calcBits[12]);
		updateBinaryString(12);
            });
	
	calcBits[13].setOnMouseClicked(event -> {
                toggleBit(calcBits[13]);
		updateBinaryString(13);
            });

        calcBits[14].setOnMouseClicked(event -> {
                toggleBit(calcBits[14]);
		updateBinaryString(14);
            });

        calcBits[15].setOnMouseClicked(event -> {
                toggleBit(calcBits[15]);
		updateBinaryString(15);
            });

	calcBits[16].setOnMouseClicked(event -> {
                toggleBit(calcBits[16]);
		updateBinaryString(16);
            });

        calcBits[17].setOnMouseClicked(event -> {
                toggleBit(calcBits[17]);
		updateBinaryString(17);
            });

        calcBits[18].setOnMouseClicked(event -> {
                toggleBit(calcBits[18]);
		updateBinaryString(18);
            });

	calcBits[19].setOnMouseClicked(event -> {
                toggleBit(calcBits[19]);
		updateBinaryString(19);
            });

        calcBits[20].setOnMouseClicked(event -> {
                toggleBit(calcBits[20]);
		updateBinaryString(20);
            });

        calcBits[21].setOnMouseClicked(event -> {
                toggleBit(calcBits[21]);
		updateBinaryString(21);
            });

	calcBits[22].setOnMouseClicked(event -> {
                toggleBit(calcBits[22]);
		updateBinaryString(22);
            });

        calcBits[23].setOnMouseClicked(event -> {
                toggleBit(calcBits[23]);
		updateBinaryString(23);
            });

        calcBits[24].setOnMouseClicked(event -> {
                toggleBit(calcBits[24]);
		updateBinaryString(24);
            });

        calcBits[25].setOnMouseClicked(event -> {
                toggleBit(calcBits[25]);
		updateBinaryString(25);
            });

	calcBits[26].setOnMouseClicked(event -> {
                toggleBit(calcBits[26]);
		updateBinaryString(26);
            });

        calcBits[27].setOnMouseClicked(event -> {
                toggleBit(calcBits[27]);
		updateBinaryString(27);
            });

        calcBits[28].setOnMouseClicked(event -> {
                toggleBit(calcBits[28]);
		updateBinaryString(28);
            });

        calcBits[29].setOnMouseClicked(event -> {
                toggleBit(calcBits[29]);
		updateBinaryString(29);
            });

	calcBits[30].setOnMouseClicked(event -> {
                toggleBit(calcBits[30]);
		updateBinaryString(30);
            });

    } //constructor

    /**
     * initializes each bit label to zero
     * an set their default font
     */
    private void initializeCalcBits(){
	for(int i=0;i<calcBits.length;i++){
	    calcBits[i] = new Label("0");
	    calcBits[i].setFont(bitFont);
	} //for
    } //initializeCalcBits

    /**
     * initializes the index labels beneath the bits
     * and sets their default font
     */
    private void initializeBitIndex(){
	bitIndex[0] = new Label("0 ");
	bitIndex[1] = new Label("   15");
	bitIndex[2] = new Label("   31");
	
	for(int i=0;i<bitIndex.length;i++){
	    bitIndex[i].setFont(indexFont);
	    bitIndex[i].setTextFill(Color.RED);
	} //for
    } //initializeBitIndex
    
    /**
     * Returns VBox containing text areas of user Input and answers
     *
     * @return same VBox of textArea, not a copy
     */
    public VBox getTextArea(){
	return textArea;
    } //getTextArea

    /**
     * Returns VBox containing the binary bits and location markers
     *
     * @return same VBox of Bits, not a copy
     */
    public VBox getVBoxBits(){
	return vboxBits;
    } //getHBox

    /**
     * toggles the bit value to that it isn't,
     * 1 goes to 0 and 0 goes to 1
     *
     * @param bit, the bit to toggle
     */
    public void toggleBit(Label bit){
	if(bit.getText().equals("0")){
		bit.setText("1");
	    }else{
		bit.setText("0");
	    } //else
    } //toggleBit

    /**
     * Changes the stored binaryString to match the current bits
     * shown as output
     *
     * @param pos the position to update
     */
    private void updateBinaryString(int pos){
       
	String pre = binaryString.substring(0,pos);
	if(pos<30){
	    String post = binaryString.substring(pos+1);
	    binaryString = pre+(calcBits[pos].getText())+post;
        } //if
	else{
	    binaryString = pre+(calcBits[pos].getText());
	} //else
	
	numTextArea.setText("" + Integer.parseInt(binaryString, 2));
    } //setBinaryString

    /**
     * Returns the binaryString, that is the current binary displayed on calculator, used to calculate output
     *
     * @return String binaryString
     */
    public String getBinaryString(){
	return binaryString;
    } //getBinaryString

    /**
     * updates the calcTextArea, that is the user input, to use latest input, that is buttonText, if it is applicable
     *
     * @param buttonText, the latest user clicked button
     */
    public void setCalcTextArea(String buttonText){
	//if user clicks x, will clear area and resets binary/result areas
	if(buttonText.equals("x")){
	    calcTextArea.setText("");
	    numTextArea.setText("");
	    setEqualToBinary(0);
	    return;
	//if user clicks <, it is treated as backspace and takes away
	//the appropriate amount of spaces to erase latest character
	}else if(buttonText.equals("<")){
	    if(calcTextArea.getText().length() >= 3){
		if(calcTextArea.getText().substring(calcTextArea.getText().length() - 1).equals(" ")){
		    if(calcTextArea.getText().substring(calcTextArea.getText().length() - 2).equals("> ") ||
		       calcTextArea.getText().substring(calcTextArea.getText().length() - 2).equals("< ")){
			   calcTextArea.setText(calcTextArea.getText().substring(0, calcTextArea.getText().length() -4));
			   return;
		       }//if
		    calcTextArea.setText(calcTextArea.getText().substring(0, calcTextArea.getText().length() -3));
	            return;
	        }//if
	    }//if
	    if(calcTextArea.getText().length() >= 2){
		if(calcTextArea.getText().substring(calcTextArea.getText().length() - 1).equals("!")){
		    calcTextArea.setText(calcTextArea.getText().substring(0, calcTextArea.getText().length() -2));
		    return;
		}//if
	    }//if
	    if(calcTextArea.getText().length() != 0){
		calcTextArea.setText(calcTextArea.getText().substring(0, calcTextArea.getText().length() -1));
		return;
	    }//if
	// if user repeats an opperation that isn't allowed, no input will be added
        }else{
	    if(buttonText.equals(" * ") || buttonText.equals(" / ") || buttonText.equals(" - ") || 
	       buttonText.equals(" << ") || buttonText.equals(" ^ ") || buttonText.equals(" + ") ||
	       buttonText.equals(" >> ") || buttonText.equals(" !")){
		if(calcTextArea.getText().length() != 0){
		    if(calcTextArea.getText().substring(calcTextArea.getText().length()-1).equals(" ")) return;
		}//if
		if(calcTextArea.getText().equals("")){
		    return;
		}//if
		
	    }//if
	    if(calcTextArea.getText().length() >= 2){
		if(calcTextArea.getText().substring(calcTextArea.getText().length()-1).equals("!")){
		    if(buttonText.length() ==1) return;
		}//if
	    }//if
            calcTextArea.setText(calcTextArea.getText() + buttonText);
	}//else
    } //setCalcTextArea

    /**
     * switches the current math mode to one not in use
     * switches between recursion and iteration
     *
     * @return boolean of Recursion value before switch
     */
    public boolean switchRecursion(){
	boolean value = useRecursion;
	if(useRecursion) useRecursion = false;
	else useRecursion = true;
	return value;
    }//switchRecursion

    /**
     * switches the current mode to show binary or not, 
     * and displays appropriately
     *
     * @return boolean of current Binary mode, true if binary is showing
     */
    public boolean switchBinary(){
	
	if(showBinary) showBinary = false;
	else showBinary = true;

	//shows or hides binary numbers
	vboxBits.setVisible(showBinary);

	return showBinary;
    }//switchBinary

    /**
     * if equals was clicked, sets result and binary text to appropriate values
     *
     */
   public void equalsClicked(){
	if(calcTextArea.getText().equals("")){
	    setCalcTextArea("x");
	    return;
	}//if

	//copied from project description
	// string containing a mathematical expression represented in infix notation
	String expression = calcTextArea.getText();

	// convert the expression into an array by splitting it by white space
	String infix[] = expression.split(" ");

	// use the ReversePolishNotation class to get an array containing the expression
	// in post-fix notation
	String postfix[] = ReversePolishNotation.infixToPostfix(infix);

	// create an instance of our BasicMath class
	Math iterativeMath = new IterativeMath();
	Math recursiveMath = new RecursiveMath();

	// use the ReversePolishNotation class to evaluate the expression
	int result = 0;
	if(!useRecursion) result = ReversePolishNotation.evaluate(recursiveMath, postfix);
	else result = ReversePolishNotation.evaluate(iterativeMath, postfix);

	//sets result text area
	numTextArea.setText("" + result);
	
	//makes binary equals to result
	setEqualToBinary(result);

    }//equalsClicked
    
    /**
     * sets the binary string, and then the bits to match the input result value
     *
     * @param result, the number to change to binary
     */
    private void setEqualToBinary(int result){
	String tempBinaryString = Integer.toBinaryString(result);
	int temp = tempBinaryString.length();
	int total32 = 31-temp;
	binaryString = "";
	for(int i = 0; i < total32; i ++){
	    binaryString += "0";
	}//for
	binaryString += tempBinaryString;
	for(int i = 0; i < 31; i ++){
	    calcBits[i].setText(binaryString.substring(i,i+1));
	}//for

    }//setEqualToBinary
    
} //CalcDisplays
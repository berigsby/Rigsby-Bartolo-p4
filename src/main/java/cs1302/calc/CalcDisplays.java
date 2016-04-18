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

public class CalcDisplays{

    Label l0,l1,l2,l3,l4,l5,l6,l7,l8,l9, //the zeros and ones
	l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,
	l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31;

    Label index0,index15,index31; //the index beneath the bits

    Label [] calcBits = {l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,
	       l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,
	       l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31};
    
    Label [] bitIndex = {index0,index15,index31}; //the index below the bit

    Font bitFont;
    Font indexFont;
    TextField calcTextArea;

    HBox hboxBits;
    HBox hbox1,hbox2,hbox3,hbox4,hbox5,hbox6,hbox7,hbox8;
    HBox hboxBitIndex;
    VBox vboxBits;

    String binaryString;

    public CalcDisplays(){

	bitFont = Font.font("Comic Sans MS", FontWeight.BOLD, 20);
	indexFont = Font.font("Comic Sans MS", FontWeight.NORMAL, 13);

	binaryString = "00000000000000000000000000000000";

	initializeCalcBits();
	initializeBitIndex();

	calcTextArea = new TextField();
	calcTextArea.setPrefWidth(100);
	calcTextArea.setPrefHeight(100);
	calcTextArea.setAlignment(Pos.CENTER_RIGHT);
	
	hbox1 = new HBox();
	hbox1.getChildren().addAll(calcBits[3],calcBits[2],calcBits[1],calcBits[0]);
	hbox2 = new HBox();
        hbox2.getChildren().addAll(calcBits[7],calcBits[6],calcBits[5],calcBits[4]);
	hbox3 = new HBox();
        hbox3.getChildren().addAll(calcBits[11],calcBits[10],calcBits[9],calcBits[8]);
	hbox4 = new HBox();
        hbox4.getChildren().addAll(calcBits[15],calcBits[14],calcBits[13],calcBits[12]);
	hbox5 = new HBox();
        hbox5.getChildren().addAll(calcBits[19],calcBits[18],calcBits[17],calcBits[16]);
	hbox6 = new HBox();
        hbox6.getChildren().addAll(calcBits[23],calcBits[22],calcBits[21],calcBits[20]);
	hbox7 = new HBox();
        hbox7.getChildren().addAll(calcBits[27],calcBits[26],calcBits[25],calcBits[24]);
	hbox8 = new HBox();
        hbox8.getChildren().addAll(calcBits[31],calcBits[30],calcBits[29],calcBits[28]);

	hboxBitIndex = new HBox();
	hboxBitIndex.getChildren().addAll(bitIndex[2],bitIndex[1],bitIndex[0]);
        hboxBitIndex.setSpacing(248);

	hboxBits = new HBox();
	hboxBits.getChildren().addAll(hbox8,hbox7,hbox6,hbox5,hbox4,hbox3,hbox2,hbox1);
	hboxBits.setPadding(new Insets(15, 0, 0, 12));
	hboxBits.setSpacing(16);

	vboxBits = new VBox();
	vboxBits.getChildren().addAll(hboxBits,hboxBitIndex);
	
	//	LabelHandler lh = new LabelHandler();
	//	for(int i=0;i<calcBits.length;i++){
	    //  calcBits[i].setOnMouseClicked(lh);
	    //	} //for

	calcBits[0].setOnMouseClicked(event -> {
		toggleBit(calcBits[0].getText());
		updateBinaryString(0);
	    });

	calcBits[1].setOnMouseClicked(event -> {
                toggleBit(calcBits[1].getText());
		updateBinaryString(1);
            });
	
	calcBits[2].setOnMouseClicked(event -> {
                toggleBit(calcBits[2].getText());
		updateBinaryString(2);
            });

	calcBits[3].setOnMouseClicked(event -> {
                toggleBit(calcBits[3].getText());
		updateBinaryString(3);
            });

	calcBits[4].setOnMouseClicked(event -> {
                toggleBit(calcBits[4].getText());
		updateBinaryString(4);
            });

	calcBits[5].setOnMouseClicked(event -> {
                toggleBit(calcBits[5].getText());
		updateBinaryString(5);
            });

	calcBits[6].setOnMouseClicked(event -> {
                toggleBit(calcBits[6].getText());
		updateBinaryString(6);
            });

	calcBits[7].setOnMouseClicked(event -> {
                toggleBit(calcBits[7].getText());
		updateBinaryString(7);
            });

	calcBits[8].setOnMouseClicked(event -> {
                toggleBit(calcBits[8].getText());
		updateBinaryString(8);
            });

	calcBits[9].setOnMouseClicked(event -> {
                toggleBit(calcBits[9].getText());
		updateBinaryString(9);
            });

	calcBits[10].etOnMouseClicked(event -> {
                toggleBit(calcBits[10].getText());
		updateBinaryString(10);
            });

       	calcBits[11].getOnMouseClicked(event -> {
                 toggleBit(calcBits[11].getText());
		 updateBinaryString(11);
            });

	calcBits[12].getOnMouseClicked(event -> {
                toggleBit(calcBits[12].getText());
		updateBinaryString(12);
            });
	
	calcBits[13].getOnMouseClicked(event -> {
                toggleBit(calcBits[13].getText());
		updateBinaryString(13);
            });

        calcBits[14].getOnMouseClicked(event -> {
                toggleBit(calcBits[14].getText());
		updateBinaryString(14);
            });

        calcBits[15].getOnMouseClicked(event -> {
                toggleBit(calcBits[15].getText());
		updateBinaryString(15);
            });

	calcBits[16].getOnMouseClicked(event -> {
                toggleBit(calcBits[16].getText());
		updateBinaryString(16);
            });

        calcBits[17].getOnMouseClicked(event -> {
                toggleBit(calcBits[17].getText());
		updateBinaryString(17);
            });

        calcBits[18].getOnMouseClicked(event -> {
                toggleBit(calcBits[18].getText());
		updateBinaryString(18);
            });

	calcBits[19].getOnMouseClicked(event -> {
                toggleBit(calcBits[19].getText());
		updateBinaryString(19);
            });

        calcBits[20].getOnMouseClicked(event -> {
                toggleBit(calcBits[20].getText());
		updateBinaryString(20);
            });

        calcBits[21].getOnMouseClicked(event -> {
                toggleBit(calcBits[21].getText());
		updateBinaryString(21);
            });

	calcBits[22].getOnMouseClicked(event -> {
                toggleBit(calcBits[22].getText());
		updateBinaryString(22);
            });

        calcBits[23].getOnMouseClicked(event -> {
                toggleBit(calcBits[23].getText());
		updateBinaryString(23);
            });

        calcBits[24].getOnMouseClicked(event -> {
                toggleBit(calcBits[24].getText());
		updateBinaryString(24);
            });

        calcBits[25].getOnMouseClicked(event -> {
                toggleBit(calcBits[25].getText());
		updateBinaryString(25);
            });

	calcBits[26].getOnMouseClicked(event -> {
                toggleBit(calcBits[26].getText());
		updateBinaryString(26);
            });

        calcBits[27].getOnMouseClicked(event -> {
                toggleBit(calcBits[27].getText());
		updateBinaryString(27);
            });

        calcBits[28].getOnMouseClicked(event -> {
                toggleBit(calcBits[28].getText());
		updateBinaryString(28);
            });

        calcBits[29].getOnMouseClicked(event -> {
                toggleBit(calcBits[29].getText());
		updateBinaryString(29);
            });

	calcBits[30].getOnMouseClicked(event -> {
                toggleBit(calcBits[30].getText());
		updateBinaryString(30);
            });

	calcBits[31].getOnMouseClicked(event -> {
                toggleBit(calcBits[31].getText());
		updateBinaryString(31);
            });

    } //constructor

    private void initializeCalcBits(){
	for(int i=0;i<calcBits.length;i++){
	    calcBits[i] = new Label("0");
	    calcBits[i].setFont(bitFont);
	} //for
    } //initializeCalcBits

    private void initializeBitIndex(){
	bitIndex[0] = new Label("0");
	bitIndex[1] = new Label("     15");
	bitIndex[2] = new Label("   31");
	
	for(int i=0;i<bitIndex.length;i++){
	    bitIndex[i].setFont(indexFont);
	    bitIndex[i].setTextFill(Color.RED);
	} //for
    } //initializeBitIndex

    public TextField getTextArea(){
	return calcTextArea;
    } //getTextArea

    public VBox getVBoxBits(){
	return vboxBits;
    } //getHBox

    public void toggleBit(Label bit){
	if(bit.getText().equals("0")){
		bit.setText("1");
	    }else{
		bit.setText("0");
	    } //else
    } //toggleBit

<<<<<<< HEAD
    private void updateBinaryString(int pos){
       
	String pre = binaryString.substring(0,pos);
	if(pos<31){
	    String post = binaryString.substring(pos+1);
	    binaryString = pre+(calcBits[pos].getText())+post);
        } //if
	else{
	    binaryString = pre+(calcBits[pos].getText());
	} //else
	


    } //setBinaryString

    public String getBinaryString(){
	return binaryString;
    } //getBinaryString

    public void setCalcTextArea(String buttonText){
	calcTextArea.setText(calcTextArea.getText() + buttonText);
    } //setCalcTextArea

    
=======
>>>>>>> 663eade362b7d279daa6c617315e27833f8e5683
} //CalcDisplays
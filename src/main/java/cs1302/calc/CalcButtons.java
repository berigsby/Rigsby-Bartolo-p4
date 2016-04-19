package cs1302.calc;

import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CalcButtons{

    CalcDisplays cd;

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9; //buttons with numbers
    Button asterisk;
    Button leftDArrows;
    Button rightDArrows;
    Button exMark;
    Button exp;
    Button forSlash;
    Button minus;
    Button plus;
    Button multi;
    Button equals;
    Button leftArrow;
    Button binaryButton;
    Button recurButton;
    
    VBox vbox;
    HBox hbox1;
    HBox hbox2;
    HBox hbox3;
    HBox hbox4;

    Image imageZero;
    Image imageOne;
    Image imageTwo;
    Image imageThree;
    Image imageFour;
    Image imageFive;
    Image imageSix;
    Image imageSeven;
    Image imageEight;
    Image imageNine;
    
    Image imageAsterisk;
    Image imageHideBinary;
    Image imageUnhideBinary;
    Image imageLeftDArrows;
    Image imageRightDArrows;
    Image imageEqual;
    Image imageExclamation;
    Image imageExponent;
    Image imageForwardSlash;
    Image imageLeftArrow;
    Image imageMinus;
    Image imagePlus;
    Image imageMultiply;
    Image imageUseRecursion;
    Image imageUnuseRecursion;

    

    public CalcButtons(CalcDisplays cda){

	this.cd = cda;

	hbox1 = new HBox();
	hbox2 = new HBox();
	hbox3 = new HBox();
	hbox4 = new HBox();
	
	vbox = new VBox();

	imageZero = new Image("file:src/main/resources/Nodes/Project 4 - 0.png");
	imageOne = new Image("file:src/main/resources/Nodes/Project 4 - 1.png");
	imageTwo = new Image("file:src/main/resources/Nodes/Project 4 - 2.png");
        imageThree = new Image("file:src/main/resources/Nodes/Project 4 - 3.png");
	imageFour = new Image("file:src/main/resources/Nodes/Project 4 - 4.png");
        imageFive = new Image("file:src/main/resources/Nodes/Project 4 - 5.png");
	imageSix = new Image("file:src/main/resources/Nodes/Project 4 - 6.png");
        imageSeven = new Image("file:src/main/resources/Nodes/Project 4 - 7.png");
	imageEight = new Image("file:src/main/resources/Nodes/Project 4 - 8.png");
        imageNine = new Image("file:src/main/resources/Nodes/Project 4 - 9.png");

	imageAsterisk = new Image("file:src/main/resources/Nodes/Project 4 - Asterisk.png");
        imageHideBinary = new Image("file:src/main/resources/Nodes/Project 4 - Hide Binary.png");
        imageUnhideBinary = new Image("file:src/main/resources/Nodes/Project 4 - Unhide Binary.png");
        imageLeftDArrows = new Image("file:src/main/resources/Nodes/Project 4 - Double Left Arrows.png");
        imageRightDArrows = new Image("file:src/main/resources/Nodes/Project 4 - Double Right Arrows.png");
        imageEqual = new Image("file:src/main/resources/Nodes/Project 4 - Equal.png");
        imageExclamation = new Image("file:src/main/resources/Nodes/Project 4 - Exclamation.png");
        imageExponent = new Image("file:src/main/resources/Nodes/Project 4 - Exponent.png");
        imageForwardSlash = new Image("file:src/main/resources/Nodes/Project 4 - Forward Slash.png");
        imageLeftArrow = new Image("file:src/main/resources/Nodes/Project 4 - Left Arrow.png");
	imageMinus = new Image("file:src/main/resources/Nodes/Project 4 - Minus.png");
        imagePlus = new Image("file:src/main/resources/Nodes/Project 4 - Plus.png");
        imageMultiply = new Image("file:src/main/resources/Nodes/Project 4 - Multiply.png");
        imageUseRecursion = new Image("file:src/main/resources/Nodes/Project 4 - Use Recursion.png");
        imageUnuseRecursion = new Image("file:src/main/resources/Nodes/Project 4 - Unuse Recursion.png");

	asterisk = new Button();
	leftDArrows = new Button();
	rightDArrows = new Button();
        exMark = new Button();
	exp = new Button();
	forSlash = new Button();
	minus = new Button();
	plus = new Button();
        multi = new Button();
	equals = new Button();
	leftArrow = new Button();
	binaryButton = new Button();
	recurButton = new Button();


	b0 = new Button();
	b1 = new Button();
	b2 = new Button();
        b3 = new Button();
	b4 = new Button();
        b5 = new Button();
	b6 = new Button();
        b7 = new Button();
	b8 = new Button();
        b9 = new Button();

	asterisk.setGraphic(new ImageView(imageAsterisk));
	leftDArrows.setGraphic(new ImageView(imageLeftDArrows));
	rightDArrows.setGraphic(new ImageView(imageRightDArrows));
        exMark.setGraphic(new ImageView(imageExclamation));
	exp.setGraphic(new ImageView(imageExponent));
	forSlash.setGraphic(new ImageView(imageForwardSlash));
	minus.setGraphic(new ImageView(imageMinus));
	plus.setGraphic(new ImageView(imagePlus));
	multi.setGraphic(new ImageView(imageMultiply));
	equals.setGraphic(new ImageView(imageEqual));
	leftArrow.setGraphic(new ImageView(imageLeftArrow));
	binaryButton.setGraphic(new ImageView(imageHideBinary));
	recurButton.setGraphic(new ImageView(imageUseRecursion));

        b0.setGraphic(new ImageView(imageZero));
        b1.setGraphic(new ImageView(imageOne));
	b2.setGraphic(new ImageView(imageTwo));
        b3.setGraphic(new ImageView(imageThree));
	b4.setGraphic(new ImageView(imageFour));
        b5.setGraphic(new ImageView(imageFive));
	b6.setGraphic(new ImageView(imageSix));
        b7.setGraphic(new ImageView(imageSeven));
	b8.setGraphic(new ImageView(imageEight));
        b9.setGraphic(new ImageView(imageNine));

	hbox1.getChildren().addAll(b7,b8,b9,forSlash,exMark,leftArrow,multi);
	hbox2.getChildren().addAll(b4,b5,b6,asterisk,exp,leftDArrows,rightDArrows);
	hbox3.getChildren().addAll(b1,b2,b3,minus,recurButton);
	hbox4.getChildren().addAll(b0,equals,plus,binaryButton);

	vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox4);
	
	b0.setOnAction(event -> {
		cd.setCalcTextArea("0");
	});

	b1.setOnAction(event -> {
		cd.setCalcTextArea("1");
	});

	b2.setOnAction(event -> {
		cd.setCalcTextArea("2");
	});

	b3.setOnAction(event -> {
		cd.setCalcTextArea("3");
	});

	b4.setOnAction(event -> {
		cd.setCalcTextArea("4");
	});

	b5.setOnAction(event -> {
		cd.setCalcTextArea("5");
	});

	b6.setOnAction(event -> {
		cd.setCalcTextArea("6");
	});

	b7.setOnAction(event -> {
		cd.setCalcTextArea("7");
	});

	b8.setOnAction(event -> {
		cd.setCalcTextArea("8");
	});

	b9.setOnAction(event -> {
		cd.setCalcTextArea("9");
	});

	asterisk.setOnAction(event -> {
		cd.setCalcTextArea(" * ");
	});

	leftDArrows.setOnAction(event -> {
		cd.setCalcTextArea(" << ");
	});

	rightDArrows.setOnAction(event -> {
		cd.setCalcTextArea(" >> ");
	});

	exMark.setOnAction(event -> {
		cd.setCalcTextArea(" ! ");
	});

	exp.setOnAction(event -> {
		cd.setCalcTextArea(" ^ ");
	});

	forSlash.setOnAction(event -> {
		cd.setCalcTextArea(" / ");
	});	

	minus.setOnAction(event -> {
		cd.setCalcTextArea(" - ");
	});

	plus.setOnAction(event -> {
		cd.setCalcTextArea(" + ");
	});

	multi.setOnAction(event -> {
		cd.setCalcTextArea("x");
	});

	equals.setOnAction(event -> {
		cd.equalsClicked();
	});

	leftArrow.setOnAction(event -> {
		cd.setCalcTextArea("<");
	});

	binaryButton.setOnAction(event -> {
		if(!cd.switchBinary()) binaryButton.setGraphic(new ImageView(imageUnhideBinary));
		else binaryButton.setGraphic(new ImageView(imageHideBinary));
	});

	recurButton.setOnAction(event -> {
		if(cd.switchRecursion()) recurButton.setGraphic(new ImageView(imageUnuseRecursion));
		else recurButton.setGraphic(new ImageView(imageUseRecursion));
	});

    } //constructor
   
    public VBox getVBox(){
	return vbox;
    } //getVBox
} //CalcButtons

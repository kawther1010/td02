package com.example.td02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        /*PARTIE 01
        HBox root= new HBox();
        Button button1= new Button("OK");
        root.getChildren().add(button1);
        Button button2= new Button("YES");
        button2.setPrefSize(100,100);
        root.getChildren().add(button2);
        TextField textField= new TextField("Text Field");
        textField.setPrefWidth(110);
        root.getChildren().add(textField);
        CheckBox checkBox= new CheckBox("Check Box");
        root.getChildren().add(checkBox);
        RadioButton radioButton= new RadioButton("Radio Button");
        root.getChildren().add(radioButton);
        Scene scene= new Scene(root, 800, 400);
        //question c
        root.setSpacing(10);

        //question d
        root.setPadding(new Insets(10));

        //question e
        button1.setPadding(new Insets(10));

        //question f
        ComboBox comboBox= new ComboBox();
        comboBox.getItems().add("Choice   01");
        comboBox.getItems().add("Choice   02");
        comboBox.getItems().add("Choice   03");
        comboBox.getSelectionModel().select(0);
        root.getChildren().add(comboBox);

        //question g
        button1.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(button1, Priority.ALWAYS);
        //question h
        //HBox root= new HBox();
        //VBox root= new VBox();
        //FlowPane root= new FlowPane();
        //TilePane root= new TilePane();
        */


        /* PARTIE 02
        Button btn1= new Button("Button 01");
        Button btn2= new Button("Button 02");
        Button btn3= new Button("Button 03");
        Button btn4= new Button("Button 04");
        GridPane root= new GridPane();
        root.add(btn1, 1, 0);
        root.add(btn2, 2, 1);
        root.add(btn3, 3, 2);
        root.add(btn4, 1, 2);
        root.setVgap(15);
        btn1.setMaxWidth((Double.MAX_VALUE));
        HBox.setHgrow(btn1, Priority.ALWAYS);
        */

        //PARTIE 03 There is problems in this part
        //BorderPane // HBox //GridPane //HBox
        //BorderPane root= new BorderPane();
        HBox root1= new HBox();
        root1.getChildren().add(new Button("B1"));
        root1.getChildren().add(new Button("B2"));
        root1.getChildren().add(new Button("B3"));
        root1.getChildren().add(new Button("B4"));
        root1.setSpacing(10);
        //????????????????????????????????????????????
        GridPane root2= new GridPane();
        Button btn1= new Button("GR1");
        Button btn2= new Button("GR2");
        Button btn3= new Button("GR3");
        Button btn4= new Button("GR4");
        root2.add(btn1,0,0);
        root2.add(btn2,1,0);
        root2.add(btn3,0,1);
        root2.add(btn4,1,1);
        //????????????????????????????????????????
        /*
        HBox root3= new HBox();
        root3.getItems().add(" ");
        root3.getItems().add(" ");
        root3.getSelectionModel().select(0);
        root3.getChildren().add(comboBox);
        //????????????????????????????????????????
        root3.getChildren().add( new TextField("Un Text"));
        //????????????????????????????????????????

         */
        //root.getChildren().add(root1); //to top
        //root.getChildren().add(root2);
        //root.getChildren().add(root3);

        Scene scene= new Scene(root1, 1000, 500);
        stage.setTitle("Application Complexe Layout");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


// module-info.java






























/*
HBox rootTop=new HBox();
Button b1 = new Button("B1");
Button b2 = new Button("B2");
Button b3 = new Button("B3");
Button b4 = new Button("B4");
rootTop.setAlignment(Pos.TOP_CENTER);
rootTop.setPadding(new Insets(5));//pour définir l'espace (marge) entre le bord du conteneur et
les composants enfants
rootTop.setSpacing(5); //pour définir l'espace entre les composants enfants
rootTop.getChildren().addAll(b1,b2,b3,b4);
GridPane rootCentre = new GridPane();
rootCentre.setPrefSize(400, 400);//setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
//rootCentre.setPadding(new Insets(5, 0, 5, 0));
rootCentre.setAlignment(Pos.TOP_CENTER);
Button bgr1 = new Button("GR1");
Button bgr2 = new Button("GR2");
Button bgr3 = new Button("GR3");
Button bgr4 = new Button("GR4");
GridPane.setValignment(bgr1, VPos.CENTER);
GridPane.setValignment(bgr2, VPos.CENTER);
GridPane.setValignment(bgr3, VPos.CENTER);
GridPane.setValignment(bgr4, VPos.CENTER);
bgr1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
bgr2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
bgr3.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
bgr4.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
rootCentre.setHgrow(bgr1,Priority.ALWAYS);
rootCentre.setHgrow(bgr2,Priority.ALWAYS);
rootCentre.setHgrow(bgr3,Priority.ALWAYS);
rootCentre.setHgrow(bgr4,Priority.ALWAYS);
rootCentre.setVgrow(bgr1,Priority.ALWAYS);
rootCentre.setVgrow(bgr2,Priority.ALWAYS);
rootCentre.setVgrow(bgr3,Priority.ALWAYS);
rootCentre.setVgrow(bgr4,Priority.ALWAYS);
rootCentre.add(bgr1, 0, 0);
rootCentre.add(bgr2, 1, 0);
rootCentre.add(bgr3, 0, 1);
rootCentre.add(bgr4, 1, 1);
HBox rootBottom = new HBox();
rootBottom.setAlignment(Pos.TOP_CENTER);
ComboBox combobox =new ComboBox();
TextField tex=new TextField("Un texte");
rootBottom.getChildren().addAll(combobox ,tex);
BorderPane root =new BorderPane();
root.setTop(rootTop);
root.setCenter(rootCentre);
root.setBottom(rootBottom);
Scene scene = new Scene(root, 250, 150);
primaryStage.setTitle("Layouts");
primaryStage.setScene(scene);
primaryStage.show();
 */
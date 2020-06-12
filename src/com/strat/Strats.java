package com.strat;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Strats extends Application {

  /*  public static void main(String[] args) {
        System.out.println("Hello, World!");
        launch(args);
    }*/

    @Override
    public void start(Stage theStage) throws Exception {
        GridPane grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5,5,5,5));
        //Group rootNode = new Group();
        Scene theScene = new Scene(grid,800,800);
        theStage.setScene(theScene);
        theStage.show();

        ObservableList<String> options = FXCollections.observableArrayList("Bank","Border","Chalet","Clubhouse","Coastline","Consulate","Kafe Dostoyevsky","Kanal","Oregon","Outback","Villa","Theme Park");
        final ComboBox cb = new ComboBox(options);
        grid.add(cb,0,0,1,1);
        //rootNode.getChildren().add(grid);


    }
}

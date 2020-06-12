package com.strat;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Strats extends Application {

    public Scene theScene;
    public GridPane grid;
    public ObservableList<String> options;
    public ComboBox cb,siteCB,attDef;
    public boolean side;
    /*public int[][] currSite = {
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
            {},
    };*/

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        launch(args);
    }
    public void updateMap(String map) {
        //System.out.println(map);
        switch (map) {
            case "Bank":

                break;
            case "Border":

                break;
            case "Chalet":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("Basement","Kitchen|Trophy","Top Floor");
                break;
            case "Clubhouse":

                break;
            case "Coastline":

                break;
            case "Consulate":

                break;
            case "Kafe Dostoyevsky":

                break;
            case "Kanal":

                break;
            case "Oregon":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("Basement", "Kitchen|Meeting", "Second Floor");
                break;
            case "Outback":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("Compressor|Gear Store","Nature|Bushranger","Office|Party","Laundry|Games");
                break;
            case "Villa":

                break;
            case "Theme Park":

                break;
            default:
                System.out.println("You done fucked up");
                System.exit(1);
                break;
        }
    }
    @Override
    public void start(Stage theStage) throws Exception {
        grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5,5,5,5));
        theScene = new Scene(grid,1500,800);
        theStage.setScene(theScene);
        theStage.show();

        options = FXCollections.observableArrayList("Bank","Border","Chalet","Clubhouse","Coastline","Consulate","Kafe Dostoyevsky","Kanal","Oregon","Outback","Villa","Theme Park");
        cb = new ComboBox(options);
        siteCB = new ComboBox();
        attDef = new ComboBox();
        attDef.getItems().addAll("Attack","Defense");
        attDef.getSelectionModel().select(1);

        grid.add(cb,0,0,1,1);
        grid.add(attDef,0,1,1,1);
        grid.add(siteCB,0,2,1,1);


        cb.setOnAction(e -> updateMap((String)cb.getValue()));
        siteCB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });
    }
}

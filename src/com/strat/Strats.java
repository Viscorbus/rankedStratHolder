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
import javafx.scene.control.TreeItem;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Strats extends Application {

    public Scene theScene;
    public GridPane grid;
    public ObservableList<String> options;
    public ComboBox cb,siteCB,attDef;
    public boolean side;
    public TreeItem<String> root;
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
    /*public void updateMap(String map) {
        //System.out.println(map);
        switch (map) {
            case "Bank":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("B CCTV|Lockers","1F Tellers'|Archives","1F Open|Staff","2F CEO|Executive");
                break;
            case "Border":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("2F Armory|Archives","1F Bathroom|Tellers","1F Workshop|Ventilation","1F Supply|Customs");
                break;
            case "Chalet":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("B Wine|Snowmobile","1F Kitchen|Trophy","1F Gaming|Bar","2F Office|Master Bed");
                break;
            case "Clubhouse":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("B Church|Arsenal","1F Bar|Stock","2F Cash|CCTV","2F Bedroom|Gym");
                break;
            case "Coastline":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("1F Sunrise|Blue","1F Kitchen|Service","2F Theater|Penthouse","2F Hookah|Billiards");
                break;
            case "Consulate":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("B Cafeteria|Garage","1F/B Archives|Tellers","1F Lobby|Press","2F Meeting|Office");
                break;
            case "Kafe Dostoyevsky":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("1F Kitchen|Kitchen","2F Reading|Fireplace","2F Mining|Fireplace","3F Cocktail");
                break;
            case "Kanal":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("B Kayaks|Supply","1F Coast Guard|Lounge","1F Security|Maps","2F Server|Radar");
                break;
            case "Oregon":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("B Laundry|Supply","1F Dining|Kitchen","1F Kitchen|Meeting","2F Kids|Dorms");
                break;
            case "Outback":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("1F Compressor|Gear Store","1F Nature|Bushranger","2F Office|Party","2F Laundry|Games");
                break;
            case "Villa":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("1F Kitchen|Dining","1F Living|Library","2F Trophy|Statuary","2F Aviator|Games");
                break;
            case "Theme Park":
                siteCB.getItems().clear();
                siteCB.getItems().addAll("1F Drugs|Lab|Storage","1F Throne|Armory","2F Bunk|Day Care","2F Initiation|Office");
                break;
            default:
                System.out.println("You done fucked up");
                System.exit(1);
                break;
        }
    }*/
    @Override
    public void start(Stage theStage) throws Exception {
        grid = new GridPane();
        grid.setVgap(4);
        grid.setHgap(10);
        grid.setPadding(new Insets(5,5,5,5));
        theScene = new Scene(grid,1500,800);
        theStage.setScene(theScene);
        theStage.show();

        //options = FXCollections.observableArrayList("Bank","Border","Chalet","Clubhouse","Coastline","Consulate","Kafe Dostoyevsky","Kanal","Oregon","Outback","Villa","Theme Park");
        //cb = new ComboBox(options);
        //siteCB = new ComboBox();
        attDef = new ComboBox();
        attDef.getItems().addAll("Attack","Defense");
        attDef.getSelectionModel().select(1);

        //grid.add(cb,0,0,1,1);
        grid.add(attDef,0,1,1,1);
        //grid.add(siteCB,0,2,1,1);


        /*cb.setOnAction(e -> updateMap((String)cb.getValue()));
        siteCB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });*/
    }
}

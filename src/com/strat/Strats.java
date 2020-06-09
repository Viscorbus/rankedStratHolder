package com.strat;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Strats extends Application {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        launch(args);
    }

    @Override
    public void start(Stage theStage) throws Exception {
        Group rootNode = new Group();
        Scene theScene = new Scene(rootNode,200,200);
        theStage.setScene(theScene);
        theStage.show();
    }
}

package de.dubhar.jfxtest.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {

    private final Button helloButton = new Button();
    private int count = 0;

    public GUI() {
        this.helloButton.setText("Click me!");
        this.helloButton.setOnAction(this::buttonAction);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello World!");

        StackPane root = new StackPane();
        root.getChildren().add(this.helloButton);
        stage.setScene(new Scene(root, 300, 250));
        stage.show();
    }

    private void buttonAction(ActionEvent event) {
        this.count++;
        this.helloButton.setText(String.format("Clicked %s times!", this.count));
    }

    public static void main(String[] args) {
        launch(args);
    }
}

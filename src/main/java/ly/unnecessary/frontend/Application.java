package ly.unnecessary.frontend;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        var scene = new Scene(new Label("Hello, world"), 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JTodo");

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
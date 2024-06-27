package main.java.com;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainApp.primaryStage = primaryStage;
        showLoginScene();
    }

    public static void showLoginScene() throws Exception {
        Parent loginRoot = FXMLLoader.load(MainApp.class.getResource("/src/main/resource/com/login.fxml"));
        Scene loginScene = new Scene(loginRoot, 300, 200);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(loginScene);
        loginScene.getStylesheets().add(MainApp.class.getResource("/src/main/resource/com/login.css").toExternalForm());
        primaryStage.show();
    }

    public static void showRegisterScene() throws Exception {
        Parent registerRoot = FXMLLoader.load(MainApp.class.getResource("/src/main/resource/com/register.fxml"));
        Scene registerScene = new Scene(registerRoot, 400, 300);
        primaryStage.setTitle("Register Form");
        primaryStage.setScene(registerScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


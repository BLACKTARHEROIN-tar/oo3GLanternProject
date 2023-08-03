package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login extends Application {


    private static final String USERNAME = "user123";
    private static final String PASSWORD = "pass123";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Program");

        // Create UI components
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> handleLogin(primaryStage, usernameField.getText(), passwordField.getText()));

        // Create a grid pane layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(usernameLabel, 0, 0);
        grid.add(usernameField, 1, 0);
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(loginButton, 1, 2);

        // Set up the scene and stage
        Scene scene = new Scene(grid, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleLogin(Stage primaryStage, String username, String password) {
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            showMainAppScene(primaryStage, username);
        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password. Please try again.");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    private void showMainAppScene(Stage primaryStage, String username) {
        // Create the main application layout
        Label welcomeLabel = new Label("Welcome, " + username + "!");
        Button logoutButton = new Button("Logout");
        logoutButton.setOnAction(e -> showLoginScene(primaryStage));

        GridPane mainGrid = new GridPane();
        mainGrid.setPadding(new Insets(20, 20, 20, 20));
        mainGrid.setVgap(10);
        mainGrid.setHgap(10);
        mainGrid.add(welcomeLabel, 0, 0);
        mainGrid.add(logoutButton, 0, 1);

        Scene mainScene = new Scene(mainGrid, 300, 150);
        primaryStage.setScene(mainScene);
    }

    private void showLoginScene(Stage primaryStage) {
        // Clear the user input fields
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Label("Username:"), 0, 0);
        grid.add(usernameField, 1, 0);
        grid.add(new Label("Password:"), 0, 1);
        grid.add(passwordField, 1, 1);
        grid.add(new Button("Login"), 1, 2);

        Scene loginScene = new Scene(grid, 300, 150);
        primaryStage.setScene(loginScene);
    }
}

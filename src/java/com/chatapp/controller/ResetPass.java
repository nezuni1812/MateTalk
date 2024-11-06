package com.chatapp.controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class ResetPass extends Controller {
    @FXML
    private Button switchToSignInButton;
    @FXML
    private Button switchToSignUpButton;

    @FXML
    private void switchToSignIn() throws IOException {
        Parent sceneSignInRoot = FXMLLoader.load(getClass().getResource("/fxml/signin.fxml"));
        Scene sceneSignIn = new Scene(sceneSignInRoot);

        Stage stage = (Stage) switchToSignInButton.getScene().getWindow();
        stage.setScene(sceneSignIn);
    }

    @FXML
    private void switchToSignUp() throws IOException {
        Parent sceneSignUpRoot = FXMLLoader.load(getClass().getResource("/fxml/signup.fxml"));
        Scene sceneSignUp = new Scene(sceneSignUpRoot);

        Stage stage = (Stage) switchToSignUpButton.getScene().getWindow();
        stage.setScene(sceneSignUp);
    }

}

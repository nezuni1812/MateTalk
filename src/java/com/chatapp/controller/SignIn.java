package com.chatapp.controller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class SignIn extends Controller {
    @FXML
    private Button switchToSignUpButton;
    @FXML
    private Button switchToResetPassButton;

    @FXML
    private void switchToSignUp() throws IOException {
        Parent sceneSignUpRoot = FXMLLoader.load(getClass().getResource("/fxml/signup.fxml"));
        Scene sceneSignUp = new Scene(sceneSignUpRoot);

        Stage stage = (Stage) switchToSignUpButton.getScene().getWindow();
        stage.setScene(sceneSignUp);
    }
    
    @FXML
    private void switchToResetPass() throws IOException {
        Parent sceneResetPassRoot = FXMLLoader.load(getClass().getResource("/fxml/ResetPass.fxml"));
        Scene sceneResetPass = new Scene(sceneResetPassRoot);

        Stage stage = (Stage) switchToResetPassButton.getScene().getWindow();
        stage.setScene(sceneResetPass);
    }
}

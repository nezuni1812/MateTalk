/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatapp.controller;

/**
 *
 * @author Uyen Nhi
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage; 

public class Controller {

    @FXML
    private TextField tfName;
    
    private Stage mainWindow; // Define mainWindow as a variable of type Stage

    public void setMainWindow(Stage mainWindow) {
        this.mainWindow = mainWindow;
    }


    @FXML
    void btnOkDetect(ActionEvent event) {
        String title = tfName.getText();
        mainWindow.setTitle(title);
    }

}

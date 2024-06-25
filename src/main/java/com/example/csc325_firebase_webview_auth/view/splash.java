package com.example.csc325_firebase_webview_auth.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class splash {
    @FXML
    private Button enterButton;

    public void handleEnterButton() throws IOException {
        System.out.println ("handleEnterButton called");
        App.setRoot("/files/AccessFBView.fxml");
    }
}

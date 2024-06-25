package com.example.csc325_firebase_webview_auth.view;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import javafx.application.Platform;
import javafx.fxml.FXML;

import java.io.IOException;

public class register {

    @FXML
    public void GoBack() throws IOException {
        System.out.println("GoBack Menu button called");
        App.setRoot("/files/AccessFBView.fxml");
    }

    @FXML
    public void Close() {
        System.out.println("Close Menu button called");
        Platform.exit();
    }

    @FXML
    public boolean rbutton() {
        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail("user@example.com")
                .setEmailVerified(false)
                .setPassword("secretPassword")
                .setPhoneNumber("+11234567890")
                .setDisplayName("John Doe")
                .setDisabled(false);

        UserRecord userRecord;
        try {
            userRecord = App.fauth.createUser(request);
            System.out.println("Successfully created new user: " + userRecord.getUid());
            return true;

        } catch (FirebaseAuthException ex) {
            // Logger.getLogger(FirestoreContext.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}

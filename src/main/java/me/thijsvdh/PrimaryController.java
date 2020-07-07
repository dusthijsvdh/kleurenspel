package me.thijsvdh;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class PrimaryController {
//    @FXML TextField primaryTextField;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    // This doesn't work
//    public void textFieldUpdate(KeyEvent keyEvent) {
//        try {
//            if (primaryTextField.getText() != null) {
//                System.out.println(primaryTextField.getText());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}

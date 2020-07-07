package me.thijsvdh.controllers;

import javafx.fxml.FXML;
import me.thijsvdh.App;

import java.io.IOException;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
package com.example.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

// To render the Header.fxml
public class Header {



    public AnchorPane root;
    Header() throws IOException {
        root = FXMLLoader.load(getClass().getResource("Header.fxml"));
    }
}

package com.example.test_toolhand;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label fileText;

    private byte count = 0;


    @FXML
    protected void onHelloButtonClick() {
        String result = null;
        switch (count) {
            case 0 -> result = HelloApplication.getTextFile();
            case 1 -> result = "Я готов трудиться!";
            case 2 -> result = "Я правда буду рад и действительно готов!";
            case 3 -> result = "Хватит издеваться, берите и не думайте!";
            default -> count = 0;
        }

        if (result != null) {
            fileText.setText("");
            fileText.setText(result);
            count++;
        }
    }
}
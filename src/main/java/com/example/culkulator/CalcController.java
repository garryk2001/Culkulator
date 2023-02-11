package com.example.culkulator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
    public TextField idAction;
    public TextField idFirst;
    public TextField idSecond;
    @FXML
    private Label idResult;

    @FXML
    public void onCalcClick() {
        switch (idAction.getText()) {
            case ("+") ->
                    idResult.setText(Integer.toString(Integer.parseInt(idFirst.getText()) + Integer.parseInt(idSecond.getText())));
            case ("-") ->
                    idResult.setText(Integer.toString(Integer.parseInt(idFirst.getText()) - Integer.parseInt(idSecond.getText())));
            case ("/") ->
                    idResult.setText(Double.toString(Double.parseDouble(idFirst.getText()) / Double.parseDouble(idSecond.getText())));
            case ("*") ->
                    idResult.setText(Integer.toString(Integer.parseInt(idFirst.getText()) * Integer.parseInt(idSecond.getText())));
            default -> idResult.setText("second commit!");
        }



    }
}
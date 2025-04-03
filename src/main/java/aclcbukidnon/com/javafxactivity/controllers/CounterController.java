package aclcbukidnon.com.javafxactivity.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterController {


    @FXML
    private Label labelcount;

    @FXML
    protected void onPlusClick() {
        var countText = labelcount.getText();
        var countValue = Integer.parseInt(countText);
        countValue++;
        labelcount.setText(countValue + "");
    }

    @FXML
    protected void onMinusClick() {

    }
}
package com.example.task0_delegation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label Count1;
    @FXML
    private Label Count2;
    @FXML
    private Label Count3;

    @FXML
    private TextField Field;

    @FXML
    protected void onButton1Click() {
        double sum = Integer.valueOf(Field.getText());
        int finsum;
        Percent count1 = new Percent();
        finsum = count1.fincount(sum,15);
        Count1.setText("Рассчёт: " + String.valueOf(finsum));
    }
    @FXML
    protected void onButton2Click() {
        double sum = Integer.valueOf(Field.getText());
        int finsum;
        Percent count2 = new Percent();
        finsum = count2.fincount(sum,10);
        Count2.setText("Рассчёт: " + String.valueOf(finsum));
    }
    @FXML
    protected void onButton3Click() {
        double sum = Integer.valueOf(Field.getText());
        int finsum;
        Percent count3 = new Percent();
        finsum = count3.fincount(sum,3);
        Count3.setText("Рассчёт: " + String.valueOf(finsum));
    }
}

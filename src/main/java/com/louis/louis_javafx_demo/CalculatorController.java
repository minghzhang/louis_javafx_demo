package com.louis.louis_javafx_demo;

import com.googlecode.aviator.AviatorEvaluator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField resultTextField;

    @FXML
    private Button modeButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button divideButton;

    @FXML
    private Button sevenButton;

    @FXML
    private Button eightButton;

    @FXML
    private Button nineButton;

    @FXML
    private Button multipleButton;

    @FXML
    private Button fourButton;

    @FXML
    private Button fiveButton;

    @FXML
    private Button sixButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button oneButton;

    @FXML
    private Button twoButton;

    @FXML
    private Button threeButton;

    @FXML
    private Button plusButton;

    @FXML
    private Button doubleZeroButton;

    @FXML
    private Button zeroButton;

    @FXML
    private Button dotButton;

    @FXML
    private Button resultButton;

    @FXML
    private TextArea historyArea;

    private StringBuilder currentBuilder = new StringBuilder();
    private StringBuilder historyBuilder = new StringBuilder();

    @FXML
    void clear(ActionEvent event) {
        clearBuilder();
        resultTextField.setText(currentBuilder.toString());
    }

    private void clearBuilder() {
        String value = currentBuilder.toString();
        if (value != null && value.length() > 0) {
            currentBuilder.delete(0, value.length());
        }
    }

    @FXML
    void divide(ActionEvent event) {
        currentBuilder.append("/");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void getResult(ActionEvent event) {
        Object result = AviatorEvaluator.execute(currentBuilder.toString());

        currentBuilder.append("=").append(result);
        resultTextField.setText(result.toString());
        historyBuilder.append(currentBuilder.toString()).append("\n");
        historyArea.setText(historyBuilder.toString());
        clearBuilder();
        currentBuilder.append(result.toString());
    }

    @FXML
    void minus(ActionEvent event) {
        currentBuilder.append("-");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void multiple(ActionEvent event) {
        currentBuilder.append("*");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onDot(ActionEvent event) {
        currentBuilder.append(".");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onDoubleZero(ActionEvent event) {
        currentBuilder.append("00");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onEight(ActionEvent event) {
        currentBuilder.append("8");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onFive(ActionEvent event) {
        currentBuilder.append("5");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onFour(ActionEvent event) {
        currentBuilder.append("4");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onMode(ActionEvent event) {
        currentBuilder.append("%");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onNine(ActionEvent event) {
        currentBuilder.append("9");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onOne(ActionEvent event) {
        currentBuilder.append("1");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onSeven(ActionEvent event) {
        currentBuilder.append("7");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onSix(ActionEvent event) {
        currentBuilder.append("6");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onThree(ActionEvent event) {
        currentBuilder.append("3");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onTwo(ActionEvent event) {
        currentBuilder.append("2");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void onZero(ActionEvent event) {
        currentBuilder.append("0");
        resultTextField.setText(currentBuilder.toString());
    }

    @FXML
    void plus(ActionEvent event) {
        currentBuilder.append("+");
        resultTextField.setText(currentBuilder.toString());
    }

}
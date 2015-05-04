/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class CalculatorEngine implements ActionListener {

    Calculator parent;

    private final String ADDITION = "+";
    private final String SUBSTRUCTION = "-";
    private final String MULTIPLICATION = "*";
    private final String DIVISION = "/";
    private final String POINT = ".";
    private final String EQUAL = "=";

    String lastOperation;
    boolean lastValue = false;
    boolean pointPressed = false;
    double value = 0;
    double result;

    public CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();
        String dispFieldText = parent.getDisplayValue();

        if (clickedButtonLabel.equals(ADDITION)) {
            value += Double.parseDouble(parent.getDisplayValue());
            lastOperation = ADDITION;
            lastValue = true;
            pointPressed = false;

        } else if (clickedButtonLabel.equals(SUBSTRUCTION)) {
            if (value != 0) {
                value -= Double.parseDouble(parent.getDisplayValue());
            } else {
                value = Double.parseDouble(parent.getDisplayValue());
            }
            lastOperation = SUBSTRUCTION;
            lastValue = true;
            pointPressed = false;

        } else if (clickedButtonLabel.equals(MULTIPLICATION)) {
            if (value != 0) {
                value *= Double.parseDouble(parent.getDisplayValue());
            } else {
                value = Double.parseDouble(parent.getDisplayValue());
            }
            lastOperation = MULTIPLICATION;
            lastValue = true;
            pointPressed = false;

        } else if (clickedButtonLabel.equals(DIVISION)) {
            if (value != 0) {
                value /= Double.parseDouble(parent.getDisplayValue());
            } else {
                value = Double.parseDouble(parent.getDisplayValue());
            }
            lastOperation = DIVISION;
            lastValue = true;
            pointPressed = false;

        } else if (clickedButtonLabel.equals(POINT) && lastValue == true) {
            parent.setDisplayValue("0" + clickedButtonLabel);
            pointPressed = true;
            lastValue = false;

        } else if (clickedButtonLabel.equals(POINT) && pointPressed == false) {
            parent.setDisplayValue(dispFieldText + clickedButtonLabel);
            pointPressed = true;

        } else if (clickedButtonLabel.equals(POINT) && dispFieldText.equals("0")) {
            parent.setDisplayValue(dispFieldText + clickedButtonLabel);
            pointPressed = true;
            
        } else if (clickedButtonLabel.equals(POINT) && pointPressed == true) {

        } else if (clickedButtonLabel.equals(EQUAL)) {
            switch (lastOperation) {
                case ADDITION:
                    result = value + Double.parseDouble(parent.getDisplayValue());
                    break;
                case SUBSTRUCTION:
                    result = value - Double.parseDouble(parent.getDisplayValue());
                    break;
                case MULTIPLICATION:
                    result = value * Double.parseDouble(parent.getDisplayValue());
                    break;
                case DIVISION:
                    result = value / Double.parseDouble(parent.getDisplayValue());
                    break;
            }

            parent.setDisplayValue(String.valueOf(result));
            value = 0;
            lastValue = true;
            pointPressed = false;

        } else if (dispFieldText.equals("0")) {
            parent.clearDisplayValue();
            parent.setDisplayValue(clickedButtonLabel);

        } else if (lastValue == true) {
            parent.setDisplayValue(clickedButtonLabel);
            lastValue = false;

        } else {
            parent.setDisplayValue(dispFieldText + clickedButtonLabel);

        }

    }

}

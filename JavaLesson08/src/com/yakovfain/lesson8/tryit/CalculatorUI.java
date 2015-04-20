/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson8.tryit;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Anastasiy
 */
public class CalculatorUI {
    JPanel windowContent;
    JTextField displayField;
    JButton buttonMC;
    JButton buttonMH;
    JButton buttonMS;
    JButton buttonMPlus;
    JButton buttonRadical;
    JButton buttonPoint;
    JButton buttonDiv;
    JButton buttonMult;
    JButton buttonMin;
    JButton buttonPlus;
    JButton buttonSqrt;
    JButton buttonPercent;
    JButton buttonDivByX;
    JButton buttonEqual; 
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
        
    
    public CalculatorUI (){
        
        // Initialize all components
        windowContent = new JPanel();
        displayField = new JTextField();
        // Column 0
        buttonMC = new JButton("MC");
        buttonMH = new JButton("MH");
        buttonMS = new JButton("MS");
        buttonMPlus = new JButton("M+");
        
        // Column 1
        button7 = new JButton("7");
        button4 = new JButton("4");
        button1 = new JButton("1");
        button0 = new JButton("0");
        
        // Column 2
        button8 = new JButton("8");
        button5 = new JButton("5");
        button2 = new JButton("2");
        buttonRadical = new JButton("\u2713");
        
        // Column 3
        button9 = new JButton("9");
        button6 = new JButton("6");
        button3 = new JButton("3");
        buttonPoint = new JButton(".");
        
        // Column 4
        buttonDiv = new JButton("/");
        buttonMult = new JButton("*");
        buttonMin = new JButton("-");
        buttonPlus = new JButton("+");
        
        // Column 5
        buttonSqrt = new JButton("sqrt");
        buttonPercent = new JButton("%");
        buttonDivByX = new JButton("1/x");
        buttonEqual = new JButton("=");
        
        // Set layout manager
        GridBagLayout gb = new GridBagLayout();
        windowContent.setLayout(gb);
        
        // Set up DISPLAY component constraints
        GridBagConstraints constrDisplay = new GridBagConstraints();
        constrDisplay.gridx = 0;
        constrDisplay.gridy = 0;
        constrDisplay.gridheight = 1;
        constrDisplay.gridwidth = 6;
        constrDisplay.fill = GridBagConstraints.BOTH;
        constrDisplay.weightx = 1.0;
        constrDisplay.weighty = 1.0;
        constrDisplay.anchor = GridBagConstraints.CENTER;
        constrDisplay.ipady = 10;
        
        // Set up BUTTONMC component constraints
        GridBagConstraints constrButtonMC = new GridBagConstraints();
        constrButtonMC.gridx = 0;
        constrButtonMC.gridy = 1;
        constrButtonMC.gridheight = 1;
        constrButtonMC.gridwidth = 1;
        constrButtonMC.fill = GridBagConstraints.BOTH;
        constrButtonMC.weightx = 1.0;
        constrButtonMC.weighty = 1.0;
        constrButtonMC.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONMH component constraints
        GridBagConstraints constrButtonMH = new GridBagConstraints();
        constrButtonMH.gridx = 0;
        constrButtonMH.gridy = 2;
        constrButtonMH.gridheight = 1;
        constrButtonMH.gridwidth = 1;
        constrButtonMH.fill = GridBagConstraints.BOTH;
        constrButtonMH.weightx = 1.0;
        constrButtonMH.weighty = 1.0;
        constrButtonMH.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONMS component constraints
        GridBagConstraints constrButtonMS = new GridBagConstraints();
        constrButtonMS.gridx = 0;
        constrButtonMS.gridy = 3;
        constrButtonMS.gridheight = 1;
        constrButtonMS.gridwidth = 1;
        constrButtonMS.fill = GridBagConstraints.BOTH;
        constrButtonMS.weightx = 1.0;
        constrButtonMS.weighty = 1.0;
        constrButtonMS.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONMPlus component constraints
        GridBagConstraints constrButtonMPlus = new GridBagConstraints();
        constrButtonMPlus.gridx = 0;
        constrButtonMPlus.gridy = 4;
        constrButtonMPlus.gridheight = 1;
        constrButtonMPlus.gridwidth = 1;
        constrButtonMPlus.fill = GridBagConstraints.BOTH;
        constrButtonMPlus.weightx = 1.0;
        constrButtonMPlus.weighty = 1.0;
        constrButtonMPlus.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON7 component constraints
        GridBagConstraints constrButton7 = new GridBagConstraints();
        constrButton7.gridx = 1;
        constrButton7.gridy = 1;
        constrButton7.gridheight = 1;
        constrButton7.gridwidth = 1;
        constrButton7.fill = GridBagConstraints.BOTH;
        constrButton7.weightx = 1.0;
        constrButton7.weighty = 1.0;
        constrButton7.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON4 component constraints
        GridBagConstraints constrButton4 = new GridBagConstraints();
        constrButton4.gridx = 1;
        constrButton4.gridy = 2;
        constrButton4.gridheight = 1;
        constrButton4.gridwidth = 1;
        constrButton4.fill = GridBagConstraints.BOTH;
        constrButton4.weightx = 1.0;
        constrButton4.weighty = 1.0;
        constrButton4.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON1 component constraints
        GridBagConstraints constrButton1 = new GridBagConstraints();
        constrButton1.gridx = 1;
        constrButton1.gridy = 3;
        constrButton1.gridheight = 1;
        constrButton1.gridwidth = 1;
        constrButton1.fill = GridBagConstraints.BOTH;
        constrButton1.weightx = 1.0;
        constrButton1.weighty = 1.0;
        constrButton1.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON0 component constraints
        GridBagConstraints constrButton0 = new GridBagConstraints();
        constrButton0.gridx = 1;
        constrButton0.gridy = 4;
        constrButton0.gridheight = 1;
        constrButton0.gridwidth = 1;
        constrButton0.fill = GridBagConstraints.BOTH;
        constrButton0.weightx = 1.0;
        constrButton0.weighty = 1.0;
        constrButton0.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON8 component constraints
        GridBagConstraints constrButton8 = new GridBagConstraints();
        constrButton8.gridx = 2;
        constrButton8.gridy = 1;
        constrButton8.gridheight = 1;
        constrButton8.gridwidth = 1;
        constrButton8.fill = GridBagConstraints.BOTH;
        constrButton8.weightx = 1.0;
        constrButton8.weighty = 1.0;
        constrButton8.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON5 component constraints
        GridBagConstraints constrButton5 = new GridBagConstraints();
        constrButton5.gridx = 2;
        constrButton5.gridy = 2;
        constrButton5.gridheight = 1;
        constrButton5.gridwidth = 1;
        constrButton5.fill = GridBagConstraints.BOTH;
        constrButton5.weightx = 1.0;
        constrButton5.weighty = 1.0;
        constrButton5.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON2 component constraints
        GridBagConstraints constrButton2 = new GridBagConstraints();
        constrButton2.gridx = 2;
        constrButton2.gridy = 3;
        constrButton2.gridheight = 1;
        constrButton2.gridwidth = 1;
        constrButton2.fill = GridBagConstraints.BOTH;
        constrButton2.weightx = 1.0;
        constrButton2.weighty = 1.0;
        constrButton2.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONRADICAL component constraints
        GridBagConstraints constrButtonRadical = new GridBagConstraints();
        constrButtonRadical.gridx = 2;
        constrButtonRadical.gridy = 4;
        constrButtonRadical.gridheight = 1;
        constrButtonRadical.gridwidth = 1;
        constrButtonRadical.fill = GridBagConstraints.BOTH;
        constrButtonRadical.weightx = 1.0;
        constrButtonRadical.weighty = 1.0;
        constrButtonRadical.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON9 component constraints
        GridBagConstraints constrButton9 = new GridBagConstraints();
        constrButton9.gridx = 3;
        constrButton9.gridy = 1;
        constrButton9.gridheight = 1;
        constrButton9.gridwidth = 1;
        constrButton9.fill = GridBagConstraints.BOTH;
        constrButton9.weightx = 1.0;
        constrButton9.weighty = 1.0;
        constrButton9.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON6 component constraints
        GridBagConstraints constrButton6 = new GridBagConstraints();
        constrButton6.gridx = 3;
        constrButton6.gridy = 2;
        constrButton6.gridheight = 1;
        constrButton6.gridwidth = 1;
        constrButton6.fill = GridBagConstraints.BOTH;
        constrButton6.weightx = 1.0;
        constrButton6.weighty = 1.0;
        constrButton6.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTON3 component constraints
        GridBagConstraints constrButton3 = new GridBagConstraints();
        constrButton3.gridx = 3;
        constrButton3.gridy = 3;
        constrButton3.gridheight = 1;
        constrButton3.gridwidth = 1;
        constrButton3.fill = GridBagConstraints.BOTH;
        constrButton3.weightx = 1.0;
        constrButton3.weighty = 1.0;
        constrButton3.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONPOINT component constraints
        GridBagConstraints constrButtonPoint = new GridBagConstraints();
        constrButtonPoint.gridx = 3;
        constrButtonPoint.gridy = 4;
        constrButtonPoint.gridheight = 1;
        constrButtonPoint.gridwidth = 1;
        constrButtonPoint.fill = GridBagConstraints.BOTH;
        constrButtonPoint.weightx = 1.0;
        constrButtonPoint.weighty = 1.0;
        constrButtonPoint.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONDIV component constraints
        GridBagConstraints constrButtonDiv = new GridBagConstraints();
        constrButtonDiv.gridx = 4;
        constrButtonDiv.gridy = 1;
        constrButtonDiv.gridheight = 1;
        constrButtonDiv.gridwidth = 1;
        constrButtonDiv.fill = GridBagConstraints.BOTH;
        constrButtonDiv.weightx = 1.0;
        constrButtonDiv.weighty = 1.0;
        constrButtonDiv.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONMULT component constraints
        GridBagConstraints constrButtonMult = new GridBagConstraints();
        constrButtonMult.gridx = 4;
        constrButtonMult.gridy = 2;
        constrButtonMult.gridheight = 1;
        constrButtonMult.gridwidth = 1;
        constrButtonMult.fill = GridBagConstraints.BOTH;
        constrButtonMult.weightx = 1.0;
        constrButtonMult.weighty = 1.0;
        constrButtonMult.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONMIN component constraints
        GridBagConstraints constrButtonMin = new GridBagConstraints();
        constrButtonMin.gridx = 4;
        constrButtonMin.gridy = 3;
        constrButtonMin.gridheight = 1;
        constrButtonMin.gridwidth = 1;
        constrButtonMin.fill = GridBagConstraints.BOTH;
        constrButtonMin.weightx = 1.0;
        constrButtonMin.weighty = 1.0;
        constrButtonMin.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONPLUS component constraints
        GridBagConstraints constrButtonPlus = new GridBagConstraints();
        constrButtonPlus.gridx = 4;
        constrButtonPlus.gridy = 4;
        constrButtonPlus.gridheight = 1;
        constrButtonPlus.gridwidth = 1;
        constrButtonPlus.fill = GridBagConstraints.BOTH;
        constrButtonPlus.weightx = 1.0;
        constrButtonPlus.weighty = 1.0;
        constrButtonPlus.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONSQRT component constraints
        GridBagConstraints constrButtonSqrt = new GridBagConstraints();
        constrButtonSqrt.gridx = 5;
        constrButtonSqrt.gridy = 1;
        constrButtonSqrt.gridheight = 1;
        constrButtonSqrt.gridwidth = 1;
        constrButtonSqrt.fill = GridBagConstraints.BOTH;
        constrButtonSqrt.weightx = 1.0;
        constrButtonSqrt.weighty = 1.0;
        constrButtonSqrt.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONPERCENT component constraints
        GridBagConstraints constrButtonPercent = new GridBagConstraints();
        constrButtonPercent.gridx = 5;
        constrButtonPercent.gridy = 2;
        constrButtonPercent.gridheight = 1;
        constrButtonPercent.gridwidth = 1;
        constrButtonPercent.fill = GridBagConstraints.BOTH;
        constrButtonPercent.weightx = 1.0;
        constrButtonPercent.weighty = 1.0;
        constrButtonPercent.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONDIVBYX component constraints
        GridBagConstraints constrButtonDivByX = new GridBagConstraints();
        constrButtonDivByX.gridx = 5;
        constrButtonDivByX.gridy = 3;
        constrButtonDivByX.gridheight = 1;
        constrButtonDivByX.gridwidth = 1;
        constrButtonDivByX.fill = GridBagConstraints.BOTH;
        constrButtonDivByX.weightx = 1.0;
        constrButtonDivByX.weighty = 1.0;
        constrButtonDivByX.anchor = GridBagConstraints.CENTER;
        
        // Set up BUTTONEQUAL component constraints
        GridBagConstraints constrButtonEqual = new GridBagConstraints();
        constrButtonEqual.gridx = 5;
        constrButtonEqual.gridy = 4;
        constrButtonEqual.gridheight = 1;
        constrButtonEqual.gridwidth = 1;
        constrButtonEqual.fill = GridBagConstraints.BOTH;
        constrButtonEqual.weightx = 1.0;
        constrButtonEqual.weighty = 1.0;
        constrButtonEqual.anchor = GridBagConstraints.CENTER;
        
        // Set constraints to components      
        gb.setConstraints(displayField, constrDisplay);
        gb.setConstraints(buttonMC, constrButtonMC);
        gb.setConstraints(buttonMH, constrButtonMH);
        gb.setConstraints(buttonMS, constrButtonMS);
        gb.setConstraints(buttonMPlus, constrButtonMPlus);
        gb.setConstraints(button7, constrButton7);
        gb.setConstraints(button4, constrButton4);
        gb.setConstraints(button1, constrButton1);
        gb.setConstraints(button0, constrButton0);
        gb.setConstraints(button8, constrButton8);
        gb.setConstraints(button5, constrButton5);
        gb.setConstraints(button2, constrButton2);
        gb.setConstraints(buttonRadical, constrButtonRadical);
        gb.setConstraints(button9, constrButton9);
        gb.setConstraints(button6, constrButton6);
        gb.setConstraints(button3, constrButton3);
        gb.setConstraints(buttonPoint, constrButtonPoint);
        gb.setConstraints(buttonDiv, constrButtonDiv);
        gb.setConstraints(buttonMult, constrButtonMult);
        gb.setConstraints(buttonMin, constrButtonMin);
        gb.setConstraints(buttonPlus, constrButtonPlus);
        gb.setConstraints(buttonSqrt, constrButtonSqrt);
        gb.setConstraints(buttonPercent, constrButtonPercent);
        gb.setConstraints(buttonDivByX, constrButtonDivByX);
        gb.setConstraints(buttonEqual, constrButtonEqual);
               
        // Add components to the window
        windowContent.add(displayField);
        windowContent.add(buttonMC);
        windowContent.add(buttonMH);
        windowContent.add(buttonMS);
        windowContent.add(buttonMPlus);
        windowContent.add(button7);
        windowContent.add(button4);
        windowContent.add(button1);
        windowContent.add(button0);
        windowContent.add(button8);
        windowContent.add(button5);
        windowContent.add(button2);
        windowContent.add(buttonRadical);
        windowContent.add(button9);
        windowContent.add(button6);
        windowContent.add(button3);
        windowContent.add(buttonPoint);
        windowContent.add(buttonDiv);
        windowContent.add(buttonMult);
        windowContent.add(buttonMin);
        windowContent.add(buttonPlus);
        windowContent.add(buttonSqrt);
        windowContent.add(buttonPercent);
        windowContent.add(buttonDivByX);
        windowContent.add(buttonEqual);
        // Create the frame and set its content pane
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        
        // Set the size of the window big enough to accomodate all controls
        frame.pack();
        
        // Place window in the center of the screen
        frame.setLocationRelativeTo(null);
        
        // Display the window
        frame.setVisible(true);
        
        // Ends application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        new CalculatorUI();
    }
}

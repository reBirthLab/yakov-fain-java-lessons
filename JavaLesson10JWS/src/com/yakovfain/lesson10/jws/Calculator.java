/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson10.jws;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anastasiy
 */
public class Calculator {

    // Declare all calculator's components.
    private final JPanel windowContent;
    private final JTextField displayField;
    private final JButton button0;
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton button5;
    private final JButton button6;
    private final JButton button7;
    private final JButton button8;
    private final JButton button9;
    private final JButton buttonPoint;
    private final JButton buttonEqual;
    private final JButton buttonAdd;
    private final JButton buttonSub;
    private final JButton buttonMult;
    private final JButton buttonDiv;
    private final JPanel p1;

    // Methods for setting and getting Display Value
    public void setDisplayValue(String val) {
        displayField.setText(val);
    }

    public String getDisplayValue() {
        return displayField.getText();
    }

    public void clearDisplayValue() {
        displayField.setText(null);
    }

    // Constructor creates the components
    // and adds the t}o the frame using combination of
    // Borderlayout and Gridlayout
    public Calculator() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }

        windowContent = new JPanel();

        // Set the layout manager for this panel
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

        // Calculator Fonts
        Font fontButtons = new Font(Font.SANS_SERIF, Font.BOLD, 16);
        Font fontDisplay = new Font(Font.SANS_SERIF, Font.PLAIN, 24);

        // Create the display field and place it in the
        // North area of the window
        displayField = new JTextField("0", 30);
        displayField.setPreferredSize(new Dimension(300, 50));
        windowContent.add("North", displayField);
        displayField.setHorizontalAlignment(JTextField.RIGHT);

        displayField.setFont(fontDisplay);

        // Create buttons using constructor of the
        // class JButton that takes the label of the
        // button as a parameter
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMult = new JButton("*");
        buttonDiv = new JButton("/");

        // Buttons font settings
        button0.setFont(fontButtons);
        button1.setFont(fontButtons);
        button2.setFont(fontButtons);
        button3.setFont(fontButtons);
        button4.setFont(fontButtons);
        button5.setFont(fontButtons);
        button6.setFont(fontButtons);
        button7.setFont(fontButtons);
        button8.setFont(fontButtons);
        button9.setFont(fontButtons);
        buttonAdd.setFont(fontButtons);
        buttonSub.setFont(fontButtons);
        buttonMult.setFont(fontButtons);
        buttonDiv.setFont(fontButtons);
        buttonEqual.setFont(fontButtons);
        buttonPoint.setFont(fontButtons);

        // Create the panel with the GridLayout with 12 buttons - 
        // 10 numeric ones, period, and the equal sing
        p1 = new JPanel();
        GridLayout g1 = new GridLayout(4, 4);
        p1.setLayout(g1);

        // Add window controls to the panel p1
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(buttonAdd);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(buttonSub);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(buttonMult);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        p1.add(buttonDiv);

        // Add the panel p1 to the center of the window 
        windowContent.add("Center", p1);

        //Implementation of ActionListener
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);
        buttonPoint.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
        buttonAdd.addActionListener(calcEngine);
        buttonSub.addActionListener(calcEngine);
        buttonMult.addActionListener(calcEngine);
        buttonDiv.addActionListener(calcEngine);

        // Create the frame and set its content pane
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        // Set the size of the window big enough to accomodate all controls
        frame.setSize(300, 220);

        // Place window in the center of the screen
        frame.setLocationRelativeTo(null);

        // Display the window
        frame.setVisible(true);

        // Ends application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

}

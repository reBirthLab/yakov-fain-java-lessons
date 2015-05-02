/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yakovfain.lesson11;

import javax.swing.JButton;

/**
 *
 * @author Anastasiy
 */
public class TicTacToeGUI extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public TicTacToeGUI() {

        initComponents();

        buttons[0][0] = jButton1;
        buttons[0][1] = jButton2;
        buttons[0][2] = jButton3;
        buttons[1][0] = jButton4;
        buttons[1][1] = jButton5;
        buttons[1][2] = jButton6;
        buttons[2][0] = jButton7;
        buttons[2][1] = jButton8;
        buttons[2][2] = jButton9;

        engine = new TicTacToeGameEngine(this);
        setActionListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playBoard = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        playAgain = new javax.swing.JButton();
        messageHead = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(360, 400));
        setPreferredSize(new java.awt.Dimension(360, 400));

        playBoard.setMinimumSize(new java.awt.Dimension(300, 300));
        playBoard.setPreferredSize(new java.awt.Dimension(300, 300));
        playBoard.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton1);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton2);

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton3);

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton4);

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton5);

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton6);

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton7);

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton8);

        jButton9.setFont(new java.awt.Font("Comic Sans MS", 0, 60)); // NOI18N
        playBoard.add(jButton9);

        message.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        message.setText("Let's play!");

        playAgain.setText("Play Again");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });

        messageHead.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        messageHead.setText(">");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageHead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playAgain))
                    .addComponent(playBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(playBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAgain)
                    .addComponent(message)
                    .addComponent(messageHead))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
        reset();
        message.setText("Let's play again!");
        TicTacToeGameEngine.resetGameStatus();
    }//GEN-LAST:event_playAgainActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel message;
    private javax.swing.JLabel messageHead;
    private javax.swing.JButton playAgain;
    private javax.swing.JPanel playBoard;
    // End of variables declaration//GEN-END:variables

    // Custom variables declaration
    private final String PLAYERX = TicTacToeGameEngine.PLAYERX;
    private final String PLAYERO = TicTacToeGameEngine.PLAYERO;
    JButton[][] buttons = new JButton[3][3];
    TicTacToeGameEngine engine;

    // Methods
    void messageCurrentPlayerTurn(String playerName) {
        message.setText(playerName + ", your turn.");
    }
    
    public void setMessage(String message){
        this.message.setText(message);
    }

    String[][] getCurrentState() {
        String[][] currentState = new String[3][3];
        for (int i = 0; i < 3; ++i) {
            for(int j = 0; j < 3; ++j){
                currentState[i][j] = buttons[i][j].getText();
            }
        }
        return currentState;
    }
    
    public void setMove(Point point, String playerName){
        
        switch (playerName) {
            case PLAYERX:
                buttons[point.x][point.y].setText("X");
                break;
            case PLAYERO:
                buttons[point.x][point.y].setText("O");
                break;
        }
    }

    void reset() {
        for (JButton[] buttonsRow : buttons) {
            for (JButton button : buttonsRow){
                button.setText("");
            } 
        }
        message.setText("Let's play!");
    }
    
    // Private methods
    private void setActionListener() {
        for (JButton[] buttonsRow : buttons) {
            for (JButton button : buttonsRow){
                button.addMouseListener(engine);
            } 
        }
    }

}
/* 
 * Copyright (C) 2015 Anastasiy Tovstik <archianastasius@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        computer = new javax.swing.JRadioButton();
        human = new javax.swing.JRadioButton();
        start = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(360, 450));
        setPreferredSize(new java.awt.Dimension(360, 450));

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
        message.setText("Let's play! Choose who makes first move...");

        playAgain.setText("Play Again");
        playAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainActionPerformed(evt);
            }
        });

        messageHead.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        messageHead.setText(">");

        buttonGroup1.add(computer);
        computer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        computer.setText("Computer \"O\"");
        computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computerActionPerformed(evt);
            }
        });

        buttonGroup1.add(human);
        human.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        human.setText("Human \"X\"");
        human.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humanActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        start.setText("START");
        start.setMinimumSize(new java.awt.Dimension(80, 28));
        start.setPreferredSize(new java.awt.Dimension(80, 28));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageHead)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(playBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(human)
                        .addGap(11, 11, 11)
                        .addComponent(computer)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(playBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(message)
                    .addComponent(messageHead))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computer)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(human))
                .addGap(11, 11, 11)
                .addComponent(playAgain)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void playAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainActionPerformed
        reset();
        engine.resetGameStatus();
    }//GEN-LAST:event_playAgainActionPerformed

    private void humanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humanActionPerformed
        if (!startButtonPressed){
            chosenPlayer = PLAYERX;
        }          
    }//GEN-LAST:event_humanActionPerformed

    private void computerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computerActionPerformed
        if (!startButtonPressed){
            chosenPlayer = PLAYERO;            
        }
    }//GEN-LAST:event_computerActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        if (!startButtonPressed && chosenPlayer.equals(PLAYERO)){
            human.setEnabled(false);
            computer.setEnabled(false);
            engine.computersFirstMove();
            startButtonPressed = true;
        } else if (!startButtonPressed && chosenPlayer.equals(PLAYERX)){
            human.setEnabled(false);
            computer.setEnabled(false);
            startButtonPressed = true;
            messagePlayerTurn(chosenPlayer);
        }
    }//GEN-LAST:event_startActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton computer;
    private javax.swing.JRadioButton human;
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
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables

    // Custom variables declaration
    private final String PLAYERX = TicTacToeGameEngine.PLAYERX;
    private final String PLAYERO = TicTacToeGameEngine.PLAYERO;
    private final JButton[][] buttons = new JButton[3][3];
    private boolean startButtonPressed = false;
    private String chosenPlayer;
    TicTacToeGameEngine engine;

    // Methods
    void messagePlayerTurn(String playerName) {
        message.setText(playerName + ", your turn.");
    }
    
    public boolean isStartButtonPressed(){
        return startButtonPressed;
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
    
    void setMove(Point point, String playerName){
        
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
        message.setText("Let's play! Choose who makes first move...");
        
        human.setEnabled(true);
        computer.setEnabled(true);
        startButtonPressed = false;
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

/*
 * Copyright (C) 2015 Anastasiy
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

import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Anastasiy
 */
public class TicTacToeGameEngine implements MouseListener {

    private static final String PLAYERX = "Player X";
    private static final String PLAYERO = "Player O";
    private static boolean gameOver = false;
    private String[] currentButtons;
    

    TicTacToeGUI parent;

    public TicTacToeGameEngine(TicTacToeGUI parent) {
        this.parent = parent;
    }

    private boolean findThreeInRow() {
        if ((currentButtons[0] == currentButtons[1] && currentButtons[1] == currentButtons[2]
                && currentButtons[1] != "")||
                (currentButtons[3] == currentButtons[4] && currentButtons[4] == currentButtons[5]
                && currentButtons[3] != "")||
                (currentButtons[6] == currentButtons[7] && currentButtons[7] == currentButtons[8]
                && currentButtons[6] != "")||
                (currentButtons[0] == currentButtons[3] && currentButtons[3] == currentButtons[6]
                && currentButtons[0] != "")||
                (currentButtons[1] == currentButtons[4] && currentButtons[4] == currentButtons[7]
                && currentButtons[1] != "")||
                (currentButtons[2] == currentButtons[5] && currentButtons[5] == currentButtons[8]
                && currentButtons[2] != "")||
                (currentButtons[0] == currentButtons[4] && currentButtons[4] == currentButtons[8]
                && currentButtons[0] != "")||
                (currentButtons[2] == currentButtons[4] && currentButtons[4] == currentButtons[6]
                && currentButtons[2] != "")) {
            return true;
        } else {
            return false;
        }
    }

    private void checkForWinner() {
        if (findThreeInRow()) {
            String winnerName
                    = (parent.getCurrentPlayerName().equals(PLAYERX)) ? PLAYERO : PLAYERX;
            parent.setMessage(winnerName + " won!!! Congratulations!!!");
            gameOver = true;
        }
    }

    public static void resetGameStatus(){
        gameOver = false;
    }
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        JButton currentButton = (JButton) e.getComponent();
        if ((currentButton.getText()).equals("") && !gameOver) {
            switch (parent.getCurrentPlayerName()) {
                case PLAYERX:
                    currentButton.setText("X");
                    parent.messageCurrentPlayerTurn(PLAYERO);
                    break;
                case PLAYERO:
                    currentButton.setText("O");
                    parent.messageCurrentPlayerTurn(PLAYERX);
                    break;
            }
        }

        currentButtons = parent.getCurrentState();
        checkForWinner();

    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        if (parent.getCurrentPlayerName() == null) {
            parent.messageCurrentPlayerTurn(PLAYERX);
        }
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }
}

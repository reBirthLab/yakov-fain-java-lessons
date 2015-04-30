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
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Anastasiy
 */
class Point {

    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class TicTacToeGameEngine implements MouseListener {

    public static final String PLAYERX = "Player X";
    public static final String PLAYERO = "Player O";
    
    private static boolean firstMove = true;
    private static boolean gameOver = false;
    private String[][] currentState;
    private List<Point> avalibleMoves;
    private Point computerMove;
    private Random rand = new Random();
    
    TicTacToeGUI parent;

    public TicTacToeGameEngine(TicTacToeGUI parent) {
        this.parent = parent;
    }

    private List<Point> getAvalibleMoves() {
        avalibleMoves = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (currentState[i][j].equals("")) {
                    avalibleMoves.add(new Point(i, j));
                    System.out.println("x=" + i + " y=" + j);
                }
            }
        }
        return avalibleMoves;
    }
    
    private void minimax (int depth, String player){
        List<Point> avalibleMooves = getAvalibleMoves();
    }

    private boolean findThreeInRow() {
        if ((currentState[0][0] == currentState[0][1] && currentState[0][1] == currentState[0][2]
                && currentState[0][0] != "")
                || (currentState[1][0] == currentState[1][1] && currentState[1][1] == currentState[1][2]
                && currentState[1][0] != "")
                || (currentState[2][0] == currentState[2][1] && currentState[2][1] == currentState[2][2]
                && currentState[2][0] != "")
                || (currentState[0][0] == currentState[1][0] && currentState[1][0] == currentState[2][0]
                && currentState[0][0] != "")
                || (currentState[0][1] == currentState[1][1] && currentState[1][1] == currentState[2][1]
                && currentState[0][1] != "")
                || (currentState[0][2] == currentState[1][2] && currentState[1][2] == currentState[2][2]
                && currentState[0][2] != "")
                || (currentState[0][0] == currentState[1][1] && currentState[1][1] == currentState[2][2]
                && currentState[0][0] != "")
                || (currentState[0][2] == currentState[1][1] && currentState[1][1] == currentState[2][0]
                && currentState[0][2] != "")) {
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

    public static void resetGameStatus() {
        gameOver = false;
        firstMove = true;
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

//        if (firstMove && parent.getCurrentPlayerName().equals(PLAYERO)){
//            Point p = new Point(rand.nextInt(3), rand.nextInt(3));
//            parent.placeAMove(p, PLAYERO);
//            firstMove = false;
//            
//        }
        
        currentState = parent.getCurrentState();
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

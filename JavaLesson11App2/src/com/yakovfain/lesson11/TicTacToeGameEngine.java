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
    public static final String EMPTY = "";

    private static String currentPlayerName = null;
    private static boolean firstMove = true;
    private static boolean gameOver = false;
    private String[][] currentState;
    private List<Point> avalibleMoves;
    private Point computersMove;
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
                }
            }
        }
        return avalibleMoves;
    }

    private void placeMove(Point point, String player) {
        if (player.equals(PLAYERX)) {
            currentState[point.x][point.y] = "X";
        } else if (player.equals(PLAYERO)) {
            currentState[point.x][point.y] = "O";
        } else if (player.equals(EMPTY)) {
            currentState[point.x][point.y] = "";
        }
    }

    private int minimax(int depth, String player) {
        List<Point> avalibleMovesMirror = getAvalibleMoves();
        if (avalibleMovesMirror.isEmpty()) {
            return 0;
        }
        if (oHasWon()) {
            return 1;
        }
        if (xHasWon()) {
            return -1;
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < avalibleMovesMirror.size(); ++i) {
            Point point = avalibleMovesMirror.get(i);
            if (player.equals(PLAYERO)) {
                placeMove(point, PLAYERO);
                int currentScore = minimax(depth + 1, PLAYERX);
                max = Math.max(currentScore, max);

                if (depth == 0) {
                    System.out.println("Score for position " + (i + 1)
                            + " = " + currentScore);
                }
                if (currentScore >= 0 && depth == 0) {
                    computersMove = point;
                }
                if (i == avalibleMovesMirror.size() - 1
                        && max < 0
                        && depth == 0) {
                    computersMove = point;
                }
                if (currentScore == 1) {
                    placeMove(point, EMPTY);
                }
            } else if (player.equals(PLAYERX)) {
                placeMove(point, PLAYERX);
                int currentScore = minimax(depth + 1, PLAYERO);
                min = Math.min(currentScore, min);

                if (currentScore == -1) {
                    placeMove(point, EMPTY);
                }
            }
            placeMove(point, EMPTY);
        }
        return player.equals(PLAYERO) ? max : min;
    }

    private boolean xHasWon() {
        if ((currentState[0][0] == currentState[1][1]
                && currentState[1][1] == currentState[2][2]
                && currentState[0][0].equals("X"))
                || (currentState[0][2] == currentState[1][1]
                && currentState[1][1] == currentState[2][0]
                && currentState[0][2].equals("X"))) {
            return true;
        }

        for (int i = 0; i < 3; ++i) {
            if ((currentState[i][0] == currentState[i][1]
                    && currentState[i][1] == currentState[i][2]
                    && currentState[i][0].equals("X"))
                    || (currentState[0][i] == currentState[1][i]
                    && currentState[1][i] == currentState[2][i]
                    && currentState[0][i].equals("X"))) {
                return true;
            }
        }
        return false;
    }

    private boolean oHasWon() {
        if ((currentState[0][0] == currentState[1][1]
                && currentState[1][1] == currentState[2][2]
                && currentState[0][0].equals("O"))
                || (currentState[0][2] == currentState[1][1]
                && currentState[1][1] == currentState[2][0]
                && currentState[0][2].equals("O"))) {
            return true;
        }

        for (int i = 0; i < 3; ++i) {
            if ((currentState[i][0] == currentState[i][1]
                    && currentState[i][1] == currentState[i][2]
                    && currentState[i][0].equals("O"))
                    || (currentState[0][i] == currentState[1][i]
                    && currentState[1][i] == currentState[2][i]
                    && currentState[0][i].equals("O"))) {
                return true;
            }
        }
        return false;
    }

    private boolean draw() {
        boolean state = true;
        for (String[] currentStateRow : currentState) {
            for (String value : currentStateRow) {
                if (value.equals("")) {
                    state = false;
                }
            }
        }
        return state;
    }
    
    private void checkForWinner() {
        if (xHasWon()) {
            parent.setMessage(PLAYERX + " won!!! Congratulations!!!");
            gameOver = true;
        } else if (oHasWon()) {
            parent.setMessage(PLAYERO + " won!!! Congratulations!!!");
            gameOver = true;
        } else if (draw()){
            parent.setMessage("Draw! No one wins. Play again!");
            gameOver = true;
        }
    }

    public static void resetGameStatus() {
        currentPlayerName = null;
        gameOver = false;
        firstMove = true;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        JButton currentButton = (JButton) e.getComponent();
        if ((currentButton.getText()).equals("") && !gameOver) {

            currentButton.setText("X");
            currentPlayerName = PLAYERO;
            parent.messageCurrentPlayerTurn(currentPlayerName);
            currentState = parent.getCurrentState();

            minimax(0, PLAYERO);
            parent.setMove(computersMove, currentPlayerName);
            currentPlayerName = PLAYERX;
            parent.messageCurrentPlayerTurn(currentPlayerName);
            currentState = parent.getCurrentState();
            
            checkForWinner();

        }

//        if (firstMove && parent.getCurrentPlayerName().equals(PLAYERO)){
//            Point p = new Point(rand.nextInt(3), rand.nextInt(3));
//            parent.placeAMove(p, PLAYERO);
//            firstMove = false;
//            
//        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        if (currentPlayerName == null) {
            currentPlayerName = PLAYERX;
            parent.messageCurrentPlayerTurn(currentPlayerName);
        }
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {

    }
}

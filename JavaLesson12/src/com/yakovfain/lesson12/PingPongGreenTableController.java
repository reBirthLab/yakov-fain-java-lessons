/* 
 * Copyright (C) 2015 Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
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
package com.yakovfain.lesson12;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import com.yakovfain.lesson12.common.GameConstants;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class PingPongGreenTableController implements Initializable {

    private int kidScore;
    private int computerScore;
    private double kidRacketY = GameConstants.KID_RACKET_Y_START;
    private double ballX;
    private double ballY;
    private boolean newGameFlag = false;
    private boolean ballServed = false;

    @FXML
    private Label coordinates;
    @FXML
    private Rectangle computerRacket;
    @FXML
    private Label message;
    @FXML
    private Rectangle kidRacket;
    @FXML
    private Circle ball;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    // Start a new game
    private void startNewGame() {
        kidScore = 0;
        computerScore = 0;
        message.setText("Current score: Computer: 0  Kid: 0");
        newGameFlag = true;
    }

    // End the game
    private void endGame() {
        System.exit(0);
    }

    private void kidServe() {
        if (newGameFlag) {
            ballServed = true;
            ballX = GameConstants.KID_RACKET_X - 20;
            ballY = kidRacketY;

            setBallPosition(ballX, ballY);
        }
    }

    private void setBallPosition(double x, double y) {
        ball.setCenterX(x);
        ball.setCenterY(y);
    }

    @FXML
    private void handleMouseMoveAction(MouseEvent event) {
        coordinates.setText("x:" + String.valueOf(event.getX())
                + ", y:" + String.valueOf(event.getY()));

        double mouseY = event.getY();
        if (newGameFlag) {
            if (GameConstants.TABLE_TOP < mouseY && mouseY < GameConstants.TABLE_BOTTOM) {
                kidRacketY = mouseY;
                kidRacket.setY(kidRacketY);
            }
        }
    }

    @FXML
    private void handleKeyPressedAction(KeyEvent event) {
        KeyCode key = event.getCode();

        switch (key) {
            case N:
                startNewGame();
                break;
            case S:
                kidServe();
                break;
            case Q:
                endGame();
                break;
        }
    }

    @FXML
    private void handleOnAction(ActionEvent event) {
        MenuItem mItem = (MenuItem) event.getSource();
        String action = mItem.getText();

        switch (action) {
            case "New":
                startNewGame();
                break;
            case "Serve":
                kidServe();
                break;
            case "Quit":
                endGame();
                break;
        }
    }
}

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class GameEngine implements Initializable, Runnable {

    private int kidScore;
    private int computerScore;
    private double kidRacketY = GameConstants.RACKET_Y_START;
    private double computerRacketY = GameConstants.RACKET_Y_START;
    private double ballX;
    private double ballY;
    private int verticalSlide;
    private boolean newGameFlag = false;
    private boolean ballServed = false;
    private boolean movingLeft = true;

    Thread worker;

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
    @FXML
    private Pane table;

    public GameEngine() {
        worker = new Thread(this);
        worker.setDaemon(true); // Experimental
        worker.setName("My Thread"); // Experimental
        worker.start();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @Override
    public void run() {
        boolean canBounce = false;

        while (worker.isAlive()) {
            // If ball is moving
            if (ballServed) {

                // 1. If ball is moving to the left
                if (movingLeft && ballX > GameConstants.BALL_MIN_X) {
                    // Check if ball hits computer's racket
                    canBounce = (ballY > (computerRacketY - GameConstants.RACKET_HALF_LENGTH)
                            && ballY < (computerRacketY + GameConstants.RACKET_HALF_LENGTH));

                    ballX -= GameConstants.BALL_INCREMENT;

                    if (ballY <= GameConstants.TABLE_TOP - 40) {
                        verticalSlide = -1;
                    } else if (ballY >= (GameConstants.TABLE_BOTTOM + 40)) {
                        verticalSlide = 1;
                    }

                    ballY -= verticalSlide;

                    setBallPosition(ballX, ballY);

                    if ((ballX - GameConstants.BALL_RADIUS)
                            <= GameConstants.COMPUTER_RACKET_X && canBounce) {
                        movingLeft = false;
                    }
                }

                // 2. If ball is moving to the right
                if (!movingLeft && ballX <= GameConstants.BALL_MAX_X) {
                    // Check if ball hits kid's racket
                    canBounce = (ballY > (kidRacketY - GameConstants.RACKET_HALF_LENGTH)
                            && ballY < (kidRacketY + GameConstants.RACKET_HALF_LENGTH));

                    ballX += GameConstants.BALL_INCREMENT;

                    if (ballY <= GameConstants.TABLE_TOP - 40) {
                        verticalSlide = -1;
                    } else if (ballY >= GameConstants.TABLE_BOTTOM + 40) {
                        verticalSlide = 1;
                    }

                    ballY -= verticalSlide;

                    setBallPosition(ballX, ballY);

                    if ((ballX + GameConstants.BALL_RADIUS)
                            >= GameConstants.KID_RACKET_X && canBounce) {
                        if (ballY + GameConstants.BALL_RADIUS
                                > kidRacketY + 10) {
                            verticalSlide = -3;
                        } else if (ballY - GameConstants.BALL_RADIUS
                                < kidRacketY - 10) {
                            verticalSlide = 3;
                        } else {
                            verticalSlide = 0;
                        }
                        movingLeft = true;
                    }
                }

                // 3. Move computer's racket
                if (computerRacketY < ballY && computerRacketY
                        < GameConstants.TABLE_BOTTOM) {
                    computerRacketY += GameConstants.RACKET_INCREMENT;
                } else if (computerRacketY > GameConstants.TABLE_TOP) {
                    computerRacketY -= GameConstants.RACKET_INCREMENT;
                }

                computerRacket.setY(computerRacketY);

                // 4. Slow down the loop
                try {
                    Thread.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GameEngine.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // Start a new game
    private void startNewGame() {
        kidScore = 0;
        computerScore = 0;

        ballX = GameConstants.KID_RACKET_X - 30;
        ball.setVisible(true);

        table.setCursor(Cursor.NONE);
        message.setText("Current score: Computer: 0  Kid: 0");

        newGameFlag = true;

        movingLeft = true; // Temporary 
        ballServed = false; // Temporary 
    }

    // End the game
    private void endGame() {
        System.exit(0);
    }

    private void kidServe() {
        if (newGameFlag) {
            ballServed = true;
            ballY = kidRacketY;

            if (ballY > GameConstants.TABLE_HEIGHT / 2) {
                verticalSlide = -1;
            } else {
                verticalSlide = 1;
            }

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

                if (!ballServed) {
                    ballY = mouseY;
                    setBallPosition(ballX, ballY);
                }
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

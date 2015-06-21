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

import com.yakovfain.lesson12.common.GameConstants;
import javafx.application.Platform;
import javafx.concurrent.Task;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class PingPongGameEngine extends Task<Void> {

    private double kidRacketY = GameConstants.RACKET_Y_START;
    private double computerRacketY = GameConstants.RACKET_Y_START;
    private double ballX;
    private double ballY;
    private int verticalSlide;
    private boolean movingLeft = true;

    private volatile boolean running = true;
    private UI_Controller ui;

    public PingPongGameEngine(UI_Controller ui) {
        this.ui = ui;
    }

    @Override
    protected Void call() throws Exception {
        ballX = ui.getBallX();
        ballY = ui.getBallY();

        if (ballY > GameConstants.TABLE_HEIGHT / 2) {
            verticalSlide = -1;
        } else {
            verticalSlide = 1;
        }

        ui.setBallPosition(ballX, ballY);

        while (running) {
            
            kidRacketY = ui.getRacketY();
            
            Platform.runLater(new Runnable() {

                @Override
                public void run() {
                    boolean canBounce = false;

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

                        ui.setBallPosition(ballX, ballY);

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

                        ui.setBallPosition(ballX, ballY);

                        if ((ballX + GameConstants.BALL_RADIUS)
                                >= GameConstants.KID_RACKET_X && canBounce) {
                            if (ballY + GameConstants.BALL_RADIUS
                                    > kidRacketY + 15) {
                                verticalSlide = -2;
                            } else if (ballY - GameConstants.BALL_RADIUS
                                    < kidRacketY - 15) {
                                verticalSlide = 2;
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

                    ui.setComputerRacketY(computerRacketY);
                }

            });
            // Slow down the loop
            Thread.sleep(3);
        }
        return null;
    }
}

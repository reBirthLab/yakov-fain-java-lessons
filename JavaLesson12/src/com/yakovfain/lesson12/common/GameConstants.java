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
package com.yakovfain.lesson12.common;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public interface GameConstants {
    final int TABLE_WIDTH = 1096;
    final int TABLE_HEIGHT = 610;
    final int TABLE_TOP = 50;
    final int TABLE_BOTTOM = 560;
    
    final int BALL_MIN_X = 0;
    final int BALL_MIN_Y = 0;
    final int BALL_MAX_X = TABLE_WIDTH;
    final int BALL_MAX_Y = TABLE_HEIGHT;
    final int BALL_INCREMENT = 1;
    final int BALL_RADIUS = 10;
    
    final int RACKET_Y_START = 305;
    final int RACKET_LENGTH = 100;
    final int RACKET_WIDTH = 10;
    final int RACKET_HALF_LENGTH = RACKET_LENGTH / 2;
    final int RACKET_INCREMENT = 1;
    
    final int COMPUTER_RACKET_X = 30;
    final int KID_RACKET_X = 1066;
    
}

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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import com.yakovfain.lesson12.common.GameConstants;

/**
 *
 * @author Anastasiy Tovstik <anastasiy.tovstik@gmail.com>
 */
public class PingPongGreenTableController implements Initializable {
    
    @FXML
    private Pane pane;
    @FXML
    private Rectangle playersRacket;
    
    private double kidRacketY = GameConstants.KID_RACKET_Y_START;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleMouseClickedAction(MouseEvent event) {
    }

    @FXML
    private void handleMouseMoveAction(MouseEvent event) {
        double mouseY = event.getY();
        if(mouseY > GameConstants.TABLE_TOP && mouseY < GameConstants.TABLE_BOTTOM){
            playersRacket.setY(mouseY);
        }   
    }
    
}

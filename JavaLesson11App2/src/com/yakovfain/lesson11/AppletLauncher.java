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

import javax.swing.JApplet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Anastasiy
 */
public class AppletLauncher extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        
        try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppletLauncher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AppletLauncher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AppletLauncher.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AppletLauncher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        add(new TicTacToeGUI());
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}

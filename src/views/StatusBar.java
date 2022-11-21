/*
 * File: StatusBar.java
 * Created Date: 2022-11-21 
 * Author: Boros Zoltán by BorosFather
 * Github: https://github.com/BorosFather
 * -----
 *  Last Modified: 2022-11-21
 * Modified By: Boros Zoltán by BorosFather
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package views;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class StatusBar extends JPanel {
    JLabel statusLabel;

    public StatusBar(int width) {        
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        size(width, 25);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        statusLabel = new JLabel("Kész");
        this.setm("Kész");
        this.add(statusLabel);
    } 
    
    public void size(int x, int y) {
        setMaximumSize(new Dimension(x, y));
        setMinimumSize(new Dimension(x, y));
        setPreferredSize(new Dimension(x, y));
    }

    public void setm(String message) {
        
        this.statusLabel.setText(message);
    }
}

/*
 * File: WordsController.java
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

package controllers;

import views.MainWindow;

public class WordsController {
    MainWindow mainWindow;
    
    public WordsController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.mainWindow.exitButton.addActionListener(event ->{
            System.exit(0);
        });
    }
    
}

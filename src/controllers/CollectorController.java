/*
 * File: CollectorController.java
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

import java.util.ArrayList;

import models.Page;
import views.MainWindow;

// A CollectorController osztály
public class CollectorController extends MainController {
    //A CollectorController osztály konstruktora    
    public CollectorController(MainWindow mainWindow) {
        super(mainWindow);
        //A vágólap tartalmát beillesztjük

        mainWindow.pasteButton.addActionListener(event -> {
            System.out.println("beillesztés");
            mainWindow.urlField.paste();
        }); // A pasteButton eseménykezelő vége

        //Indul a szógyűjtés
        mainWindow.startButton.addActionListener(event -> {
            // URL
            String path = mainWindow.urlField.getText();
            if (path.isEmpty()) {
                path = "https://index.hu";
            }
            //Egy weblap
            Page page = new Page();
            page.setUrl(path);
            //Gyűjtött szavak ide kerülnek:
            ArrayList<String> web = page.getContent();

            for(String word : web) {
                if (mainWindow.wordsModel.indexOf(word)<0) {
                    mainWindow.wordsModel.addElement(word);
                }                
            } // for ciklus vége
            Integer wordCount = mainWindow.wordsModel.getSize();
            mainWindow.statusBar.setm("Szavak: " + wordCount.toString());
        }); 


    }   
}

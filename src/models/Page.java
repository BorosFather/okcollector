/*
 * File: Page.java
 * Created Date: 2022-11-21 
 * Author: Boros Zoltán by BorosFather
 * Github: https://github.com/BorosFather
 * -----
* Last Modified: 2022-11-21
 * Modified By: Boros Zoltán by BorosFather
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

package models;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.Document;

public class Page {
    public String url;
    public String Jsoup;
    
    public ArrayList<String> getContent() {
        String result = "semmi";
        ArrayList<String> wordList = new ArrayList<>();
        if (!url.isEmpty()) {
            try {
                String conn = Jsoup.concat(this.url);
                Document doc = conn.get();
                result = doc.body().text();
                
                } catch (IOException e) {
                    System.err.println("Hiba! A weblap nem olvasható");
                }
                result = result.replaceAll("\\p{Punct}", "");
                result = result.replaceAll("[©0-9]", "");
                result = result.trim().replaceAll(" +", "\n");
        
        }else {
            System.err.println("Hiba! Az url nincs beállítva!");
        }

        Scanner scanner = new Scanner(result);
        while(scanner.hasNextLine()) {
            wordList.add(scanner.nextLine());
        }
        scanner.close();
        Collections.sort(wordList);
        return wordList;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}

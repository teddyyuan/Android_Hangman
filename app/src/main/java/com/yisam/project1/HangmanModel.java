package com.yisam.project1;

import java.util.HashMap;
import java.util.Random;

//Game logic and associated variables

public class HangmanModel {

    //Global game conditions
    boolean isGameStarted = false;
    private static int timeToDeath = 8;

    //Game-time variables
    public String guessesSoFar;
    private int wrongGuesses = 0;

    //At initialization
    private int wordLength;
    public String selectedCategory;
    public String selectedWord;

    public HangmanModel() {
        setGameStarted();
    }

    public void setGameStarted() {
        isGameStarted = true;
        //Sets word, category,
        selectWord();
        this.guessesSoFar = "";
        this.wordLength = this.selectedWord.length();
    }

    // Selects word from category - These will be selected at every game start
    public String selectWord() {
        HashMap<String, String[]> category = new HashMap<>();
        category.put("fruit", Words.fruit);
        category.put("mammals", Words.mammals);
        category.put("subjects", Words.subjects);

        Random r = new Random();
        //Select category at random
        int category_randomNum = r.nextInt(3);
        switch (category_randomNum) {
            case 0:
                this.selectedCategory = "fruit";
                break;
            case 1:
                this.selectedCategory = "mammals";
                break;
            case 2:
                this.selectedCategory = "subjects";
                break;
        }
        String[] categoryWords = category.get(selectedCategory);
        //Select a random word based on length of word list
        this.selectedWord = categoryWords[r.nextInt(categoryWords.length)];

        return selectedWord;
    }

    public void wrongGuess(String input) {
        this.wrongGuesses++;
        this.guessesSoFar += input;

        //HANGMAN VISIBILITY LOGIC - Caio

        checkGameEnd();
    }

    public boolean checkGameEnd() {
        if (isGameStarted) {
            if (wrongGuesses >= timeToDeath) {
                return true;
            }
        }
        return false;
    }


}

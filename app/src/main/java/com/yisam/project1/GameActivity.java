package com.yisam.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity implements View.OnClickListener{
    HangmanModel hangmanModel;
    TextView hintView, guessView;
    //actualWord View is just for testing. Delete this textview and all associated XML once game is completed.
    TextView actualWord;

    //TODO: FOR EVERYONE - MAKE SURE YOUR PART OF THE CODE IS COMPILABLE AND RUNNABLE BEFORE YOU START AND AFTER YOU FINISH. ALL RELEVANT VARIABLES ARE IN THE MODEL FILE AND CHANGED/INCREMENTED THERE.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initialize game
        hangmanModel = new HangmanModel();
        String categoryOfTheGame = hangmanModel.selectedCategory;
        String wordOfTheGame = hangmanModel.selectedWord;

        hintView = (TextView) findViewById(R.id.chosenCategory);
        guessView = (TextView) findViewById(R.id.guessedWords);
        actualWord = (TextView) findViewById(R.id.chosenWord);

        hintView.append(" " + categoryOfTheGame);
        actualWord.append(wordOfTheGame);

        /*
            Teddy - Logic for creating dynamic textviews will go here. Make sure on game start that the textViews have underscores: _ while view is empty. They must match the length of the wordOfTheGame.
            Create logic for replacing textView with the correct letter of the String if it is guessed correctly. The function is below.
         */

    }


    /*
        Erez - You will be filling out the onClick events based on keyboard presses (A-Z). When a user presses a letter:
            Disable button
            Append guessView (all guesses) with the letter of the view that was pressed. Make everything a String for easy appends.
            Help Teddy create logic for dynamically creating and referencing TextViews

        Caio - You will need to create onClicks with a test button that increments the wrongGuesses integer to test your hangman visibility logic. Put your hangman visibility game logic in the model file.
            Also change timeToDeath based on how many chances the user gets. Create a death dialog when game is over to reset
     */

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /*
            case R.id.myButtonId:
                PSEUDOCODE:
                .setVisibility = false
                button.disable();
                guessView.append(character that button represents)

             */
        }
    }

    public void guessRight(String c) {
        guessView.append(c);

        /*
            Teddy - Logic for changing textview after you create it dynamically: https://stackoverflow.com/questions/12494554/textview-style-after-adding-dynamically
            Basically you will need to reference the textview with a dynamic id you give it to change it to display the correct character
         */

    }
    public void guessWrong(String c) {
        hangmanModel.wrongGuess(c);
    }
}

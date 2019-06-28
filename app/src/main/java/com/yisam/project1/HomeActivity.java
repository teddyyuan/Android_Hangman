package com.yisam.project1;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//SY - Working on this Activity
//TODO: Setup Dialogs/Homepage!

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button gameButton, rulesButton, dialogButton;
    AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        dialog = new AlertDialog.Builder(this);
        dialog.setTitle(R.string.title_rules);
        dialog.setView(R.id.rules_textView);
        dialog.create();

        gameButton = findViewById(R.id.Play);
        rulesButton = findViewById(R.id.Rules);

        gameButton.setOnClickListener(this);
        rulesButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Play:
                Intent i = new Intent(this, GameActivity.class);
                startActivity(i);
            case R.id.Rules:
                dialog.show();
                dialogButton = findViewById(R.id.dialog_exit);
                dialogButton.setOnClickListener(this);
            case R.id.dialog_exit:
        }
    }
}

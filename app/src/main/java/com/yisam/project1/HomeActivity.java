package com.yisam.project1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button gameButton, rulesButton;
    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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
                RulesFragment rulesFragment = new RulesFragment();
                rulesFragment.show(fm, "Rules");
        }
    }
}

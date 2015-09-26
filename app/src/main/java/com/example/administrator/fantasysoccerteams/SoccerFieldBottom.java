package com.example.administrator.fantasysoccerteams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/**
 * Created by martinme18 on 9/25/2015.
 */
public class SoccerFieldBottom extends ActionBarActivity implements View.OnClickListener{
    Button goToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_soccerfield);
        goToMain = (Button)findViewById(R.id.goBackToMainButton);
        goBackToMain();
    }

    private void goBackToMain(){
        goToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    public void onClick(View v) {
    Intent intent = new Intent(this, SoccerFieldBottom.class);
        startActivity(intent);
    }
}

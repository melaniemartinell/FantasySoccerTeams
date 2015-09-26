package com.example.administrator.fantasysoccerteams;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button switchToEditPage;
    Button switchToField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchToEditPage = (Button) findViewById(R.id.editTeamPlayerButton);
        switchToField = (Button) findViewById(R.id.goToFieldButton);
        moveToField();
        moveToEditPage();
    }
    private void moveToField(){
        switchToField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SoccerFieldBottom.class));
            }
        });
    }

    private void moveToEditPage() {

        switchToEditPage.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EditTeams.class));
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}

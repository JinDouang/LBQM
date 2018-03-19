package com.lbqm.longbeachquickmenu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


/**
 * Created by jin on 18/03/2018.
 */

public class CampusActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.campus);

        ImageView Beach = findViewById(R.id.beachside);
        Beach.setOnClickListener(this);

        ImageView Hill = findViewById(R.id.hillside);
        Hill.setOnClickListener(this);

        ImageView Park = findViewById(R.id.parkside);
        Park.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.beachside:
                Intent BeachSide = new Intent(CampusActivity.this, BeachsideMenu.class);
                startActivity(BeachSide);
                break;
            case R.id.hillside:
                Intent HillSide = new Intent(CampusActivity.this, HillsideMenu.class);
                startActivity(HillSide);
                break;
            case R.id.parkside:
                Intent ParkSide = new Intent(CampusActivity.this, ParksideMenu.class);
                startActivity(ParkSide);
                break;
        }
    }
}

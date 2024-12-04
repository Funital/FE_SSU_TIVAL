package com.foo.fessutival.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.foo.fessutival.Home.booth_information.Day_booth_01Activity;
import com.foo.fessutival.Home.festival_information.Home_festival_informationActivity;
import com.foo.fessutival.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Switch boothSwitch = findViewById(R.id.booth_switch);
        ImageButton informationButtion = findViewById(R.id.festival_information_button);
        ImageButton dayButton = findViewById(R.id.booth_information_day_button);
        ImageButton nightButton = findViewById(R.id.booth_information_night_button);


        Glide.with(this)
                .load("https://drive.google.com/uc?export=view&id=1ZWHmad5neDCXHJ2NqS3mugkWn3pNtYQ1")
                .into(informationButtion);

        Glide.with(this)
                .load("https://drive.google.com/uc?export=view&id=1NfeE5lsVCC2RSsDytAlfaOO_oseynVSe")
                .into(dayButton);

        Glide.with(this)
                .load("https://drive.google.com/uc?export=view&id=1IH8O5b88l8LsBYhz0aoaAbGStWzmOSJH")
                .into(nightButton);

        informationButtion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Home_festival_informationActivity.class));
            }
        });

        dayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Day_booth_01Activity.class));
            }
        });

        nightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, Day_booth_01Activity.class));
            }
        });

        boothSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // 야간 부스 정보를 표시하고 주간 부스 정보를 숨김
                dayButton.setVisibility(View.GONE);
                nightButton.setVisibility(View.VISIBLE);
            } else {
                // 주간 부스 정보를 표시하고 야간 부스 정보를 숨김
                dayButton.setVisibility(View.VISIBLE);
                nightButton.setVisibility(View.GONE);
            }
        });
    }
}
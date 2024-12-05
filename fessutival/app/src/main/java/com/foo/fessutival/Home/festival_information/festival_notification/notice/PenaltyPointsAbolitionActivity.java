package com.foo.fessutival.Home.festival_information.festival_notification.notice;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class PenaltyPointsAbolitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penalty_points_abolition);

        ImageView penaltyPointsAbolition01 = findViewById(R.id.penalty_points_abolition_01);
        ImageView penaltyPointsAbolition02 = findViewById(R.id.penalty_points_abolition_02);
        ImageView penaltyPointsAbolition03 = findViewById(R.id.penalty_points_abolition_03);

        String penaltyPointsAbolition01URL = "https://drive.google.com/uc?export=view&id=12xbqV3kfzOgRU4iKukqkYnPRtTeFUIGK";
        String penaltyPointsAbolition02URL = "https://drive.google.com/uc?export=view&id=13XZsr_u5lF_-BUUqCT3SzRK7GK8C5th0";
        String penaltyPointsAbolition03URL = "https://drive.google.com/uc?export=view&id=1-sYU2QIu_JEMMwT2T-Q5jWJkA3nb0Ipe";

        Glide.with(this)
                .load(penaltyPointsAbolition01URL)
                .into(penaltyPointsAbolition01);
        Glide.with(this)
                .load(penaltyPointsAbolition02URL)
                .into(penaltyPointsAbolition02);
        Glide.with(this)
                .load(penaltyPointsAbolition03URL)
                .into(penaltyPointsAbolition03);

    }
}
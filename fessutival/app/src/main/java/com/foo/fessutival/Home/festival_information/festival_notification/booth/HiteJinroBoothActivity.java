package com.foo.fessutival.Home.festival_information.festival_notification.booth;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class HiteJinroBoothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hite_jinro_booth);

        ImageView hiteJinroBooth01 = findViewById(R.id.hite_jinro_booth_01);
        ImageView hiteJinroBooth02 = findViewById(R.id.hite_jinro_booth_02);
        ImageView hiteJinroBooth03 = findViewById(R.id.hite_jinro_booth_03);

        String hiteJinroBooth01URL = "https://drive.google.com/uc?export=view&id=1V3oMpL1ycyrE2Zp8exsP7SvIVbF-Q-iw";
        String hiteJinroBooth02URL = "https://drive.google.com/uc?export=view&id=1Y3wX9WxkOb-Tjap9dKiS96v5dV5IGOT5";
        String hiteJinroBooth03URL = "https://drive.google.com/uc?export=view&id=11L41qIJgoWUcDqUsJcsnN9yo8rUHB5mY";

        Glide.with(this)
                .load(hiteJinroBooth01URL)
                .into(hiteJinroBooth01);
        Glide.with(this)
                .load(hiteJinroBooth02URL)
                .into(hiteJinroBooth02);
        Glide.with(this)
                .load(hiteJinroBooth03URL)
                .into(hiteJinroBooth03);

    }
}
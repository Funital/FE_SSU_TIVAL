package com.foo.fessutival.Home.festival_information.festival_notification.booth;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class DayBoothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_booth);

        ImageView dayBooth01 = findViewById(R.id.day_booth_01);
        ImageView dayBooth02 = findViewById(R.id.day_booth_02);
        ImageView dayBooth03 = findViewById(R.id.day_booth_03);
        ImageView dayBooth04 = findViewById(R.id.day_booth_04);
        ImageView dayBooth05 = findViewById(R.id.day_booth_05);
        ImageView dayBooth06 = findViewById(R.id.day_booth_06);
        ImageView dayBooth07 = findViewById(R.id.day_booth_07);
        ImageView dayBooth08 = findViewById(R.id.day_booth_08);
        ImageView dayBooth09 = findViewById(R.id.day_booth_09);

        String dayBooth01URL = "https://drive.google.com/uc?export=view&id=1YDOUPsdE4Mp2N91lXK0NMFEecAK4wkxC";
        String dayBooth02URL = "https://drive.google.com/uc?export=view&id=1rmb3US32IkjC3PE4dhZbyYJjtENQVrZf";
        String dayBooth03URL = "https://drive.google.com/uc?export=view&id=1O7RB8D6oZFK9iBXtnfsFvhwLnX3Ub-m8";
        String dayBooth04URL = "https://drive.google.com/uc?export=view&id=1cLFeggxFqBtJAh-4ZXDAHZzEN74ABSYd";
        String dayBooth05URL = "https://drive.google.com/uc?export=view&id=1PgJyRD8SyjVimxMGtIRqcuaWhkbGfXOn";
        String dayBooth06URL = "https://drive.google.com/uc?export=view&id=1MIqfmdhzgAhY4cnu9NxAMXw-L027ZQ_D";
        String dayBooth07URL = "https://drive.google.com/uc?export=view&id=1wdr-lgo0lO_r3gprSD7DAK-uYZTJec3c";
        String dayBooth08URL = "https://drive.google.com/uc?export=view&id=1OGkzEjGcxGQHMrsB3lZO6s70PPGXAy4T";
        String dayBooth09URL = "https://drive.google.com/uc?export=view&id=12FMTPhyTXybSxyJBo8d5Y6og1H32LpGz";

        Glide.with(this)
                .load(dayBooth01URL)
                .into(dayBooth01);
        Glide.with(this)
                .load(dayBooth02URL)
                .into(dayBooth02);
        Glide.with(this)
                .load(dayBooth03URL)
                .into(dayBooth03);
        Glide.with(this)
                .load(dayBooth04URL)
                .into(dayBooth04);
        Glide.with(this)
                .load(dayBooth05URL)
                .into(dayBooth05);
        Glide.with(this)
                .load(dayBooth06URL)
                .into(dayBooth06);
        Glide.with(this)
                .load(dayBooth07URL)
                .into(dayBooth07);
        Glide.with(this)
                .load(dayBooth08URL)
                .into(dayBooth08);
        Glide.with(this)
                .load(dayBooth09URL)
                .into(dayBooth09);

    }
}
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

public class NightBoothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_booth);

        ImageView nightBooth01 = findViewById(R.id.night_booth_01);
        ImageView nightBooth02 = findViewById(R.id.night_booth_02);
        ImageView nightBooth03 = findViewById(R.id.night_booth_03);
        ImageView nightBooth04 = findViewById(R.id.night_booth_04);
        ImageView nightBooth05 = findViewById(R.id.night_booth_05);

        String nightBooth01URL = "https://drive.google.com/uc?export=view&id=1fyOYOx_JqaSGLyZFevRV77Pjpb-OdijI";
        String nightBooth02URL = "https://drive.google.com/uc?export=view&id=1tnGQ6xYvQidUNhmwADlorlePLt-fjr7U";
        String nightBooth03URL = "https://drive.google.com/uc?export=view&id=12d2ZW9XAfuyt0FiGsrIj00t8JD_rxBeb";
        String nightBooth04URL = "https://drive.google.com/uc?export=view&id=1XXo2Uj6fZ_ceOMVdhGyc8_PHdTZRaTKu";
        String nightBooth05URL = "https://drive.google.com/uc?export=view&id=1wjedVtiCUCW_sxKSguB2CXiTfXSMg0fz";

        Glide.with(this)
                .load(nightBooth01URL)
                .into(nightBooth01);
        Glide.with(this)
                .load(nightBooth02URL)
                .into(nightBooth02);
        Glide.with(this)
                .load(nightBooth03URL)
                .into(nightBooth03);
        Glide.with(this)
                .load(nightBooth04URL)
                .into(nightBooth04);
        Glide.with(this)
                .load(nightBooth05URL)
                .into(nightBooth05);

    }
}
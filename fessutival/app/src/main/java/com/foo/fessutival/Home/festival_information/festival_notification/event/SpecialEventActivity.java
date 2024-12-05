package com.foo.fessutival.Home.festival_information.festival_notification.event;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class SpecialEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_event);

        ImageView specialBooth01 = findViewById(R.id.special_event_01);
        ImageView specialBooth02 = findViewById(R.id.special_event_02);
        ImageView specialBooth03 = findViewById(R.id.special_event_03);
        ImageView specialBooth04 = findViewById(R.id.special_event_04);

        String specialBooth01URL = "https://drive.google.com/uc?export=view&id=1asSeI3HQFz_H5MZ30qFVtMUT6XmtceFf";
        String specialBooth02URL = "https://drive.google.com/uc?export=view&id=1uf996T07RUK_CbF6vZIDMCkkJgd7gPYp";
        String specialBooth03URL = "https://drive.google.com/uc?export=view&id=1Eh5tNdlAcH6Z_ZjQgcjpPBIMZG9QPpYU";
        String specialBooth04URL = "https://drive.google.com/uc?export=view&id=1YWYk_3WIwMzIM48LkDPyi9-VnCQOmJlU";


        Glide.with(this)
                .load(specialBooth01URL)
                .into(specialBooth01);
        Glide.with(this)
                .load(specialBooth02URL)
                .into(specialBooth02);
        Glide.with(this)
                .load(specialBooth03URL)
                .into(specialBooth03);
        Glide.with(this)
                .load(specialBooth04URL)
                .into(specialBooth04);
    }
}
package com.foo.fessutival.Home.festival_information.festival_notification.stage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class MainStageBannedListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_stage_banned_list);

        ImageView mainStageBannedList01 = findViewById(R.id.main_stage_banned_list_01);
        ImageView mainStageBannedList02 = findViewById(R.id.main_stage_banned_list_02);
        ImageView mainStageBannedList03 = findViewById(R.id.main_stage_banned_list_03);

        String mainStageBannedList01URL = "https://drive.google.com/uc?export=view&id=1rUdWvvM0rdNFVMqLC6WzsU1qVYcPnaKR";
        String mainStageBannedList02URL = "https://drive.google.com/uc?export=view&id=1K3FesYF3X_Eppghllux_V_UOyJQ0S5KA";
        String mainStageBannedList03URL = "https://drive.google.com/uc?export=view&id=1y9OyPovgRQ-JfIlz-8E5aff3Huaze8Fm";

        Glide.with(this)
                .load(mainStageBannedList01URL)
                .into(mainStageBannedList01);

        Glide.with(this)
                .load(mainStageBannedList02URL)
                .into(mainStageBannedList02);

        Glide.with(this)
                .load(mainStageBannedList03URL)
                .into(mainStageBannedList03);

    }
}
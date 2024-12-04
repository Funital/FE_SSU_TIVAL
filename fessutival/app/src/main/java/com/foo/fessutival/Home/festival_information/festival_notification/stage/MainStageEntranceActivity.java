package com.foo.fessutival.Home.festival_information.festival_notification.stage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class MainStageEntranceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_stage_entrance);

        ImageView mainStageEntrance01 = findViewById(R.id.main_stage_entrance_01);
        ImageView mainStageEntrance02 = findViewById(R.id.main_stage_entrance_02);
        ImageView mainStageEntrance03 = findViewById(R.id.main_stage_entrance_03);
        ImageView mainStageEntrance04 = findViewById(R.id.main_stage_entrance_04);
        ImageView mainStageEntrance05 = findViewById(R.id.main_stage_entrance_05);

        String mainStageEntrance01URL = "https://drive.google.com/uc?export=view&id=1J6RDktTEpYDi1A0VY20uYUbmoYPGaMqu";
        String mainStageEntrance02URL = "https://drive.google.com/uc?export=view&id=1uXa9OhWr3Vq9q8FQoHwI5aPJCdgT84yw";
        String mainStageEntrance03URL = "https://drive.google.com/uc?export=view&id=1mjNrBvZYt3WIRU4qZmlkDtsYEsO7t7CA";
        String mainStageEntrance04URL = "https://drive.google.com/uc?export=view&id=1RtWRlZgj1ZwPb5MgKEDDIv70SrB_Cxnz";
        String mainStageEntrance05URL = "https://drive.google.com/uc?export=view&id=1GGMoOxxXyhNDrDYNdLq5-nh6iRORxcq0";

        Glide.with(this)
                .load(mainStageEntrance01URL)
                .into(mainStageEntrance01);
        Glide.with(this)
                .load(mainStageEntrance02URL)
                .into(mainStageEntrance02);
        Glide.with(this)
                .load(mainStageEntrance03URL)
                .into(mainStageEntrance03);
        Glide.with(this)
                .load(mainStageEntrance04URL)
                .into(mainStageEntrance04);
        Glide.with(this)
                .load(mainStageEntrance05URL)
                .into(mainStageEntrance05);
    }
}
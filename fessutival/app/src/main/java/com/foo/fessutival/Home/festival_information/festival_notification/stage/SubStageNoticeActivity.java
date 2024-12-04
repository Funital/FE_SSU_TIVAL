package com.foo.fessutival.Home.festival_information.festival_notification.stage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class SubStageNoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_stage_notice);

        ImageView subStageNotice01 = findViewById(R.id.sub_stage_notice_01);
        ImageView subStageNotice02 = findViewById(R.id.sub_stage_notice_02);
        ImageView subStageNotice03 = findViewById(R.id.sub_stage_notice_03);

        String subStageNotice01URL = "https://drive.google.com/uc?export=view&id=1a-EJayIRDdEAr0Y0xjvtC79fR7pAo5m8";
        String subStageNotice02URL = "https://drive.google.com/uc?export=view&id=1_Ona-IObmeRBd_w3Kan3B4J5uuco71PR";
        String subStageNotice03URL = "https://drive.google.com/uc?export=view&id=1yuwxPDOpUoW5-IyWM3YKEW81awSKQx1r";

        Glide.with(this)
                .load(subStageNotice01URL)
                .into(subStageNotice01);
        Glide.with(this)
                .load(subStageNotice02URL)
                .into(subStageNotice02);
        Glide.with(this)
                .load(subStageNotice03URL)
                .into(subStageNotice03);


    }
}
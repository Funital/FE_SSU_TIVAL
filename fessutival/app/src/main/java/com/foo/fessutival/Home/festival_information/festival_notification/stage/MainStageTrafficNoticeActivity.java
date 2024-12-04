package com.foo.fessutival.Home.festival_information.festival_notification.stage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class MainStageTrafficNoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_stage_traffic_notice);

        ImageView mainStageTrafficNotice01 = findViewById(R.id.main_stage_traffic_notice_01);
        ImageView mainStageTrafficNotice02 = findViewById(R.id.main_stage_traffic_notice_02);
        ImageView mainStageTrafficNotice03 = findViewById(R.id.main_stage_traffic_notice_03);
        ImageView mainStageTrafficNotice04 = findViewById(R.id.main_stage_traffic_notice_04);
        ImageView mainStageTrafficNotice05 = findViewById(R.id.main_stage_traffic_notice_05);
        ImageView mainStageTrafficNotice06 = findViewById(R.id.main_stage_traffic_notice_06);

        String mainStageTrafficNotice01URL = "https://drive.google.com/uc?export=view&id=1i62eVjPa35IHJfg0PMuBTvr0E_rhW1r5";
        String mainStageTrafficNotice02URL = "https://drive.google.com/uc?export=view&id=1TcfcdYIScSUk0-EzKhoZu8ilyboiGCzr";
        String mainStageTrafficNotice03URL = "https://drive.google.com/uc?export=view&id=1U371iLddVxE7AhYn5POriG5R9aaWG4WV";
        String mainStageTrafficNotice04URL = "https://drive.google.com/uc?export=view&id=15XB6iUAh-vRj0NOUHTyuuDSIzLKJuM9h";
        String mainStageTrafficNotice05URL = "https://drive.google.com/uc?export=view&id=1OcNWVFLl_hv6Lb2wgwqzGOC6qqUFq2qL";
        String mainStageTrafficNotice06URL = "https://drive.google.com/uc?export=view&id=182wkBA4Lu1_9r6Y-bsLhG-QwJJ2ISOnT";

        Glide.with(this)
                .load(mainStageTrafficNotice01URL)
                .into(mainStageTrafficNotice01);
        Glide.with(this)
                .load(mainStageTrafficNotice02URL)
                .into(mainStageTrafficNotice02);
        Glide.with(this)
                .load(mainStageTrafficNotice03URL)
                .into(mainStageTrafficNotice03);
        Glide.with(this)
                .load(mainStageTrafficNotice04URL)
                .into(mainStageTrafficNotice04);
        Glide.with(this)
                .load(mainStageTrafficNotice05URL)
                .into(mainStageTrafficNotice05);
        Glide.with(this)
                .load(mainStageTrafficNotice06URL)
                .into(mainStageTrafficNotice06);


    }
}
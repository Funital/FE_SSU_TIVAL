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

public class HeadOfficeEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_office_event);

        ImageView headOfficeEvent01 = findViewById(R.id.head_office_event_01);
        ImageView headOfficeEvent02 = findViewById(R.id.head_office_event_02);
        ImageView headOfficeEvent03 = findViewById(R.id.head_office_event_03);
        ImageView headOfficeEvent04 = findViewById(R.id.head_office_event_04);

        String headOfficeEvent01URL = "https://drive.google.com/uc?export=view&id=16IxEFOD9rTc-len-eNmJA4wiFdGWoIQO";
        String headOfficeEvent02URL = "https://drive.google.com/uc?export=view&id=173ByBzgDvRCyjJ3PJi7b8RDg7UVsip9_";
        String headOfficeEvent03URL = "https://drive.google.com/uc?export=view&id=1xi-_NxqahHBgiA4BkIlqHPanQys5Qb3X";
        String headOfficeEvent04URL = "https://drive.google.com/uc?export=view&id=18Sn8jnFxSnKjhbYByz4AV-ARY9VeF9Hz";

        Glide.with(this)
                .load(headOfficeEvent01URL)
                .into(headOfficeEvent01);
        Glide.with(this)
                .load(headOfficeEvent02URL)
                .into(headOfficeEvent02);
        Glide.with(this)
                .load(headOfficeEvent03URL)
                .into(headOfficeEvent03);
        Glide.with(this)
                .load(headOfficeEvent04URL)
                .into(headOfficeEvent04);

    }
}
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

public class InquiryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry);

        ImageView inquiry01 = findViewById(R.id.inquiry_01);
        ImageView inquiry02 = findViewById(R.id.inquiry_02);

        String inquiry01URL = "https://drive.google.com/uc?export=view&id=1nOKsbmUNhAsd-PxcKbza35Dg7DA_nPdt";
        String inquiry02URL = "https://drive.google.com/uc?export=view&id=1nZAB_fu3-bDI88kggoUgSV_54oP4q0ZL";

        Glide.with(this)
                .load(inquiry01URL)
                .into(inquiry01);
        Glide.with(this)
                .load(inquiry02URL)
                .into(inquiry02);
    }
}
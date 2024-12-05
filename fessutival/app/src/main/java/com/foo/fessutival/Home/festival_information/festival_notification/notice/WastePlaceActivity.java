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

public class WastePlaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waste_place);

        ImageView wastePlace01 = findViewById(R.id.waste_place_01);
        ImageView wastePlace02 = findViewById(R.id.waste_place_02);

        String wastePlace01URL = "https://drive.google.com/uc?export=view&id=1e7TNiMkEM03ppO8ju5_ixBVoBg8NMraD";
        String wastePlace02URL = "https://drive.google.com/uc?export=view&id=1exolxd7JMgjdM6sgZC6XBkJErwLIgvGg";

        Glide.with(this)
                .load(wastePlace01URL)
                .into(wastePlace01);
        Glide.with(this)
                .load(wastePlace02URL)
                .into(wastePlace02);

    }
}
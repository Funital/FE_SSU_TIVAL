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

public class GoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);

        ImageView goods01 = findViewById(R.id.goods_01);
        ImageView goods02 = findViewById(R.id.goods_02);
        ImageView goods03 = findViewById(R.id.goods_03);
        ImageView goods04 = findViewById(R.id.goods_04);
        ImageView goods05 = findViewById(R.id.goods_05);

        String goods01URL = "https://drive.google.com/uc?export=view&id=1BZKSEP8qX70QXVhy5M4IGGhxYi7qFD1Y";
        String goods02URL = "https://drive.google.com/uc?export=view&id=1IJJew1n4ljwOlUIwG2SS_hXVnNTWgW5K";
        String goods03URL = "https://drive.google.com/uc?export=view&id=1EDo7yfUhmRnWrnIu5pbas28hmhQgvB5w";
        String goods04URL = "https://drive.google.com/uc?export=view&id=1TE4XLEusUwr3t3ftSn7GQYXj9zEJwL2o";
        String goods05URL = "https://drive.google.com/uc?export=view&id=1b_auKIeXMKM-V7Yx3JHCJeauVUfGQvRP";

        Glide.with(this)
                .load(goods01URL)
                .into(goods01);
        Glide.with(this)
                .load(goods02URL)
                .into(goods02);
        Glide.with(this)
                .load(goods03URL)
                .into(goods03);
        Glide.with(this)
                .load(goods04URL)
                .into(goods04);
        Glide.with(this)
                .load(goods05URL)
                .into(goods05);

    }
}
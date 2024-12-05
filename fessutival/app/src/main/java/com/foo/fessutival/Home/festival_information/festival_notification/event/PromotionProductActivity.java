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

public class PromotionProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_product);

        ImageView promotionProduct01 = findViewById(R.id.promotion_product_01);
        ImageView promotionProduct02 = findViewById(R.id.promotion_product_02);

        String promotionProduct01URL = "https://drive.google.com/uc?export=view&id=1Fm2-NPesNBFlNbEPdW426nDLEYcieg6m";
        String promotionProduct02URL = "https://drive.google.com/uc?export=view&id=1B6I0hFaEjdydseGPNBTy8VVGerqgio7R";

        Glide.with(this)
                .load(promotionProduct01URL)
                .into(promotionProduct01);
        Glide.with(this)
                .load(promotionProduct02URL)
                .into(promotionProduct02);

    }
}
package com.foo.fessutival.Home.festival_information.festival_notification.booth;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class FoodTruckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_truck);

        ImageView foodTruck01 = findViewById(R.id.food_truck_01);
        ImageView foodTruck02 = findViewById(R.id.food_truck_02);

        String foodTruck01URL = "https://drive.google.com/uc?export=view&id=12wdGDvPe3sg0NDomF71pf5iStoj3820q";
        String foodTruck02URL = "https://drive.google.com/uc?export=view&id=12Tn87-h-OL1bbgnki2FBVBAq6r3Purba";

        Glide.with(this)
                .load(foodTruck01URL)
                .into(foodTruck01);
        Glide.with(this)
                .load(foodTruck02URL)
                .into(foodTruck02);

    }
}
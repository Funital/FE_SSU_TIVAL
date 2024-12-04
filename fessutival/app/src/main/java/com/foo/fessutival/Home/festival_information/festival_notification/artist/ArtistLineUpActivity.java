package com.foo.fessutival.Home.festival_information.festival_notification.artist;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class ArtistLineUpActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_line_up);

        ImageView artistLineUp01 = findViewById(R.id.artist_line_up_01);

        String artistLineUp01URL = "https://drive.google.com/uc?export=view&id=1sv06AUdfhMaJWpYZKtup7X2XwmHhMRrV";

        Glide.with(this)
                .load(artistLineUp01URL)
                .into(artistLineUp01);
    }
}
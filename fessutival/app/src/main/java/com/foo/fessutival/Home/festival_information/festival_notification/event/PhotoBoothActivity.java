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

public class PhotoBoothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_booth);

        ImageView photoBooth01 = findViewById(R.id.photo_booth_01);
        ImageView photoBooth02 = findViewById(R.id.photo_booth_02);
        ImageView photoBooth03 = findViewById(R.id.photo_booth_03);
        ImageView photoBooth04 = findViewById(R.id.photo_booth_04);
        ImageView photoBooth05 = findViewById(R.id.photo_booth_05);
        ImageView photoBooth06 = findViewById(R.id.photo_booth_06);
        ImageView photoBooth07 = findViewById(R.id.photo_booth_07);

        String photoBooth01URL = "https://drive.google.com/uc?export=view&id=1ZAfwb3dhg4gZkyIGOw9715qGwznqZV_T";
        String photoBooth02URL = "https://drive.google.com/uc?export=view&id=19q-D3QwmR0renN2gVQPRXn1HTnyfzu2y";
        String photoBooth03URL = "https://drive.google.com/uc?export=view&id=1c09IDcBV0nrYZ6FQhytWmNAmY0IC-OCF";
        String photoBooth04URL = "https://drive.google.com/uc?export=view&id=1fQH2SqPEAnn1p_Zc5Phu-Uq440dDHRoX";
        String photoBooth05URL = "https://drive.google.com/uc?export=view&id=10kCsnb45ugazzjdmzirRxqgLggai5n7p";
        String photoBooth06URL = "https://drive.google.com/uc?export=view&id=1uJeapddRDW5TQCbZT8ryX0jW3rbnxB2c";
        String photoBooth07URL = "https://drive.google.com/uc?export=view&id=1sjzsr_Ct07vfiWXs7RpnjaJundGDn8-S";

                Glide.with(this)
                .load(photoBooth01URL)
                .into(photoBooth01);
        Glide.with(this)
                .load(photoBooth02URL)
                .into(photoBooth02);
        Glide.with(this)
                .load(photoBooth03URL)
                .into(photoBooth03);
        Glide.with(this)
                .load(photoBooth04URL)
                .into(photoBooth04);
        Glide.with(this)
                .load(photoBooth05URL)
                .into(photoBooth05);
        Glide.with(this)
                .load(photoBooth06URL)
                .into(photoBooth06);
        Glide.with(this)
                .load(photoBooth07URL)
                .into(photoBooth07);

    }
}
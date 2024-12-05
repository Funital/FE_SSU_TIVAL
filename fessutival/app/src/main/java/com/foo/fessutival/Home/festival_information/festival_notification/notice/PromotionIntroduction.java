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

public class PromotionIntroduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promotion_introduction);

        ImageView promotionIntroduction01 = findViewById(R.id.promotion_introduction_01);
        ImageView promotionIntroduction02 = findViewById(R.id.promotion_introduction_02);
        ImageView promotionIntroduction03 = findViewById(R.id.promotion_introduction_03);
        ImageView promotionIntroduction04 = findViewById(R.id.promotion_introduction_04);
        ImageView promotionIntroduction05 = findViewById(R.id.promotion_introduction_05);
        ImageView promotionIntroduction06 = findViewById(R.id.promotion_introduction_06);
        ImageView promotionIntroduction07 = findViewById(R.id.promotion_introduction_07);
        ImageView promotionIntroduction08 = findViewById(R.id.promotion_introduction_08);

        String promotionIntroduction01URL = "https://drive.google.com/uc?export=view&id=1eZ-R1xwTPHKeJH6FM3bw7l2iD0xAbwPA";
        String promotionIntroduction02URL = "https://drive.google.com/uc?export=view&id=1T5YK0zp6GeI_5Xqw-4lWA_BEw81mh-rS";
        String promotionIntroduction03URL = "https://drive.google.com/uc?export=view&id=1-8cYomYATivM6B0M43ZIiMDBV7uUat_s";
        String promotionIntroduction04URL = "https://drive.google.com/uc?export=view&id=1S8M5WG9f6sjA20ugzPWhhJrJjs9P2DTO";
        String promotionIntroduction05URL = "https://drive.google.com/uc?export=view&id=107vayqu1FTs_oLXwZPIapNIO06HN0zw0";
        String promotionIntroduction06URL = "https://drive.google.com/uc?export=view&id=1zBr5QEOmPcVmgLenylUDdgT_ehnGRq3r";
        String promotionIntroduction07URL = "https://drive.google.com/uc?export=view&id=1_CtQRDwDjgHzq4gtiE8fkjNcBAah_lTa";
        String promotionIntroduction08URL = "https://drive.google.com/uc?export=view&id=1O2pJdqxfAUwcLE-rAGzQWi2n-r1rBTmc";

        Glide.with(this)
                .load(promotionIntroduction01URL)
                .into(promotionIntroduction01);
        Glide.with(this)
                .load(promotionIntroduction02URL)
                .into(promotionIntroduction02);
        Glide.with(this)
                .load(promotionIntroduction03URL)
                .into(promotionIntroduction03);
        Glide.with(this)
                .load(promotionIntroduction04URL)
                .into(promotionIntroduction04);
        Glide.with(this)
                .load(promotionIntroduction05URL)
                .into(promotionIntroduction05);
        Glide.with(this)
                .load(promotionIntroduction06URL)
                .into(promotionIntroduction06);
        Glide.with(this)
                .load(promotionIntroduction07URL)
                .into(promotionIntroduction07);
        Glide.with(this)
                .load(promotionIntroduction08URL)
                .into(promotionIntroduction08);
    }
}
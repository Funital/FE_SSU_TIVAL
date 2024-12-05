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

public class CommercialPartnershipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercial_partnership);

        ImageView commercialPartnership01 = findViewById(R.id.commercial_partnership_01);
        ImageView commercialPartnership02 = findViewById(R.id.commercial_partnership_02);
        ImageView commercialPartnership03 = findViewById(R.id.commercial_partnership_03);
        ImageView commercialPartnership04 = findViewById(R.id.commercial_partnership_04);
        ImageView commercialPartnership05 = findViewById(R.id.commercial_partnership_05);
        ImageView commercialPartnership06 = findViewById(R.id.commercial_partnership_06);
        ImageView commercialPartnership07 = findViewById(R.id.commercial_partnership_07);
        ImageView commercialPartnership08 = findViewById(R.id.commercial_partnership_08);
        ImageView commercialPartnership09 = findViewById(R.id.commercial_partnership_09);
        ImageView commercialPartnership10 = findViewById(R.id.commercial_partnership_10);

        String commercialPartnership01URL = "https://drive.google.com/uc?export=view&id=1D3LlvTj5oXfUdMtOcEY-DMvr_pk3zMI6";
        String commercialPartnership02URL = "https://drive.google.com/uc?export=view&id=1EBM863a1YJKAVvwoIqWNaLE2T5Scxglg";
        String commercialPartnership03URL = "https://drive.google.com/uc?export=view&id=1NZG2z5MHekcj8TnaXEbL7Cw3lqMQwv_Y";
        String commercialPartnership04URL = "https://drive.google.com/uc?export=view&id=1UCQ1ieGqQ-oedtyAoZzBp_qrqjfbmLz-";
        String commercialPartnership05URL = "https://drive.google.com/uc?export=view&id=1eTLCzaSQTO5nwusOv06WYirFbgdzM_UX";
        String commercialPartnership06URL = "https://drive.google.com/uc?export=view&id=1RTQy0LfnGfn1lA9WO6LRGbBTH0YVNzO_";
        String commercialPartnership07URL = "https://drive.google.com/uc?export=view&id=1qrvc8Iu-u8JkyBt_jtDi6dZVEwE9PNMb";
        String commercialPartnership08URL = "https://drive.google.com/uc?export=view&id=1ywaw5w9ZFFwmICg7rHRgA5DUOFnBWpeM";
        String commercialPartnership09URL = "https://drive.google.com/uc?export=view&id=13z6DoZ2QCjcrBrYFsqT9OFUV-y5qHGn2";
        String commercialPartnership10URL = "https://drive.google.com/uc?export=view&id=1a7lZ2pSsCCwmcsdLQB5M7JTXAYwoBbUj";

        Glide.with(this)
                .load(commercialPartnership01URL)
                .into(commercialPartnership01);
        Glide.with(this)
                .load(commercialPartnership02URL)
                .into(commercialPartnership02);
        Glide.with(this)
                .load(commercialPartnership03URL)
                .into(commercialPartnership03);
        Glide.with(this)
                .load(commercialPartnership04URL)
                .into(commercialPartnership04);
        Glide.with(this)
                .load(commercialPartnership05URL)
                .into(commercialPartnership05);
        Glide.with(this)
                .load(commercialPartnership06URL)
                .into(commercialPartnership06);
        Glide.with(this)
                .load(commercialPartnership07URL)
                .into(commercialPartnership07);
        Glide.with(this)
                .load(commercialPartnership08URL)
                .into(commercialPartnership08);
        Glide.with(this)
                .load(commercialPartnership09URL)
                .into(commercialPartnership09);
        Glide.with(this)
                .load(commercialPartnership10URL)
                .into(commercialPartnership10);
    }
}
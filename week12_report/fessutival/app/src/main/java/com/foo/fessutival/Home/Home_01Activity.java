package com.foo.fessutival.Home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import com.foo.fessutival.R;

public class Home_01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home01);

        Switch boothSwitch = findViewById(R.id.booth_switch);
        ImageButton dayButton = findViewById(R.id.booth_information_day_button);
        ImageButton nightButton = findViewById(R.id.booth_information_night_button);

        boothSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                // 야간 부스 정보를 표시하고 주간 부스 정보를 숨김
                dayButton.setVisibility(View.GONE);
                nightButton.setVisibility(View.VISIBLE);
            } else {
                // 주간 부스 정보를 표시하고 야간 부스 정보를 숨김
                dayButton.setVisibility(View.VISIBLE);
                nightButton.setVisibility(View.GONE);
            }
        });
    }
}
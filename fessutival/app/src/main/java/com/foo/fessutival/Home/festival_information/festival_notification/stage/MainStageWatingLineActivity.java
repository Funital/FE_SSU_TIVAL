package com.foo.fessutival.Home.festival_information.festival_notification.stage;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class MainStageWatingLineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_stage_wating_line);

        ImageView mainStageWatingLine01 = findViewById(R.id.main_stage_wating_line_01);
        ImageView mainStageWatingLine02 = findViewById(R.id.main_stage_wating_line_02);
        ImageView mainStageWatingLine03 = findViewById(R.id.main_stage_wating_line_03);

        String mainStageWatingLine01URL = "https://drive.google.com/uc?export=view&id=1kLobzuH8M5gVz9Ijx7EuFVMdJyo6mmAF";
        String mainStageWatingLine02URL = "https://drive.google.com/uc?export=view&id=15LWrlZzKftk-wpb81MV4PhZKws38KcwX";
        String mainStageWatingLine03URL = "https://drive.google.com/uc?export=view&id=1cO-IS4gHI6-k3ZU0zWncWJjGv5IES_70";

        Glide.with(this)
                .load(mainStageWatingLine01URL)
                .into(mainStageWatingLine01);
        Glide.with(this)
                .load(mainStageWatingLine02URL)
                .into(mainStageWatingLine02);
        Glide.with(this)
                .load(mainStageWatingLine03URL)
                .into(mainStageWatingLine03);
    }
}
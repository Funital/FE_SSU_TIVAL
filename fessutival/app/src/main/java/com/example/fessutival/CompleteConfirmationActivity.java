package com.example.fessutival;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CompleteConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_confirmation);

        // 전달된 메시지를 받아와서 텍스트에 설정
        String message = getIntent().getStringExtra("message");
        TextView textView = findViewById(R.id.CompleteTextView2);
        textView.setText(message);
    }
}
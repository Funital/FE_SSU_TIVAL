package com.example.fessutival;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class InquiryConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry_confirmation);

        // Inquiry 다이얼로그 띄우기
        showInquiryDialog();
    }

    private void showInquiryDialog() {
        // Inquiry 다이얼로그 생성
        Dialog inquiryDialog = new Dialog(this);
        inquiryDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        inquiryDialog.setContentView(R.layout.activity_inquiry_confirmation);

        if (inquiryDialog.getWindow() != null) {
            inquiryDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        // 다이얼로그의 "Okay" 버튼
        Button okayButton = inquiryDialog.findViewById(R.id.okayButton);
        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inquiryDialog.dismiss(); // 문의 다이얼로그 닫기
            }
        });

        inquiryDialog.show();
    }
}
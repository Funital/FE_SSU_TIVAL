package com.example.fessutival;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ReservationActivity extends AppCompatActivity {

    private LinearLayout reservationLayout; // IT대학 주점 레이아웃 참조

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        reservationLayout = findViewById(R.id.reservationLayout); // IT대학 주점 레이아웃
        Button cancelReservationButton = findViewById(R.id.myCancelReservationButton);
        Button inquiryButton = findViewById(R.id.myReservationButton); // 문의 버튼

        // 취소 버튼 클릭 시 다이얼로그 표시
        cancelReservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCancelDialog(); // 취소 다이얼로그 띄우기
            }
        });

        // 문의 버튼 클릭 시 다이얼로그 표시
        inquiryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInquiryDialog(); // 문의 다이얼로그 띄우기
            }
        });
    }

    private void showCancelDialog() {
        // 사용자 정의 다이얼로그 생성
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.activity_cancel_confirmation);

        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        // 다이얼로그 버튼 연결
        Button cancelButton = dialog.findViewById(R.id.cancelButton);
        Button okayButton = dialog.findViewById(R.id.okayButton);

        // "Cancel" 버튼 클릭 시 다이얼로그 닫기
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // 다이얼로그 닫기
            }
        });

        // "Okay" 버튼 클릭 시
        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss(); // 다이얼로그 닫기
                showCompleteDialog(); // "취소되었습니다" 팝업 표시
            }
        });

        dialog.show();
    }

    private void showCompleteDialog() {
        // 완료 다이얼로그 생성
        Dialog completeDialog = new Dialog(this);
        completeDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        completeDialog.setContentView(R.layout.activity_complete_confirmation);

        if (completeDialog.getWindow() != null) {
            completeDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        // 완료 다이얼로그의 확인 버튼
        Button okayButton = completeDialog.findViewById(R.id.okayButton);
        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                completeDialog.dismiss(); // 다이얼로그 닫기

                // IT대학 주점 레이아웃 삭제
                if (reservationLayout != null) {
                    reservationLayout.setVisibility(View.GONE);
                }

                // "취소되었습니다" 메시지 표시
                Toast.makeText(ReservationActivity.this, "취소되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        completeDialog.show();
    }
    private void showInquiryDialog() {
        // Inquiry 다이얼로그 생성
        Dialog inquiryDialog = new Dialog(this);
        inquiryDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        inquiryDialog.setContentView(R.layout.activity_inquiry_confirmation); // 올바른 레이아웃 참조

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
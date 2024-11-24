package com.example.fessutival_re.reservation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.fessutival_re.R;

public class CancelConfirmationActivity extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // 사용자 정의 레이아웃 적용
        View view = inflater.inflate(R.layout.activity_cancel_confirmation, container, false);

        // 버튼 연결 및 동작 설정
        Button cancelButton = view.findViewById(R.id.cancelButton);
        Button okayButton = view.findViewById(R.id.okayButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CompleteConfirmationActivity로 이동
                Intent intent = new Intent(getActivity(), CompleteConfirmationActivity.class);
                intent.putExtra("message", "취소가 취소되었습니다.");
                startActivity(intent);
                dismiss(); // 다이얼로그 닫기
            }
        });

        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CompleteConfirmationActivity로 이동
                Intent intent = new Intent(getActivity(), CompleteConfirmationActivity.class);
                intent.putExtra("message", "예약이 취소되었습니다.");
                startActivity(intent);
                dismiss(); // 다이얼로그 닫기
            }
        });

        return view;
    }
}

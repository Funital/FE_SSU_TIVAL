package com.example.fessutival_re.bottomNavigation;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.fessutival_re.R;
import com.example.fessutival_re.databinding.ActivityCancelConfirmationBinding;
import com.example.fessutival_re.databinding.ActivityCompleteConfirmationBinding;
import com.example.fessutival_re.databinding.ActivityInquiryConfirmationBinding;
import com.example.fessutival_re.databinding.FragmentReservationBinding;

public class ReservationFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentReservationBinding binding;

    private String mParam1;
    private String mParam2;

    public ReservationFragment() {
        // Required empty public constructor
    }

    public static ReservationFragment newInstance(String param1, String param2) {
        ReservationFragment fragment = new ReservationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentReservationBinding.inflate(inflater, container, false);
        // 취소 버튼 클릭 리스너
        binding.myCancelReservationButton.setOnClickListener(v -> showCancelDialog(binding.reservationLayout));

        // 문의 버튼 클릭 리스너
        binding.myReservationButton.setOnClickListener(v -> showInquiryDialog());

        // 예약하기 버튼 클릭 리스너 추가
        binding.availableReservationButton1.setOnClickListener(v -> showReservationCompleteDialog((LinearLayout) v.getParent().getParent().getParent()));
        binding.availableReservationButton2.setOnClickListener(v -> showReservationCompleteDialog((LinearLayout) v.getParent().getParent().getParent()));
        binding.availableReservationButton3.setOnClickListener(v -> showReservationCompleteDialog((LinearLayout) v.getParent().getParent().getParent()));
        binding.availableReservationButton4.setOnClickListener(v -> showReservationCompleteDialog((LinearLayout) v.getParent().getParent().getParent()));
        binding.availableReservationButton5.setOnClickListener(v -> showReservationCompleteDialog((LinearLayout) v.getParent().getParent().getParent()));

        return binding.getRoot();
    }

    private void showCancelDialog(View reservationView) {
        ActivityCancelConfirmationBinding dialogBinding = ActivityCancelConfirmationBinding.inflate(getLayoutInflater());
        Dialog dialog = createCustomDialog(dialogBinding.getRoot());

        dialogBinding.cancelButton.setOnClickListener(v -> dialog.dismiss());
        dialogBinding.okayButton.setOnClickListener(v -> {
            dialog.dismiss();
            moveReservationToAvailable(reservationView);
            showCompleteDialog("예약이 취소되었습니다.");
        });

        dialog.show();
    }

    private void showCompleteDialog(String message) {
        ActivityCompleteConfirmationBinding dialogBinding = ActivityCompleteConfirmationBinding.inflate(getLayoutInflater());
        Dialog dialog = createCustomDialog(dialogBinding.getRoot());

        dialogBinding.okayButton.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
        });

        dialog.show();
    }

    private void showInquiryDialog() {
        ActivityInquiryConfirmationBinding dialogBinding = ActivityInquiryConfirmationBinding.inflate(getLayoutInflater());
        Dialog dialog = createCustomDialog(dialogBinding.getRoot());

        dialogBinding.okayButton.setOnClickListener(v -> dialog.dismiss());
        dialog.show();
    }

    private void showReservationCompleteDialog(LinearLayout reservationLayout) {
        ActivityCompleteConfirmationBinding dialogBinding = ActivityCompleteConfirmationBinding.inflate(getLayoutInflater());
        Dialog dialog = createCustomDialog(dialogBinding.getRoot());

        dialogBinding.CompleteTextView1.setText("예약 완료하기");
        dialogBinding.CompleteTextView2.setText("예약이 완료되었습니다.");

        dialogBinding.okayButton.setOnClickListener(v -> {
            dialog.dismiss();
            Toast.makeText(getContext(), "예약이 완료되었습니다.", Toast.LENGTH_SHORT).show();
            moveReservationToMyReservations(reservationLayout);
        });

        dialog.show();
    }

    private Dialog createCustomDialog(View contentView) {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(contentView);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }
        return dialog;
    }

    private void moveReservationToMyReservations(LinearLayout reservationLayout) {
        // 새로운 예약 레이아웃 생성
        LinearLayout newReservationLayout = new LinearLayout(getContext());
        newReservationLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        newReservationLayout.setOrientation(LinearLayout.HORIZONTAL);
        newReservationLayout.setPadding(16, 16, 16, 16);
        newReservationLayout.setBackgroundResource(R.drawable.view_border);

        // 기존 레이아웃의 내용을 새 레이아웃으로 복사
        for (int i = 0; i < reservationLayout.getChildCount(); i++) {
            View child = reservationLayout.getChildAt(i);
            if (child instanceof ImageView || child instanceof LinearLayout) {
                newReservationLayout.addView(cloneView(child));
            }
        }

        // 버튼 레이아웃 수정
        LinearLayout buttonLayout = (LinearLayout) newReservationLayout.getChildAt(1);
        LinearLayout newButtonLayout = (LinearLayout) buttonLayout.getChildAt(3);
        newButtonLayout.removeAllViews();
        // 문의 버튼 추가
        Button inquiryButton = new Button(getContext());
        inquiryButton.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        inquiryButton.setText("문의");
        inquiryButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.ssu_color)));
        inquiryButton.setTextColor(getResources().getColor(R.color.white));
        inquiryButton.setOnClickListener(v -> showInquiryDialog());
        newButtonLayout.addView(inquiryButton);

        // 취소 버튼 추가
        Button cancelButton = new Button(getContext());
        cancelButton.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        cancelButton.setText("취소");
        cancelButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.ssu_gray)));
        cancelButton.setTextColor(getResources().getColor(R.color.white));
        cancelButton.setOnClickListener(v -> showCancelDialog(newReservationLayout));
        newButtonLayout.addView(cancelButton);

        // 새 레이아웃을 나의 예약 섹션에 추가
        binding.myReservationsContainer.addView(newReservationLayout);

        // 기존 레이아웃 숨기기
        reservationLayout.setVisibility(View.GONE);
    }


    private void moveReservationToAvailable(View reservationView) {
        if (reservationView.getParent() instanceof ViewGroup) {
            ((ViewGroup) reservationView.getParent()).removeView(reservationView);

            // 예약 버튼으로 변경
            LinearLayout buttonLayout = (LinearLayout) ((LinearLayout) reservationView).getChildAt(1);
            LinearLayout newButtonLayout = (LinearLayout) buttonLayout.getChildAt(3);
            newButtonLayout.removeAllViews();

            Button reservationButton = new Button(getContext());
            reservationButton.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            reservationButton.setText("예약하기");
            reservationButton.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.ssu_color)));
            reservationButton.setTextColor(getResources().getColor(R.color.white));
            reservationButton.setOnClickListener(v -> showReservationCompleteDialog((LinearLayout) reservationView));
            newButtonLayout.addView(reservationButton);

            // 예약 가능한 주점 섹션에 추가
            binding.availableReservationsContainer.addView(reservationView);
        }
    }

    private View cloneView(View view) {
        if (view instanceof ImageView) {
            ImageView originalImage = (ImageView) view;
            ImageView newImage = new ImageView(getContext());
            newImage.setLayoutParams(originalImage.getLayoutParams());
            newImage.setImageDrawable(originalImage.getDrawable());
            newImage.setScaleType(originalImage.getScaleType());
            return newImage;
        } else if (view instanceof LinearLayout) {
            LinearLayout originalLayout = (LinearLayout) view;
            LinearLayout newLayout = new LinearLayout(getContext());
            newLayout.setLayoutParams(originalLayout.getLayoutParams());
            newLayout.setOrientation(originalLayout.getOrientation());
            for (int i = 0; i < originalLayout.getChildCount(); i++) {
                newLayout.addView(cloneView(originalLayout.getChildAt(i)));
            }
            return newLayout;
        } else if (view instanceof TextView) {
            TextView originalText = (TextView) view;
            TextView newText = new TextView(getContext());
            newText.setLayoutParams(originalText.getLayoutParams());
            newText.setText(originalText.getText());
            newText.setTextSize(TypedValue.COMPLEX_UNIT_PX, originalText.getTextSize());
            newText.setTypeface(originalText.getTypeface(), originalText.getTypeface().getStyle());
            return newText;
        }
        return null;
    }
}

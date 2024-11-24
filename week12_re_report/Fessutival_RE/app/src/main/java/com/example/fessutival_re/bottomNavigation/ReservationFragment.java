package com.example.fessutival_re.bottomNavigation;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.fessutival_re.R;

public class ReservationFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private LinearLayout reservationLayout;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reservation, container, false);

        reservationLayout = view.findViewById(R.id.reservationLayout);
        Button cancelReservationButton = view.findViewById(R.id.myCancelReservationButton);
        Button inquiryButton = view.findViewById(R.id.myReservationButton);

        // Cancel button click
        cancelReservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCancelDialog();
            }
        });

        // Inquiry button click
        inquiryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInquiryDialog();
            }
        });

        return view;
    }

    private void showCancelDialog() {
        Dialog dialog = new Dialog(getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.activity_cancel_confirmation);

        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        Button cancelButton = dialog.findViewById(R.id.cancelButton);
        Button okayButton = dialog.findViewById(R.id.okayButton);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                showCompleteDialog();
            }
        });

        dialog.show();
    }

    private void showCompleteDialog() {
        Dialog completeDialog = new Dialog(getContext());
        completeDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        completeDialog.setContentView(R.layout.activity_complete_confirmation);

        if (completeDialog.getWindow() != null) {
            completeDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        Button okayButton = completeDialog.findViewById(R.id.okayButton);
        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                completeDialog.dismiss();
                if (reservationLayout != null) {
                    reservationLayout.setVisibility(View.GONE);
                }
                Toast.makeText(getContext(), "취소되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        completeDialog.show();
    }

    private void showInquiryDialog() {
        Dialog inquiryDialog = new Dialog(getContext());
        inquiryDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        inquiryDialog.setContentView(R.layout.activity_inquiry_confirmation);

        if (inquiryDialog.getWindow() != null) {
            inquiryDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }

        Button okayButton = inquiryDialog.findViewById(R.id.okayButton);
        okayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inquiryDialog.dismiss();
            }
        });

        inquiryDialog.show();
    }

}

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_reservation, container, false);
//    }
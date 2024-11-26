package com.example.fessutival_re.bottomNavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.app.AlertDialog;

import androidx.fragment.app.Fragment;

import com.example.fessutival_re.R;

public class SettingsFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public SettingsFragment() {
        // Required empty public constructor
    }

    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();
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

        // Fragment의 레이아웃을 인플레이션합니다.
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        // 'view'를 사용하여 뷰를 찾습니다.
        ListView listView1 = view.findViewById(R.id.tv_setting_listview);
        ListView listView2 = view.findViewById(R.id.tv_setting_listview2);

        // 어댑터나 기타 UI 컴포넌트를 설정합니다.
        String[] items1 = {"비밀번호 변경"};
        String[] items2 = {"로그아웃","회원탈퇴"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getContext(), // Fragment에서 'getContext()'를 사용합니다.
                android.R.layout.simple_list_item_1,
                items1
        );

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(
                getContext(), // Context for the second adapter
                android.R.layout.simple_list_item_1,
                items2
        );

        listView1.setAdapter(adapter);
        listView2.setAdapter(adapter2);

        setListViewHeightBasedOnItems(listView1);
        setListViewHeightBasedOnItems(listView2);

        // **ListView1 클릭 이벤트 추가**
        listView1.setOnItemClickListener((parent, view1, position, id) -> {
            // 비밀번호 변경 클릭 시 다이얼로그 표시
            if (position == 0) {
                showPasswordChangeDialog();
            }
        });

        // **ListView2 클릭 이벤트 추가**
        listView2.setOnItemClickListener((parent, view12, position, id) -> {
            if (position == 0) {
                showLogoutDialog(); // 로그아웃 다이얼로그
            } else if (position == 1) {
                showDeleteAccountDialog(); // 회원탈퇴 다이얼로그
            }
        });

        return view;
    }

    public static void setListViewHeightBasedOnItems(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    // **비밀번호 변경 다이얼로그**
    private void showPasswordChangeDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("비밀번호 변경")
                .setMessage("비밀번호를 변경하시겠습니까?")
                .setPositiveButton("확인", (dialog, which) -> {
                    // 비밀번호 변경 로직 처리
                    Toast.makeText(getContext(), "비밀번호 변경 완료", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("취소", null)
                .show();
    }

    // **로그아웃 다이얼로그**
    private void showLogoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("로그아웃")
                .setMessage("정말 로그아웃하시겠습니까?")
                .setPositiveButton("로그아웃", (dialog, which) -> {
                    // 로그아웃 로직 처리
                    Toast.makeText(getContext(), "로그아웃되었습니다.", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("취소", null)
                .show();
    }

    // **회원탈퇴 다이얼로그**
    private void showDeleteAccountDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("회원탈퇴")
                .setMessage("정말 회원탈퇴하시겠습니까?")
                .setPositiveButton("회원탈퇴", (dialog, which) -> {
                    // 회원탈퇴 로직 처리
                    Toast.makeText(getContext(), "회원탈퇴 완료", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("취소", null)
                .show();
    }
}
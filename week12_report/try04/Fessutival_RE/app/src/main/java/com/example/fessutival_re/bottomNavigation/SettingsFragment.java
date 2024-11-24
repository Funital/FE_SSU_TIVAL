package com.example.fessutival_re.bottomNavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.fessutival_re.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {

//    String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SettingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
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

//        ListView listView = findViewById(R.id.tv_setting_listview);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_settings, container, false);

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
}
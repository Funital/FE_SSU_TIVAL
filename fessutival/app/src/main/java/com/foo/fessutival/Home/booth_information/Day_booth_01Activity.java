package com.foo.fessutival.Home.booth_information;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;

import com.foo.fessutival.R;

public class Day_booth_01Activity extends AppCompatActivity {

    private ImageButton searchButton;
    private SearchView boothSearchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_booth01); // XML 파일 연결

        // XML에서 뷰 가져오기
        searchButton = findViewById(R.id.booth_search_button);
        boothSearchView = findViewById(R.id.booth_search_view);

        // 초기 상태에서 SearchView 숨기기
        boothSearchView.setVisibility(View.GONE);

        // 검색 버튼 클릭 이벤트 설정
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (boothSearchView.getVisibility() == View.GONE) {
                    boothSearchView.setVisibility(View.VISIBLE); // SearchView 나타내기
                } else {
                    boothSearchView.setVisibility(View.GONE); // SearchView 숨기기
                }
            }
        });
    }
}
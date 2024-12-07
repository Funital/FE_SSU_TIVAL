package com.foo.fessutival.Home.booth_information;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;

public class Night_booth_01Activity extends AppCompatActivity {

    private ImageButton searchButton;
    private SearchView boothSearchView;
    private int dayCheck = 1;

    CardView nbooth101;
    CardView nbooth102;
    CardView nbooth103;
    CardView nbooth104;
    CardView nbooth105;
    CardView nbooth106;
    CardView nbooth107;
    CardView nbooth108;
    CardView nbooth109;
    CardView nbooth201;
    CardView nbooth202;
    CardView nbooth203;
    CardView nbooth204;
    CardView nbooth205;
    CardView nbooth206;
    CardView nbooth207;
    CardView nbooth208;
    CardView nbooth209;
    CardView nbooth301;
    CardView nbooth302;
    CardView nbooth303;
    CardView nbooth304;
    CardView nbooth305;
    CardView nbooth306;
    CardView nbooth307;
    CardView nbooth308;
    CardView nbooth309;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_booth01); // XML 파일 연결

        Button nday1Button = findViewById(R.id.nday1_button);
        Button nday2Button = findViewById(R.id.nday2_button);
        Button nday3Button = findViewById(R.id.nday3_button);

        ImageView ndayBooth1Map = findViewById(R.id.nday1_booth_map_image1);
        ImageView ndayBooth2Map = findViewById(R.id.nday1_booth_map_image2);
        ImageView ndayBooth3Map = findViewById(R.id.nday1_booth_map_image3);

        String nday1URL = "https://drive.google.com/uc?export=view&id=12d2ZW9XAfuyt0FiGsrIj00t8JD_rxBeb";
        String nday2URL = "https://drive.google.com/uc?export=view&id=1XXo2Uj6fZ_ceOMVdhGyc8_PHdTZRaTKu";
        String nday3URL = "https://drive.google.com/uc?export=view&id=1wjedVtiCUCW_sxKSguB2CXiTfXSMg0fz";

        boothSearchView = findViewById(R.id.nbooth_search_view);
        dayCheck = 1;
        Switch boothSwitch = findViewById(R.id.nbooth_switch);

        nbooth101 = findViewById(R.id.nday_booth_card_101);
        nbooth102 = findViewById(R.id.nday_booth_card_102);
        nbooth103 = findViewById(R.id.nday_booth_card_103);
        nbooth104 = findViewById(R.id.nday_booth_card_104);
        nbooth105 = findViewById(R.id.nday_booth_card_105);
        nbooth106 = findViewById(R.id.nday_booth_card_106);
        nbooth107 = findViewById(R.id.nday_booth_card_107);
        nbooth108 = findViewById(R.id.nday_booth_card_108);
         nbooth109 = findViewById(R.id.nday_booth_card_109);
         nbooth201 = findViewById(R.id.nday_booth_card_201);
         nbooth202 = findViewById(R.id.nday_booth_card_202);
         nbooth203 = findViewById(R.id.nday_booth_card_203);
         nbooth204 = findViewById(R.id.nday_booth_card_204);
         nbooth205 = findViewById(R.id.nday_booth_card_205);
         nbooth206 = findViewById(R.id.nday_booth_card_206);
         nbooth207 = findViewById(R.id.nday_booth_card_207);
         nbooth208 = findViewById(R.id.nday_booth_card_208);
         nbooth209 = findViewById(R.id.nday_booth_card_209);
         nbooth301 = findViewById(R.id.nday_booth_card_301);
         nbooth302 = findViewById(R.id.nday_booth_card_302);
         nbooth303 = findViewById(R.id.nday_booth_card_303);
         nbooth304 = findViewById(R.id.nday_booth_card_304);
         nbooth305 = findViewById(R.id.nday_booth_card_305);
         nbooth306 = findViewById(R.id.nday_booth_card_306);
         nbooth307 = findViewById(R.id.nday_booth_card_307);
         nbooth308 = findViewById(R.id.nday_booth_card_308);
         nbooth309 = findViewById(R.id.nday_booth_card_309);

        TextView n1011 = findViewById(R.id.textn1011);
        TextView n1012 = findViewById(R.id.textn1012);
        TextView n1013 = findViewById(R.id.textn1013);
        TextView n1014 = findViewById(R.id.textn1014);
        TextView n1021 = findViewById(R.id.textn1021);
        TextView n1022 = findViewById(R.id.textn1022);
        TextView n1023 = findViewById(R.id.textn1023);
        TextView n1024 = findViewById(R.id.textn1024);
        TextView n1031 = findViewById(R.id.textn1031);
        TextView n1032 = findViewById(R.id.textn1032);
        TextView n1033 = findViewById(R.id.textn1033);
        TextView n1034 = findViewById(R.id.textn1034);
        TextView n1041 = findViewById(R.id.textn1041);
        TextView n1042 = findViewById(R.id.textn1042);
        TextView n1043 = findViewById(R.id.textn1043);
        TextView n1044 = findViewById(R.id.textn1044);
        TextView n1051 = findViewById(R.id.textn1051);
        TextView n1052 = findViewById(R.id.textn1052);
        TextView n1053 = findViewById(R.id.textn1053);
        TextView n1054 = findViewById(R.id.textn1054);
        TextView n1061 = findViewById(R.id.textn1061);
        TextView n1062 = findViewById(R.id.textn1062);
        TextView n1063 = findViewById(R.id.textn1063);
        TextView n1064 = findViewById(R.id.textn1064);
        TextView n1071 = findViewById(R.id.textn1071);
        TextView n1072 = findViewById(R.id.textn1072);
        TextView n1073 = findViewById(R.id.textn1073);
        TextView n1074 = findViewById(R.id.textn1074);
        TextView n1081 = findViewById(R.id.textn1081);
        TextView n1082 = findViewById(R.id.textn1082);
        TextView n1083 = findViewById(R.id.textn1083);
        TextView n1084 = findViewById(R.id.textn1084);
        TextView n1091 = findViewById(R.id.textn1091);
        TextView n1092 = findViewById(R.id.textn1092);
        TextView n1093 = findViewById(R.id.textn1093);
        TextView n1094 = findViewById(R.id.textn1094);
        TextView n2011 = findViewById(R.id.textn2011);
        TextView n2012 = findViewById(R.id.textn2012);
        TextView n2013 = findViewById(R.id.textn2013);
        TextView n2014 = findViewById(R.id.textn2014);
        TextView n2021 = findViewById(R.id.textn2021);
        TextView n2022 = findViewById(R.id.textn2022);
        TextView n2023 = findViewById(R.id.textn2023);
        TextView n2024 = findViewById(R.id.textn2024);
        TextView n2031 = findViewById(R.id.textn2031);
        TextView n2032 = findViewById(R.id.textn2032);
        TextView n2033 = findViewById(R.id.textn2033);
        TextView n2034 = findViewById(R.id.textn2034);
        TextView n2041 = findViewById(R.id.textn2041);
        TextView n2042 = findViewById(R.id.textn2042);
        TextView n2043 = findViewById(R.id.textn2043);
        TextView n2044 = findViewById(R.id.textn2044);
        TextView n2051 = findViewById(R.id.textn2051);
        TextView n2052 = findViewById(R.id.textn2052);
        TextView n2053 = findViewById(R.id.textn2053);
        TextView n2054 = findViewById(R.id.textn2054);
        TextView n2061 = findViewById(R.id.textn2061);
        TextView n2062 = findViewById(R.id.textn2062);
        TextView n2063 = findViewById(R.id.textn2063);
        TextView n2064 = findViewById(R.id.textn2064);
        TextView n2071 = findViewById(R.id.textn2071);
        TextView n2072 = findViewById(R.id.textn2072);
        TextView n2073 = findViewById(R.id.textn2073);
        TextView n2074 = findViewById(R.id.textn2074);
        TextView n2081 = findViewById(R.id.textn2081);
        TextView n2082 = findViewById(R.id.textn2082);
        TextView n2083 = findViewById(R.id.textn2083);
        TextView n2084 = findViewById(R.id.textn2084);
        TextView n2091 = findViewById(R.id.textn2091);
        TextView n2092 = findViewById(R.id.textn2092);
        TextView n2093 = findViewById(R.id.textn2093);
        TextView n2094 = findViewById(R.id.textn2094);
        TextView n3011 = findViewById(R.id.textn3011);
        TextView n3012 = findViewById(R.id.textn3012);
        TextView n3013 = findViewById(R.id.textn3013);
        TextView n3014 = findViewById(R.id.textn3014);
        TextView n3021 = findViewById(R.id.textn3021);
        TextView n3022 = findViewById(R.id.textn3022);
        TextView n3023 = findViewById(R.id.textn3023);
        TextView n3024 = findViewById(R.id.textn3024);
        TextView n3031 = findViewById(R.id.textn3031);
        TextView n3032 = findViewById(R.id.textn3032);
        TextView n3033 = findViewById(R.id.textn3033);
        TextView n3034 = findViewById(R.id.textn3034);
        TextView n3041 = findViewById(R.id.textn3041);
        TextView n3042 = findViewById(R.id.textn3042);
        TextView n3043 = findViewById(R.id.textn3043);
        TextView n3044 = findViewById(R.id.textn3044);
        TextView n3051 = findViewById(R.id.textn3051);
        TextView n3052 = findViewById(R.id.textn3052);
        TextView n3053 = findViewById(R.id.textn3053);
        TextView n3054 = findViewById(R.id.textn3054);
        TextView n3061 = findViewById(R.id.textn3061);
        TextView n3062 = findViewById(R.id.textn3062);
        TextView n3063 = findViewById(R.id.textn3063);
        TextView n3064 = findViewById(R.id.textn3064);
        TextView n3071 = findViewById(R.id.textn3071);
        TextView n3072 = findViewById(R.id.textn3072);
        TextView n3073 = findViewById(R.id.textn3073);
        TextView n3074 = findViewById(R.id.textn3074);
        TextView n3081 = findViewById(R.id.textn3081);
        TextView n3082 = findViewById(R.id.textn3082);
        TextView n3083 = findViewById(R.id.textn3083);
        TextView n3084 = findViewById(R.id.textn3084);
        TextView n3091 = findViewById(R.id.textn3091);
        TextView n3092 = findViewById(R.id.textn3092);
        TextView n3093 = findViewById(R.id.textn3093);
        TextView n3094 = findViewById(R.id.textn3094);


        Glide.with(this)
                .load(nday1URL)
                .into(ndayBooth1Map);
        Glide.with(this)
                .load(nday2URL)
                .into(ndayBooth2Map);
        Glide.with(this)
                .load(nday3URL)
                .into(ndayBooth3Map);

        nbooth101.setVisibility(View.VISIBLE);
        nbooth102.setVisibility(View.VISIBLE);
        nbooth103.setVisibility(View.VISIBLE);
        nbooth104.setVisibility(View.VISIBLE);
        nbooth105.setVisibility(View.VISIBLE);
        nbooth106.setVisibility(View.VISIBLE);
        nbooth107.setVisibility(View.VISIBLE);
        nbooth108.setVisibility(View.VISIBLE);
        nbooth109.setVisibility(View.VISIBLE);
        nbooth201.setVisibility(View.GONE);
        nbooth202.setVisibility(View.GONE);
        nbooth203.setVisibility(View.GONE);
        nbooth204.setVisibility(View.GONE);
        nbooth205.setVisibility(View.GONE);
        nbooth206.setVisibility(View.GONE);
        nbooth207.setVisibility(View.GONE);
        nbooth208.setVisibility(View.GONE);
        nbooth209.setVisibility(View.GONE);
        nbooth301.setVisibility(View.GONE);
        nbooth302.setVisibility(View.GONE);
        nbooth303.setVisibility(View.GONE);
        nbooth304.setVisibility(View.GONE);
        nbooth305.setVisibility(View.GONE);
        nbooth306.setVisibility(View.GONE);
        nbooth307.setVisibility(View.GONE);
        nbooth308.setVisibility(View.GONE);
        nbooth309.setVisibility(View.GONE);

        boothSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // 검색어 제출 시 처리
                updateViews(query, n1011, n1012, n1013, n1014,
                        n1021, n1022, n1023, n1024,
                        n1031, n1032, n1033, n1034,
                        n1041, n1042, n1043, n1044,
                        n1051, n1052, n1053, n1054,
                        n1061, n1062, n1063, n1064,
                        n1071, n1072, n1073, n1074,
                        n1081, n1082, n1083, n1084,
                        n1091, n1092, n1093, n1094,
                        n2011, n2012, n2013, n2014,
                        n2021, n2022, n2023, n2024,
                        n2031, n2032, n2033, n2034,
                        n2041, n2042, n2043, n2044,
                        n2051, n2052, n2053, n2054,
                        n2061, n2062, n2063, n2064,
                        n2071, n2072, n2073, n2074,
                        n2081, n2082, n2083, n2084,
                        n2091, n2092, n2093, n2094,
                        n3011, n3012, n3013, n3014,
                        n3021, n3022, n3023, n3024,
                        n3031, n3032, n3033, n3034,
                        n3041, n3042, n3043, n3044,
                        n3051, n3052, n3053, n3054,
                        n3061, n3062, n3063, n3064,
                        n3071, n3072, n3073, n3074,
                        n3081, n3082, n3083, n3084,
                        n3091, n3092, n3093, n3094);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // 검색어 변경 시 처리
                updateViews(newText, n1011, n1012, n1013, n1014,
                        n1021, n1022, n1023, n1024,
                        n1031, n1032, n1033, n1034,
                        n1041, n1042, n1043, n1044,
                        n1051, n1052, n1053, n1054,
                        n1061, n1062, n1063, n1064,
                        n1071, n1072, n1073, n1074,
                        n1081, n1082, n1083, n1084,
                        n1091, n1092, n1093, n1094,
                        n2011, n2012, n2013, n2014,
                        n2021, n2022, n2023, n2024,
                        n2031, n2032, n2033, n2034,
                        n2041, n2042, n2043, n2044,
                        n2051, n2052, n2053, n2054,
                        n2061, n2062, n2063, n2064,
                        n2071, n2072, n2073, n2074,
                        n2081, n2082, n2083, n2084,
                        n2091, n2092, n2093, n2094,
                        n3011, n3012, n3013, n3014,
                        n3021, n3022, n3023, n3024,
                        n3031, n3032, n3033, n3034,
                        n3041, n3042, n3043, n3044,
                        n3051, n3052, n3053, n3054,
                        n3061, n3062, n3063, n3064,
                        n3071, n3072, n3073, n3074,
                        n3081, n3082, n3083, n3084,
                        n3091, n3092, n3093, n3094);
                return true;
            }
        });

        // XML에서 뷰 가져오기
        searchButton = findViewById(R.id.nbooth_search_button);
        boothSearchView = findViewById(R.id.nbooth_search_view);

        // 초기 상태에서 SearchView 숨기기
        boothSearchView.setVisibility(View.GONE);

        boothSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){

            }   else{
                Intent intent = new Intent(Night_booth_01Activity.this, Day_booth_01Activity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }
        });

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

        nday1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ndayBooth1Map.setVisibility(View.VISIBLE);
                ndayBooth2Map.setVisibility(View.GONE);
                ndayBooth3Map.setVisibility(View.GONE);
                dayCheck = 1;

                nbooth101.setVisibility(View.VISIBLE);
                nbooth102.setVisibility(View.VISIBLE);
                nbooth103.setVisibility(View.VISIBLE);
                nbooth104.setVisibility(View.VISIBLE);
                nbooth105.setVisibility(View.VISIBLE);
                nbooth106.setVisibility(View.VISIBLE);
                nbooth107.setVisibility(View.VISIBLE);
                nbooth108.setVisibility(View.VISIBLE);
                nbooth109.setVisibility(View.VISIBLE);
                nbooth201.setVisibility(View.GONE);
                nbooth202.setVisibility(View.GONE);
                nbooth203.setVisibility(View.GONE);
                nbooth204.setVisibility(View.GONE);
                nbooth205.setVisibility(View.GONE);
                nbooth206.setVisibility(View.GONE);
                nbooth207.setVisibility(View.GONE);
                nbooth208.setVisibility(View.GONE);
                nbooth209.setVisibility(View.GONE);
                nbooth301.setVisibility(View.GONE);
                nbooth302.setVisibility(View.GONE);
                nbooth303.setVisibility(View.GONE);
                nbooth304.setVisibility(View.GONE);
                nbooth305.setVisibility(View.GONE);
                nbooth306.setVisibility(View.GONE);
                nbooth307.setVisibility(View.GONE);
                nbooth308.setVisibility(View.GONE);
                nbooth309.setVisibility(View.GONE);
            }
        });

        nday2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ndayBooth1Map.setVisibility(View.GONE);
                ndayBooth2Map.setVisibility(View.VISIBLE);
                ndayBooth3Map.setVisibility(View.GONE);
                dayCheck = 2;

                nbooth101.setVisibility(View.GONE);
                nbooth102.setVisibility(View.GONE);
                nbooth103.setVisibility(View.GONE);
                nbooth104.setVisibility(View.GONE);
                nbooth105.setVisibility(View.GONE);
                nbooth106.setVisibility(View.GONE);
                nbooth107.setVisibility(View.GONE);
                nbooth108.setVisibility(View.GONE);
                nbooth109.setVisibility(View.GONE);
                nbooth201.setVisibility(View.VISIBLE);
                nbooth202.setVisibility(View.VISIBLE);
                nbooth203.setVisibility(View.VISIBLE);
                nbooth204.setVisibility(View.VISIBLE);
                nbooth205.setVisibility(View.VISIBLE);
                nbooth206.setVisibility(View.VISIBLE);
                nbooth207.setVisibility(View.VISIBLE);
                nbooth208.setVisibility(View.VISIBLE);
                nbooth209.setVisibility(View.VISIBLE);
                nbooth301.setVisibility(View.GONE);
                nbooth302.setVisibility(View.GONE);
                nbooth303.setVisibility(View.GONE);
                nbooth304.setVisibility(View.GONE);
                nbooth305.setVisibility(View.GONE);
                nbooth306.setVisibility(View.GONE);
                nbooth307.setVisibility(View.GONE);
                nbooth308.setVisibility(View.GONE);
                nbooth309.setVisibility(View.GONE);
            }
        });

        nday3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ndayBooth1Map.setVisibility(View.GONE);
                ndayBooth2Map.setVisibility(View.GONE);
                ndayBooth3Map.setVisibility(View.VISIBLE);
                dayCheck = 3;

                nbooth101.setVisibility(View.GONE);
                nbooth102.setVisibility(View.GONE);
                nbooth103.setVisibility(View.GONE);
                nbooth104.setVisibility(View.GONE);
                nbooth105.setVisibility(View.GONE);
                nbooth106.setVisibility(View.GONE);
                nbooth107.setVisibility(View.GONE);
                nbooth108.setVisibility(View.GONE);
                nbooth109.setVisibility(View.GONE);
                nbooth201.setVisibility(View.GONE);
                nbooth202.setVisibility(View.GONE);
                nbooth203.setVisibility(View.GONE);
                nbooth204.setVisibility(View.GONE);
                nbooth205.setVisibility(View.GONE);
                nbooth206.setVisibility(View.GONE);
                nbooth207.setVisibility(View.GONE);
                nbooth208.setVisibility(View.GONE);
                nbooth209.setVisibility(View.GONE);
                nbooth301.setVisibility(View.VISIBLE);
                nbooth302.setVisibility(View.VISIBLE);
                nbooth303.setVisibility(View.VISIBLE);
                nbooth304.setVisibility(View.VISIBLE);
                nbooth305.setVisibility(View.VISIBLE);
                nbooth306.setVisibility(View.VISIBLE);
                nbooth307.setVisibility(View.VISIBLE);
                nbooth308.setVisibility(View.VISIBLE);
                nbooth309.setVisibility(View.VISIBLE);
            }
        });
    }

    private void updateViews(String query, TextView n1011, TextView n1012, TextView n1013, TextView n1014,
                             TextView n1021, TextView n1022, TextView n1023, TextView n1024,
                             TextView n1031, TextView n1032, TextView n1033, TextView n1034,
                             TextView n1041, TextView n1042, TextView n1043, TextView n1044,
                             TextView n1051, TextView n1052, TextView n1053, TextView n1054,
                             TextView n1061, TextView n1062, TextView n1063, TextView n1064,
                             TextView n1071, TextView n1072, TextView n1073, TextView n1074,
                             TextView n1081, TextView n1082, TextView n1083, TextView n1084,
                             TextView n1091, TextView n1092, TextView n1093, TextView n1094,
                             TextView n2011, TextView n2012, TextView n2013, TextView n2014,
                             TextView n2021, TextView n2022, TextView n2023, TextView n2024,
                             TextView n2031, TextView n2032, TextView n2033, TextView n2034,
                             TextView n2041, TextView n2042, TextView n2043, TextView n2044,
                             TextView n2051, TextView n2052, TextView n2053, TextView n2054,
                             TextView n2061, TextView n2062, TextView n2063, TextView n2064,
                             TextView n2071, TextView n2072, TextView n2073, TextView n2074,
                             TextView n2081, TextView n2082, TextView n2083, TextView n2084,
                             TextView n2091, TextView n2092, TextView n2093, TextView n2094,
                             TextView n3011, TextView n3012, TextView n3013, TextView n3014,
                             TextView n3021, TextView n3022, TextView n3023, TextView n3024,
                             TextView n3031, TextView n3032, TextView n3033, TextView n3034,
                             TextView n3041, TextView n3042, TextView n3043, TextView n3044,
                             TextView n3051, TextView n3052, TextView n3053, TextView n3054,
                             TextView n3061, TextView n3062, TextView n3063, TextView n3064,
                             TextView n3071, TextView n3072, TextView n3073, TextView n3074,
                             TextView n3081, TextView n3082, TextView n3083, TextView n3084,
                             TextView n3091, TextView n3092, TextView n3093, TextView n3094) {
        // 모든 뷰 숨기기
        nbooth101.setVisibility(View.GONE);
        nbooth102.setVisibility(View.GONE);
        nbooth103.setVisibility(View.GONE);
        nbooth104.setVisibility(View.GONE);
        nbooth105.setVisibility(View.GONE);
        nbooth106.setVisibility(View.GONE);
        nbooth107.setVisibility(View.GONE);
        nbooth108.setVisibility(View.GONE);
        nbooth109.setVisibility(View.GONE);
        nbooth201.setVisibility(View.GONE);
        nbooth202.setVisibility(View.GONE);
        nbooth203.setVisibility(View.GONE);
        nbooth204.setVisibility(View.GONE);
        nbooth205.setVisibility(View.GONE);
        nbooth206.setVisibility(View.GONE);
        nbooth207.setVisibility(View.GONE);
        nbooth208.setVisibility(View.GONE);
        nbooth209.setVisibility(View.GONE);
        nbooth301.setVisibility(View.GONE);
        nbooth302.setVisibility(View.GONE);
        nbooth303.setVisibility(View.GONE);
        nbooth304.setVisibility(View.GONE);
        nbooth305.setVisibility(View.GONE);
        nbooth306.setVisibility(View.GONE);
        nbooth307.setVisibility(View.GONE);
        nbooth308.setVisibility(View.GONE);
        nbooth309.setVisibility(View.GONE);

        if (dayCheck == 1){
            if (n1011.getText().toString().contains(query) || n1012.getText().toString().contains(query) || n1013.getText().toString().contains(query) || n1014.getText().toString().contains(query)) {
                nbooth101.setVisibility(View.VISIBLE);
            }
            if (n1021.getText().toString().contains(query) || n1022.getText().toString().contains(query) || n1023.getText().toString().contains(query) || n1024.getText().toString().contains(query)) {
                nbooth102.setVisibility(View.VISIBLE);
            }
            if (n1031.getText().toString().contains(query) || n1032.getText().toString().contains(query) || n1033.getText().toString().contains(query) || n1034.getText().toString().contains(query)) {
                nbooth103.setVisibility(View.VISIBLE);
            }
            if (n1041.getText().toString().contains(query) || n1042.getText().toString().contains(query) || n1043.getText().toString().contains(query) || n1044.getText().toString().contains(query)) {
                nbooth104.setVisibility(View.VISIBLE);
            }
            if (n1051.getText().toString().contains(query) || n1052.getText().toString().contains(query) || n1053.getText().toString().contains(query) || n1054.getText().toString().contains(query)) {
                nbooth105.setVisibility(View.VISIBLE);
            }
            if (n1061.getText().toString().contains(query) || n1062.getText().toString().contains(query) || n1063.getText().toString().contains(query) || n1064.getText().toString().contains(query)) {
                nbooth106.setVisibility(View.VISIBLE);
            }
            if (n1071.getText().toString().contains(query) || n1072.getText().toString().contains(query) || n1073.getText().toString().contains(query) || n1074.getText().toString().contains(query)) {
                nbooth107.setVisibility(View.VISIBLE);
            }
            if (n1081.getText().toString().contains(query) || n1082.getText().toString().contains(query) || n1083.getText().toString().contains(query) || n1084.getText().toString().contains(query)) {
                nbooth108.setVisibility(View.VISIBLE);
            }
            if (n1091.getText().toString().contains(query) || n1092.getText().toString().contains(query) || n1093.getText().toString().contains(query) || n1094.getText().toString().contains(query)) {
                nbooth109.setVisibility(View.VISIBLE);
            }
        }else if (dayCheck == 3){
            if (n3011.getText().toString().contains(query) || n3012.getText().toString().contains(query) || n3013.getText().toString().contains(query) || n3014.getText().toString().contains(query)) {
                nbooth301.setVisibility(View.VISIBLE);
            }
            if (n3021.getText().toString().contains(query) || n3022.getText().toString().contains(query) || n3023.getText().toString().contains(query) || n3024.getText().toString().contains(query)) {
                nbooth302.setVisibility(View.VISIBLE);
            }
            if (n3031.getText().toString().contains(query) || n3032.getText().toString().contains(query) || n3033.getText().toString().contains(query) || n3034.getText().toString().contains(query)) {
                nbooth303.setVisibility(View.VISIBLE);
            }
            if (n3041.getText().toString().contains(query) || n3042.getText().toString().contains(query) || n3043.getText().toString().contains(query) || n3044.getText().toString().contains(query)) {
                nbooth304.setVisibility(View.VISIBLE);
            }
            if (n3051.getText().toString().contains(query) || n3052.getText().toString().contains(query) || n3053.getText().toString().contains(query) || n3054.getText().toString().contains(query)) {
                nbooth305.setVisibility(View.VISIBLE);
            }
            if (n3061.getText().toString().contains(query) || n3062.getText().toString().contains(query) || n3063.getText().toString().contains(query) || n3064.getText().toString().contains(query)) {
                nbooth306.setVisibility(View.VISIBLE);
            }
            if (n3071.getText().toString().contains(query) || n3072.getText().toString().contains(query) || n3073.getText().toString().contains(query) || n3074.getText().toString().contains(query)) {
                nbooth307.setVisibility(View.VISIBLE);
            }
            if (n3081.getText().toString().contains(query) || n3082.getText().toString().contains(query) || n3083.getText().toString().contains(query) || n3084.getText().toString().contains(query)) {
                nbooth308.setVisibility(View.VISIBLE);
            }
            if (n3091.getText().toString().contains(query) || n3092.getText().toString().contains(query) || n3093.getText().toString().contains(query) || n3094.getText().toString().contains(query)) {
                nbooth309.setVisibility(View.VISIBLE);
            }
        }else if (dayCheck == 2){
            if (n2011.getText().toString().contains(query) || n2012.getText().toString().contains(query) || n2013.getText().toString().contains(query) || n2014.getText().toString().contains(query)) {
                nbooth201.setVisibility(View.VISIBLE);
            }
            if (n2021.getText().toString().contains(query) || n2022.getText().toString().contains(query) || n2023.getText().toString().contains(query) || n2024.getText().toString().contains(query)) {
                nbooth202.setVisibility(View.VISIBLE);
            }
            if (n2031.getText().toString().contains(query) || n2032.getText().toString().contains(query) || n2033.getText().toString().contains(query) || n2034.getText().toString().contains(query)) {
                nbooth203.setVisibility(View.VISIBLE);
            }
            if (n2041.getText().toString().contains(query) || n2042.getText().toString().contains(query) || n2043.getText().toString().contains(query) || n2044.getText().toString().contains(query)) {
                nbooth204.setVisibility(View.VISIBLE);
            }
            if (n2051.getText().toString().contains(query) || n2052.getText().toString().contains(query) || n2053.getText().toString().contains(query) || n2054.getText().toString().contains(query)) {
                nbooth205.setVisibility(View.VISIBLE);
            }
            if (n2061.getText().toString().contains(query) || n2062.getText().toString().contains(query) || n2063.getText().toString().contains(query) || n2064.getText().toString().contains(query)) {
                nbooth206.setVisibility(View.VISIBLE);
            }
            if (n2071.getText().toString().contains(query) || n2072.getText().toString().contains(query) || n2073.getText().toString().contains(query) || n2074.getText().toString().contains(query)) {
                nbooth207.setVisibility(View.VISIBLE);
            }
            if (n2081.getText().toString().contains(query) || n2082.getText().toString().contains(query) || n2083.getText().toString().contains(query) || n2084.getText().toString().contains(query)) {
                nbooth208.setVisibility(View.VISIBLE);
            }
            if (n2091.getText().toString().contains(query) || n2092.getText().toString().contains(query) || n2093.getText().toString().contains(query) || n2094.getText().toString().contains(query)) {
                nbooth209.setVisibility(View.VISIBLE);
            }
        }
    }
}
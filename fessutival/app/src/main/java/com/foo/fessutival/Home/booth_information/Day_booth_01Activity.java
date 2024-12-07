package com.foo.fessutival.Home.booth_information;

import android.content.Intent;
import android.net.ipsec.ike.exceptions.InvalidMajorVersionException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.foo.fessutival.Home.booth_information.day_booth1.Day_Booth1_21;
import com.foo.fessutival.Home.booth_information.day_booth1.Day_Booth1_28;
import com.foo.fessutival.R;

import org.w3c.dom.Text;

public class Day_booth_01Activity extends AppCompatActivity {

    private ImageButton searchButton;
    private SearchView boothSearchView;
    private int dayCheck;

    CardView dayBoothCard0102;
    CardView dayBoothCard0304;
    CardView dayBoothCard05;
    CardView dayBoothCard06;
    CardView dayBoothCard07;
    CardView dayBoothCard08;
    CardView dayBoothCard0910;
    CardView dayBoothCard1112;
    CardView dayBoothCard1314;
    CardView dayBoothCard1516;
    CardView dayBoothCard17;
    CardView dayBoothCard18;
    CardView dayBoothCard19;
    CardView dayBoothCard20;
    CardView dayBoothCard21;
    CardView dayBoothCard22;
    CardView dayBoothCard23;
    CardView dayBoothCard24;
    CardView dayBoothCard25;
    CardView dayBoothCard26;
    CardView dayBoothCard27;
    CardView dayBoothCard28;
    CardView dayBoothCard29;
    CardView dayBoothCard3031;
    CardView dayBoothCard3233;
    CardView dayBoothCard3435;
    CardView dayBoothCard3637;
    CardView dayBoothCard3839;
    CardView dayBoothCard4041;
    CardView dayBoothCard4243;
    CardView dayBoothCard44;
    CardView dayBoothCard45;
    CardView dayBoothCard46;
    CardView dayBoothCard47;
    CardView dayBoothCard4849;
    CardView dayBoothCard50;
    CardView dayBoothCard51;
    CardView dayBoothCard5253;
    CardView dayBoothCard54;
    CardView dayBoothCard55;
    CardView dayBoothCard5657;
    CardView dayBoothCard5859;
    CardView dayBoothCard60;
    CardView dayBoothCard61;
    CardView dayBoothCard6263;
    CardView dayBoothCard64;
    CardView dayBoothCard65;
    CardView dayBoothCard66;
    CardView dayBoothCard67;
    CardView dayBoothCard6869;
    CardView dayBoothCard7071;
    CardView dayBoothCard7273;
    CardView dayBoothCard74;
    CardView dayBoothCard7576;
    CardView dayBoothCard7778;
    CardView dayBoothCard79;
    CardView dayBoothCard80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_booth01); // XML 파일 연결

        dayCheck = 1;
        Switch boothSwitch = findViewById(R.id.booth_switch);
        boothSearchView = findViewById(R.id.booth_search_view);

        Button day1Button = findViewById(R.id.day1_button);
        Button day2Button = findViewById(R.id.day2_button);
        Button day3Button = findViewById(R.id.day3_button);

        CheckBox allCheckBox = findViewById(R.id.all_check_box);
        CheckBox foodCheckBox = findViewById(R.id.food_check_box);
        CheckBox dessertCheckBox = findViewById(R.id.dessert_check_box);
        CheckBox activityCheckBox = findViewById(R.id.activity_check_box);
        CheckBox eventCheckBox = findViewById(R.id.event_check_box);

        ImageView dayBooth1Map = findViewById(R.id.day_booth_map_image1);
        ImageView dayBooth2Map = findViewById(R.id.day_booth_map_image2);
        ImageView dayBooth3Map = findViewById(R.id.day_booth_map_image3);

        String day1URL = "https://drive.google.com/uc?export=view&id=1rmb3US32IkjC3PE4dhZbyYJjtENQVrZf";
        String day2URL = "https://drive.google.com/uc?export=view&id=1O7RB8D6oZFK9iBXtnfsFvhwLnX3Ub-m8";
        String day3URL = "https://drive.google.com/uc?export=view&id=1cLFeggxFqBtJAh-4ZXDAHZzEN74ABSYd";

         dayBoothCard0102 = findViewById(R.id.day_booth_card_0102);
         dayBoothCard0304 = findViewById(R.id.day_booth_card_0304);
         dayBoothCard05 = findViewById(R.id.day_booth_card_05);
         dayBoothCard06 = findViewById(R.id.day_booth_card_06);
         dayBoothCard07 = findViewById(R.id.day_booth_card_07);
         dayBoothCard08 = findViewById(R.id.day_booth_card_08);
         dayBoothCard0910 = findViewById(R.id.day_booth_card_0910);
         dayBoothCard1112 = findViewById(R.id.day_booth_card_1112);
         dayBoothCard1314 = findViewById(R.id.day_booth_card_1314);
         dayBoothCard1516 = findViewById(R.id.day_booth_card_1516);
         dayBoothCard17 = findViewById(R.id.day_booth_card_17);
         dayBoothCard18 = findViewById(R.id.day_booth_card_18);
         dayBoothCard19 = findViewById(R.id.day_booth_card_19);
         dayBoothCard20 = findViewById(R.id.day_booth_card_20);
         dayBoothCard21 = findViewById(R.id.day_booth_card_21);
         dayBoothCard22 = findViewById(R.id.day_booth_card_22);
         dayBoothCard23 = findViewById(R.id.day_booth_card_23);
         dayBoothCard24 = findViewById(R.id.day_booth_card_24);
         dayBoothCard25 = findViewById(R.id.day_booth_card_25);
         dayBoothCard26 = findViewById(R.id.day_booth_card_26);
         dayBoothCard27 = findViewById(R.id.day_booth_card_27);
         dayBoothCard28 = findViewById(R.id.day_booth_card_28);
         dayBoothCard29 = findViewById(R.id.day_booth_card_29);
         dayBoothCard3031 = findViewById(R.id.day_booth_card_3031);
         dayBoothCard3233 = findViewById(R.id.day_booth_card_3233);
         dayBoothCard3435 = findViewById(R.id.day_booth_card_3435);
         dayBoothCard3637 = findViewById(R.id.day_booth_card_3637);
         dayBoothCard3839 = findViewById(R.id.day_booth_card_3839);
         dayBoothCard4041 = findViewById(R.id.day_booth_card_4041);
         dayBoothCard4243 = findViewById(R.id.day_booth_card_4243);
         dayBoothCard44 = findViewById(R.id.day_booth_card_44);
         dayBoothCard45 = findViewById(R.id.day_booth_card_45);
         dayBoothCard46 = findViewById(R.id.day_booth_card_46);
         dayBoothCard47 = findViewById(R.id.day_booth_card_47);
         dayBoothCard4849 = findViewById(R.id.day_booth_card_4849);
         dayBoothCard50 = findViewById(R.id.day_booth_card_50);
         dayBoothCard51 = findViewById(R.id.day_booth_card_51);
         dayBoothCard5253 = findViewById(R.id.day_booth_card_5253);
         dayBoothCard54 = findViewById(R.id.day_booth_card_54);
         dayBoothCard55 = findViewById(R.id.day_booth_card_55);
         dayBoothCard5657 = findViewById(R.id.day_booth_card_5657);
         dayBoothCard5859 = findViewById(R.id.day_booth_card_5859);
         dayBoothCard60 = findViewById(R.id.day_booth_card_60);
         dayBoothCard61 = findViewById(R.id.day_booth_card_61);
         dayBoothCard6263 = findViewById(R.id.day_booth_card_6263);
         dayBoothCard64 = findViewById(R.id.day_booth_card_64);
         dayBoothCard65 = findViewById(R.id.day_booth_card_65);
         dayBoothCard66 = findViewById(R.id.day_booth_card_66);
         dayBoothCard67 = findViewById(R.id.day_booth_card_67);
         dayBoothCard6869 = findViewById(R.id.day_booth_card_6869);
         dayBoothCard7071 = findViewById(R.id.day_booth_card_7071);
         dayBoothCard7273 = findViewById(R.id.day_booth_card_7273);
         dayBoothCard74 = findViewById(R.id.day_booth_card_74);
         dayBoothCard7576 = findViewById(R.id.day_booth_card_7576);
         dayBoothCard7778 = findViewById(R.id.day_booth_card_7778);
         dayBoothCard79 = findViewById(R.id.day_booth_card_79);
         dayBoothCard80 = findViewById(R.id.day_booth_card_80);

        TextView d011 = findViewById(R.id.text011);
        TextView d012 = findViewById(R.id.text012);
        TextView d013 = findViewById(R.id.text013);
        TextView d014 = findViewById(R.id.text014);
        TextView d031 = findViewById(R.id.text031);
        TextView d032 = findViewById(R.id.text032);
        TextView d033 = findViewById(R.id.text033);
        TextView d034 = findViewById(R.id.text034);
        TextView d051 = findViewById(R.id.text051);
        TextView d052 = findViewById(R.id.text052);
        TextView d053 = findViewById(R.id.text053);
        TextView d054 = findViewById(R.id.text054);
        TextView d061 = findViewById(R.id.text061);
        TextView d062 = findViewById(R.id.text062);
        TextView d063 = findViewById(R.id.text063);
        TextView d064 = findViewById(R.id.text064);
        TextView d071 = findViewById(R.id.text071);
        TextView d072 = findViewById(R.id.text072);
        TextView d073 = findViewById(R.id.text073);
        TextView d074 = findViewById(R.id.text074);
        TextView d081 = findViewById(R.id.text081);
        TextView d082 = findViewById(R.id.text082);
        TextView d083 = findViewById(R.id.text083);
        TextView d084 = findViewById(R.id.text084);
        TextView d091 = findViewById(R.id.text091);
        TextView d092 = findViewById(R.id.text092);
        TextView d093 = findViewById(R.id.text093);
        TextView d094 = findViewById(R.id.text094);
        TextView d111 = findViewById(R.id.text111);
        TextView d112 = findViewById(R.id.text112);
        TextView d113 = findViewById(R.id.text113);
        TextView d114 = findViewById(R.id.text114);
        TextView d131 = findViewById(R.id.text131);
        TextView d132 = findViewById(R.id.text132);
        TextView d133 = findViewById(R.id.text133);
        TextView d134 = findViewById(R.id.text134);
        TextView d151 = findViewById(R.id.text151);
        TextView d152 = findViewById(R.id.text152);
        TextView d153 = findViewById(R.id.text153);
        TextView d154 = findViewById(R.id.text154);
        TextView d171 = findViewById(R.id.text171);
        TextView d172 = findViewById(R.id.text172);
        TextView d173 = findViewById(R.id.text173);
        TextView d174 = findViewById(R.id.text174);
        TextView d181 = findViewById(R.id.text181);
        TextView d182 = findViewById(R.id.text182);
        TextView d183 = findViewById(R.id.text183);
        TextView d184 = findViewById(R.id.text184);
        TextView d191 = findViewById(R.id.text191);
        TextView d192 = findViewById(R.id.text192);
        TextView d193 = findViewById(R.id.text193);
        TextView d194 = findViewById(R.id.text194);
        TextView d201 = findViewById(R.id.text201);
        TextView d202 = findViewById(R.id.text202);
        TextView d203 = findViewById(R.id.text203);
        TextView d204 = findViewById(R.id.text204);
        TextView d211 = findViewById(R.id.text211);
        TextView d212 = findViewById(R.id.text212);
        TextView d213 = findViewById(R.id.text213);
        TextView d214 = findViewById(R.id.text214);
        TextView d221 = findViewById(R.id.text221);
        TextView d222 = findViewById(R.id.text222);
        TextView d223 = findViewById(R.id.text223);
        TextView d224 = findViewById(R.id.text224);
        TextView d231 = findViewById(R.id.text231);
        TextView d232 = findViewById(R.id.text232);
        TextView d233 = findViewById(R.id.text233);
        TextView d234 = findViewById(R.id.text234);
        TextView d241 = findViewById(R.id.text241);
        TextView d242 = findViewById(R.id.text242);
        TextView d243 = findViewById(R.id.text243);
        TextView d244 = findViewById(R.id.text244);
        TextView d251 = findViewById(R.id.text251);
        TextView d252 = findViewById(R.id.text252);
        TextView d253 = findViewById(R.id.text253);
        TextView d254 = findViewById(R.id.text254);
        TextView d261 = findViewById(R.id.text261);
        TextView d262 = findViewById(R.id.text262);
        TextView d263 = findViewById(R.id.text263);
        TextView d264 = findViewById(R.id.text264);
        TextView d271 = findViewById(R.id.text271);
        TextView d272 = findViewById(R.id.text272);
        TextView d273 = findViewById(R.id.text273);
        TextView d274 = findViewById(R.id.text274);
        TextView d281 = findViewById(R.id.text281);
        TextView d282 = findViewById(R.id.text282);
        TextView d283 = findViewById(R.id.text283);
        TextView d284 = findViewById(R.id.text284);
        TextView d291 = findViewById(R.id.text291);
        TextView d292 = findViewById(R.id.text292);
        TextView d293 = findViewById(R.id.text293);
        TextView d294 = findViewById(R.id.text294);
        TextView d301 = findViewById(R.id.text301);
        TextView d302 = findViewById(R.id.text302);
        TextView d303 = findViewById(R.id.text303);
        TextView d304 = findViewById(R.id.text304);
        TextView d321 = findViewById(R.id.text321);
        TextView d322 = findViewById(R.id.text322);
        TextView d323 = findViewById(R.id.text323);
        TextView d324 = findViewById(R.id.text324);
        TextView d341 = findViewById(R.id.text341);
        TextView d342 = findViewById(R.id.text342);
        TextView d343 = findViewById(R.id.text343);
        TextView d344 = findViewById(R.id.text344);
        TextView d361 = findViewById(R.id.text361);
        TextView d362 = findViewById(R.id.text362);
        TextView d363 = findViewById(R.id.text363);
        TextView d364 = findViewById(R.id.text364);
        TextView d381 = findViewById(R.id.text381);
        TextView d382 = findViewById(R.id.text382);
        TextView d383 = findViewById(R.id.text383);
        TextView d384 = findViewById(R.id.text384);
        TextView d401 = findViewById(R.id.text401);
        TextView d402 = findViewById(R.id.text402);
        TextView d403 = findViewById(R.id.text403);
        TextView d404 = findViewById(R.id.text404);
        TextView d421 = findViewById(R.id.text421);
        TextView d422 = findViewById(R.id.text422);
        TextView d423 = findViewById(R.id.text423);
        TextView d424 = findViewById(R.id.text424);
        TextView d441 = findViewById(R.id.text441);
        TextView d442 = findViewById(R.id.text442);
        TextView d443 = findViewById(R.id.text443);
        TextView d444 = findViewById(R.id.text444);
        TextView d451 = findViewById(R.id.text451);
        TextView d452 = findViewById(R.id.text452);
        TextView d453 = findViewById(R.id.text453);
        TextView d454 = findViewById(R.id.text454);
        TextView d461 = findViewById(R.id.text461);
        TextView d462 = findViewById(R.id.text462);
        TextView d463 = findViewById(R.id.text463);
        TextView d464 = findViewById(R.id.text464);
        TextView d471 = findViewById(R.id.text471);
        TextView d472 = findViewById(R.id.text472);
        TextView d473 = findViewById(R.id.text473);
        TextView d474 = findViewById(R.id.text474);
        TextView d481 = findViewById(R.id.text481);
        TextView d482 = findViewById(R.id.text482);
        TextView d483 = findViewById(R.id.text483);
        TextView d484 = findViewById(R.id.text484);
        TextView d501 = findViewById(R.id.text501);
        TextView d502 = findViewById(R.id.text502);
        TextView d503 = findViewById(R.id.text503);
        TextView d504 = findViewById(R.id.text504);
        TextView d511 = findViewById(R.id.text511);
        TextView d512 = findViewById(R.id.text512);
        TextView d513 = findViewById(R.id.text513);
        TextView d514 = findViewById(R.id.text514);
        TextView d521 = findViewById(R.id.text521);
        TextView d522 = findViewById(R.id.text522);
        TextView d523 = findViewById(R.id.text523);
        TextView d524 = findViewById(R.id.text524);
        TextView d541 = findViewById(R.id.text541);
        TextView d542 = findViewById(R.id.text542);
        TextView d543 = findViewById(R.id.text543);
        TextView d544 = findViewById(R.id.text544);
        TextView d551 = findViewById(R.id.text551);
        TextView d552 = findViewById(R.id.text552);
        TextView d553 = findViewById(R.id.text553);
        TextView d554 = findViewById(R.id.text554);
        TextView d561 = findViewById(R.id.text561);
        TextView d562 = findViewById(R.id.text562);
        TextView d563 = findViewById(R.id.text563);
        TextView d564 = findViewById(R.id.text564);
        TextView d581 = findViewById(R.id.text581);
        TextView d582 = findViewById(R.id.text582);
        TextView d583 = findViewById(R.id.text583);
        TextView d584 = findViewById(R.id.text584);
        TextView d601 = findViewById(R.id.text601);
        TextView d602 = findViewById(R.id.text602);
        TextView d603 = findViewById(R.id.text603);
        TextView d604 = findViewById(R.id.text604);
        TextView d611 = findViewById(R.id.text611);
        TextView d612 = findViewById(R.id.text612);
        TextView d613 = findViewById(R.id.text613);
        TextView d614 = findViewById(R.id.text614);
        TextView d621 = findViewById(R.id.text621);
        TextView d622 = findViewById(R.id.text622);
        TextView d623 = findViewById(R.id.text623);
        TextView d624 = findViewById(R.id.text624);
        TextView d641 = findViewById(R.id.text641);
        TextView d642 = findViewById(R.id.text642);
        TextView d643 = findViewById(R.id.text643);
        TextView d644 = findViewById(R.id.text644);
        TextView d651 = findViewById(R.id.text651);
        TextView d652 = findViewById(R.id.text652);
        TextView d653 = findViewById(R.id.text653);
        TextView d654 = findViewById(R.id.text654);
        TextView d661 = findViewById(R.id.text661);
        TextView d662 = findViewById(R.id.text662);
        TextView d663 = findViewById(R.id.text663);
        TextView d664 = findViewById(R.id.text664);
        TextView d671 = findViewById(R.id.text671);
        TextView d672 = findViewById(R.id.text672);
        TextView d673 = findViewById(R.id.text673);
        TextView d674 = findViewById(R.id.text674);
        TextView d681 = findViewById(R.id.text681);
        TextView d682 = findViewById(R.id.text682);
        TextView d683 = findViewById(R.id.text683);
        TextView d684 = findViewById(R.id.text684);
        TextView d701 = findViewById(R.id.text701);
        TextView d702 = findViewById(R.id.text702);
        TextView d703 = findViewById(R.id.text703);
        TextView d704 = findViewById(R.id.text704);
        TextView d721 = findViewById(R.id.text721);
        TextView d722 = findViewById(R.id.text722);
        TextView d723 = findViewById(R.id.text723);
        TextView d724 = findViewById(R.id.text724);
        TextView d741 = findViewById(R.id.text741);
        TextView d742 = findViewById(R.id.text742);
        TextView d743 = findViewById(R.id.text743);
        TextView d744 = findViewById(R.id.text744);
        TextView d751 = findViewById(R.id.text751);
        TextView d752 = findViewById(R.id.text752);
        TextView d753 = findViewById(R.id.text753);
        TextView d754 = findViewById(R.id.text754);
        TextView d771 = findViewById(R.id.text771);
        TextView d772 = findViewById(R.id.text772);
        TextView d773 = findViewById(R.id.text773);
        TextView d774 = findViewById(R.id.text774);
        TextView d791 = findViewById(R.id.text791);
        TextView d792 = findViewById(R.id.text792);
        TextView d793 = findViewById(R.id.text793);
        TextView d794 = findViewById(R.id.text794);
        TextView d801 = findViewById(R.id.text801);
        TextView d802 = findViewById(R.id.text802);
        TextView d803 = findViewById(R.id.text803);
        TextView d804 = findViewById(R.id.text804);

        Glide.with(this)
                .load(day1URL)
                .into(dayBooth1Map);
        Glide.with(this)
                .load(day2URL)
                .into(dayBooth2Map);
        Glide.with(this)
                .load(day3URL)
                .into(dayBooth3Map);

        dayBoothCard0102.setVisibility(View.VISIBLE);
        dayBoothCard0304.setVisibility(View.VISIBLE);
        dayBoothCard05.setVisibility(View.VISIBLE);
        dayBoothCard06.setVisibility(View.VISIBLE);
        dayBoothCard07.setVisibility(View.VISIBLE);
        dayBoothCard08.setVisibility(View.VISIBLE);
        dayBoothCard0910.setVisibility(View.VISIBLE);
        dayBoothCard1112.setVisibility(View.VISIBLE);
        dayBoothCard1314.setVisibility(View.VISIBLE);
        dayBoothCard1516.setVisibility(View.VISIBLE);
        dayBoothCard17.setVisibility(View.VISIBLE);
        dayBoothCard18.setVisibility(View.VISIBLE);
        dayBoothCard19.setVisibility(View.VISIBLE);
        dayBoothCard20.setVisibility(View.VISIBLE);
        dayBoothCard21.setVisibility(View.VISIBLE);
        dayBoothCard22.setVisibility(View.VISIBLE);
        dayBoothCard23.setVisibility(View.VISIBLE);
        dayBoothCard24.setVisibility(View.VISIBLE);
        dayBoothCard25.setVisibility(View.VISIBLE);
        dayBoothCard26.setVisibility(View.VISIBLE);
        dayBoothCard27.setVisibility(View.VISIBLE);
        dayBoothCard28.setVisibility(View.VISIBLE);
        dayBoothCard29.setVisibility(View.VISIBLE);
        dayBoothCard3031.setVisibility(View.VISIBLE);
        dayBoothCard3233.setVisibility(View.VISIBLE);
        dayBoothCard3435.setVisibility(View.VISIBLE);
        dayBoothCard3637.setVisibility(View.VISIBLE);
        dayBoothCard3839.setVisibility(View.VISIBLE);
        dayBoothCard4041.setVisibility(View.VISIBLE);
        dayBoothCard4243.setVisibility(View.VISIBLE);
        dayBoothCard44.setVisibility(View.VISIBLE);
        dayBoothCard45.setVisibility(View.VISIBLE);
        dayBoothCard46.setVisibility(View.VISIBLE);
        dayBoothCard47.setVisibility(View.VISIBLE);
        dayBoothCard4849.setVisibility(View.VISIBLE);
        dayBoothCard50.setVisibility(View.VISIBLE);
        dayBoothCard51.setVisibility(View.VISIBLE);
        dayBoothCard5253.setVisibility(View.VISIBLE);
        dayBoothCard54.setVisibility(View.VISIBLE);
        dayBoothCard55.setVisibility(View.VISIBLE);
        dayBoothCard5657.setVisibility(View.VISIBLE);
        dayBoothCard5859.setVisibility(View.VISIBLE);
        dayBoothCard7576.setVisibility(View.VISIBLE);
        dayBoothCard7778.setVisibility(View.VISIBLE);
        dayBoothCard79.setVisibility(View.VISIBLE);

        dayBoothCard60.setVisibility(View.GONE);
        dayBoothCard61.setVisibility(View.GONE);
        dayBoothCard6263.setVisibility(View.GONE);
        dayBoothCard64.setVisibility(View.GONE);
        dayBoothCard65.setVisibility(View.GONE);
        dayBoothCard66.setVisibility(View.GONE);
        dayBoothCard67.setVisibility(View.GONE);
        dayBoothCard6869.setVisibility(View.GONE);
        dayBoothCard7071.setVisibility(View.GONE);
        dayBoothCard7273.setVisibility(View.GONE);
        dayBoothCard74.setVisibility(View.GONE);
        dayBoothCard80.setVisibility(View.GONE);


        // XML에서 뷰 가져오기
        searchButton = findViewById(R.id.booth_search_button);
        boothSearchView = findViewById(R.id.booth_search_view);

        // 초기 상태에서 SearchView 숨기기
        boothSearchView.setVisibility(View.GONE);

        boothSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                Intent intent = new Intent(Day_booth_01Activity.this, Night_booth_01Activity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                finish();
            }   else{

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

        boothSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // 검색어 제출 시 처리
                updateViews(query, d011, d012, d013, d014,
                        d031, d032, d033, d034,
                        d051, d052, d053, d054,
                        d061, d062, d063, d064,
                        d071, d072, d073, d074,
                        d081, d082, d083, d084,
                        d091, d092, d093, d094,
                        d111, d112, d113, d114,
                        d131, d132, d133, d134,
                        d151, d152, d153, d154,
                        d171, d172, d173, d174,
                        d181, d182, d183, d184,
                        d191, d192, d193, d194,
                        d201, d202, d203, d204,
                        d211, d212, d213, d214,
                        d221, d222, d223, d224,
                        d231, d232, d233, d234,
                        d241, d242, d243, d244,
                        d251, d252, d253, d254,
                        d261, d262, d263, d264,
                        d271, d272, d273, d274,
                        d281, d282, d283, d284,
                        d291, d292, d293, d294,
                        d301, d302, d303, d304,
                        d321, d322, d323, d324,
                        d341, d342, d343, d344,
                        d361, d362, d363, d364,
                        d381, d382, d383, d384,
                        d401, d402, d403, d404,
                        d421, d422, d423, d424,
                        d441, d442, d443, d444,
                        d451, d452, d453, d454,
                        d461, d462, d463, d464,
                        d471, d472, d473, d474,
                        d481, d482, d483, d484,
                        d501, d502, d503, d504,
                        d511, d512, d513, d514,
                        d521, d522, d523, d524,
                        d541, d542, d543, d544,
                        d551, d552, d553, d554,
                        d561, d562, d563, d564,
                        d581, d582, d583, d584,
                        d601, d602, d603, d604,
                        d611, d612, d613, d614,
                        d621, d622, d623, d624,
                        d641, d642, d643, d644,
                        d651, d652, d653, d654,
                        d661, d662, d663, d664,
                        d671, d672, d673, d674,
                        d681, d682, d683, d684,
                        d701, d702, d703, d704,
                        d721, d722, d723, d724,
                        d741, d742, d743, d744,
                        d751, d752, d753, d754,
                        d771, d772, d773, d774,
                        d791, d792, d793, d794,
                        d801, d802, d803, d804
                );
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // 검색어 변경 시 처리
                updateViews(newText, d011, d012, d013, d014,
                        d031, d032, d033, d034,
                        d051, d052, d053, d054,
                        d061, d062, d063, d064,
                        d071, d072, d073, d074,
                        d081, d082, d083, d084,
                        d091, d092, d093, d094,
                        d111, d112, d113, d114,
                        d131, d132, d133, d134,
                        d151, d152, d153, d154,
                        d171, d172, d173, d174,
                        d181, d182, d183, d184,
                        d191, d192, d193, d194,
                        d201, d202, d203, d204,
                        d211, d212, d213, d214,
                        d221, d222, d223, d224,
                        d231, d232, d233, d234,
                        d241, d242, d243, d244,
                        d251, d252, d253, d254,
                        d261, d262, d263, d264,
                        d271, d272, d273, d274,
                        d281, d282, d283, d284,
                        d291, d292, d293, d294,
                        d301, d302, d303, d304,
                        d321, d322, d323, d324,
                        d341, d342, d343, d344,
                        d361, d362, d363, d364,
                        d381, d382, d383, d384,
                        d401, d402, d403, d404,
                        d421, d422, d423, d424,
                        d441, d442, d443, d444,
                        d451, d452, d453, d454,
                        d461, d462, d463, d464,
                        d471, d472, d473, d474,
                        d481, d482, d483, d484,
                        d501, d502, d503, d504,
                        d511, d512, d513, d514,
                        d521, d522, d523, d524,
                        d541, d542, d543, d544,
                        d551, d552, d553, d554,
                        d561, d562, d563, d564,
                        d581, d582, d583, d584,
                        d601, d602, d603, d604,
                        d611, d612, d613, d614,
                        d621, d622, d623, d624,
                        d641, d642, d643, d644,
                        d651, d652, d653, d654,
                        d661, d662, d663, d664,
                        d671, d672, d673, d674,
                        d681, d682, d683, d684,
                        d701, d702, d703, d704,
                        d721, d722, d723, d724,
                        d741, d742, d743, d744,
                        d751, d752, d753, d754,
                        d771, d772, d773, d774,
                        d791, d792, d793, d794,
                        d801, d802, d803, d804);
                return true;
            }
        });

        day1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayBooth1Map.setVisibility(View.VISIBLE);
                dayBooth2Map.setVisibility(View.GONE);
                dayBooth3Map.setVisibility(View.GONE);

                dayCheck = 1;

                allCheckBox.setChecked(true);
                foodCheckBox.setChecked(true);
                dessertCheckBox.setChecked(true);
                activityCheckBox.setChecked(true);
                eventCheckBox.setChecked(true);

                dayBoothCard0102.setVisibility(View.VISIBLE);
                dayBoothCard0304.setVisibility(View.VISIBLE);
                dayBoothCard05.setVisibility(View.VISIBLE);
                dayBoothCard06.setVisibility(View.VISIBLE);
                dayBoothCard07.setVisibility(View.VISIBLE);
                dayBoothCard08.setVisibility(View.VISIBLE);
                dayBoothCard0910.setVisibility(View.VISIBLE);
                dayBoothCard1112.setVisibility(View.VISIBLE);
                dayBoothCard1314.setVisibility(View.VISIBLE);
                dayBoothCard1516.setVisibility(View.VISIBLE);
                dayBoothCard17.setVisibility(View.VISIBLE);
                dayBoothCard18.setVisibility(View.VISIBLE);
                dayBoothCard19.setVisibility(View.VISIBLE);
                dayBoothCard20.setVisibility(View.VISIBLE);
                dayBoothCard21.setVisibility(View.VISIBLE);
                dayBoothCard22.setVisibility(View.VISIBLE);
                dayBoothCard23.setVisibility(View.VISIBLE);
                dayBoothCard24.setVisibility(View.VISIBLE);
                dayBoothCard25.setVisibility(View.VISIBLE);
                dayBoothCard26.setVisibility(View.VISIBLE);
                dayBoothCard27.setVisibility(View.VISIBLE);
                dayBoothCard28.setVisibility(View.VISIBLE);
                dayBoothCard29.setVisibility(View.VISIBLE);
                dayBoothCard3031.setVisibility(View.VISIBLE);
                dayBoothCard3233.setVisibility(View.VISIBLE);
                dayBoothCard3435.setVisibility(View.VISIBLE);
                dayBoothCard3637.setVisibility(View.VISIBLE);
                dayBoothCard3839.setVisibility(View.VISIBLE);
                dayBoothCard4041.setVisibility(View.VISIBLE);
                dayBoothCard4243.setVisibility(View.VISIBLE);
                dayBoothCard44.setVisibility(View.VISIBLE);
                dayBoothCard45.setVisibility(View.VISIBLE);
                dayBoothCard46.setVisibility(View.VISIBLE);
                dayBoothCard47.setVisibility(View.VISIBLE);
                dayBoothCard4849.setVisibility(View.VISIBLE);
                dayBoothCard50.setVisibility(View.VISIBLE);
                dayBoothCard51.setVisibility(View.VISIBLE);
                dayBoothCard5253.setVisibility(View.VISIBLE);
                dayBoothCard54.setVisibility(View.VISIBLE);
                dayBoothCard55.setVisibility(View.VISIBLE);
                dayBoothCard5657.setVisibility(View.VISIBLE);
                dayBoothCard5859.setVisibility(View.VISIBLE);
                dayBoothCard7576.setVisibility(View.VISIBLE);
                dayBoothCard7778.setVisibility(View.VISIBLE);
                dayBoothCard79.setVisibility(View.VISIBLE);

                dayBoothCard60.setVisibility(View.GONE);
                dayBoothCard61.setVisibility(View.GONE);
                dayBoothCard6263.setVisibility(View.GONE);
                dayBoothCard64.setVisibility(View.GONE);
                dayBoothCard65.setVisibility(View.GONE);
                dayBoothCard66.setVisibility(View.GONE);
                dayBoothCard67.setVisibility(View.GONE);
                dayBoothCard6869.setVisibility(View.GONE);
                dayBoothCard7071.setVisibility(View.GONE);
                dayBoothCard7273.setVisibility(View.GONE);
                dayBoothCard74.setVisibility(View.GONE);
                dayBoothCard80.setVisibility(View.GONE);

            }
        });

        day2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayBooth1Map.setVisibility(View.GONE);
                dayBooth2Map.setVisibility(View.VISIBLE);
                dayBooth3Map.setVisibility(View.GONE);

                dayCheck = 2;

                allCheckBox.setChecked(true);
                foodCheckBox.setChecked(true);
                dessertCheckBox.setChecked(true);
                activityCheckBox.setChecked(true);
                eventCheckBox.setChecked(true);

                dayBoothCard0102.setVisibility(View.VISIBLE);
                dayBoothCard0304.setVisibility(View.VISIBLE);
                dayBoothCard05.setVisibility(View.VISIBLE);
                dayBoothCard06.setVisibility(View.VISIBLE);
                dayBoothCard07.setVisibility(View.VISIBLE);
                dayBoothCard08.setVisibility(View.VISIBLE);
                dayBoothCard0910.setVisibility(View.VISIBLE);
                dayBoothCard1314.setVisibility(View.VISIBLE);
                dayBoothCard18.setVisibility(View.VISIBLE);
                dayBoothCard19.setVisibility(View.VISIBLE);
                dayBoothCard20.setVisibility(View.VISIBLE);
                dayBoothCard21.setVisibility(View.VISIBLE);
                dayBoothCard22.setVisibility(View.VISIBLE);
                dayBoothCard23.setVisibility(View.VISIBLE);
                dayBoothCard24.setVisibility(View.VISIBLE);
                dayBoothCard25.setVisibility(View.VISIBLE);
                dayBoothCard26.setVisibility(View.VISIBLE);
                dayBoothCard27.setVisibility(View.VISIBLE);
                dayBoothCard3031.setVisibility(View.VISIBLE);
                dayBoothCard3233.setVisibility(View.VISIBLE);
                dayBoothCard3435.setVisibility(View.VISIBLE);
                dayBoothCard3637.setVisibility(View.VISIBLE);
                dayBoothCard3839.setVisibility(View.VISIBLE);
                dayBoothCard4243.setVisibility(View.VISIBLE);
                dayBoothCard44.setVisibility(View.VISIBLE);
                dayBoothCard45.setVisibility(View.VISIBLE);
                dayBoothCard46.setVisibility(View.VISIBLE);
                dayBoothCard47.setVisibility(View.VISIBLE);
                dayBoothCard4849.setVisibility(View.VISIBLE);
                dayBoothCard5253.setVisibility(View.VISIBLE);
                dayBoothCard54.setVisibility(View.VISIBLE);
                dayBoothCard55.setVisibility(View.VISIBLE);
                dayBoothCard5657.setVisibility(View.VISIBLE);
                dayBoothCard5859.setVisibility(View.VISIBLE);
                dayBoothCard60.setVisibility(View.VISIBLE);
                dayBoothCard61.setVisibility(View.VISIBLE);
                dayBoothCard6263.setVisibility(View.VISIBLE);
                dayBoothCard64.setVisibility(View.VISIBLE);
                dayBoothCard65.setVisibility(View.VISIBLE);
                dayBoothCard66.setVisibility(View.VISIBLE);
                dayBoothCard67.setVisibility(View.VISIBLE);
                dayBoothCard6869.setVisibility(View.VISIBLE);
                dayBoothCard7071.setVisibility(View.VISIBLE);

                dayBoothCard1112.setVisibility(View.GONE);
                dayBoothCard1516.setVisibility(View.GONE);
                dayBoothCard17.setVisibility(View.GONE);
                dayBoothCard28.setVisibility(View.GONE);
                dayBoothCard29.setVisibility(View.GONE);
                dayBoothCard4041.setVisibility(View.GONE);
                dayBoothCard50.setVisibility(View.GONE);
                dayBoothCard51.setVisibility(View.GONE);
                dayBoothCard7273.setVisibility(View.GONE);
                dayBoothCard74.setVisibility(View.GONE);
                dayBoothCard7576.setVisibility(View.GONE);
                dayBoothCard7778.setVisibility(View.GONE);
                dayBoothCard79.setVisibility(View.GONE);
                dayBoothCard80.setVisibility(View.GONE);
            }
        });

        day3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dayBooth1Map.setVisibility(View.GONE);
                dayBooth2Map.setVisibility(View.GONE);
                dayBooth3Map.setVisibility(View.VISIBLE);

                dayCheck = 3;

                allCheckBox.setChecked(true);
                foodCheckBox.setChecked(true);
                dessertCheckBox.setChecked(true);
                activityCheckBox.setChecked(true);
                eventCheckBox.setChecked(true);

                dayBoothCard0102.setVisibility(View.VISIBLE);
                dayBoothCard0304.setVisibility(View.VISIBLE);
                dayBoothCard0910.setVisibility(View.VISIBLE);
                dayBoothCard1314.setVisibility(View.VISIBLE);
                dayBoothCard22.setVisibility(View.VISIBLE);
                dayBoothCard23.setVisibility(View.VISIBLE);
                dayBoothCard24.setVisibility(View.VISIBLE);
                dayBoothCard25.setVisibility(View.VISIBLE);
                dayBoothCard26.setVisibility(View.VISIBLE);
                dayBoothCard27.setVisibility(View.VISIBLE);
                dayBoothCard3031.setVisibility(View.VISIBLE);
                dayBoothCard4243.setVisibility(View.VISIBLE);
                dayBoothCard44.setVisibility(View.VISIBLE);
                dayBoothCard45.setVisibility(View.VISIBLE);
                dayBoothCard46.setVisibility(View.VISIBLE);
                dayBoothCard47.setVisibility(View.VISIBLE);
                dayBoothCard5253.setVisibility(View.VISIBLE);
                dayBoothCard54.setVisibility(View.VISIBLE);
                dayBoothCard55.setVisibility(View.VISIBLE);
                dayBoothCard5657.setVisibility(View.VISIBLE);
                dayBoothCard5859.setVisibility(View.VISIBLE);
                dayBoothCard60.setVisibility(View.VISIBLE);
                dayBoothCard6263.setVisibility(View.VISIBLE);
                dayBoothCard66.setVisibility(View.VISIBLE);
                dayBoothCard67.setVisibility(View.VISIBLE);
                dayBoothCard7273.setVisibility(View.VISIBLE);
                dayBoothCard74.setVisibility(View.VISIBLE);
                dayBoothCard7576.setVisibility(View.VISIBLE);
                dayBoothCard80.setVisibility(View.VISIBLE);

                dayBoothCard05.setVisibility(View.GONE);
                dayBoothCard06.setVisibility(View.GONE);
                dayBoothCard07.setVisibility(View.GONE);
                dayBoothCard08.setVisibility(View.GONE);
                dayBoothCard1516.setVisibility(View.GONE);
                dayBoothCard17.setVisibility(View.GONE);
                dayBoothCard18.setVisibility(View.GONE);
                dayBoothCard19.setVisibility(View.GONE);
                dayBoothCard20.setVisibility(View.GONE);
                dayBoothCard21.setVisibility(View.GONE);
                dayBoothCard28.setVisibility(View.GONE);
                dayBoothCard29.setVisibility(View.GONE);
                dayBoothCard3233.setVisibility(View.GONE);
                dayBoothCard3435.setVisibility(View.GONE);
                dayBoothCard3637.setVisibility(View.GONE);
                dayBoothCard3839.setVisibility(View.GONE);
                dayBoothCard4041.setVisibility(View.GONE);
                dayBoothCard4849.setVisibility(View.GONE);
                dayBoothCard50.setVisibility(View.GONE);
                dayBoothCard51.setVisibility(View.GONE);
                dayBoothCard61.setVisibility(View.GONE);
                dayBoothCard64.setVisibility(View.GONE);
                dayBoothCard65.setVisibility(View.GONE);
                dayBoothCard6869.setVisibility(View.GONE);
                dayBoothCard7071.setVisibility(View.GONE);
                dayBoothCard7778.setVisibility(View.GONE);
                dayBoothCard79.setVisibility(View.GONE);

            }
        });

        allCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                foodCheckBox.setChecked(true);
                dessertCheckBox.setChecked(true);
                activityCheckBox.setChecked(true);
                eventCheckBox.setChecked(true);
            } else {
                foodCheckBox.setChecked(false);
                dessertCheckBox.setChecked(false);
                activityCheckBox.setChecked(false);
                eventCheckBox.setChecked(false);
            }
        });

        foodCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                if (dayCheck == 1){
                    dayBoothCard19.setVisibility(View.VISIBLE);
                    dayBoothCard23.setVisibility(View.VISIBLE);
                    dayBoothCard27.setVisibility(View.VISIBLE);
                    dayBoothCard3031.setVisibility(View.VISIBLE);
                    dayBoothCard3435.setVisibility(View.VISIBLE);
                    dayBoothCard3839.setVisibility(View.VISIBLE);
                    dayBoothCard4041.setVisibility(View.VISIBLE);
                    dayBoothCard4243.setVisibility(View.VISIBLE);
                    dayBoothCard50.setVisibility(View.VISIBLE);
                    dayBoothCard54.setVisibility(View.VISIBLE);
                    dayBoothCard5657.setVisibility(View.VISIBLE);
                } else if (dayCheck == 2){
                    dayBoothCard19.setVisibility(View.VISIBLE);
                    dayBoothCard23.setVisibility(View.VISIBLE);
                    dayBoothCard27.setVisibility(View.VISIBLE);
                    dayBoothCard3031.setVisibility(View.VISIBLE);
                    dayBoothCard3435.setVisibility(View.VISIBLE);
                    dayBoothCard3839.setVisibility(View.VISIBLE);
                    dayBoothCard4243.setVisibility(View.VISIBLE);
                    dayBoothCard54.setVisibility(View.VISIBLE);
                    dayBoothCard5657.setVisibility(View.VISIBLE);
                    dayBoothCard67.setVisibility(View.VISIBLE);
                    dayBoothCard6869.setVisibility(View.VISIBLE);

                } else if (dayCheck == 3){
                    dayBoothCard23.setVisibility(View.VISIBLE);
                    dayBoothCard27.setVisibility(View.VISIBLE);
                    dayBoothCard3031.setVisibility(View.VISIBLE);
                    dayBoothCard4243.setVisibility(View.VISIBLE);
                    dayBoothCard54.setVisibility(View.VISIBLE);
                    dayBoothCard5657.setVisibility(View.VISIBLE);
                    dayBoothCard67.setVisibility(View.VISIBLE);
                }
            } else {
                if (dayCheck == 1){
                    dayBoothCard19.setVisibility(View.GONE);
                    dayBoothCard23.setVisibility(View.GONE);
                    dayBoothCard27.setVisibility(View.GONE);
                    dayBoothCard3031.setVisibility(View.GONE);
                    dayBoothCard3435.setVisibility(View.GONE);
                    dayBoothCard3839.setVisibility(View.GONE);
                    dayBoothCard4041.setVisibility(View.GONE);
                    dayBoothCard4243.setVisibility(View.GONE);
                    dayBoothCard50.setVisibility(View.GONE);
                    dayBoothCard54.setVisibility(View.GONE);
                    dayBoothCard5657.setVisibility(View.GONE);
                } else if (dayCheck == 2){
                    dayBoothCard19.setVisibility(View.GONE);
                    dayBoothCard23.setVisibility(View.GONE);
                    dayBoothCard27.setVisibility(View.GONE);
                    dayBoothCard3031.setVisibility(View.GONE);
                    dayBoothCard3435.setVisibility(View.GONE);
                    dayBoothCard3839.setVisibility(View.GONE);
                    dayBoothCard4243.setVisibility(View.GONE);
                    dayBoothCard54.setVisibility(View.GONE);
                    dayBoothCard5657.setVisibility(View.GONE);
                    dayBoothCard67.setVisibility(View.GONE);
                    dayBoothCard6869.setVisibility(View.GONE);
                } else if (dayCheck == 3){
                    dayBoothCard23.setVisibility(View.GONE);
                    dayBoothCard27.setVisibility(View.GONE);
                    dayBoothCard3031.setVisibility(View.GONE);
                    dayBoothCard4243.setVisibility(View.GONE);
                    dayBoothCard54.setVisibility(View.GONE);
                    dayBoothCard5657.setVisibility(View.GONE);
                    dayBoothCard67.setVisibility(View.GONE);
                }

            }
        });

        dessertCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                if (dayCheck == 1){
                    dayBoothCard08.setVisibility(View.VISIBLE);
                    dayBoothCard26.setVisibility(View.VISIBLE);
                    dayBoothCard28.setVisibility(View.VISIBLE);
                    dayBoothCard3637.setVisibility(View.VISIBLE);
                    dayBoothCard45.setVisibility(View.VISIBLE);
                    dayBoothCard51.setVisibility(View.VISIBLE);
                    dayBoothCard55.setVisibility(View.VISIBLE);
                } else if (dayCheck == 2){
                    dayBoothCard08.setVisibility(View.VISIBLE);
                    dayBoothCard26.setVisibility(View.VISIBLE);
                    dayBoothCard3637.setVisibility(View.VISIBLE);
                    dayBoothCard45.setVisibility(View.VISIBLE);
                    dayBoothCard55.setVisibility(View.VISIBLE);
                    dayBoothCard7071.setVisibility(View.VISIBLE);

                } else if (dayCheck == 3){
                    dayBoothCard26.setVisibility(View.VISIBLE);
                    dayBoothCard45.setVisibility(View.VISIBLE);
                    dayBoothCard55.setVisibility(View.VISIBLE);
                }
            } else {
                if (dayCheck == 1){
                    dayBoothCard08.setVisibility(View.GONE);
                    dayBoothCard26.setVisibility(View.GONE);
                    dayBoothCard28.setVisibility(View.GONE);
                    dayBoothCard3637.setVisibility(View.GONE);
                    dayBoothCard45.setVisibility(View.GONE);
                    dayBoothCard51.setVisibility(View.GONE);
                    dayBoothCard55.setVisibility(View.GONE);
                } else if (dayCheck == 2){
                    dayBoothCard08.setVisibility(View.GONE);
                    dayBoothCard26.setVisibility(View.GONE);
                    dayBoothCard3637.setVisibility(View.GONE);
                    dayBoothCard45.setVisibility(View.GONE);
                    dayBoothCard55.setVisibility(View.GONE);
                    dayBoothCard7071.setVisibility(View.GONE);
                } else if (dayCheck == 3){
                    dayBoothCard26.setVisibility(View.GONE);
                    dayBoothCard45.setVisibility(View.GONE);
                    dayBoothCard55.setVisibility(View.GONE);
                }

            }
        });

        activityCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                if (dayCheck == 1){
                    dayBoothCard0102.setVisibility(View.VISIBLE);
                    dayBoothCard0304.setVisibility(View.VISIBLE);
                    dayBoothCard05.setVisibility(View.VISIBLE);
                    dayBoothCard06.setVisibility(View.VISIBLE);
                    dayBoothCard07.setVisibility(View.VISIBLE);
                    dayBoothCard0910.setVisibility(View.VISIBLE);
                    dayBoothCard1314.setVisibility(View.VISIBLE);
                    dayBoothCard17.setVisibility(View.VISIBLE);
                    dayBoothCard18.setVisibility(View.VISIBLE);
                    dayBoothCard20.setVisibility(View.VISIBLE);
                    dayBoothCard21.setVisibility(View.VISIBLE);
                    dayBoothCard22.setVisibility(View.VISIBLE);
                    dayBoothCard24.setVisibility(View.VISIBLE);
                    dayBoothCard25.setVisibility(View.VISIBLE);
                    dayBoothCard29.setVisibility(View.VISIBLE);
                    dayBoothCard3233.setVisibility(View.VISIBLE);
                    dayBoothCard44.setVisibility(View.VISIBLE);
                    dayBoothCard46.setVisibility(View.VISIBLE);
                    dayBoothCard47.setVisibility(View.VISIBLE);
                    dayBoothCard4849.setVisibility(View.VISIBLE);
                    dayBoothCard5253.setVisibility(View.VISIBLE);
                    dayBoothCard5859.setVisibility(View.VISIBLE);
                } else if (dayCheck == 2){
                    dayBoothCard0102.setVisibility(View.VISIBLE);
                    dayBoothCard0304.setVisibility(View.VISIBLE);
                    dayBoothCard05.setVisibility(View.VISIBLE);
                    dayBoothCard06.setVisibility(View.VISIBLE);
                    dayBoothCard07.setVisibility(View.VISIBLE);
                    dayBoothCard0910.setVisibility(View.VISIBLE);
                    dayBoothCard1314.setVisibility(View.VISIBLE);
                    dayBoothCard18.setVisibility(View.VISIBLE);
                    dayBoothCard20.setVisibility(View.VISIBLE);
                    dayBoothCard21.setVisibility(View.VISIBLE);
                    dayBoothCard22.setVisibility(View.VISIBLE);
                    dayBoothCard24.setVisibility(View.VISIBLE);
                    dayBoothCard25.setVisibility(View.VISIBLE);
                    dayBoothCard3233.setVisibility(View.VISIBLE);
                    dayBoothCard44.setVisibility(View.VISIBLE);
                    dayBoothCard46.setVisibility(View.VISIBLE);
                    dayBoothCard47.setVisibility(View.VISIBLE);
                    dayBoothCard4849.setVisibility(View.VISIBLE);
                    dayBoothCard5253.setVisibility(View.VISIBLE);
                    dayBoothCard5859.setVisibility(View.VISIBLE);
                    dayBoothCard60.setVisibility(View.VISIBLE);
                    dayBoothCard61.setVisibility(View.VISIBLE);
                    dayBoothCard6263.setVisibility(View.VISIBLE);
                    dayBoothCard64.setVisibility(View.VISIBLE);
                    dayBoothCard65.setVisibility(View.VISIBLE);
                    dayBoothCard66.setVisibility(View.VISIBLE);
                } else if (dayCheck == 3){
                    dayBoothCard0102.setVisibility(View.VISIBLE);
                    dayBoothCard0304.setVisibility(View.VISIBLE);
                    dayBoothCard0910.setVisibility(View.VISIBLE);
                    dayBoothCard1314.setVisibility(View.VISIBLE);
                    dayBoothCard22.setVisibility(View.VISIBLE);
                    dayBoothCard24.setVisibility(View.VISIBLE);
                    dayBoothCard25.setVisibility(View.VISIBLE);
                    dayBoothCard44.setVisibility(View.VISIBLE);
                    dayBoothCard46.setVisibility(View.VISIBLE);
                    dayBoothCard47.setVisibility(View.VISIBLE);
                    dayBoothCard5253.setVisibility(View.VISIBLE);
                    dayBoothCard5859.setVisibility(View.VISIBLE);
                    dayBoothCard60.setVisibility(View.VISIBLE);
                    dayBoothCard6263.setVisibility(View.VISIBLE);
                    dayBoothCard66.setVisibility(View.VISIBLE);
                    dayBoothCard7273.setVisibility(View.VISIBLE);
                    dayBoothCard74.setVisibility(View.VISIBLE);
                }
            } else {
                if (dayCheck == 1){
                    dayBoothCard0102.setVisibility(View.GONE);
                    dayBoothCard0304.setVisibility(View.GONE);
                    dayBoothCard05.setVisibility(View.GONE);
                    dayBoothCard06.setVisibility(View.GONE);
                    dayBoothCard07.setVisibility(View.GONE);
                    dayBoothCard0910.setVisibility(View.GONE);
                    dayBoothCard1314.setVisibility(View.GONE);
                    dayBoothCard17.setVisibility(View.GONE);
                    dayBoothCard18.setVisibility(View.GONE);
                    dayBoothCard20.setVisibility(View.GONE);
                    dayBoothCard21.setVisibility(View.GONE);
                    dayBoothCard22.setVisibility(View.GONE);
                    dayBoothCard24.setVisibility(View.GONE);
                    dayBoothCard25.setVisibility(View.GONE);
                    dayBoothCard29.setVisibility(View.GONE);
                    dayBoothCard3233.setVisibility(View.GONE);
                    dayBoothCard44.setVisibility(View.GONE);
                    dayBoothCard46.setVisibility(View.GONE);
                    dayBoothCard47.setVisibility(View.GONE);
                    dayBoothCard4849.setVisibility(View.GONE);
                    dayBoothCard5253.setVisibility(View.GONE);
                    dayBoothCard5859.setVisibility(View.GONE);
                } else if (dayCheck == 2){
                    dayBoothCard0102.setVisibility(View.GONE);
                    dayBoothCard0304.setVisibility(View.GONE);
                    dayBoothCard05.setVisibility(View.GONE);
                    dayBoothCard06.setVisibility(View.GONE);
                    dayBoothCard07.setVisibility(View.GONE);
                    dayBoothCard0910.setVisibility(View.GONE);
                    dayBoothCard1314.setVisibility(View.GONE);
                    dayBoothCard18.setVisibility(View.GONE);
                    dayBoothCard20.setVisibility(View.GONE);
                    dayBoothCard21.setVisibility(View.GONE);
                    dayBoothCard22.setVisibility(View.GONE);
                    dayBoothCard24.setVisibility(View.GONE);
                    dayBoothCard25.setVisibility(View.GONE);
                    dayBoothCard3233.setVisibility(View.GONE);
                    dayBoothCard44.setVisibility(View.GONE);
                    dayBoothCard46.setVisibility(View.GONE);
                    dayBoothCard47.setVisibility(View.GONE);
                    dayBoothCard4849.setVisibility(View.GONE);
                    dayBoothCard5253.setVisibility(View.GONE);
                    dayBoothCard5859.setVisibility(View.GONE);
                    dayBoothCard60.setVisibility(View.GONE);
                    dayBoothCard61.setVisibility(View.GONE);
                    dayBoothCard6263.setVisibility(View.GONE);
                    dayBoothCard64.setVisibility(View.GONE);
                    dayBoothCard65.setVisibility(View.GONE);
                    dayBoothCard66.setVisibility(View.GONE);
                } else if (dayCheck == 3){
                    dayBoothCard0102.setVisibility(View.GONE);
                    dayBoothCard0304.setVisibility(View.GONE);
                    dayBoothCard0910.setVisibility(View.GONE);
                    dayBoothCard1314.setVisibility(View.GONE);
                    dayBoothCard22.setVisibility(View.GONE);
                    dayBoothCard24.setVisibility(View.GONE);
                    dayBoothCard25.setVisibility(View.GONE);
                    dayBoothCard44.setVisibility(View.GONE);
                    dayBoothCard46.setVisibility(View.GONE);
                    dayBoothCard47.setVisibility(View.GONE);
                    dayBoothCard5253.setVisibility(View.GONE);
                    dayBoothCard5859.setVisibility(View.GONE);
                    dayBoothCard60.setVisibility(View.GONE);
                    dayBoothCard6263.setVisibility(View.GONE);
                    dayBoothCard66.setVisibility(View.GONE);
                    dayBoothCard7273.setVisibility(View.GONE);
                    dayBoothCard74.setVisibility(View.GONE);
                }

            }
        });

        eventCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                if (dayCheck == 1){
                    dayBoothCard1112.setVisibility(View.VISIBLE);
                    dayBoothCard1516.setVisibility(View.VISIBLE);
                    dayBoothCard7576.setVisibility(View.VISIBLE);
                    dayBoothCard7778.setVisibility(View.VISIBLE);
                    dayBoothCard79.setVisibility(View.VISIBLE);
                } else if (dayCheck == 2){




                } else if (dayCheck == 3){
                    dayBoothCard1112.setVisibility(View.VISIBLE);
                    dayBoothCard7576.setVisibility(View.VISIBLE);
                    dayBoothCard80.setVisibility(View.VISIBLE);

                }
            } else {
                if (dayCheck == 1){
                    dayBoothCard1112.setVisibility(View.GONE);
                    dayBoothCard1516.setVisibility(View.GONE);
                    dayBoothCard7576.setVisibility(View.GONE);
                    dayBoothCard7778.setVisibility(View.GONE);
                    dayBoothCard79.setVisibility(View.GONE);
                } else if (dayCheck == 2){

                } else if (dayCheck == 3){
                    dayBoothCard1112.setVisibility(View.GONE);
                    dayBoothCard7576.setVisibility(View.GONE);
                    dayBoothCard80.setVisibility(View.GONE);
                }

            }
        });

        dayBoothCard21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Day_booth_01Activity.this, Day_Booth1_21.class));
            }
        });
        dayBoothCard28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Day_booth_01Activity.this, Day_Booth1_28.class));
            }
        });

    }
    private void updateViews(String query, TextView d011, TextView  d012, TextView  d013, TextView  d014,
                             TextView d031, TextView d032, TextView d033, TextView d034,
                             TextView d051, TextView d052, TextView d053, TextView d054,
                             TextView d061, TextView d062, TextView d063, TextView d064,
                             TextView d071, TextView d072, TextView d073, TextView d074,
                             TextView d081, TextView d082, TextView d083, TextView d084,
                             TextView d091, TextView d092, TextView d093, TextView d094,
                             TextView d111, TextView d112, TextView d113, TextView d114,
                             TextView d131, TextView d132, TextView d133, TextView d134,
                             TextView d151, TextView d152, TextView d153, TextView d154,
                             TextView d171, TextView d172, TextView d173, TextView d174,
                             TextView d181, TextView d182, TextView d183, TextView d184,
                             TextView d191, TextView d192, TextView d193, TextView d194,
                             TextView d201, TextView d202, TextView d203, TextView d204,
                             TextView d211, TextView d212, TextView d213, TextView d214,
                             TextView d221, TextView d222, TextView d223, TextView d224,
                             TextView d231, TextView d232, TextView d233, TextView d234,
                             TextView d241, TextView d242, TextView d243, TextView d244,
                             TextView d251, TextView d252, TextView d253, TextView d254,
                             TextView d261, TextView d262, TextView d263, TextView d264,
                             TextView d271, TextView d272, TextView d273, TextView d274,
                             TextView d281, TextView d282, TextView d283, TextView d284,
                             TextView d291, TextView d292, TextView d293, TextView d294,
                             TextView d301, TextView d302, TextView d303, TextView d304,
                             TextView d321, TextView d322, TextView d323, TextView d324,
                             TextView d341, TextView d342, TextView d343, TextView d344,
                             TextView d361, TextView d362, TextView d363, TextView d364,
                             TextView d381, TextView d382, TextView d383, TextView d384,
                             TextView d401, TextView d402, TextView d403, TextView d404,
                             TextView d421, TextView d422, TextView d423, TextView d424,
                             TextView d441, TextView d442, TextView d443, TextView d444,
                             TextView d451, TextView d452, TextView d453, TextView d454,
                             TextView d461, TextView d462, TextView d463, TextView d464,
                             TextView d471, TextView d472, TextView d473, TextView d474,
                             TextView d481, TextView d482, TextView d483, TextView d484,
                             TextView d501, TextView d502, TextView d503, TextView d504,
                             TextView d511, TextView d512, TextView d513, TextView d514,
                             TextView d521, TextView d522, TextView d523, TextView d524,
                             TextView d541, TextView d542, TextView d543, TextView d544,
                             TextView d551, TextView d552, TextView d553, TextView d554,
                             TextView d561, TextView d562, TextView d563, TextView d564,
                             TextView d581, TextView d582, TextView d583, TextView d584,
                             TextView d601, TextView d602, TextView d603, TextView d604,
                             TextView d611, TextView d612, TextView d613, TextView d614,
                             TextView d621, TextView d622, TextView d623, TextView d624,
                             TextView d641, TextView d642, TextView d643, TextView d644,
                             TextView d651, TextView d652, TextView d653, TextView d654,
                             TextView d661, TextView d662, TextView d663, TextView d664,
                             TextView d671, TextView d672, TextView d673, TextView d674,
                             TextView d681, TextView d682, TextView d683, TextView d684,
                             TextView d701, TextView d702, TextView d703, TextView d704,
                             TextView d721, TextView d722, TextView d723, TextView d724,
                             TextView d741, TextView d742, TextView d743, TextView d744,
                             TextView d751, TextView d752, TextView d753, TextView d754,
                             TextView d771, TextView d772, TextView d773, TextView d774,
                             TextView d791, TextView d792, TextView d793, TextView d794,
                             TextView d801, TextView d802, TextView d803, TextView d804) {
        // 모든 뷰 숨기기
        dayBoothCard0102.setVisibility(View.GONE);
        dayBoothCard0304.setVisibility(View.GONE);
        dayBoothCard05.setVisibility(View.GONE);
        dayBoothCard06.setVisibility(View.GONE);
        dayBoothCard07.setVisibility(View.GONE);
        dayBoothCard08.setVisibility(View.GONE);
        dayBoothCard0910.setVisibility(View.GONE);
        dayBoothCard1112.setVisibility(View.GONE);
        dayBoothCard1314.setVisibility(View.GONE);
        dayBoothCard1516.setVisibility(View.GONE);
        dayBoothCard17.setVisibility(View.GONE);
        dayBoothCard18.setVisibility(View.GONE);
        dayBoothCard19.setVisibility(View.GONE);
        dayBoothCard20.setVisibility(View.GONE);
        dayBoothCard21.setVisibility(View.GONE);
        dayBoothCard22.setVisibility(View.GONE);
        dayBoothCard23.setVisibility(View.GONE);
        dayBoothCard24.setVisibility(View.GONE);
        dayBoothCard25.setVisibility(View.GONE);
        dayBoothCard26.setVisibility(View.GONE);
        dayBoothCard27.setVisibility(View.GONE);
        dayBoothCard28.setVisibility(View.GONE);
        dayBoothCard29.setVisibility(View.GONE);
        dayBoothCard3031.setVisibility(View.GONE);
        dayBoothCard3233.setVisibility(View.GONE);
        dayBoothCard3435.setVisibility(View.GONE);
        dayBoothCard3637.setVisibility(View.GONE);
        dayBoothCard3839.setVisibility(View.GONE);
        dayBoothCard4041.setVisibility(View.GONE);
        dayBoothCard4243.setVisibility(View.GONE);
        dayBoothCard44.setVisibility(View.GONE);
        dayBoothCard45.setVisibility(View.GONE);
        dayBoothCard46.setVisibility(View.GONE);
        dayBoothCard47.setVisibility(View.GONE);
        dayBoothCard4849.setVisibility(View.GONE);
        dayBoothCard50.setVisibility(View.GONE);
        dayBoothCard51.setVisibility(View.GONE);
        dayBoothCard5253.setVisibility(View.GONE);
        dayBoothCard54.setVisibility(View.GONE);
        dayBoothCard55.setVisibility(View.GONE);
        dayBoothCard5657.setVisibility(View.GONE);
        dayBoothCard5859.setVisibility(View.GONE);
        dayBoothCard60.setVisibility(View.GONE);
        dayBoothCard61.setVisibility(View.GONE);
        dayBoothCard6263.setVisibility(View.GONE);
        dayBoothCard64.setVisibility(View.GONE);
        dayBoothCard65.setVisibility(View.GONE);
        dayBoothCard66.setVisibility(View.GONE);
        dayBoothCard67.setVisibility(View.GONE);
        dayBoothCard6869.setVisibility(View.GONE);
        dayBoothCard7071.setVisibility(View.GONE);
        dayBoothCard7273.setVisibility(View.GONE);
        dayBoothCard74.setVisibility(View.GONE);
        dayBoothCard7576.setVisibility(View.GONE);
        dayBoothCard7778.setVisibility(View.GONE);
        dayBoothCard79.setVisibility(View.GONE);
        dayBoothCard80.setVisibility(View.GONE);

        if (dayCheck == 1){
            if (d011.getText().toString().contains(query) || d012.getText().toString().contains(query) || d013.getText().toString().contains(query) || d014.getText().toString().contains(query)) {
                dayBoothCard0102.setVisibility(View.VISIBLE);
            }if (d031.getText().toString().contains(query) || d032.getText().toString().contains(query) || d032.getText().toString().contains(query) || d034.getText().toString().contains(query)) {
                dayBoothCard0304.setVisibility(View.VISIBLE);
            }if (d051.getText().toString().contains(query) || d052.getText().toString().contains(query) || d052.getText().toString().contains(query) || d054.getText().toString().contains(query)) {
                dayBoothCard05.setVisibility(View.VISIBLE);
            }if (d061.getText().toString().contains(query) || d062.getText().toString().contains(query) || d062.getText().toString().contains(query) || d064.getText().toString().contains(query)) {
                dayBoothCard06.setVisibility(View.VISIBLE);
            }if (d071.getText().toString().contains(query) || d072.getText().toString().contains(query) || d073.getText().toString().contains(query) || d074.getText().toString().contains(query)) {
                dayBoothCard07.setVisibility(View.VISIBLE);
            }if (d081.getText().toString().contains(query) || d082.getText().toString().contains(query) || d083.getText().toString().contains(query) || d084.getText().toString().contains(query)) {
                dayBoothCard08.setVisibility(View.VISIBLE);
            }if (d091.getText().toString().contains(query) || d092.getText().toString().contains(query) || d093.getText().toString().contains(query) || d094.getText().toString().contains(query)) {
                dayBoothCard0910.setVisibility(View.VISIBLE);
            }if (d111.getText().toString().contains(query) || d112.getText().toString().contains(query) || d113.getText().toString().contains(query) || d114.getText().toString().contains(query)) {
                dayBoothCard1112.setVisibility(View.VISIBLE);
            }if (d131.getText().toString().contains(query) || d132.getText().toString().contains(query) || d133.getText().toString().contains(query) || d134.getText().toString().contains(query)) {
                dayBoothCard1314.setVisibility(View.VISIBLE);
            }if (d151.getText().toString().contains(query) || d152.getText().toString().contains(query) || d153.getText().toString().contains(query) || d154.getText().toString().contains(query)) {
                dayBoothCard1516.setVisibility(View.VISIBLE);
            }if (d171.getText().toString().contains(query) || d172.getText().toString().contains(query) || d173.getText().toString().contains(query) || d174.getText().toString().contains(query)) {
                dayBoothCard17.setVisibility(View.VISIBLE);
            }if (d181.getText().toString().contains(query) || d182.getText().toString().contains(query) || d183.getText().toString().contains(query) || d184.getText().toString().contains(query)) {
                dayBoothCard18.setVisibility(View.VISIBLE);
            }if (d191.getText().toString().contains(query) || d192.getText().toString().contains(query) || d193.getText().toString().contains(query) || d194.getText().toString().contains(query)) {
                dayBoothCard19.setVisibility(View.VISIBLE);
            }if (d201.getText().toString().contains(query) || d202.getText().toString().contains(query) || d203.getText().toString().contains(query) || d204.getText().toString().contains(query)) {
                dayBoothCard20.setVisibility(View.VISIBLE);
            }if (d211.getText().toString().contains(query) || d212.getText().toString().contains(query) || d213.getText().toString().contains(query) || d214.getText().toString().contains(query)) {
                dayBoothCard21.setVisibility(View.VISIBLE);
            }if (d221.getText().toString().contains(query) || d222.getText().toString().contains(query) || d223.getText().toString().contains(query) || d224.getText().toString().contains(query)) {
                dayBoothCard22.setVisibility(View.VISIBLE);
            }if (d231.getText().toString().contains(query) || d232.getText().toString().contains(query) || d233.getText().toString().contains(query) || d234.getText().toString().contains(query)) {
                dayBoothCard23.setVisibility(View.VISIBLE);
            }if (d241.getText().toString().contains(query) || d242.getText().toString().contains(query) || d243.getText().toString().contains(query) || d244.getText().toString().contains(query)) {
                dayBoothCard24.setVisibility(View.VISIBLE);
            }if (d251.getText().toString().contains(query) || d252.getText().toString().contains(query) || d253.getText().toString().contains(query) || d254.getText().toString().contains(query)) {
                dayBoothCard25.setVisibility(View.VISIBLE);
            }if (d261.getText().toString().contains(query) || d262.getText().toString().contains(query) || d263.getText().toString().contains(query) || d264.getText().toString().contains(query)) {
                dayBoothCard26.setVisibility(View.VISIBLE);
            }if (d271.getText().toString().contains(query) || d272.getText().toString().contains(query) || d273.getText().toString().contains(query) || d274.getText().toString().contains(query)) {
                dayBoothCard27.setVisibility(View.VISIBLE);
            }if (d281.getText().toString().contains(query) || d282.getText().toString().contains(query) || d283.getText().toString().contains(query) || d284.getText().toString().contains(query)) {
                dayBoothCard28.setVisibility(View.VISIBLE);
            }if (d291.getText().toString().contains(query) || d292.getText().toString().contains(query) || d293.getText().toString().contains(query) || d294.getText().toString().contains(query)) {
                dayBoothCard29.setVisibility(View.VISIBLE);
            }if (d301.getText().toString().contains(query) || d302.getText().toString().contains(query) || d303.getText().toString().contains(query) || d304.getText().toString().contains(query)) {
                dayBoothCard3031.setVisibility(View.VISIBLE);
            }if (d321.getText().toString().contains(query) || d322.getText().toString().contains(query) || d323.getText().toString().contains(query) || d324.getText().toString().contains(query)) {
                dayBoothCard3233.setVisibility(View.VISIBLE);
            }if (d341.getText().toString().contains(query) || d342.getText().toString().contains(query) || d343.getText().toString().contains(query) || d344.getText().toString().contains(query)) {
                dayBoothCard3435.setVisibility(View.VISIBLE);
            }if (d361.getText().toString().contains(query) || d362.getText().toString().contains(query) || d363.getText().toString().contains(query) || d364.getText().toString().contains(query)) {
                dayBoothCard3637.setVisibility(View.VISIBLE);
            }if (d381.getText().toString().contains(query) || d382.getText().toString().contains(query) || d383.getText().toString().contains(query) || d384.getText().toString().contains(query)) {
                dayBoothCard3839.setVisibility(View.VISIBLE);
            }if (d401.getText().toString().contains(query) || d402.getText().toString().contains(query) || d403.getText().toString().contains(query) || d404.getText().toString().contains(query)) {
                dayBoothCard4041.setVisibility(View.VISIBLE);
            }if (d421.getText().toString().contains(query) || d422.getText().toString().contains(query) || d423.getText().toString().contains(query) || d424.getText().toString().contains(query)) {
                dayBoothCard4243.setVisibility(View.VISIBLE);
            }if (d441.getText().toString().contains(query) || d442.getText().toString().contains(query) || d443.getText().toString().contains(query) || d444.getText().toString().contains(query)) {
                dayBoothCard44.setVisibility(View.VISIBLE);
            }if (d451.getText().toString().contains(query) || d452.getText().toString().contains(query) || d453.getText().toString().contains(query) || d454.getText().toString().contains(query)) {
                dayBoothCard45.setVisibility(View.VISIBLE);
            }if (d461.getText().toString().contains(query) || d462.getText().toString().contains(query) || d463.getText().toString().contains(query) || d464.getText().toString().contains(query)) {
                dayBoothCard46.setVisibility(View.VISIBLE);
            }if (d471.getText().toString().contains(query) || d472.getText().toString().contains(query) || d473.getText().toString().contains(query) || d474.getText().toString().contains(query)) {
                dayBoothCard47.setVisibility(View.VISIBLE);
            }if (d481.getText().toString().contains(query) || d482.getText().toString().contains(query) || d483.getText().toString().contains(query) || d484.getText().toString().contains(query)) {
                dayBoothCard4849.setVisibility(View.VISIBLE);
            }if (d501.getText().toString().contains(query) || d502.getText().toString().contains(query) || d503.getText().toString().contains(query) || d504.getText().toString().contains(query)) {
                dayBoothCard50.setVisibility(View.VISIBLE);
            }if (d511.getText().toString().contains(query) || d512.getText().toString().contains(query) || d513.getText().toString().contains(query) || d514.getText().toString().contains(query)) {
                dayBoothCard51.setVisibility(View.VISIBLE);
            }if (d521.getText().toString().contains(query) || d522.getText().toString().contains(query) || d523.getText().toString().contains(query) || d524.getText().toString().contains(query)) {
                dayBoothCard5253.setVisibility(View.VISIBLE);
            }if (d541.getText().toString().contains(query) || d542.getText().toString().contains(query) || d543.getText().toString().contains(query) || d544.getText().toString().contains(query)) {
                dayBoothCard54.setVisibility(View.VISIBLE);
            }if (d551.getText().toString().contains(query) || d552.getText().toString().contains(query) || d553.getText().toString().contains(query) || d554.getText().toString().contains(query)) {
                dayBoothCard55.setVisibility(View.VISIBLE);
            }if (d561.getText().toString().contains(query) || d562.getText().toString().contains(query) || d563.getText().toString().contains(query) || d564.getText().toString().contains(query)) {
                dayBoothCard5657.setVisibility(View.VISIBLE);
            }if (d581.getText().toString().contains(query) || d582.getText().toString().contains(query) || d583.getText().toString().contains(query) || d584.getText().toString().contains(query)) {
                dayBoothCard5859.setVisibility(View.VISIBLE);
            }if (d751.getText().toString().contains(query) || d752.getText().toString().contains(query) || d753.getText().toString().contains(query) || d754.getText().toString().contains(query)) {
                dayBoothCard7576.setVisibility(View.VISIBLE);
            }if (d771.getText().toString().contains(query) || d772.getText().toString().contains(query) || d773.getText().toString().contains(query) || d774.getText().toString().contains(query)) {
                dayBoothCard7778.setVisibility(View.VISIBLE);
            }if (d791.getText().toString().contains(query) || d792.getText().toString().contains(query) || d793.getText().toString().contains(query) || d794.getText().toString().contains(query)) {
                dayBoothCard79.setVisibility(View.VISIBLE);
            }
        }else if (dayCheck == 2){
            if (d011.getText().toString().contains(query) || d012.getText().toString().contains(query) || d013.getText().toString().contains(query) || d014.getText().toString().contains(query)) {
                dayBoothCard0102.setVisibility(View.VISIBLE);
            }if (d031.getText().toString().contains(query) || d032.getText().toString().contains(query) || d032.getText().toString().contains(query) || d034.getText().toString().contains(query)) {
                dayBoothCard0304.setVisibility(View.VISIBLE);
            }if (d051.getText().toString().contains(query) || d052.getText().toString().contains(query) || d052.getText().toString().contains(query) || d054.getText().toString().contains(query)) {
                dayBoothCard05.setVisibility(View.VISIBLE);
            }if (d061.getText().toString().contains(query) || d062.getText().toString().contains(query) || d062.getText().toString().contains(query) || d064.getText().toString().contains(query)) {
                dayBoothCard06.setVisibility(View.VISIBLE);
            }if (d071.getText().toString().contains(query) || d072.getText().toString().contains(query) || d073.getText().toString().contains(query) || d074.getText().toString().contains(query)) {
                dayBoothCard07.setVisibility(View.VISIBLE);
            }if (d081.getText().toString().contains(query) || d082.getText().toString().contains(query) || d083.getText().toString().contains(query) || d084.getText().toString().contains(query)) {
                dayBoothCard08.setVisibility(View.VISIBLE);
            }if (d091.getText().toString().contains(query) || d092.getText().toString().contains(query) || d093.getText().toString().contains(query) || d094.getText().toString().contains(query)) {
                dayBoothCard0910.setVisibility(View.VISIBLE);
            }if (d181.getText().toString().contains(query) || d182.getText().toString().contains(query) || d183.getText().toString().contains(query) || d184.getText().toString().contains(query)) {
                dayBoothCard18.setVisibility(View.VISIBLE);
            }if (d191.getText().toString().contains(query) || d192.getText().toString().contains(query) || d193.getText().toString().contains(query) || d194.getText().toString().contains(query)) {
                dayBoothCard19.setVisibility(View.VISIBLE);
            }if (d201.getText().toString().contains(query) || d202.getText().toString().contains(query) || d203.getText().toString().contains(query) || d204.getText().toString().contains(query)) {
                dayBoothCard20.setVisibility(View.VISIBLE);
            }if (d211.getText().toString().contains(query) || d212.getText().toString().contains(query) || d213.getText().toString().contains(query) || d214.getText().toString().contains(query)) {
                dayBoothCard21.setVisibility(View.VISIBLE);
            }if (d221.getText().toString().contains(query) || d222.getText().toString().contains(query) || d223.getText().toString().contains(query) || d224.getText().toString().contains(query)) {
                dayBoothCard22.setVisibility(View.VISIBLE);
            }if (d231.getText().toString().contains(query) || d232.getText().toString().contains(query) || d233.getText().toString().contains(query) || d234.getText().toString().contains(query)) {
                dayBoothCard23.setVisibility(View.VISIBLE);
            }if (d241.getText().toString().contains(query) || d242.getText().toString().contains(query) || d243.getText().toString().contains(query) || d244.getText().toString().contains(query)) {
                dayBoothCard24.setVisibility(View.VISIBLE);
            }if (d251.getText().toString().contains(query) || d252.getText().toString().contains(query) || d253.getText().toString().contains(query) || d254.getText().toString().contains(query)) {
                dayBoothCard25.setVisibility(View.VISIBLE);
            }if (d261.getText().toString().contains(query) || d262.getText().toString().contains(query) || d263.getText().toString().contains(query) || d264.getText().toString().contains(query)) {
                dayBoothCard26.setVisibility(View.VISIBLE);
            }if (d271.getText().toString().contains(query) || d272.getText().toString().contains(query) || d273.getText().toString().contains(query) || d274.getText().toString().contains(query)) {
                dayBoothCard27.setVisibility(View.VISIBLE);
            }if (d301.getText().toString().contains(query) || d302.getText().toString().contains(query) || d303.getText().toString().contains(query) || d304.getText().toString().contains(query)) {
                dayBoothCard3031.setVisibility(View.VISIBLE);
            }if (d321.getText().toString().contains(query) || d322.getText().toString().contains(query) || d323.getText().toString().contains(query) || d324.getText().toString().contains(query)) {
                dayBoothCard3233.setVisibility(View.VISIBLE);
            }if (d341.getText().toString().contains(query) || d342.getText().toString().contains(query) || d343.getText().toString().contains(query) || d344.getText().toString().contains(query)) {
                dayBoothCard3435.setVisibility(View.VISIBLE);
            }if (d361.getText().toString().contains(query) || d362.getText().toString().contains(query) || d363.getText().toString().contains(query) || d364.getText().toString().contains(query)) {
                dayBoothCard3637.setVisibility(View.VISIBLE);
            }if (d381.getText().toString().contains(query) || d382.getText().toString().contains(query) || d383.getText().toString().contains(query) || d384.getText().toString().contains(query)) {
                dayBoothCard3839.setVisibility(View.VISIBLE);
            }if (d421.getText().toString().contains(query) || d422.getText().toString().contains(query) || d423.getText().toString().contains(query) || d424.getText().toString().contains(query)) {
                dayBoothCard4243.setVisibility(View.VISIBLE);
            }if (d441.getText().toString().contains(query) || d442.getText().toString().contains(query) || d443.getText().toString().contains(query) || d444.getText().toString().contains(query)) {
                dayBoothCard44.setVisibility(View.VISIBLE);
            }if (d451.getText().toString().contains(query) || d452.getText().toString().contains(query) || d453.getText().toString().contains(query) || d454.getText().toString().contains(query)) {
                dayBoothCard45.setVisibility(View.VISIBLE);
            }if (d461.getText().toString().contains(query) || d462.getText().toString().contains(query) || d463.getText().toString().contains(query) || d464.getText().toString().contains(query)) {
                dayBoothCard46.setVisibility(View.VISIBLE);
            }if (d471.getText().toString().contains(query) || d472.getText().toString().contains(query) || d473.getText().toString().contains(query) || d474.getText().toString().contains(query)) {
                dayBoothCard47.setVisibility(View.VISIBLE);
            }if (d481.getText().toString().contains(query) || d482.getText().toString().contains(query) || d483.getText().toString().contains(query) || d484.getText().toString().contains(query)) {
                dayBoothCard4849.setVisibility(View.VISIBLE);
            }if (d521.getText().toString().contains(query) || d522.getText().toString().contains(query) || d523.getText().toString().contains(query) || d524.getText().toString().contains(query)) {
                dayBoothCard5253.setVisibility(View.VISIBLE);
            }if (d541.getText().toString().contains(query) || d542.getText().toString().contains(query) || d543.getText().toString().contains(query) || d544.getText().toString().contains(query)) {
                dayBoothCard54.setVisibility(View.VISIBLE);
            }if (d551.getText().toString().contains(query) || d552.getText().toString().contains(query) || d553.getText().toString().contains(query) || d554.getText().toString().contains(query)) {
                dayBoothCard55.setVisibility(View.VISIBLE);
            }if (d561.getText().toString().contains(query) || d562.getText().toString().contains(query) || d563.getText().toString().contains(query) || d564.getText().toString().contains(query)) {
                dayBoothCard5657.setVisibility(View.VISIBLE);
            }if (d581.getText().toString().contains(query) || d582.getText().toString().contains(query) || d583.getText().toString().contains(query) || d584.getText().toString().contains(query)) {
                dayBoothCard5859.setVisibility(View.VISIBLE);
            }if (d601.getText().toString().contains(query) || d602.getText().toString().contains(query) || d603.getText().toString().contains(query) || d604.getText().toString().contains(query)) {
                dayBoothCard60.setVisibility(View.VISIBLE);
            }if (d611.getText().toString().contains(query) || d612.getText().toString().contains(query) || d613.getText().toString().contains(query) || d614.getText().toString().contains(query)) {
                dayBoothCard61.setVisibility(View.VISIBLE);
            }if (d621.getText().toString().contains(query) || d622.getText().toString().contains(query) || d623.getText().toString().contains(query) || d624.getText().toString().contains(query)) {
                dayBoothCard6263.setVisibility(View.VISIBLE);
            }if (d641.getText().toString().contains(query) || d642.getText().toString().contains(query) || d643.getText().toString().contains(query) || d644.getText().toString().contains(query)) {
                dayBoothCard64.setVisibility(View.VISIBLE);
            }if (d651.getText().toString().contains(query) || d652.getText().toString().contains(query) || d653.getText().toString().contains(query) || d654.getText().toString().contains(query)) {
                dayBoothCard65.setVisibility(View.VISIBLE);
            }if (d661.getText().toString().contains(query) || d662.getText().toString().contains(query) || d663.getText().toString().contains(query) || d664.getText().toString().contains(query)) {
                dayBoothCard66.setVisibility(View.VISIBLE);
            }if (d671.getText().toString().contains(query) || d672.getText().toString().contains(query) || d673.getText().toString().contains(query) || d674.getText().toString().contains(query)) {
                dayBoothCard67.setVisibility(View.VISIBLE);
            }if (d681.getText().toString().contains(query) || d682.getText().toString().contains(query) || d683.getText().toString().contains(query) || d684.getText().toString().contains(query)) {
                dayBoothCard6869.setVisibility(View.VISIBLE);
            }if (d701.getText().toString().contains(query) || d702.getText().toString().contains(query) || d703.getText().toString().contains(query) || d704.getText().toString().contains(query)) {
                dayBoothCard7071.setVisibility(View.VISIBLE);
            }
        }else if (dayCheck == 3){
            if (d011.getText().toString().contains(query) || d012.getText().toString().contains(query) || d013.getText().toString().contains(query) || d014.getText().toString().contains(query)) {
                dayBoothCard0102.setVisibility(View.VISIBLE);
            }if (d031.getText().toString().contains(query) || d032.getText().toString().contains(query) || d032.getText().toString().contains(query) || d034.getText().toString().contains(query)) {
                dayBoothCard0304.setVisibility(View.VISIBLE);
            }if (d091.getText().toString().contains(query) || d092.getText().toString().contains(query) || d093.getText().toString().contains(query) || d094.getText().toString().contains(query)) {
                dayBoothCard0910.setVisibility(View.VISIBLE);
            }if (d111.getText().toString().contains(query) || d112.getText().toString().contains(query) || d113.getText().toString().contains(query) || d114.getText().toString().contains(query)) {
                dayBoothCard1112.setVisibility(View.VISIBLE);
            }if (d131.getText().toString().contains(query) || d132.getText().toString().contains(query) || d133.getText().toString().contains(query) || d134.getText().toString().contains(query)) {
                dayBoothCard1314.setVisibility(View.VISIBLE);
            }if (d221.getText().toString().contains(query) || d222.getText().toString().contains(query) || d223.getText().toString().contains(query) || d224.getText().toString().contains(query)) {
                dayBoothCard22.setVisibility(View.VISIBLE);
            }if (d231.getText().toString().contains(query) || d232.getText().toString().contains(query) || d233.getText().toString().contains(query) || d234.getText().toString().contains(query)) {
                dayBoothCard23.setVisibility(View.VISIBLE);
            }if (d241.getText().toString().contains(query) || d242.getText().toString().contains(query) || d243.getText().toString().contains(query) || d244.getText().toString().contains(query)) {
                dayBoothCard24.setVisibility(View.VISIBLE);
            }if (d251.getText().toString().contains(query) || d252.getText().toString().contains(query) || d253.getText().toString().contains(query) || d254.getText().toString().contains(query)) {
                dayBoothCard25.setVisibility(View.VISIBLE);
            }if (d261.getText().toString().contains(query) || d262.getText().toString().contains(query) || d263.getText().toString().contains(query) || d264.getText().toString().contains(query)) {
                dayBoothCard26.setVisibility(View.VISIBLE);
            }if (d271.getText().toString().contains(query) || d272.getText().toString().contains(query) || d273.getText().toString().contains(query) || d274.getText().toString().contains(query)) {
                dayBoothCard27.setVisibility(View.VISIBLE);
            }if (d301.getText().toString().contains(query) || d302.getText().toString().contains(query) || d303.getText().toString().contains(query) || d304.getText().toString().contains(query)) {
                dayBoothCard3031.setVisibility(View.VISIBLE);
            }if (d421.getText().toString().contains(query) || d422.getText().toString().contains(query) || d423.getText().toString().contains(query) || d424.getText().toString().contains(query)) {
                dayBoothCard4243.setVisibility(View.VISIBLE);
            }if (d441.getText().toString().contains(query) || d442.getText().toString().contains(query) || d443.getText().toString().contains(query) || d444.getText().toString().contains(query)) {
                dayBoothCard44.setVisibility(View.VISIBLE);
            }if (d451.getText().toString().contains(query) || d452.getText().toString().contains(query) || d453.getText().toString().contains(query) || d454.getText().toString().contains(query)) {
                dayBoothCard45.setVisibility(View.VISIBLE);
            }if (d461.getText().toString().contains(query) || d462.getText().toString().contains(query) || d463.getText().toString().contains(query) || d464.getText().toString().contains(query)) {
                dayBoothCard46.setVisibility(View.VISIBLE);
            }if (d471.getText().toString().contains(query) || d472.getText().toString().contains(query) || d473.getText().toString().contains(query) || d474.getText().toString().contains(query)) {
                dayBoothCard47.setVisibility(View.VISIBLE);
            }if (d521.getText().toString().contains(query) || d522.getText().toString().contains(query) || d523.getText().toString().contains(query) || d524.getText().toString().contains(query)) {
                dayBoothCard5253.setVisibility(View.VISIBLE);
            }if (d541.getText().toString().contains(query) || d542.getText().toString().contains(query) || d543.getText().toString().contains(query) || d544.getText().toString().contains(query)) {
                dayBoothCard54.setVisibility(View.VISIBLE);
            }if (d551.getText().toString().contains(query) || d552.getText().toString().contains(query) || d553.getText().toString().contains(query) || d554.getText().toString().contains(query)) {
                dayBoothCard55.setVisibility(View.VISIBLE);
            }if (d561.getText().toString().contains(query) || d562.getText().toString().contains(query) || d563.getText().toString().contains(query) || d564.getText().toString().contains(query)) {
                dayBoothCard5657.setVisibility(View.VISIBLE);
            }if (d581.getText().toString().contains(query) || d582.getText().toString().contains(query) || d583.getText().toString().contains(query) || d584.getText().toString().contains(query)) {
                dayBoothCard5859.setVisibility(View.VISIBLE);
            }if (d601.getText().toString().contains(query) || d602.getText().toString().contains(query) || d603.getText().toString().contains(query) || d604.getText().toString().contains(query)) {
                dayBoothCard60.setVisibility(View.VISIBLE);
            }if (d621.getText().toString().contains(query) || d622.getText().toString().contains(query) || d623.getText().toString().contains(query) || d624.getText().toString().contains(query)) {
                dayBoothCard6263.setVisibility(View.VISIBLE);
            }if (d661.getText().toString().contains(query) || d662.getText().toString().contains(query) || d663.getText().toString().contains(query) || d664.getText().toString().contains(query)) {
                dayBoothCard66.setVisibility(View.VISIBLE);
            }if (d671.getText().toString().contains(query) || d672.getText().toString().contains(query) || d673.getText().toString().contains(query) || d674.getText().toString().contains(query)) {
                dayBoothCard67.setVisibility(View.VISIBLE);
            }if (d721.getText().toString().contains(query) || d722.getText().toString().contains(query) || d723.getText().toString().contains(query) || d724.getText().toString().contains(query)) {
                dayBoothCard7273.setVisibility(View.VISIBLE);
            }if (d741.getText().toString().contains(query) || d742.getText().toString().contains(query) || d743.getText().toString().contains(query) || d744.getText().toString().contains(query)) {
                dayBoothCard74.setVisibility(View.VISIBLE);
            }if (d751.getText().toString().contains(query) || d752.getText().toString().contains(query) || d753.getText().toString().contains(query) || d754.getText().toString().contains(query)) {
                dayBoothCard7576.setVisibility(View.VISIBLE);
            }if (d801.getText().toString().contains(query) || d802.getText().toString().contains(query) || d803.getText().toString().contains(query) || d804.getText().toString().contains(query)) {
                dayBoothCard80.setVisibility(View.VISIBLE);
            }
        }
    }
}
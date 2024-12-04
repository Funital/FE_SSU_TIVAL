package com.foo.fessutival.Home.festival_information;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.bumptech.glide.Glide;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.ArtistLineUpActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_1.A10cmActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_1.ChangmoActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_1.HighlightActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_1.TheWindActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_2.BbangsonggukActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_2.Fromis9Activity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_2.HahyunsangActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_2.ResceneActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_2.RoyKimActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_2.YdbbActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_3.BewhyActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_3.CnblueActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_3.LilboiActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_3.LucyActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.artist.day_3.YounhaActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.booth.DayBoothActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.booth.FoodTruckActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.booth.NightBoothActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.event.GoodsActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.event.HeadOfficeEventActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.event.PhotoBoothActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.event.PromotionProductActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.event.SpecialEventActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.notice.CommercialPartnershipActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.notice.InquiryActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.notice.PenaltyPointsAbolitionActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.notice.PromotionIntroduction;
import com.foo.fessutival.Home.festival_information.festival_notification.notice.WastePlaceActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.stage.MainStageBannedListActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.stage.MainStageEntranceActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.stage.MainStageTrafficNoticeActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.stage.MainStageWatingLineActivity;
import com.foo.fessutival.Home.festival_information.festival_notification.stage.SubStageNoticeActivity;
import com.foo.fessutival.R;

public class Home_festival_informationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_festival_information);

        ImageView mainPosterVertical = findViewById(R.id.main_poster_vertical);

        String mainPosterVerticalURL = "https://drive.google.com/uc?export=view&id=1_4-872Ls50iVgTi5gefvqwKoeavIPLkw";

        Glide.with(this)
                .load(mainPosterVerticalURL)
                .into(mainPosterVertical);

        Button informationAllButton = findViewById(R.id.information_all);
        Button informationArtistButton = findViewById(R.id.information_artist);
        Button informationBoothButton = findViewById(R.id.information_booth);
        Button informationEventButton = findViewById(R.id.information_event);
        Button informationNoticeButton = findViewById(R.id.information_notice);
        Button informationStageButton = findViewById(R.id.information_stage);

        // Stage CardView
        CardView mainStageBannedListCard = findViewById(R.id.main_stage_banned_list_card);
        CardView mainStageEntranceCard = findViewById(R.id.main_stage_entrance_card);
        CardView mainStageTrafficNoticeCard = findViewById(R.id.main_stage_traffic_notice_card);
        CardView mainStageWatingLineCard = findViewById(R.id.main_stage_wating_line_card);
        CardView subStageNoticeCard = findViewById(R.id.sub_stage_notice_card);

        // Booth CardView
        CardView dayBoothCard = findViewById(R.id.day_booth_card);
        CardView foodTruckCard = findViewById(R.id.food_truck_card);
        CardView hiteJinroBoothCard = findViewById(R.id.hite_jinro_booth_card);
        CardView nightBoothCard = findViewById(R.id.night_booth_card);

        // Event CardView
        CardView goodsCard = findViewById(R.id.goods_card);
        CardView headOfficeEventCard = findViewById(R.id.head_office_event_card);
        CardView photoBoothCard = findViewById(R.id.photo_booth_card);
        CardView promotionProductCard = findViewById(R.id.promotion_product_card);
        CardView specialEventCard = findViewById(R.id.special_event_card);

        // Notice CardView
        CardView commercialPartnershipCard = findViewById(R.id.commercial_partnership_card);
        CardView inquiryCard = findViewById(R.id.inquiry_card);
        CardView penaltyPointsAbolitionCard = findViewById(R.id.penalty_points_abolition_card);
        CardView promotionIntroductionCard = findViewById(R.id.promotion_introduction_card);
        CardView wastePlaceCard = findViewById(R.id.waste_place_card);

        // Artist CardView
        CardView artistLineUpCard = findViewById(R.id.artist_line_up_card);

        CardView highlightCard = findViewById(R.id.highlight_card);
        CardView changmoCard = findViewById(R.id.changmo_card);
        CardView a10cmCard = findViewById(R.id.a10cm_card);
        CardView theWindCard = findViewById(R.id.the_wind_card);

        CardView royKimCard = findViewById(R.id.roy_kim_card);
        CardView hahyunsangCard = findViewById(R.id.hahyunsang_card);
        CardView ydbbCard = findViewById(R.id.ydbb_card);
        CardView fromis9Card = findViewById(R.id.fromis_9_card);
        CardView resceneCard = findViewById(R.id.rescene_card);
        CardView bbangsonggukCard = findViewById(R.id.bbangsongguk_card);

        CardView younhaCard = findViewById(R.id.younha_card);
        CardView lucyCard = findViewById(R.id.lucy_card);
        CardView lilboiCard = findViewById(R.id.lilboi_card);
        CardView bewhyCard = findViewById(R.id.bewhy_card);
        CardView cnblueCard = findViewById(R.id.cnblue_card);


        mainStageBannedListCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, MainStageBannedListActivity.class));
            }
        });

        mainStageEntranceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, MainStageEntranceActivity.class));
            }
        });

        mainStageTrafficNoticeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, MainStageTrafficNoticeActivity.class));
            }
        });

        mainStageWatingLineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, MainStageWatingLineActivity.class));
            }
        });

        subStageNoticeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, SubStageNoticeActivity.class));
            }
        });

        dayBoothCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, DayBoothActivity.class));
            }
        });

        foodTruckCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, FoodTruckActivity.class));
            }
        });

        hiteJinroBoothCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, Home_festival_informationActivity.class));
            }
        });

        nightBoothCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, NightBoothActivity.class));
            }
        });

        goodsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, GoodsActivity.class));
            }
        });

        headOfficeEventCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, HeadOfficeEventActivity.class));
            }
        });

        photoBoothCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, PhotoBoothActivity.class));
            }
        });

        promotionProductCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, PromotionProductActivity.class));
            }
        });

        specialEventCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, SpecialEventActivity.class));
            }
        });

        commercialPartnershipCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, CommercialPartnershipActivity.class));
            }
        });

        inquiryCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, InquiryActivity.class));
            }
        });

        penaltyPointsAbolitionCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, PenaltyPointsAbolitionActivity.class));
            }
        });

        promotionIntroductionCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, PromotionIntroduction.class));
            }
        });

        wastePlaceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, WastePlaceActivity.class));
            }
        });

        artistLineUpCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, ArtistLineUpActivity.class));
            }
        });

        a10cmCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, A10cmActivity.class));
            }
        });

        changmoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, ChangmoActivity.class));
            }
        });

        highlightCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, HighlightActivity.class));
            }
        });

        theWindCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, TheWindActivity.class));
            }
        });

        bbangsonggukCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, BbangsonggukActivity.class));
            }
        });

        fromis9Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, Fromis9Activity.class));
            }
        });

        hahyunsangCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, HahyunsangActivity.class));
            }
        });

        resceneCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, ResceneActivity.class));
            }
        });

        royKimCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, RoyKimActivity.class));
            }
        });

        ydbbCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, YdbbActivity.class));
            }
        });

        bewhyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, BewhyActivity.class));
            }
        });

        cnblueCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, CnblueActivity.class));
            }
        });

        lilboiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, LilboiActivity.class));
            }
        });

        lucyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, LucyActivity.class));
            }
        });

        younhaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_festival_informationActivity.this, YounhaActivity.class));
            }
        });

        informationAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainStageBannedListCard.setVisibility(View.VISIBLE);
                mainStageEntranceCard.setVisibility(View.VISIBLE);
                mainStageTrafficNoticeCard.setVisibility(View.VISIBLE);
                mainStageWatingLineCard.setVisibility(View.VISIBLE);
                subStageNoticeCard.setVisibility(View.VISIBLE);

                dayBoothCard.setVisibility(View.VISIBLE);
                foodTruckCard.setVisibility(View.VISIBLE);
                hiteJinroBoothCard.setVisibility(View.VISIBLE);
                nightBoothCard.setVisibility(View.VISIBLE);

                goodsCard.setVisibility(View.VISIBLE);
                headOfficeEventCard.setVisibility(View.VISIBLE);
                photoBoothCard.setVisibility(View.VISIBLE);
                promotionProductCard.setVisibility(View.VISIBLE);
                specialEventCard.setVisibility(View.VISIBLE);

                commercialPartnershipCard.setVisibility(View.VISIBLE);
                inquiryCard.setVisibility(View.VISIBLE);
                penaltyPointsAbolitionCard.setVisibility(View.VISIBLE);
                promotionIntroductionCard.setVisibility(View.VISIBLE);
                wastePlaceCard.setVisibility(View.VISIBLE);

                artistLineUpCard.setVisibility(View.VISIBLE);
                highlightCard.setVisibility(View.VISIBLE);
                changmoCard.setVisibility(View.VISIBLE);
                a10cmCard.setVisibility(View.VISIBLE);
                theWindCard.setVisibility(View.VISIBLE);
                royKimCard.setVisibility(View.VISIBLE);
                hahyunsangCard.setVisibility(View.VISIBLE);
                ydbbCard.setVisibility(View.VISIBLE);
                fromis9Card.setVisibility(View.VISIBLE);
                resceneCard.setVisibility(View.VISIBLE);
                bbangsonggukCard.setVisibility(View.VISIBLE);
                younhaCard.setVisibility(View.VISIBLE);
                lucyCard.setVisibility(View.VISIBLE);
                lilboiCard.setVisibility(View.VISIBLE);
                bewhyCard.setVisibility(View.VISIBLE);
                cnblueCard.setVisibility(View.VISIBLE);
            }
        });

        informationArtistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainStageBannedListCard.setVisibility(View.GONE);
                mainStageEntranceCard.setVisibility(View.GONE);
                mainStageTrafficNoticeCard.setVisibility(View.GONE);
                mainStageWatingLineCard.setVisibility(View.GONE);
                subStageNoticeCard.setVisibility(View.GONE);

                dayBoothCard.setVisibility(View.GONE);
                foodTruckCard.setVisibility(View.GONE);
                hiteJinroBoothCard.setVisibility(View.GONE);
                nightBoothCard.setVisibility(View.GONE);

                goodsCard.setVisibility(View.GONE);
                headOfficeEventCard.setVisibility(View.GONE);
                photoBoothCard.setVisibility(View.GONE);
                promotionProductCard.setVisibility(View.GONE);
                specialEventCard.setVisibility(View.GONE);

                commercialPartnershipCard.setVisibility(View.GONE);
                inquiryCard.setVisibility(View.GONE);
                penaltyPointsAbolitionCard.setVisibility(View.GONE);
                promotionIntroductionCard.setVisibility(View.GONE);
                wastePlaceCard.setVisibility(View.GONE);

                artistLineUpCard.setVisibility(View.VISIBLE);
                highlightCard.setVisibility(View.VISIBLE);
                changmoCard.setVisibility(View.VISIBLE);
                a10cmCard.setVisibility(View.VISIBLE);
                theWindCard.setVisibility(View.VISIBLE);
                royKimCard.setVisibility(View.VISIBLE);
                hahyunsangCard.setVisibility(View.VISIBLE);
                ydbbCard.setVisibility(View.VISIBLE);
                fromis9Card.setVisibility(View.VISIBLE);
                resceneCard.setVisibility(View.VISIBLE);
                bbangsonggukCard.setVisibility(View.VISIBLE);
                younhaCard.setVisibility(View.VISIBLE);
                lucyCard.setVisibility(View.VISIBLE);
                lilboiCard.setVisibility(View.VISIBLE);
                bewhyCard.setVisibility(View.VISIBLE);
                cnblueCard.setVisibility(View.VISIBLE);
            }
        });

        informationBoothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainStageBannedListCard.setVisibility(View.GONE);
                mainStageEntranceCard.setVisibility(View.GONE);
                mainStageTrafficNoticeCard.setVisibility(View.GONE);
                mainStageWatingLineCard.setVisibility(View.GONE);
                subStageNoticeCard.setVisibility(View.GONE);

                dayBoothCard.setVisibility(View.VISIBLE);
                foodTruckCard.setVisibility(View.VISIBLE);
                hiteJinroBoothCard.setVisibility(View.VISIBLE);
                nightBoothCard.setVisibility(View.VISIBLE);

                goodsCard.setVisibility(View.GONE);
                headOfficeEventCard.setVisibility(View.GONE);
                photoBoothCard.setVisibility(View.GONE);
                promotionProductCard.setVisibility(View.GONE);
                specialEventCard.setVisibility(View.GONE);

                commercialPartnershipCard.setVisibility(View.GONE);
                inquiryCard.setVisibility(View.GONE);
                penaltyPointsAbolitionCard.setVisibility(View.GONE);
                promotionIntroductionCard.setVisibility(View.GONE);
                wastePlaceCard.setVisibility(View.GONE);

                artistLineUpCard.setVisibility(View.GONE);
                highlightCard.setVisibility(View.GONE);
                changmoCard.setVisibility(View.GONE);
                a10cmCard.setVisibility(View.GONE);
                theWindCard.setVisibility(View.GONE);
                royKimCard.setVisibility(View.GONE);
                hahyunsangCard.setVisibility(View.GONE);
                ydbbCard.setVisibility(View.GONE);
                fromis9Card.setVisibility(View.GONE);
                resceneCard.setVisibility(View.GONE);
                bbangsonggukCard.setVisibility(View.GONE);
                younhaCard.setVisibility(View.GONE);
                lucyCard.setVisibility(View.GONE);
                lilboiCard.setVisibility(View.GONE);
                bewhyCard.setVisibility(View.GONE);
                cnblueCard.setVisibility(View.GONE);
            }
        });

        informationEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainStageBannedListCard.setVisibility(View.GONE);
                mainStageEntranceCard.setVisibility(View.GONE);
                mainStageTrafficNoticeCard.setVisibility(View.GONE);
                mainStageWatingLineCard.setVisibility(View.GONE);
                subStageNoticeCard.setVisibility(View.GONE);

                dayBoothCard.setVisibility(View.GONE);
                foodTruckCard.setVisibility(View.GONE);
                hiteJinroBoothCard.setVisibility(View.GONE);
                nightBoothCard.setVisibility(View.GONE);

                goodsCard.setVisibility(View.VISIBLE);
                headOfficeEventCard.setVisibility(View.VISIBLE);
                photoBoothCard.setVisibility(View.VISIBLE);
                promotionProductCard.setVisibility(View.VISIBLE);
                specialEventCard.setVisibility(View.VISIBLE);

                commercialPartnershipCard.setVisibility(View.GONE);
                inquiryCard.setVisibility(View.GONE);
                penaltyPointsAbolitionCard.setVisibility(View.GONE);
                promotionIntroductionCard.setVisibility(View.GONE);
                wastePlaceCard.setVisibility(View.GONE);

                artistLineUpCard.setVisibility(View.GONE);
                highlightCard.setVisibility(View.GONE);
                changmoCard.setVisibility(View.GONE);
                a10cmCard.setVisibility(View.GONE);
                theWindCard.setVisibility(View.GONE);
                royKimCard.setVisibility(View.GONE);
                hahyunsangCard.setVisibility(View.GONE);
                ydbbCard.setVisibility(View.GONE);
                fromis9Card.setVisibility(View.GONE);
                resceneCard.setVisibility(View.GONE);
                bbangsonggukCard.setVisibility(View.GONE);
                younhaCard.setVisibility(View.GONE);
                lucyCard.setVisibility(View.GONE);
                lilboiCard.setVisibility(View.GONE);
                bewhyCard.setVisibility(View.GONE);
                cnblueCard.setVisibility(View.GONE);
            }
        });

        informationNoticeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainStageBannedListCard.setVisibility(View.GONE);
                mainStageEntranceCard.setVisibility(View.GONE);
                mainStageTrafficNoticeCard.setVisibility(View.GONE);
                mainStageWatingLineCard.setVisibility(View.GONE);
                subStageNoticeCard.setVisibility(View.GONE);

                dayBoothCard.setVisibility(View.GONE);
                foodTruckCard.setVisibility(View.GONE);
                hiteJinroBoothCard.setVisibility(View.GONE);
                nightBoothCard.setVisibility(View.GONE);

                goodsCard.setVisibility(View.GONE);
                headOfficeEventCard.setVisibility(View.GONE);
                photoBoothCard.setVisibility(View.GONE);
                promotionProductCard.setVisibility(View.GONE);
                specialEventCard.setVisibility(View.GONE);

                commercialPartnershipCard.setVisibility(View.VISIBLE);
                inquiryCard.setVisibility(View.VISIBLE);
                penaltyPointsAbolitionCard.setVisibility(View.VISIBLE);
                promotionIntroductionCard.setVisibility(View.VISIBLE);
                wastePlaceCard.setVisibility(View.VISIBLE);

                artistLineUpCard.setVisibility(View.GONE);
                highlightCard.setVisibility(View.GONE);
                changmoCard.setVisibility(View.GONE);
                a10cmCard.setVisibility(View.GONE);
                theWindCard.setVisibility(View.GONE);
                royKimCard.setVisibility(View.GONE);
                hahyunsangCard.setVisibility(View.GONE);
                ydbbCard.setVisibility(View.GONE);
                fromis9Card.setVisibility(View.GONE);
                resceneCard.setVisibility(View.GONE);
                bbangsonggukCard.setVisibility(View.GONE);
                younhaCard.setVisibility(View.GONE);
                lucyCard.setVisibility(View.GONE);
                lilboiCard.setVisibility(View.GONE);
                bewhyCard.setVisibility(View.GONE);
                cnblueCard.setVisibility(View.GONE);
            }
        });

        informationStageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainStageBannedListCard.setVisibility(View.VISIBLE);
                mainStageEntranceCard.setVisibility(View.VISIBLE);
                mainStageTrafficNoticeCard.setVisibility(View.VISIBLE);
                mainStageWatingLineCard.setVisibility(View.VISIBLE);
                subStageNoticeCard.setVisibility(View.VISIBLE);

                dayBoothCard.setVisibility(View.GONE);
                foodTruckCard.setVisibility(View.GONE);
                hiteJinroBoothCard.setVisibility(View.GONE);
                nightBoothCard.setVisibility(View.GONE);

                goodsCard.setVisibility(View.GONE);
                headOfficeEventCard.setVisibility(View.GONE);
                photoBoothCard.setVisibility(View.GONE);
                promotionProductCard.setVisibility(View.GONE);
                specialEventCard.setVisibility(View.GONE);

                commercialPartnershipCard.setVisibility(View.GONE);
                inquiryCard.setVisibility(View.GONE);
                penaltyPointsAbolitionCard.setVisibility(View.GONE);
                promotionIntroductionCard.setVisibility(View.GONE);
                wastePlaceCard.setVisibility(View.GONE);

                artistLineUpCard.setVisibility(View.GONE);
                highlightCard.setVisibility(View.GONE);
                changmoCard.setVisibility(View.GONE);
                a10cmCard.setVisibility(View.GONE);
                theWindCard.setVisibility(View.GONE);
                royKimCard.setVisibility(View.GONE);
                hahyunsangCard.setVisibility(View.GONE);
                ydbbCard.setVisibility(View.GONE);
                fromis9Card.setVisibility(View.GONE);
                resceneCard.setVisibility(View.GONE);
                bbangsonggukCard.setVisibility(View.GONE);
                younhaCard.setVisibility(View.GONE);
                lucyCard.setVisibility(View.GONE);
                lilboiCard.setVisibility(View.GONE);
                bewhyCard.setVisibility(View.GONE);
                cnblueCard.setVisibility(View.GONE);
            }
        });
    }
}
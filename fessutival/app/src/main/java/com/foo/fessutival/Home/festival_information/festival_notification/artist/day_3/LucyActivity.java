package com.foo.fessutival.Home.festival_information.festival_notification.artist.day_3;

import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.foo.fessutival.R;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerView;

public class LucyActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucy);

        ImageView lucy01 = findViewById(R.id.lucy_01);

        PlayerView lucy02 = findViewById(R.id.lucy_02);

        player = new ExoPlayer.Builder(this).build();
        lucy02.setPlayer(player);

        String lucy01URL = "https://drive.google.com/uc?export=view&id=1ORkfHhYiaBIRLY_qHua25GeE5MjnjV2u";
        String lucy02URL = "https://drive.google.com/uc?export=download&id=1d_Hfg_BCRcsUlSDmsODqS8B_iDmh6Voc";

        Glide.with(this)
                .load(lucy01URL)
                .into(lucy01);

        MediaItem lucyMediaItem = MediaItem.fromUri(Uri.parse(lucy02URL));
        lucy02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(lucyMediaItem);

        player.prepare();
        player.play();

    }

    protected void onPause() {
        super.onPause();
        // 액티비티 일시 중지 시 플레이어도 일시 중지
        if (player != null) {
            player.pause();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 플레이어 해제
        if (player != null) {
            player.release();
            player = null;
        }
    }


}
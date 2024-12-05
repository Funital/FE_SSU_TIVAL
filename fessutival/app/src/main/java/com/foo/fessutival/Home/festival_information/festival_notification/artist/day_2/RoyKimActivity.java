package com.foo.fessutival.Home.festival_information.festival_notification.artist.day_2;

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

public class RoyKimActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roy_kim);

        ImageView royKim01 = findViewById(R.id.roy_kim_01);

        PlayerView royKim02 = findViewById(R.id.roy_kim_02);

        player = new ExoPlayer.Builder(this).build();
        royKim02.setPlayer(player);

        String royKim01URL = "https://drive.google.com/uc?export=view&id=1tAQ_tnaXer9h5jcDdvAzrFzoY0nXF52X";
        String royKim02URL = "https://drive.google.com/uc?export=download&id=1ms9ABUaLb-Kil0ZgVu1efzODPWv732Qq";
        Glide.with(this)
                .load(royKim01URL)
                .into(royKim01);

        MediaItem royKimMediaItem = MediaItem.fromUri(Uri.parse(royKim02URL));
        royKim02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(royKimMediaItem);

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
package com.foo.fessutival.Home.festival_information.festival_notification.artist.day_1;

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

public class A10cmActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a10cm);

        ImageView a10cm01 = findViewById(R.id.a10cm_01);

        PlayerView a10cm02 = findViewById(R.id.a10cm_02);

        player = new ExoPlayer.Builder(this).build();
        a10cm02.setPlayer(player);

        String a10cm01URL = "https://drive.google.com/uc?export=view&id=1o4c6J_vnPG1e1FLguCZUHuEfuvwGKrQY";
        String a10cm02URL = "https://drive.google.com/uc?export=download&id=1xUCf5vO8wEcey3w6GaJNyH3Mc7W-v-mT";

        Glide.with(this)
                .load(a10cm01URL)
                .into(a10cm01);

        MediaItem a10cmMediaItem = MediaItem.fromUri(Uri.parse(a10cm02URL));
        a10cm02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(a10cmMediaItem);

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
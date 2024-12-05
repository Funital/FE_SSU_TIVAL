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

public class LilboiActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lilboi);

        ImageView lilboi01 = findViewById(R.id.lilboi_01);

        PlayerView lilboi02 = findViewById(R.id.lilboi_02);

        player = new ExoPlayer.Builder(this).build();
        lilboi02.setPlayer(player);

        String lilboi01URL = "https://drive.google.com/uc?export=view&id=1iwH3vODOylH81s5QCaf5_Vs7NZq55gKt";
        String lilboi02URL = "https://drive.google.com/uc?export=download&id=1Y12__Kmg8QMF8_kmG795wjL8CryFMi1p";
        Glide.with(this)
                .load(lilboi01URL)
                .into(lilboi01);

        MediaItem lilboiMediaItem = MediaItem.fromUri(Uri.parse(lilboi02URL));
        lilboi02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(lilboiMediaItem);

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
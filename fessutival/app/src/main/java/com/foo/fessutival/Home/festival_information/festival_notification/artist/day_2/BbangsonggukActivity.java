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

public class BbangsonggukActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbangsongguk);

        ImageView bbangsongguk01 = findViewById(R.id.bbangsongguk_01);

        PlayerView bbangsongguk02 = findViewById(R.id.bbangsongguk_02);

        player = new ExoPlayer.Builder(this).build();
        bbangsongguk02.setPlayer(player);

        String bbangsongguk01URL = "https://drive.google.com/uc?export=view&id=10MKx6anygjdt4rifhm0aF1RPtSeB09Ln";
        String bbangsongguk02URL = "https://drive.google.com/uc?export=download&id=1RjTA3CT5kF-UTeoHL5Oolm9HiPKRe_sJ";
        Glide.with(this)
                .load(bbangsongguk01URL)
                .into(bbangsongguk01);

        MediaItem bbangsonggukMediaItem = MediaItem.fromUri(Uri.parse(bbangsongguk02URL));
        bbangsongguk02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(bbangsonggukMediaItem);

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
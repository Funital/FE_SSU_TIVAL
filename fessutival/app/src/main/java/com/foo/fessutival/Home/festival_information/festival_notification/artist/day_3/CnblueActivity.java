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

public class CnblueActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnblue);

        ImageView cnblue01 = findViewById(R.id.cnblue_01);

        PlayerView cnblue02 = findViewById(R.id.cnblue_02);

        player = new ExoPlayer.Builder(this).build();
        cnblue02.setPlayer(player);

        String cnblue01URL = "https://drive.google.com/uc?export=view&id=1_XHDMVsAHCjIhniQzHqV_wAmzzbaEGiu";
        String cnblue02URL = "https://drive.google.com/uc?export=download&id=1nKkk2RvvowbgVcMFFLtMg6MzY4UQ-Os5";
        Glide.with(this)
                .load(cnblue01URL)
                .into(cnblue01);

        MediaItem cnblueMediaItem = MediaItem.fromUri(Uri.parse(cnblue02URL));
        cnblue02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(cnblueMediaItem);

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
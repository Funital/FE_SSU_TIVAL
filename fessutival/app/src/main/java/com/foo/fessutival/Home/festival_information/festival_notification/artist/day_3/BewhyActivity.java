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

public class BewhyActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bewhy);

        ImageView bewhy01 = findViewById(R.id.bewhy_01);

        PlayerView bewhy02 = findViewById(R.id.bewhy_02);

        player = new ExoPlayer.Builder(this).build();
        bewhy02.setPlayer(player);

        String bewhy01URL = "https://drive.google.com/uc?export=view&id=1NOioSAc4wx-GpXIBOvR6E0_8N_pgXxsY";
        String bewhy02URL = "https://drive.google.com/uc?export=download&id=1QAdZNTDnuZHg31f30nL8qL_gc1MJQr-D";
        Glide.with(this)
                .load(bewhy01URL)
                .into(bewhy01);

        MediaItem bewhyMediaItem = MediaItem.fromUri(Uri.parse(bewhy02URL));
        bewhy02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(bewhyMediaItem);

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
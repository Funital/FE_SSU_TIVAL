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

public class YdbbActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ydbb);

        ImageView ydbb01 = findViewById(R.id.ydbb_01);

        PlayerView ydbb02 = findViewById(R.id.ydbb_02);

        player = new ExoPlayer.Builder(this).build();
        ydbb02.setPlayer(player);

        String ydbb01URL = "https://drive.google.com/uc?export=view&id=1RHfAwCLMrGhSOuKJiHVOvT1VIznCffzb";
        String ydbb02URL = "https://drive.google.com/uc?export=download&id=1BMuVlcj625MgP7aL_e4966HBW6nsvPrB";
        Glide.with(this)
                .load(ydbb01URL)
                .into(ydbb01);

        MediaItem ydbbMediaItem = MediaItem.fromUri(Uri.parse(ydbb02URL));
        ydbb02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(ydbbMediaItem);

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
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

public class YounhaActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_younha);

        ImageView younha01 = findViewById(R.id.younha_01);

        PlayerView younha02 = findViewById(R.id.younha_02);

        player = new ExoPlayer.Builder(this).build();
        younha02.setPlayer(player);

        String younha01URL = "https://drive.google.com/uc?export=view&id=1-k7T14y4VFMjr7-ZuVcUHSbWwvryRT28";
        String younha02URL = "https://drive.google.com/uc?export=download&id=1m7fpNPpHmpfi8p9I0bWSGd6m32ck-SVp";

        Glide.with(this)
                .load(younha01URL)
                .into(younha01);

        MediaItem younhaMediaItem = MediaItem.fromUri(Uri.parse(younha02URL));
        younha02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(younhaMediaItem);

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
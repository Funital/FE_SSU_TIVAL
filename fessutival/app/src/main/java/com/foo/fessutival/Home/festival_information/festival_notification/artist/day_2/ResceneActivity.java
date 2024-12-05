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

public class ResceneActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rescene);

        ImageView rescene01 = findViewById(R.id.rescene_01);

        PlayerView rescene02 = findViewById(R.id.rescene_02);

        player = new ExoPlayer.Builder(this).build();
        rescene02.setPlayer(player);

        String rescene01URL = "https://drive.google.com/uc?export=view&id=1N5zXFFSfl14pD84kmKwclAQC2AX32AJv";
        String rescene02URL = "https://drive.google.com/uc?export=download&id=1irXAyJ55Vf6BRTMLuraPfNcQu2BEOQGu";
        Glide.with(this)
                .load(rescene01URL)
                .into(rescene01);

        MediaItem resceneMediaItem = MediaItem.fromUri(Uri.parse(rescene02URL));
        rescene02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(resceneMediaItem);

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
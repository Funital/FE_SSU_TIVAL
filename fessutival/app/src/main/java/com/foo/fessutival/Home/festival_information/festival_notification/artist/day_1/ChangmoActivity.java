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

public class ChangmoActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changmo);

        ImageView changmo01 = findViewById(R.id.changmo_01);

        PlayerView changmo02 = findViewById(R.id.changmo_02);

        player = new ExoPlayer.Builder(this).build();
        changmo02.setPlayer(player);

        String changmo01URL = "https://drive.google.com/uc?export=view&id=1FS_K8W-K8QJDbSzMt-l5ktV2BFp39kzZ";
        String changmo02URL = "https://drive.google.com/uc?export=download&id=1xAdDvNNLJ_rFUjHJ7sm68Qy6tMmqOJJP";

        Glide.with(this)
                .load(changmo01URL)
                .into(changmo01);

        MediaItem changmoMediaItem = MediaItem.fromUri(Uri.parse(changmo02URL));
        changmo02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(changmoMediaItem);

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
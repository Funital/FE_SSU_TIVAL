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

public class HahyunsangActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hahyunsang);

        ImageView hahyunsang01 = findViewById(R.id.hahyunsang_01);

        PlayerView hahyunsang02 = findViewById(R.id.hahyunsang_02);

        player = new ExoPlayer.Builder(this).build();
        hahyunsang02.setPlayer(player);

        String hahyunsang01URL = "https://drive.google.com/uc?export=view&id=1qCmnS1HvDFKhseo2yntJEvgc8wuTrZzY";
        String hahyunsang02URL = "https://drive.google.com/uc?export=download&id=1AXG9IcSu9XUORn6lXnJZCxoT3DR_A4Wf";
        Glide.with(this)
                .load(hahyunsang01URL)
                .into(hahyunsang01);

        MediaItem hahyunsangMediaItem = MediaItem.fromUri(Uri.parse(hahyunsang02URL));
        hahyunsang02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(hahyunsangMediaItem);

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
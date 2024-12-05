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

public class HighlightActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlight);

        ImageView hightlight01 = findViewById(R.id.highlight_01);

        PlayerView hightlight02 = findViewById(R.id.highlight_02);

        player = new ExoPlayer.Builder(this).build();
        hightlight02.setPlayer(player);

        String hightlight01URL = "https://drive.google.com/uc?export=view&id=1d2y2EltvbNcKZI4r92FyYyC8VFmeV5P-";
        String hightlight02URL = "https://drive.google.com/uc?export=download&id=1ji_dFN3hmFVbVk9r4XHbQ6w0bMApxrEx";

        Glide.with(this)
                .load(hightlight01URL)
                .into(hightlight01);

        MediaItem hightlightMediaItem = MediaItem.fromUri(Uri.parse(hightlight02URL));
        hightlight02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(hightlightMediaItem);

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
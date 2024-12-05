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

public class Fromis9Activity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fromis9);

        ImageView fromis901 = findViewById(R.id.fromis_9_01);

        PlayerView fromis902 = findViewById(R.id.fromis_9_02);

        player = new ExoPlayer.Builder(this).build();
        fromis902.setPlayer(player);

        String fromis901URL = "https://drive.google.com/uc?export=view&id=16-osMHLarXhk8lOxTA9W40kRp8LJlj_Q";
        String fromis902URL = "https://drive.google.com/uc?export=download&id=1l_6MF2q8MtBl9Z3gsPCFLbkcJtWG0UKZ";
        Glide.with(this)
                .load(fromis901URL)
                .into(fromis901);

        MediaItem fromis9MediaItem = MediaItem.fromUri(Uri.parse(fromis902URL));
        fromis902.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(fromis9MediaItem);

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
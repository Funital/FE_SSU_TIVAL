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

public class TheWindActivity extends AppCompatActivity {

    private ExoPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_wind);

        ImageView theWind01 = findViewById(R.id.the_wind_01);

        PlayerView theWind02 = findViewById(R.id.the_wind_02);

        player = new ExoPlayer.Builder(this).build();
        theWind02.setPlayer(player);

        String theWind01URL = "https://drive.google.com/uc?export=view&id=1saZzV5fycvwVyA9pwws-vZrhpc09XYPF";
        String theWind02URL = "https://drive.google.com/uc?export=download&id=13LIcgtkfJVaY1T5PtiM53TLmHnTjp9UT";

        Glide.with(this)
                .load(theWind01URL)
                .into(theWind01);

        MediaItem theWindMediaItem = MediaItem.fromUri(Uri.parse(theWind02URL));
        theWind02.setResizeMode(AspectRatioFrameLayout.RESIZE_MODE_FILL);

        player.setMediaItem(theWindMediaItem);

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
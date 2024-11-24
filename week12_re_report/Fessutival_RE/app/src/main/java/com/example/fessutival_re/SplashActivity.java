package com.example.fessutival_re;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fessutival_re.Login.Login;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // splash 3초동안
        Handler handler = new Handler();
        handler.postDelayed(new splashHandler(), 3000);
    }

    private class splashHandler implements Runnable {
        @Override
        public void run() {
            startActivity(new Intent(getApplication(), Login.class));
            SplashActivity.this.finish();
        }
    }
}
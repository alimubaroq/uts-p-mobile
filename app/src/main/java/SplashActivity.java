package com.example.gamedetall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Buat file XML ini di folder layout

        // Waktu tampilan splash screen (3000 ms = 3 detik)
        int splashScreenDuration = 3000;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Pindah ke MainActivity setelah splash screen selesai
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Tutup SplashActivity
            }
        }, splashScreenDuration);
    }
}

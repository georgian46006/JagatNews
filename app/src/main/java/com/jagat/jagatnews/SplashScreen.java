package com.jagat.jagatnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    ImageView jagat_logo;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        jagat_logo = findViewById(R.id.jagat_logo);
        lottie = findViewById(R.id.lottie);
        lottie.animate().translationY(4400).setDuration(3000).setStartDelay(4000);
        jagat_logo.animate().translationY(-4400).setDuration(3000).setStartDelay(4000);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}
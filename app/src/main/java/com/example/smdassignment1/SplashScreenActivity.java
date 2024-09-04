package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // event triggered when activity is created by intent
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView logo = findViewById(R.id.logo); // use hook to get logo
        Animation moveUp = AnimationUtils.loadAnimation(this, R.anim.move_up); // load anim move_up.xml
        logo.startAnimation(moveUp); // start animation

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, SenderInfoFormActivity.class); // explicit intent
                startActivity(intent);
                finish(); // finish this activity after the delay ( 5 seconds )
            }
        }, 5000);
    }
}

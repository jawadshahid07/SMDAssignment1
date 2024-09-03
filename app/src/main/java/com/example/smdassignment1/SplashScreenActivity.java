package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // event triggered when activity is created by intent
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

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

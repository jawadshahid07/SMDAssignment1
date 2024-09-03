package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ReceiverInfoFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // on the event that this activity is created
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_info_form);

        Button nextButton = findViewById(R.id.btnNext); // use hooks to find the button
        nextButton.setOnClickListener(new View.OnClickListener() { // when button is clicked, next activity should be displayed
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ReceiverInfoFormActivity.this, ReviewInfoActivity.class); // use intent to display next activity
                //startActivity(intent);
                finish();
            }
        });
    }
}

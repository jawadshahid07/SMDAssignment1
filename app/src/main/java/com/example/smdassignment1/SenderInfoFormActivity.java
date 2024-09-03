package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SenderInfoFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // on the event that this activity is created
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender_info_form);

        // find the fields so we can get data from them
        EditText etSenderName = findViewById(R.id.etSenderName);
        EditText etSenderCountry = findViewById(R.id.etSenderCountry);
        EditText etSenderAddress = findViewById(R.id.etSenderAddress);
        EditText etSenderContact = findViewById(R.id.etSenderContact);

        Button nextButton = findViewById(R.id.btnNext); // use hooks to find the button
        nextButton.setOnClickListener(new View.OnClickListener() { // when button is clicked, next activity should be displayed
            @Override
            public void onClick(View v) {
                //get the text from the fields
                String senderName = etSenderName.getText().toString();
                String senderCountry = etSenderCountry.getText().toString();
                String senderAddress = etSenderAddress.getText().toString();
                String senderContact = etSenderContact.getText().toString();

                Intent intent = new Intent(SenderInfoFormActivity.this, ReceiverInfoFormActivity.class); // use intent to display next activity

                // add the data to be sent forward
                intent.putExtra("SENDER_NAME", senderName);
                intent.putExtra("SENDER_COUNTRY", senderCountry);
                intent.putExtra("SENDER_ADDRESS", senderAddress);
                intent.putExtra("SENDER_CONTACT", senderContact);

                startActivity(intent);
                finish();
            }
        });
    }
}

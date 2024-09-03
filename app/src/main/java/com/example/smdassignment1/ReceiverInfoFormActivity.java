package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiverInfoFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { // on the event that this activity is created
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_info_form);

        Intent incomingIntent = getIntent();
        String senderName = incomingIntent.getStringExtra("SENDER_NAME");
        String senderCountry = incomingIntent.getStringExtra("SENDER_COUNTRY");
        String senderAddress = incomingIntent.getStringExtra("SENDER_ADDRESS");
        String senderContact = incomingIntent.getStringExtra("SENDER_CONTACT");

        EditText etReceiverName = findViewById(R.id.etReceiverName);
        EditText etReceiverCountry = findViewById(R.id.etReceiverCountry);
        EditText etReceiverAddress = findViewById(R.id.etReceiverAddress);
        EditText etReceiverContact = findViewById(R.id.etReceiverContact);

        Button nextButton = findViewById(R.id.btnNext); // use hooks to find the button
        nextButton.setOnClickListener(new View.OnClickListener() { // when button is clicked, next activity should be displayed
            @Override
            public void onClick(View v) {
                String receiverName = etReceiverName.getText().toString();
                String receiverCountry = etReceiverCountry.getText().toString();
                String receiverAddress = etReceiverAddress.getText().toString();
                String receiverContact = etReceiverContact.getText().toString();

                Intent intent = new Intent(ReceiverInfoFormActivity.this, ReviewInfoActivity.class); // use intent to display next activity

                intent.putExtra("SENDER_NAME", senderName);
                intent.putExtra("SENDER_COUNTRY", senderCountry);
                intent.putExtra("SENDER_ADDRESS", senderAddress);
                intent.putExtra("SENDER_CONTACT", senderContact);
                intent.putExtra("RECEIVER_NAME", receiverName);
                intent.putExtra("RECEIVER_COUNTRY", receiverCountry);
                intent.putExtra("RECEIVER_ADDRESS", receiverAddress);
                intent.putExtra("RECEIVER_CONTACT", receiverContact);

                startActivity(intent);
                finish();
            }
        });
    }
}

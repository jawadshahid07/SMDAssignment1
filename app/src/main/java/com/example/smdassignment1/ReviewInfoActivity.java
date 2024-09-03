package com.example.smdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_info);

        // retrieve the data from the intent
        Intent intent = getIntent();
        String senderName = intent.getStringExtra("SENDER_NAME");
        String senderCountry = intent.getStringExtra("SENDER_COUNTRY");
        String senderAddress = intent.getStringExtra("SENDER_ADDRESS");
        String senderContact = intent.getStringExtra("SENDER_CONTACT");
        String receiverName = intent.getStringExtra("RECEIVER_NAME");
        String receiverCountry = intent.getStringExtra("RECEIVER_COUNTRY");
        String receiverAddress = intent.getStringExtra("RECEIVER_ADDRESS");
        String receiverContact = intent.getStringExtra("RECEIVER_CONTACT");

        // find TextViews
        TextView tvSenderName = findViewById(R.id.tvSenderName);
        TextView tvSenderCountry = findViewById(R.id.tvSenderCountry);
        TextView tvSenderAddress = findViewById(R.id.tvSenderAddress);
        TextView tvSenderContact = findViewById(R.id.tvSenderContact);
        TextView tvReceiverName = findViewById(R.id.tvReceiverName);
        TextView tvReceiverCountry = findViewById(R.id.tvReceiverCountry);
        TextView tvReceiverAddress = findViewById(R.id.tvReceiverAddress);
        TextView tvReceiverContact = findViewById(R.id.tvReceiverContact);

        // set the text for each TextView
        tvSenderName.setText(senderName);
        tvSenderCountry.setText(senderCountry);
        tvSenderAddress.setText(senderAddress);
        tvSenderContact.setText(senderContact);
        tvReceiverName.setText(receiverName);
        tvReceiverCountry.setText(receiverCountry);
        tvReceiverAddress.setText(receiverAddress);
        tvReceiverContact.setText(receiverContact);
    }
}

package com.example.myfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        DoStuff();
    }

    private void DoStuff()
    {

        Intent intent = getIntent();
        //Stuff stuff = intent.getParcelableExtra("Stuff");
        //textView.setText(stuff.getMessage());
        Invoice invoice = (Invoice) getIntent().getParcelableExtra(MainActivity.INVOICE_KEY);

    }
}

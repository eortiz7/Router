package com.example.myfirst;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

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
        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
        try
        {
            Address address = (geocoder.getFromLocationName(invoice.getAddress(),1)).get(0);
        }
        catch(Exception e)
        {

        }
    }
}

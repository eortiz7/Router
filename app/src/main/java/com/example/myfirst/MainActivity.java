package com.example.myfirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private ListView lvInvoices;
    //private Button routeButton;
    private InvoiceAdapter adapterInvoices;
    public static final String INVOICE_KEY = "invoice";
    //private final Intent route = new Intent(MainActivity.this, MapsRouteActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Covert");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //routeButton = (Button) findViewById(R.id.routeButton);
        lvInvoices = (ListView)findViewById(R.id.invListView);
        ArrayList<Invoice> aInvoices = new ArrayList<Invoice>();
        adapterInvoices = new InvoiceAdapter(this, aInvoices);
        lvInvoices.setAdapter(adapterInvoices);

        aInvoices.add(new Invoice("323111", "1809 Fleischer Dr, Austin, TX 78728", "Golden Auto Repair"));
        aInvoices.add(new Invoice( "323112", "12172 N Mopac Expy, Austin, TX 78758", "Riethmeyer's Auto Repair Inc"));
        aInvoices.add(new Invoice( "313113", "8950 Research Blvd, Austin, TX 78758", "Body Shop"));

        //route.putParcelableArrayListExtra("WayPoints", aInvoices);



        lvInvoices.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent toNav = new Intent(MainActivity.this,MapsActivity.class);
                toNav.putExtra(INVOICE_KEY, adapterInvoices.getItem(position));
                startActivity(toNav);
            }
        });

        /*routeButton.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               startActivity(route);
           }
        });
        */

        /*Button b1 = (Button)findViewById(R.id.button1);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);

        b1.setText(inv1.getCustomerName());
        b2.setText(inv2.getCustomerName());
        b3.setText(inv3.getCustomerName());


        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){ openNav(v); }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNav(v);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNav(v);
            }
        });

        b1.setOnClickListener(new Invoice("323111", "1809 Fleischer Dr, Austin, TX 78728", "Golden Auto Repair"));
        */
    }


    /** Called when the user taps the Send button */
    /*
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        Stuff stuff = new Stuff(message);
        intent.putExtra("Stuff", stuff);
        startActivity(intent);
    }*/


}
package com.example.myfirst;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Invoice invoice;
    private Intent intent;
    private Geocoder geocoder;
    private Address address;
    //private FusedLocationProviderClient mFusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        intent = getIntent();
        invoice = (Invoice) getIntent().getParcelableExtra(MainActivity.INVOICE_KEY);
       /* geocoder = new Geocoder(this, Locale.getDefault());


        try
        {
            address = (geocoder.getFromLocationName(invoice.getAddress(),1)).get(0);
        }
        catch(Exception e)
        {
            Log.e("Error", e.getMessage());
        }*/

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng customer = new LatLng(-33.8,151.2);//address.getLatitude(), address.getLongitude());
        mMap.addMarker(new MarkerOptions().position(customer).title(invoice.getCustomerName()));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(customer));
    }
}

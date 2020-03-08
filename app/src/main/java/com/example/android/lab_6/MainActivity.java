package com.example.android.lab_6;


import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
//import android.location.Location;
//import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity {
    private final LatLng mDestinationLatLng = new LatLng(43.0754,-89.4042);
    private GoogleMap mMap;
   // private FusedLocationProviderClient mFusedLocationProviderClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_map);
        mapFragment.getMapAsync(googleMap -> {
            mMap = googleMap;
            googleMap.addMarker(new MarkerOptions().position(mDestinationLatLng).title("Bascom Hall"));

        });
    //   mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

    }
}

package com.lbqm.longbeachquickmenu;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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

        LatLng location = new LatLng(33.784733, -118.124402);

        mMap.addMarker(new MarkerOptions()
                .title("Beachside Dining Hall").position(new LatLng(33.786287, -118.135372))
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap("beachside",250,250))));


        mMap.addMarker(new MarkerOptions()
                .title("California State of University").position(new LatLng(33.783823, -118.114090))
                .icon(BitmapDescriptorFactory.fromBitmap(resizeBitmap("csulb",300,300))));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 14.0f));

        mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if(marker.getTitle().equals("Beachside Dining Hall")){
                    Intent info = new Intent(getApplicationContext(), BeachsideMenu.class);
                    startActivity(info);
                }

                if(marker.getTitle().equals("California State of University")){
                    Intent info = new Intent(getApplicationContext(), CampusActivity.class);
                    startActivity(info);
                }
            }
        });
    }

    public Bitmap resizeBitmap(String drawableName, int width, int height){
        Bitmap imageBitmap = BitmapFactory
                .decodeResource(getResources(),getResources()
                        .getIdentifier(drawableName, "drawable", getPackageName()));
        return Bitmap.createScaledBitmap(imageBitmap, width, height, false);
    }
}

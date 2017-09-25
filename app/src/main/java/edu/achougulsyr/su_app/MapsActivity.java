package edu.achougulsyr.su_app;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int ml=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Bundle extra= getIntent().getExtras();
        ml= extra.getInt("Loctn");
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
        float zoomLevel =0;

        // Add a marker in Sydney and move the camera
        if(ml==1) {
            LatLng domeloc = new LatLng(43.03629986,-76.136366126);
            mMap.addMarker(new MarkerOptions().position(domeloc).title("Marker on Career Dome"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(domeloc,16));
        }
        else if (ml==2) {
            LatLng birdloc = new LatLng(43.03991, -76.13254);
            mMap.addMarker(new MarkerOptions().position(birdloc).title("Marker on Bird Library"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(birdloc,16));
        }
        else{
            LatLng schineloc = new LatLng(43.03992 ,-76.13375);
            mMap.addMarker(new MarkerOptions().position(schineloc).title("Marker on Schine Centre"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(schineloc,16));
        }
    }
}

package com.anibalosorio.colombiaturisticavfinal;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        findViewById(R.id.mparque).setOnClickListener(this);
        findViewById(R.id.mpbarra).setOnClickListener(this);
        findViewById(R.id.mpfami).setOnClickListener(this);
        findViewById(R.id.mpfincas).setOnClickListener(this);
        findViewById(R.id.mpiglesia).setOnClickListener(this);
        findViewById(R.id.mpkiosco).setOnClickListener(this);
        findViewById(R.id.mpsofia).setOnClickListener(this);
        findViewById(R.id.mptalanquera).setOnClickListener(this);
        findViewById(R.id.mpvila).setOnClickListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.mparque:

                LatLng parque = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(parque).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(parque));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mpbarra:

                LatLng barra = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(barra).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(barra));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mpfami:

                LatLng fami = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(fami).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(fami));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mpfincas:

                LatLng fincas = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(fincas).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(fincas));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mpiglesia:

                LatLng iglesia = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(iglesia).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(iglesia));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mpkiosco:

                LatLng kiosco = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(kiosco).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(kiosco));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mpsofia:

                LatLng sofia = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(sofia).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sofia));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mptalanquera:

                LatLng talanquera = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(talanquera).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(talanquera));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;

            case R.id.mpvila:

                LatLng villa = new LatLng(5.799059,-75.907993);
                mMap.addMarker(new MarkerOptions().position(villa).title("Hispania")
                        .snippet("Parque"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(villa));
                mMap.animateCamera(CameraUpdateFactory.zoomTo(17));


                mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {

                }
                else {}
                mMap.setMyLocationEnabled(true);
                break;
            }

        }
}
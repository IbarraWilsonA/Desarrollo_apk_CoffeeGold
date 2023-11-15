package com.example.prueva

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prueva.databinding.ActivityMapsBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
//    override fun onMapReady(googleMap: GoogleMap) {
//        mMap = googleMap
//
//        // Add a marker in Sydney and move the camera
//        val sydney = LatLng(-34.0, 151.0)
//        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
//    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Create a list of LatLng objects for the markers
        val markers = listOf(
            LatLng(-19.03, -65.26), // Marker in Sydney
            LatLng(-19.046417, -65.260539), // Marker 1
            LatLng(-19.040582, -65.256776), // Marker 2
            LatLng(-19.050736, -65.265466)
        )

        // Add markers to the ma
        markers.forEach { markerLocation ->
            mMap.addMarker(MarkerOptions().position(markerLocation).title("Sucursal CoffeGold"))
        }

        // Move the camera to the first marker's location with a zoom of 800 meters
        val cameraUpdate = CameraUpdateFactory.newLatLngZoom(markers[2], 14f)
        mMap.moveCamera(cameraUpdate)
    }
}
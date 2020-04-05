package com.example.utscoba.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.utscoba.R;
import com.example.utscoba.fragments.EsBuahFragment;
import com.example.utscoba.fragments.EsCincauFragment;
import com.example.utscoba.fragments.EsKelapaMudaFragment;
import com.example.utscoba.fragments.EsTelerFragment;
import com.example.utscoba.fragments.HomeFragment;
import com.example.utscoba.fragments.MenuMakananFragment;
import com.example.utscoba.fragments.MenuMinumanFragment;
import com.example.utscoba.fragments.MinumFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener
, HomeFragment.OnFragmentInteractionListener, MinumFragment.OnFragmentInteractionListener, MenuMinumanFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment (new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.minum:
                fragment = new MinumFragment();
                break;

        }
        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onMeatClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new MenuMakananFragment()).addToBackStack(null).commit();
    }

    @Override
    public void onMinumMClicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new MenuMinumanFragment()).addToBackStack(null).commit();
    }

    @Override
    public void onMinuman1Clicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new EsBuahFragment()).addToBackStack(null).commit();
    }

    @Override
    public void onMinuman2Clicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new EsKelapaMudaFragment()).addToBackStack(null).commit();
    }

    @Override
    public void onMinuman3Clicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new EsCincauFragment()).addToBackStack(null).commit();
    }

    @Override
    public void onMinuman4Clicked() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new EsTelerFragment()).addToBackStack(null).commit();
    }

}

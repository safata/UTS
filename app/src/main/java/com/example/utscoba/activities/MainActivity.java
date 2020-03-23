package com.example.utscoba.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.utscoba.R;
import com.example.utscoba.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment (new HomeFragment());
    }

    private void loadFragment(HomeFragment homeFragment) {
    }
}

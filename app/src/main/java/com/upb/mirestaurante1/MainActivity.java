package com.upb.mirestaurante1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.upb.mirestaurante1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void consultarSedes (View v) {
        Intent i = new Intent(this, SedeActivity.class);
        startActivity(i);

    }
    public void consultarMenu (View v) {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);

    }
    public void consultarReserva (View v) {
        Intent i = new Intent(this, ReservaActivity.class);
        startActivity(i);

    }
}
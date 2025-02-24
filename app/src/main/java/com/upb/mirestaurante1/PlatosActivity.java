package com.upb.mirestaurante1;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;


public class PlatosActivity extends BaseAdvanceListActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

    }
    @Override
    protected void setData() {
        mArray.add(new Node(getString(R.string.platoFuerte1), getString(R.string.descripcionFuerte1), R.drawable.bandejapaisa));
        mArray.add(new Node(getString(R.string.platoFuerte2), getString(R.string.descripcionFuerte2), R.drawable.mondongo));
        mArray.add(new Node(getString(R.string.platoFuerte3), getString(R.string.descripcionFuerte3), R.drawable.molepoblano));
    }

}
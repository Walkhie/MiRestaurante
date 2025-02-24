package com.upb.mirestaurante1;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BebidasActivity extends BaseAdvanceListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

    }
    @Override
    protected void setData() {
        mArray.add(new Node(getString(R.string.bebida1), getString(R.string.descripcionBebida1), R.drawable.limonadadecoco));
        mArray.add(new Node(getString(R.string.bebida2), getString(R.string.descripcionBebida2), R.drawable.tintodeverano));
        mArray.add(new Node(getString(R.string.bebida3), getString(R.string.descripcionBebida3), R.drawable.classicmargarita));

        Log.d("PlatosActivity", "Elementos agregados a mArray: " + mArray.size());
    }
}
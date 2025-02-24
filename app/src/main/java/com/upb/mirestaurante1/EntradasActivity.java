package com.upb.mirestaurante1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EntradasActivity extends BaseAdvanceListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

    }
    @Override
    protected void setData() {
        mArray.add(new BaseAdvanceListActivity.Node(getString(R.string.entrada1), getString(R.string.descripcionEntrada1), R.drawable.croquetasdejamoniberico));
        mArray.add(new BaseAdvanceListActivity.Node(getString(R.string.entrada2), getString(R.string.descripcionEntrada2), R.drawable.ceviche));
        mArray.add(new BaseAdvanceListActivity.Node(getString(R.string.entrada3), getString(R.string.descripcionEntrada3), R.drawable.bruschetta));
    }
}
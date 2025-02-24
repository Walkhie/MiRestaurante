package com.upb.mirestaurante1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PostresActivity extends BaseAdvanceListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

    }
    @Override
    protected void setData() {
        mArray.add(new BaseAdvanceListActivity.Node(getString(R.string.postres1), getString(R.string.descripcionPostres1), R.drawable.tiramisu));
        mArray.add(new BaseAdvanceListActivity.Node(getString(R.string.postres2), getString(R.string.descripcionPostres2), R.drawable.coulantdechocolate));
        mArray.add(new BaseAdvanceListActivity.Node(getString(R.string.postres3), getString(R.string.descripcionPostres3), R.drawable.cheesecakedefrutos));
    }
}
package com.upb.mirestaurante1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public abstract class BaseAdvanceListActivity extends AppCompatActivity {

    protected ArrayList<Node> mArray = new ArrayList<>();
    private MyAdapter mAdapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        if (listView == null) {
            Log.e("BaseAdvanceListActivity", "ERROR: listView es NULL. Verifica el ID en activity_list.xml");
            return;
        } else {
            Log.d("BaseAdvanceListActivity", "listView encontrado correctamente.");
        }

        setData(); // Llenamos mArray
        mAdapter = new MyAdapter();
        listView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        Log.d("BaseAdvanceListActivity", "setAdapter ejecutado. Total elementos: " + mArray.size());
    }



    // Método abstracto para que cada actividad hija defina sus propios datos
    protected abstract void setData();

    // Clase para representar cada ítem de la lista
    public static class Node {
        public String mTitle;
        public String mDescription;
        public int mImageResource;

        public Node(String title, String description, int imageResource) {
            this.mTitle = title;
            this.mDescription = description;
            this.mImageResource = imageResource;
        }
    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mArray.size();
        }

        @Override
        public Object getItem(int position) {
            return mArray.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                view = inflater.inflate(R.layout.list_item_plato, parent, false);
                Log.d("MyAdapter", "Inflando nueva vista en posición: " + position);
            } else {
                view = convertView;
                Log.d("MyAdapter", "Reutilizando vista en posición: " + position);
            }

            Node node = mArray.get(position);
            Log.d("MyAdapter", "Mostrando: " + node.mTitle + ", " + node.mDescription);

            TextView tTitle = view.findViewById(R.id.title);
            tTitle.setText(node.mTitle);

            TextView tDescription = view.findViewById(R.id.description);
            tDescription.setText(node.mDescription);

            ImageView tImage = view.findViewById(R.id.image);
            tImage.setImageResource(node.mImageResource);

            return view;
        }


    }
}


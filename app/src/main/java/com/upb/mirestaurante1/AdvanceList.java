package com.upb.mirestaurante1;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdvanceList extends ListActivity {

    private MyAdapter mAdapter = null;

    // Estructura para guardar los datos

    public class Node {
        public String mTitle;
        public String mDescription;
        public Integer mImageResource;
    }

    private ArrayList<Node> mArray = new ArrayList<Node>();

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setData();

        mAdapter = new MyAdapter(this);
        setListAdapter(mAdapter);

    }

    private void setData ()
    {
        mArray.clear();

        Node mynode = new Node();

        // Plato Fuerte 1
        mynode.mTitle = this.getResources().getString(R.string.platoFuerte1);
        mynode.mDescription = this.getResources().getString(R.string.descripcionFuerte1);
        mynode.mImageResource = R.drawable.bandejapaisa;

        mArray.add(mynode);

        Node mynode2 = new Node();

        // Plato Fuerte 2
        mynode2.mTitle = this.getResources().getString(R.string.platoFuerte2);
        mynode2.mDescription = this.getResources().getString(R.string.descripcionFuerte2);
        mynode2.mImageResource = R.drawable.mondongo;

        mArray.add(mynode2);

        Node mynode3 = new Node();

        // Plato Fuerte 3
        mynode3.mTitle = this.getResources().getString(R.string.platoFuerte3);
        mynode3.mDescription = this.getResources().getString(R.string.descripcionFuerte3);
        mynode3.mImageResource = R.drawable.molepoblano;

        mArray.add(mynode3);


    }

    public  class MyAdapter extends BaseAdapter
    {

        private Context mContext;

        public MyAdapter(Context c) {
            this.mContext = c;
        }

        @Override
        public int getCount() {
            // Retornar el numero de items que tiene la lista
            return mArray.size();
        }

        @Override
        public Object getItem(int position) {
            // Devuelve un item
            return mArray.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Devuelve una vista del item que queremos visualizar

            View view = null;

            if (convertView == null){
                // Hacer una nueva vista
                LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.activity_list, null);
            } else{
                // Usar convertViwe Si esta disponible
                view = convertView;
            }

            ImageView img = (ImageView) view.findViewById(R.id.image);
            img.setImageDrawable(mContext.getResources().getDrawable(mArray.get(position).mImageResource));

            TextView tTittle = (TextView) view.findViewById(R.id.title);
            tTittle.setText(mArray.get(position).mTitle);

            TextView Tdescription = (TextView) view.findViewById(R.id.description);
            Tdescription.setText(mArray.get(position).mDescription);


            return view;
        }
    }
}
package com.upb.mirestaurante1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    String [] Categorias = new String [] {"Entradas","Platos Fuertes", "Bebidas", "Postres"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Obtener el id del archivo xml
        ListView lv = findViewById(android.R.id.list);
        //Prepara el contenido
        ListAdapter la = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Categorias);
        //Asigna contenido a la vista
        lv.setAdapter(la);
    }
}
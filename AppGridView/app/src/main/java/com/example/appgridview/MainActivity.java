package com.example.appgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView miGrid = findViewById(R.id.miGrid);

        final String[] datos = new String[]{
                "Elemento1", "Elemento2", "Elemento3", "Elemento4", "Elemento5", "Elemento6"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datos);

        miGrid.setAdapter(adaptador);

        miGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                String elemento = (String) adapterView.getItemAtPosition(posicion);
                //  String elemento = (String) adapterView.getAdapter().getItem(posicion);
                Toast.makeText(MainActivity.this, elemento, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

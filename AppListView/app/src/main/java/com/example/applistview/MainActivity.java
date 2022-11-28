package com.example.applistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listado = (ListView) findViewById(R.id.miLista);
        String[] datos = {
                "SERGIO GALVEZ REGUERA",
                "JORGE VAZQUEZ CASAUS",
                "JAVIER LOSANTOS MUÑOZ",
                "JAIRO MORA ENRIQUEZ",
                "LEO LOPEZ SANTOS",
                "JASI SINGH KAUBER",
                "CORA GONZALEZ PEREZ",
                "MICHEL CUARTERO CIMORRA"
        };
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);
/*
        ListView listado = (ListView) findViewById(R.id.miLista);
        final String[] datos = new String[]{"Elemento1", "Elemento2", "Elemento3", "Elemento4", "Elemento5"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datos);
        listado.setAdapter(adaptador);
*/

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long id) {

                //obtener el texto del elemento pulsado

                String elemento = (String) adapterView.getItemAtPosition(posicion);
            //  String elemento = (String) adapterView.getAdapter().getItem(posicion);
                Toast.makeText(MainActivity.this, elemento, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
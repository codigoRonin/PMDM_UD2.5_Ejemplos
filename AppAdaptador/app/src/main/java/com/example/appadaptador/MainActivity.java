package com.example.appadaptador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Datos[] datos = new Datos[]{
                new Datos("Línea Superior 1", "Línea Inferior 1"),
                new Datos("Línea Superior 2", "Línea Inferior 2"),
                new Datos("Línea Superior 3", "Línea Inferior 3"),
                new Datos("Línea Superior 4", "Línea Inferior 4"),
                new Datos("Línea Superior 5", "Línea Inferior 5"),
                new Datos("Línea Superior 6", "Línea Inferior 6"),
                new Datos("Línea Superior 7", "Línea Inferior 7")};

        ArrayList<Datos> datos2 = new ArrayList<Datos>();
        datos2.add(new Datos("Línea Superior 1", "Línea Inferior 1"));
        datos2.add(new Datos("Línea Superior 2", "Línea Inferior 2"));
        datos2.add(new Datos("Línea Superior 3", "Línea Inferior 3"));
        datos2.add(new Datos("Línea Superior 4", "Línea Inferior 4"));

        ListView listado = (ListView) findViewById(R.id.miLista);
        View miCabecera = getLayoutInflater().inflate(R.layout.cabecera, null);
        View miCabecera2 = getLayoutInflater().inflate(R.layout.cabecera, null);

        listado.addHeaderView(miCabecera);
        listado.addFooterView(miCabecera2);

     //  Adaptador miAdaptador = new Adaptador(this, datos);
        Adaptador_2 miAdaptador = new Adaptador_2(this, datos2);
        listado.setAdapter(miAdaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adaptador, View v, int position, long id) {
                //Por ejemplo mostrar en un Toast el elemento seleccionado
               String seleccionado = ((Datos) adaptador.getItemAtPosition(position)).getTexto1();
               Toast.makeText(MainActivity.this,seleccionado, Toast.LENGTH_SHORT).show();

            }
        });
    }


}

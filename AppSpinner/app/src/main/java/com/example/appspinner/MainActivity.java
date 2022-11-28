package com.example.appspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*    Spinner spinner = (Spinner) findViewById(R.id.miSpinner);
        String[] valor = {"Valor1", "Valor2", "Valor3","Valor4", "Valor5"};
        spinner.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, valor));*/

        Spinner spinner = (Spinner) findViewById(R.id.miSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valores, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(3);

        String value = spinner.getSelectedItem().toString();
        Toast.makeText(MainActivity.this, value, Toast.LENGTH_LONG).show();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                String selection = spinner.getItemAtPosition(position).toString();
                //Mostramos la selección actual del Spinner
                Toast.makeText(MainActivity.this, "Selección actual: " + selection, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
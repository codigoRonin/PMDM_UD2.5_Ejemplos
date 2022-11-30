package com.example.appmenucontextual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView etiqueta = (TextView)findViewById(R.id.miTexto);
        TextView etiqueta2 = (TextView)findViewById(R.id.miTexto2);
        registerForContextMenu(etiqueta);
        registerForContextMenu(etiqueta2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();

        if(v.getId() == R.id.miTexto)
             inflater.inflate(R.menu.opciones, menu);
        else if(v.getId() == R.id.miTexto2)
        {
            inflater.inflate(R.menu.opciones2, menu);
        }
    }
}
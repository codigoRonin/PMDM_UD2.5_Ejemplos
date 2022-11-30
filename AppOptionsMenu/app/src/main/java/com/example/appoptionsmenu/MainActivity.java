package com.example.appoptionsmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

      @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.opciones, menu);
            return true;
        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.opMenu1:
                    // Código para realizar
                Toast.makeText(MainActivity.this, "hola", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opMenu2:
                // Código para realizar
                return true;
            case R.id.opMenu3:
                // Código para realizar
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
/*
    private static final int MnOp1 = 1;
    private static final int MnOp1_1 = 1;
    private static final int MnOp1_2 = 1;
    private static final int MnOp2 = 2;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu smnu = menu.addSubMenu(Menu.NONE, MnOp1, Menu.NONE, "Opción A desde Java");
        smnu.add(Menu.NONE, MnOp1_1, Menu.NONE, "Opción A.1");
        smnu.add(Menu.NONE, MnOp1_2, Menu.NONE, "Opción A.2");
     //   menu.add(Menu.NONE, MnOp1, Menu.NONE, "Opción A desde Java");

        menu.add(Menu.NONE, MnOp2, Menu.NONE, "Opción B desde Java");

        return true;
    }
*/
}
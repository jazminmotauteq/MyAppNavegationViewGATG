package com.example.myappnavegationviewgatg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getTitle().toString()) {
            case "Search":
                Toast.makeText(this.getApplicationContext(), "Ha presionado opción Nuevo ", Toast.LENGTH_LONG).show();
                return true;
            case "Nuevo":
                Toast.makeText(this.getApplicationContext(), "Ha presionado opción Buscar ", Toast.LENGTH_LONG).show();
                return true;
            case "Configuracion":
                Toast.makeText(this.getApplicationContext(), "Ha presionado opción Setting", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
package com.example.creationdemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.homme) {
            Toast.makeText(this, "Option Homme", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.save) {
            Toast.makeText(this, "Option Saved", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.delete) {
            Toast.makeText(this, "Option Supprimer", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.aide) {
            Toast.makeText(this, "Option Aide", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.option01) {
            Toast.makeText(this, "Option Oune", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.option02) {
            Toast.makeText(this, "Option Two", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (itemId == R.id.option03) {
            Toast.makeText(this, "Option Three", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}
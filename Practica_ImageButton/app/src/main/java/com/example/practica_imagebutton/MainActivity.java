package com.example.practica_imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MensajeGeekipedia(View view){
        Toast.makeText(this,"La Geekipedia de Ernesto", Toast.LENGTH_SHORT).show();
    }

    public void MensajeMano(View view){
        Toast.makeText(this,"Esto es una mano", Toast.LENGTH_SHORT).show();
    }
}

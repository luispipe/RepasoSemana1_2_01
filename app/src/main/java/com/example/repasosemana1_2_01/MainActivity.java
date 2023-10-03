package com.example.repasosemana1_2_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    * 1. A usted le llegan dos valores double y va a
    *    retornar el primer valor elevado al segundo
    * 2. Dados dos String retornar si estos tienen el mismo tamaño
    *    y son iguales en sus caracteres.
    * 3. Haga un metodo que permita calcular el perimetro de un circulo
    * */
    Button pow,string,circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pow=findViewById(R.id.btnPow);
        string=findViewById(R.id.btnString);
        circle= findViewById(R.id.btnCircle);

        Intent irPow= new Intent(getApplicationContext(), PowActivity.class);
        Intent irString= new Intent(getApplicationContext(), StringActivity.class);
        Intent irCircle= new Intent(getApplicationContext(), CirculoActivity.class);

        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(irPow);
            }
        });

        string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(irString);
            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(irCircle);
            }
        });
    }




}
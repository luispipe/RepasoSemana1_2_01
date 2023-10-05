package com.example.repasosemana1_2_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StringActivity extends AppCompatActivity {
    //Primer paso  debajo de la clase definir las variables de los
    // componentes de la interfaz
    private EditText txt1, txt2;
    private Button validate;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);

        //Segundo paso: dentro del metodo onCreate asocio las
        // variables con los componentes de la interfaz
        // por medio de su id
        txt1= findViewById(R.id.etText1);//identificador del componente
        txt2= findViewById(R.id.etText2);
        validate= findViewById(R.id.btnCalculateString);
        result=findViewById(R.id.tvResultString);

        // Tercer paso: generar las acciones dentro de la interfaz
        // Elementos que generan acciones: Button, Radio Button, TextView, EditText, ...
        // Acciones o eventos: setOnClickListener o el setOnChangeListener

        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cuarto paso: dentro del metodo onClick definir lógica del ejercicio
                /*
                 *  txt1= "Hola Luis" txt2= "Hola Erid" --> Tienen misma cantidad de carácteres pero no son iguales
                 *  txt1= "Hola Luis" txt2= "Hola luis" --> Tienen misma cantidad de carácteres y son iguales
                 *  txt1= "Hola Diana" txt2= "Hola Erid" --> No tienen las misma cantidad de carácteres por ende son diferentes
                 *
                 * */

                //Quinto paso: obtener los datos que el usuario ingresa y convertirlos a String
                String texto1 = txt1.getText().toString();
                String texto2 = txt2.getText().toString();

                //Sexto paso: validar que los campos no lleguen vacios
                if (texto1.isEmpty() || texto2.isEmpty()) {
                    Toast.makeText(getBaseContext(),"Los dos campos de texto deben llenarse"
                                   ,Toast.LENGTH_LONG).show();
                } else {
                    if (texto1.length() == texto2.length()) {
                        if (texto1.equalsIgnoreCase(texto2)) {
                            result.setText("Los textos son iguales por ende tienen la misma cantidad de carácteres");
                        } else {
                            result.setText("La cantidad de carácteres es igual pero los textos diferentes");
                        }

                    } else {
                        result.setText("La cantidad de carácteres es diferente por ende no los textos no son iguales");
                    }
                }
            }
        });


    }
}
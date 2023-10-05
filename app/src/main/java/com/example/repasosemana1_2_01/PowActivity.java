package com.example.repasosemana1_2_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PowActivity extends AppCompatActivity {
    //Como buena practica en java se recomienda que las variables
    //globales sean privadas
     private EditText base, exponente;
     private Button calculatePow;
     private TextView resultPow,resultTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pow);

        base= findViewById(R.id.etBase);
        exponente=findViewById(R.id.etExponente);
        calculatePow=findViewById(R.id.btnCalculatePow);
        resultPow=findViewById(R.id.tvResultPow);
        resultTxt= findViewById(R.id.tvResultTx);

        calculatePow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtBase= base.getText().toString();
                String txtExpo= exponente.getText().toString();
            //  || son igual a "o" si se cumple la opción A ||(o) la opción B
                if(txtBase.isEmpty() || txtExpo.isEmpty()){
                    Toast.makeText(getBaseContext(),"Todos los campos" +
                            "Deben ser diligenciado",Toast.LENGTH_LONG).show();
                }else{

                    double valor_base= Double.parseDouble(txtBase);
                    double valor_exponente= Double.parseDouble(txtExpo);
                    double potencia= Math.pow(valor_base,valor_exponente);

                    resultTxt.setVisibility(View.VISIBLE);

                    resultPow.setText(potencia+"");
                    System.out.println(potencia);
                }

            }
        });

    }
}
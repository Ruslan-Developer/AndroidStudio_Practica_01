package com.example.proyecto01;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.et1);
        num2 = findViewById(R.id.et2);
        resultado = findViewById(R.id.tv1);


    }
    public void sumar(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int suma = num1 + num2;
        String resultado1 = String.valueOf(suma);
        resultado.setText("Resultado "+resultado1);



    }
    public void restar(View view){
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);
        int suma = num1 - num2;
        String resultado1 = String.valueOf(suma);
        resultado.setText("Resultado "+resultado1);



    }


}
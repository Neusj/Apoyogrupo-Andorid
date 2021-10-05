package com.example.apoyogrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView resultado;

    private float resOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resultado = findViewById(R.id.resultado);

    }

    public void sumar(View view){

        if(!num1.getText().toString().equals("") && !num2.getText().toString().equals("")){
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());

            this.resOperacion = a + b;
            resultado.setText(String.valueOf(this.resOperacion));
        }else {
            Toast.makeText(this, "Llene todos los campos para sumar", Toast.LENGTH_SHORT).show();
            Log.d("error_suma", "Campos vacios");
        }

    }

    public void restar(View view){

        if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("") ){
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());

            this.resOperacion = a - b;
            resultado.setText(String.valueOf(this.resOperacion));
        }else {
            Toast.makeText(this, "Llene todos los campos para restar", Toast.LENGTH_SHORT).show();
            Log.d("error_resta", "Campos vacíos");
        }

    }

    public void multiplicar(View view){
        if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("") ){
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());

            this.resOperacion = a * b;
            resultado.setText(String.valueOf(this.resOperacion));
        }else {
            Toast.makeText(this, "Llene todos los campos para multiplicar", Toast.LENGTH_SHORT).show();
            Log.d("error_multiplica", "Campos vacíos");
        }

    }

    public void dividir(View view){
        if (!num1.getText().toString().equals("") && !num2.getText().toString().equals("") ){

            float a = Integer.parseInt(num1.getText().toString());
            float b = Integer.parseInt(num2.getText().toString());

            if (b > 0){
                this.resOperacion = a / b;
                resultado.setText(String.valueOf(this.resOperacion));
            }else {
                Toast.makeText(this, "No es posible dividir por 0", Toast.LENGTH_SHORT).show();
                Log.d("error_divide", "División por cero");
            }

        }else {
            Toast.makeText(this, "Llene todos los campos para dividir", Toast.LENGTH_SHORT).show();
            Log.d("error_divide", "Campos vacíos");
        }
    }

    public void convertir(View view){
        //valor del eruo 10/09/2021 (1 peso = 0,0011 €)
        float EURO = 0.0011f;
        float  res = this.resOperacion * EURO;

        Intent intent = new Intent(this, SecondMainActivity.class);
        intent.putExtra("resConvertido", res);
        startActivity(intent);
        finish();

    }

}
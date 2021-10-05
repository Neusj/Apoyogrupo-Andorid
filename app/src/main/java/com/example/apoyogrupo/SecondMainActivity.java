package com.example.apoyogrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity {

    private TextView txtConver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        txtConver = findViewById(R.id.txtConvertido);

        Bundle extras = getIntent().getExtras();
        float resEnviado = extras.getFloat("resConvertido");

        txtConver.setText(String.valueOf(resEnviado));

    }


    public void volver(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
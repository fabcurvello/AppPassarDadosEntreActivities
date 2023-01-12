package com.example.apppassardadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btEnviar;
    private EditText etIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEnviar = findViewById(R.id.btEnviar);
        etIdade = findViewById(R.id.etIdade);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Capturar a idade que está no EditText e converter para int:
                int idade = Integer.parseInt( etIdade.getText().toString() );

                //Intenção de iniciar a SegundaActivity
                Intent intent = new Intent( getApplicationContext(), SegundaActivity.class );

                //Passar dados entre activities pela intent
                intent.putExtra("idadeInserida", idade );

                //Iniciar a intent
                startActivity( intent );

            }
        });

    }
}
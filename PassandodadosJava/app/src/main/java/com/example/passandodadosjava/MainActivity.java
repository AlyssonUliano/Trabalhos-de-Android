package com.example.passandodadosjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                //intanciar o objeto
                Usuario usuario= new Usuario("Alysson Vinicius","alyssonuliano97@gmail.com");

                //passar dados
                intent.putExtra("nome", "Alysson Vinicius");
                intent.putExtra("idade", 23);
                intent.putExtra("objeto",usuario);

                // chamar a outra activity
                startActivity(intent);
            }
        });

    }
}

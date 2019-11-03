package com.example.amandacruz.sospets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaUsuario extends AppCompatActivity {

   Button abrir,denuncia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        abrir = (Button) findViewById(R.id.button);
        denuncia = findViewById(R.id.denuncia);

        abrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //passar tela antiga e para qual vai //
                Intent intent = new Intent(TelaUsuario.this,TelaLocalizarAnimal.class);
                startActivity(intent);

            }
        });
        denuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //passar tela antiga e para qual vai //
                Intent intent = new Intent(TelaUsuario.this,TelaDenuncia.class);
                startActivity(intent);

            }
        });

   }
}

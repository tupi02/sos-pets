package com.example.amandacruz.sospets;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaAdmin extends AppCompatActivity {

    ImageView admin;
    TextView usuario;
    EditText senhaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_admin);

        admin = (ImageView) findViewById(R.id.entrar2);
        usuario = (TextView) findViewById(R.id.entrar);
        senhaa = (EditText) findViewById(R.id.senha);

        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* AlertDialog.Builder dialog = new AlertDialog.Builder(TelaAdmin.this);
                dialog.setTitle(senhaa.getText());*/
                if(senhaa.getText().toString().equals("1234a")){
                    Intent intent = new Intent(TelaAdmin.this,TelaPrincipalAdmin.class);
                    startActivity(intent);
                }
                else {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder( TelaAdmin.this);
                    dialogo.setTitle("Código Incorreto.");
                    dialogo.setNeutralButton( "OK",  null);
                    dialogo.show();
                }
            }
            });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(senhaa.getText().toString().equals("1234a")){
                    Intent intent = new Intent(TelaAdmin.this,TelaPrincipalAdmin.class);
                    startActivity(intent);
                }
                else {
                    AlertDialog.Builder dialogo = new AlertDialog.Builder( TelaAdmin.this);
                    dialogo.setTitle("Código Incorreto.");
                    dialogo.setNeutralButton( "OK",  null);
                    dialogo.show();
                }
            }
        });


    }
}

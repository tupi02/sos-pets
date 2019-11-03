package com.example.amandacruz.sospets;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TelaLocalizarAnimal extends AppCompatActivity {

    private EditText txtnome, txtidade, txtrua,txtnumero,txtbairro,txtreferencia,txtcaracteristica,txtestado;
    private TextView btnenviar;
    private RelativeLayout layoutRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_localizar_animal);

        layoutRelative = (RelativeLayout)findViewById(R.id.layoutRelative);
        btnenviar = (TextView)findViewById(R.id.btnenviar);
        txtnome = (EditText)findViewById(R.id.txtnome);
        txtidade = (EditText)findViewById(R.id.txtidade);
        txtrua = (EditText)findViewById(R.id.txtrua);
        txtnumero = (EditText)findViewById(R.id.txtnumero);
        txtbairro = (EditText)findViewById(R.id.txtbairro);
        txtreferencia = (EditText)findViewById(R.id.txtreferencia);
        txtcaracteristica = (EditText)findViewById(R.id.txtcaracteristica);
        txtestado = (EditText)findViewById(R.id.txtestado);


        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validaCampos();
               // Toast.makeText(getApplicationContext(), "Enviar", Toast.LENGTH_SHORT).show();

            }

        });



    }



        private void validaCampos(){

        boolean res = false;

        String nome = txtnome.getText().toString();
        int idade = Integer.parseInt(txtidade.getText().toString());
        String rua = txtrua.getText().toString();
        int numero = Integer.parseInt(txtnumero.getText().toString());
        String bairro = txtbairro.getText().toString();
        String referencia = txtreferencia.getText().toString();
        String caracteristica = txtcaracteristica.getText().toString();
        String estado = txtestado.getText().toString();

        if (res = isCampoVazio(nome)){
            txtnome.requestFocus();
        } else
        if (res = isCampoVazio(rua)){
            txtrua.requestFocus();
        } else
        if (res = isCampoVazio(bairro)){
            txtbairro.requestFocus();
        } else
        if ( res = isCampoVazio(referencia)){
            txtreferencia.requestFocus();
        } else
        if (res = isCampoVazio(caracteristica)){
            txtcaracteristica.requestFocus();
        }

       /* if(res = idade==0){
            txtidade.setText("");
        } else
         if (idade<=13){
                System.out.println("Você não possui idade suficiente para fazer uma denúncia.");
             txtnome.setText("");
             txtidade.setText("");
             txtrua.setText("");
             txtnumero.setText("");
             txtbairro.setText("");
             txtreferencia.setText("");
             txtcaracteristica.setText("");
             txtestado.setText("");

             txtnome.requestFocus();

            }else
            if (res = numero==0){
                txtnumero.requestFocus();
         }*/

         if(res){

             AlertDialog.Builder dlg = new AlertDialog.Builder(this);
             dlg.setTitle("AVISO");
             dlg.setMessage("Campos Inválidos ou em Branco.");
             dlg.setNeutralButton("OK", null);
             dlg.show();
         }

    }


    private boolean isCampoVazio(String valor){

        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;

    }


    }


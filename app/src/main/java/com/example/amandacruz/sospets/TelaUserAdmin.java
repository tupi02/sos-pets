package com.example.amandacruz.sospets;


import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.amandacruz.sospets.database.DadosOpenHelper;


public class TelaUserAdmin extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private DadosOpenHelper dadosOpenHelper;
    private RelativeLayout layoutRelativeMain;


    TextView usuario,adm;
    ImageView abrirUser,abrirAdm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_user_admin);


        //declaraçao dos objetos em variaveis//
        abrirUser = (ImageView) findViewById(R.id.user);
        usuario = (TextView) findViewById(R.id.User);
        layoutRelativeMain = (RelativeLayout)findViewById(R.id.layoutRelativeMain);

        criarConexao();

        //metodo para clicar no text view//
        usuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //passar tela antiga e para qual vai //
                Intent intent = new Intent(TelaUserAdmin.this,TelaUsuario.class);
                startActivity(intent);

            }
        });

      //    //metodo para clicar no Image view//
        abrirUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //passar tela antiga e para qual vai //
                Intent intent = new Intent(TelaUserAdmin.this,TelaUsuario.class);
                startActivity(intent);
            }

        });




        //declaraçao dos objetos em variaveis//
        abrirAdm = (ImageView) findViewById(R.id.adm);
        adm = (TextView) findViewById(R.id.textadm);


        //metodo para clicar no text view//
        adm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //passar tela antiga e para qual vai //
                Intent intent = new Intent(TelaUserAdmin.this,TelaAdmin.class);
                startActivity(intent);

            }
        });

        //    //metodo para clicar no Image view//
        abrirAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //passar tela antiga e para qual vai //
                Intent intent = new Intent(TelaUserAdmin.this,TelaAdmin.class);
                startActivity(intent);
            }

        });
    }

    private void criarConexao(){


     try{

        dadosOpenHelper = new DadosOpenHelper(this);

        conexao = dadosOpenHelper.getWritableDatabase();



         Snackbar.make(layoutRelativeMain,"Conexão criada com sucesso!",Snackbar.LENGTH_SHORT)
                 .setAction("OK",null).show();


    }catch(SQLException ex){

         AlertDialog.Builder dialogo = new AlertDialog.Builder( TelaUserAdmin.this);
         dialogo.setTitle("Erro.");
         dialogo.setMessage(ex.getMessage());
         dialogo.setNeutralButton( "OK",  null);
         dialogo.show();

    }
}






}
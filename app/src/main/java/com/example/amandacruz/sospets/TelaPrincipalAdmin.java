package com.example.amandacruz.sospets;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.amandacruz.sospets.database.DadosOpenHelper;

import java.util.concurrent.ExecutionException;

public class TelaPrincipalAdmin extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal_admin);
    }


}

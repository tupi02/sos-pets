package com.example.amandacruz.sospets.database;

/**
 * Created by amanda.cruz on 23/10/2019.
 */

public class ScriptDLL {

    public static String getCreatTableClient() {

        StringBuilder sql = new StringBuilder();

        sql.append("  CREATE TABLE IF NOT EXISTS LOCALIZACAO(" );

        sql.append("     ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," );
        sql.append("     NOME VARCHAR (250) NOT NULL," );
        sql.append("     IDADE INTEGER," );
        sql.append("     RUA VARCHAR(250)," );
        sql.append("     NUMERO INTEGER," );
        sql.append("     BAIRRO VARCHAR(250), " );
        sql.append("     PONTO_REFERENCIA VARCHAR(250), " );
        sql.append("     CARACTERISTICA VARCHAR(250)," );
        sql.append("     ESTADO_ANIMAL VARCHAR(250) NULL)" );


        return sql.toString();

    }
}

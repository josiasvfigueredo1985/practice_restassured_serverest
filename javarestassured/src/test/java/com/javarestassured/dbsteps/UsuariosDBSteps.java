package com.javarestassured.dbsteps;

import com.javarestassured.utils.DBUtils;
import com.javarestassured.utils.GeneralUtils;

public class UsuariosDBSteps {
    private static String queriesPath = System.getProperty("user.dir")+"/src/test/java/com/javarestassuredtemplate/queries/";

    public static String retornaSenhaDoUsuario(String userName){
        String query = GeneralUtils.readFileToAString(queriesPath + "retornaSenhaUsuarioQuery");
        query.replace("$nome", userName);

        return DBUtils.getQueryResult(query).get(0);
    }
}

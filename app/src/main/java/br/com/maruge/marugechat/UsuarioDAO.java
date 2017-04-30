package br.com.maruge.marugechat;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jefferson David on 30/04/2017.
 */

public class UsuarioDAO extends genericUsuario <Usuario> {


    private SQLiteDatabase database;
    public UsuarioDAO(Context context){
        super(context);
        database = getWritableDatabase();
    }

    @Override
    public boolean salvar( Usuario usuario) {
        database.execSQL("INSERT INTO user (nome, senha) " +
                "VALUES ('"+usuario.getNome()+"'," +
                "'"+usuario.getSenha()+"')");
        return false;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM user", null);
        cursor.moveToFirst();

        int indiceColunaId = cursor.getColumnIndex("iduser");
        int indiceColunaNome = cursor.getColumnIndex("nome");
        int indiceColunaSenha = cursor.getColumnIndex("senha");


        do{
            Usuario usuario = new Usuario();
            usuario.setId(cursor.getInt(indiceColunaId));
            usuario.setNome(cursor.getString(indiceColunaNome));
            usuario.setSenha(cursor.getString(indiceColunaSenha));
            usuarios.add(usuario);

        } while(cursor.moveToNext());
        return usuarios;
    }

    @Override
    public boolean deletar(int id) {
        database.execSQL("DELETE FROM user WHERE iduser="+id);
        return false;

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

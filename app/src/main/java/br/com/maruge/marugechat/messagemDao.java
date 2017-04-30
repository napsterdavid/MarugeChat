package br.com.maruge.marugechat;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Jefferson David on 30/04/2017.
 */
public abstract class messagemDao extends genericMessagem <Messagem>{
    private SQLiteDatabase database;
    public messagemDao(Context context){
        super(context);
        database = getWritableDatabase();
    }
    @Override
    public boolean salvar( Messagem messagem) {
        database.execSQL("INSERT INTO messagem(data, msg)"+
                "VALUES ('"+messagem.getData()+"'," +
                "'"+messagem.getMsg()+"'" +
                "'"+messagem.getTitulo()+"'" +
                ")");
        return false;
    }
    @Override
    public List<Messagem> listar() {
        List<Messagem> messagem = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM messagem", null);
        cursor.moveToFirst();
        int indiceColunaId = cursor.getColumnIndex("idmessagem");
        int indiceColunadata = cursor.getColumnIndex("data");
        int indiceColunamsg = cursor.getColumnIndex("msg");
        int indiceColunatitulo = cursor.getColumnIndex("titulo");
        do{
            Messagem messagem1 = new Messagem();
            messagem1.setId(cursor.getInt(indiceColunaId));
            messagem1.setData(cursor.getString(indiceColunadata));
            messagem1.setMsg(cursor.getString(indiceColunamsg));
            messagem1.setTitulo(cursor.getString(indiceColunatitulo));
            messagem.add(messagem1);
        } while(cursor.moveToNext());
        return messagem;
    }
    @Override
    public boolean deletar(int id) {
        database.execSQL("DELETE FROM messagem WHERE idmessagem="+id);
        return false;
    }
}
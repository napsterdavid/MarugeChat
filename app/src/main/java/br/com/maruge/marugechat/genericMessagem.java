package br.com.maruge.marugechat;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.List;
/**
 * Created by Jefferson David on 30/04/2017.
 */
public abstract class genericMessagem <T> extends SQLiteOpenHelper {
        private static final String BD = "MarugeChat";
        private static final int Vbd = 1;
        private String sqlCreateMessagem = "CREATE TABLE IF NOT EXISTS messagem(" +
                "idmessagem INT AUTO_INCREMENT," +
                "data VARCHAR(10) NOT NULL," +
                "msg VARCHAR(200) NOT NULL," +
                "titulo VARCHAR(40) NOT NULL," +
                "PRIMARY KEY(idmessagem)"+
                ");";
        public genericMessagem(Context context) {
            super(context, BD, null, Vbd);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(sqlCreateMessagem);
        }
        public abstract  boolean salvar(T t);
        public abstract List<T> listar();
        public abstract  boolean deletar(int id);
}

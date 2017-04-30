package br.com.maruge.marugechat;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Jefferson David on 30/04/2017.
 */
public class ListaUsuario extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_messagens);
        ListView listView = (ListView) findViewById(R.id.listView);
        UsuarioDAO usuarioDAO = new UsuarioDAO(this);
        List<Usuario> usuarios = new ArrayList<>();
        if(usuarioDAO.listar()!=null){
            if(usuarioDAO.listar().size()>0){
                usuarios = usuarioDAO.listar();
            }
        }
        ArrayAdapter<Usuario> adapter = new ArrayAdapter<Usuario>(this, android.R.layout.simple_list_item_1,
                        usuarios);
        listView.setAdapter(adapter);
    }
}

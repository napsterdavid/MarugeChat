package br.com.maruge.marugechat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by Jefferson David on 30/04/2017.
 */
public class TelaNovoUsuario extends AppCompatActivity {
    EditText edtNovoUsuario, edtNovaSenha;
    Button btnCadastrar, btnCancelar;
    @Override
    protected  void onCreate( Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
       edtNovoUsuario = (EditText)findViewById(R.id.edtNovoUsuario);
       edtNovaSenha = (EditText)findViewById(R.id.edtNovaSenha);
       btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
       btnCancelar = (Button)findViewById(R.id.btnCancelar);
    }
}


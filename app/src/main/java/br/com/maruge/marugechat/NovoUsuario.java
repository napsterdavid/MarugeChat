package br.com.maruge.marugechat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NovoUsuario extends AppCompatActivity {
    EditText edtNovoUsuario, edtNovaSenha;
    Button btnCadastrar, btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        edtNovoUsuario = (EditText)findViewById(R.id.edtNovoUsuario);
        edtNovaSenha = (EditText)findViewById(R.id.edtNovaSenha);
        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
    }
}

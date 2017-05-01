package br.com.maruge.marugechat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.maruge.marugechat.model.Usuario;
import br.com.maruge.marugechat.model.UsuarioDAO;

public class NovoUsuario extends AppCompatActivity {
    private static final String TAG = "aula_sqlite";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        final EditText tvNome = (EditText) findViewById(R.id.edtNome);
        final EditText tvSenha = (EditText) findViewById(R.id.edtSenha);
        Button btnSalvar = (Button) findViewById(R.id.btnSalvar);
        Button btnListar = (Button) findViewById(R.id.btnListar);
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                UsuarioDAO usuarioDAO = new UsuarioDAO(NovoUsuario.this);
                Usuario usuario = new Usuario();
                usuario.setNome(tvNome.getText().toString());
                usuario.setSenha(tvSenha.getText().toString());
                usuarioDAO.salvar(usuario);

                tvSenha.setText("");
                tvNome.setText("");
                Toast.makeText(NovoUsuario.this, "Usuário Salvo com Sucesso!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NovoUsuario.this, Postagens.class);
                startActivity(intent);
            }
        });
    }
}

package br.com.maruge.marugechat;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.maruge.marugechat.UsuarioDAO;
import br.com.maruge.marugechat.Usuario;




public class NovoUsuario extends AppCompatActivity {



        private static final String TAG = "MarugeChat";


   // EditText edtNovoUsuario, edtNovaSenha;
   // Button btnCadastrar, btnCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        final EditText Nome = (EditText) findViewById(R.id.edtNovoUsuario);
        final EditText Senha = (EditText) findViewById(R.id.edtNovaSenha);
        Button btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
               Button btnCancelar = (Button)findViewById(R.id.btnCancelar);

     //   edtNovoUsuario = (EditText)findViewById(R.id.edtNovoUsuario);
      //  edtNovaSenha = (EditText)findViewById(R.id.edtNovaSenha);
     //   btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
     //   btnCancelar = (Button)findViewById(R.id.btnCancelar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UsuarioDAO usuarioDAO = new UsuarioDAO(NovoUsuario.this);
                Usuario usuario = new Usuario();
                usuario.setNome(Nome.getText().toString());
                usuario.setNome(Senha.getText().toString());
                UsuarioDAO.salva(usuario);
                Nome.setText("");
                Senha.setText("");
                Toast.makeText(NovoUsuario.this, "Usuário Salvo com Sucesso!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}

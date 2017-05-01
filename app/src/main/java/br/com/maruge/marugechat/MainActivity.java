package br.com.maruge.marugechat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnLogar,btnNovoUsuario,btnNovaPostagem,btnPostagens;
    TextView txtNovoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogar = (Button)findViewById(R.id.btnLogar);
        txtNovoUsuario = (TextView)findViewById(R.id.txtNovoUsuario);
        btnNovaPostagem = (Button)findViewById(R.id.btnNovaPostagem);
        btnPostagens = (Button)findViewById(R.id.btnPostagens);

// Intente para ir para pagina de listagem das postagens
        btnPostagens.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, Postagens.class);
                startActivity(it);
            }
        });

        // Intente para criar uma nova postagem
        btnNovaPostagem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, NovaPostagem.class);
                startActivity(it);
            }
        });


        // Intente Para Novo Usuário
        txtNovoUsuario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, NovoUsuario.class);
                startActivity(it);
            }

        });




    }
}

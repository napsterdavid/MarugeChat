package br.com.maruge.marugechat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnLogar,btnNovoUsuario,btnNovaPostagem,btnPostagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogar = (Button)findViewById(R.id.btnLogar);
        btnNovoUsuario = (Button)findViewById(R.id.btnNovoUsuario);
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

        // Intente para criar uma nova postagem
        btnNovoUsuario.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, NovoUsuario.class);
                startActivity(it);
            }
        });




    }
}

package br.com.maruge.marugechat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText EdtUsuario,EdtSenha;
    Button btnlogar,btnteste;
    TextView txtNovoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtUsuario = (EditText)findViewById(R.id.EdtUsuario);
        EdtSenha = (EditText)findViewById(R.id.EdtSenha);
        btnlogar = (Button)findViewById(R.id.btnlogar);
        txtNovoUsuario = (TextView)findViewById(R.id.txtNovoUsuario);
        btnteste =(Button)findViewById(R.id.btnteste);
        Button nomeParaOBotao = (Button) findViewById(R.id.nomeDoBotao);


        nomeParaOBotao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, novoCadastro.class);
                startActivity(it);
            }
        });




        btnteste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novoUsuario = new Intent(MainActivity.this, TelaNovoUsuario.class);
                startActivity(novoUsuario);
            }

        });

        /*

        txtNovoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaNovoUsuario.class);
                startActivity(intent);
            }
        });





        txtNovoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novoUsuario = new Intent(MainActivity.this, TelaNovoUsuario.class);
                startActivity(novoUsuario);
            }

        });

*/





    }
}

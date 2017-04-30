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
    Button btnlogar;
    TextView txtNovoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtUsuario = (EditText)findViewById(R.id.EdtUsuario);
        EdtSenha = (EditText)findViewById(R.id.EdtSenha);
        btnlogar = (Button)findViewById(R.id.btnlogar);
        txtNovoUsuario = (TextView)findViewById(R.id.txtNovoUsuario);

        txtNovoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novoUsuario = new Intent(MainActivity.this, TelaNovoUsuario.class);
                startActivity(novoUsuario);
            }
        });




    }
}

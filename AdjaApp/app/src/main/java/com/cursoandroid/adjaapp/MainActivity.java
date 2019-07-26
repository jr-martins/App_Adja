package com.cursoandroid.adjaapp;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cursoandroid.adjaapp.views.DetailPastoresActivity;
import com.cursoandroid.adjaapp.views.PastoresActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoEmpresa;
    private ImageView botaoServico;
    private ImageView botaoCliente;
    private ImageView botaoContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        castAtributos();

        navigationActivity();

    }

    private void castAtributos()
    {

        botaoEmpresa = findViewById(R.id.empresaId);
        botaoServico = findViewById(R.id.servicoId);
        botaoCliente = findViewById(R.id.clienteId);
        botaoContato = findViewById(R.id.contatoId);

    }

    private void navigationActivity() {

        botaoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, DetailPastoresActivity.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, botaoEmpresa, ViewCompat.getTransitionName(botaoEmpresa));



                startActivity(in,activityOptionsCompat.toBundle());
            }
        });

        botaoServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, DetailPastoresActivity.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, botaoServico, ViewCompat.getTransitionName(botaoServico));



                startActivity(in,activityOptionsCompat.toBundle());
            }
        });

        botaoCliente.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, PastoresActivity.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, botaoCliente, ViewCompat.getTransitionName(botaoCliente));



                startActivity(in,activityOptionsCompat.toBundle());
            }
        }));

        botaoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent in = new Intent(MainActivity.this, DetailPastoresActivity.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, botaoContato, ViewCompat.getTransitionName(botaoContato));



                startActivity(in,activityOptionsCompat.toBundle());


            }
        });

    }
}

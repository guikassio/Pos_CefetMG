package com.example.alunos.appaula06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Adicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adicionar = (Button)findViewById(R.id.buttonAdicionar);

        //Adicionar.setOnClickListener(View);

    }

    public void AbrirTelaTarefas(View v)
    {
        Intent it=new Intent(this, ActivityTarefas.class);
        startActivity(it);
    }

    public void AbrirTelaVisualizar(View v)
    {
        Intent it=new Intent(this, ActivityVisualir.class);
        startActivity(it);
    }


}

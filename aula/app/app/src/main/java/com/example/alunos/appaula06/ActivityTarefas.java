package com.example.alunos.appaula06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

public class ActivityTarefas extends AppCompatActivity {

    Button Salvar;
    EditText DataConclusao;
    EditText Conclusao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefas);

        String Data, TextoConclusao;

        Salvar = (Button)findViewById(R.id.buttonSalvar);
        DataConclusao=(EditText)findViewById(R.id.editTextDataConclusao);
        Conclusao=(EditText)findViewById(R.id.editTextConclusao);


    }

    public void AdicionarTarefa(View v)
    {
        String Data=DataConclusao.getText().toString();
        String TextoConclusao=Conclusao.getText().toString();

        Tarefas t= new Tarefas();
        t.setData(Data);
        t.setDescricao(TextoConclusao);


        Banco.list.add(t);
    }

    public void VoltarTelaPrincipal(View v)
    {
        this.finish();
    }
}

package com.example.alunos.appaula06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ActivityVisualir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_visualir);


        TarefasAdapter tAdapter= new TarefasAdapter(this, Banco.list);

        ListView listview= (ListView)findViewById(R.id.listView);
        listview.setAdapter(tAdapter);
    }
}

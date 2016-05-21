package com.example.alunos.appaula06;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alunos on 21/05/16.
 */
public class TarefasAdapter extends BaseAdapter
{
    private Context context;
    private List<Tarefas> lista;

    public TarefasAdapter(Context context, List<Tarefas> lista) {
        this.context = context;
        this.lista = lista;
    }
    public int getCount() {
        return lista.size();
    }
    public Object getItem(int posicao) {
        Tarefas obj = lista.get(posicao);
        return obj;
    }
    public long getItemId(int posicao) {
        return posicao;
    }

    public View getView(int posicao, View convertView, ViewGroup parent) {

        Tarefas obj = lista.get(posicao);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.modelo, null);

        // Atualiza o valor do Text
        TextView textViewData = (TextView) v.findViewById(R.id.textViewData);
        textViewData.setText(obj.getData());

        TextView textViewConclusao = (TextView) v.findViewById(R.id.textViewConclusao);
        textViewConclusao.setText(obj.getDescricao());

        return v;
    }
}

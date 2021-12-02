package com.example.personagens;

import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity {

    public List<com.example.Personagens> lstPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstPer = new ArrayList<>();

        lstPer.add(new com.example.personagens.Personagens("Heihachi Mishima","50","Karate",R.drawable.heihachi));
        lstPer.add(new com.example.personagens.Personagens("Jin Kazama", "22", "Karate", R.drawable.jin));
        lstPer.add(new com.example.personagens.Personagens("King", "27", "Luta livre", R.drawable.king));
        lstPer.add(new com.example.personagens.Personagens("Yoshimitsu", "31", "Ninjutsu", R.drawable.toshimitzu));
        lstPer.add(new com.example.personagens.Personagens("Hwoarang", "25", "Taekwondo", R.drawable.Hwoarang));
        lstPer.add(new com.example.personagens.Personagens("Eddy Gordo ", "32", "Capoeira", R.drawable.eddy));
        lstPer.add(new com.example.personagens.Personagens("Paul", "37", "Judo", R.drawable.paul));
        lstPer.add(new com.example.personagens.Personagens("Law", "29", "Jet kune do", R.drawable.law));
        lstPer.add(new com.example.personagens.Personagens("Lei", "25", "Kong fu", R.drawable.lei));


        //declarando a variavel xml enviando para o java
        RecyclerView mRecyclerView = findViewById(R.id.id_recyclerView);

        //Instânciando o adaptador com os valores necessários
        br.com.local.booksrecyclerviewapp.RecyclerViewAdapter mAdapter = new br.com.local.booksrecyclerviewapp.RecyclerViewAdapter(getApplicationContext(), lstPer);
        //Criando o layout para inserção dos valores

        //LayoutManager não é necessário inserção de colunas - pode ser utilizado na vertical ou horizontal
        // mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL,true));

        //GriLayoutManager necessário a inserção de colunas
        mRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //Para melhorar a performance do RecyclerView na listagem com um tamanho fixo
        mRecyclerView.setHasFixedSize(true);

        //Inserindo os valores na lista do RecyclerView
        mRecyclerView.setAdapter(mAdapter);

    }

    private void setContentView(int activity_main) {
    }
}

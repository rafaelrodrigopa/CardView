package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerPostagem);

        //Define layout
        prepararPostagem();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Define adapter
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerView.setAdapter(adapter);
    }

    public void prepararPostagem(){

        Postagem p;

        p = new Postagem("Rafael Rodrigo","#tbt Viagem legal!",R.drawable.imagem1);
        postagens.add(p);

        p = new Postagem("Vanessa Weber","#Vai com Deus!",R.drawable.imagem2);
        postagens.add(p);

        p = new Postagem("Rodrigo Froes","Já fui e voltei",R.drawable.imagem3);
        postagens.add(p);

        p = new Postagem("Caue Moura","Não quero mais",R.drawable.imagem4);
        postagens.add(p);
    }
}
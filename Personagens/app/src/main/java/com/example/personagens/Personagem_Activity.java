package com.example.personagens;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Livro_Activity extends AppCompatActivity {

    private TextView txtNome, txtIdade, txtLuta;
    private ImageView imagemPer;
    Toolbar idToolBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livro_layout);

        txtNome = findViewById(R.id.txtIdTitulo);
        txtIdade= findViewById(R.id.txtIdDescricao);
        txtLuta = findViewById(R.id.txtIdCategoria);
        imagemPer = findViewById(R.id.idImgLivroN);
        idToolBar = findViewById(R.id.idToolBarLivros);

        //Inserir ação na seta de retorno da janela
        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),
                        MainActivity.class));
            }
        });

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mComprar:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em comprar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mCarrinho:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em carrinho",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mFav:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei em Favoritos",
                                Toast.LENGTH_SHORT).show();
                        break;

                }

                return false;
            }
        });



        //Intent que irá receber os valores da outra janela.
        Intent intent = getIntent();

        //As variáveis que irão receber os valores da outra janela.
        String nome, idade, luta;
        int miniatura;

        nome = intent.getExtras().getString("nome");
        idade = intent.getExtras().getString("idade");
        luta = intent.getExtras().getString("luta");
        miniatura = intent.getExtras().getInt("Miniatura");

        txtNome.setText(nome);
        txtIdade.setText(idade);
        txtLuta.setText(luta);
        imagemPer.setImageResource(miniatura);

    }
}
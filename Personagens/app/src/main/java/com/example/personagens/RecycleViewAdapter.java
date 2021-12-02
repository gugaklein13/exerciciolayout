package com.example.personagens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext; //É a classe onde estou
    private List<Personagens> mData; //O objeto que irá representar os dados


    //Construtor da classe
    public RecyclerViewAdapter(Context mContext, List<Personagens> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.modelo_livros_cardview, parent, false);

        return new MyViewHolder(view);
    }

    //Será realizada a montagem dos dados.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        //passando valores para o RecyclerView
        holder.NomePer.setText(mData.get(position).getnome());
        holder.imgPer.setImageResource(mData.get(position).getMiniatura());
        //Evento de clique no cardView
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(mContext, Livro_Activity.class);

                intent.putExtra("nome", mData.get(position).getnome());
                intent.putExtra("idade", mData.get(position).getidade());
                intent.putExtra("luta", mData.get(position).getluta());
                intent.putExtra("Miniatura", mData.get(position).getMiniatura());

                mContext.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        //tamanho da lista de livros
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView NomePer;
        ImageView imgPer;
        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            NomePer = itemView.findViewById(R.id.);
            imgPer = itemView.findViewById(R.id.);
            cardView = itemView.findViewById(R.id.);


        }
    }
}

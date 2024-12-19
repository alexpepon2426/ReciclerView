package com.ariofrio.recicleview;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyViewHolder>{
    private List<String> datalist;


    public Myadapter(List<String> datalist){
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public Myadapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.MyViewHolder holder, int position) {
        holder.textView.setText(datalist.get(position));
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    static class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView  textView;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.textView2);
        }
    }

}

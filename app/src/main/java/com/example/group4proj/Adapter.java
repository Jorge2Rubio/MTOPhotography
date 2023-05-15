package com.example.group4proj;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.denzcoskun.imageslider.interfaces.ItemClickListener;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder> {

    Context context;
    ArrayList<Model> models;

    public Adapter(Context context, ArrayList<Model> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.mTitle.setText(models.get(position).getTitle());
        holder.mDescription.setText(models.get(position).getDescription());
        holder.mImageView.setImageResource(models.get(position).getImg());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int i) {
                Intent intent = new Intent(context, Inquiry_form.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

}

package com.example.group4proj;

import android.content.ClipData;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.interfaces.ItemClickListener;


public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView mImageView;
    TextView mTitle, mDescription;
    ItemClickListener itemClickListener;


    public Holder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.image_product);
        this.mTitle = itemView.findViewById(R.id.title_product);
        this.mDescription = itemView.findViewById(R.id.description_product);

        itemView.setOnClickListener(Holder.this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemSelected(getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }
}

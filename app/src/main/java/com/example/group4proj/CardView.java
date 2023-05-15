package com.example.group4proj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CardView extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    ImageView backImg;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.packages_card);

        Toolbar backImg = findViewById(R.id.backBtn);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(CardView.this));

        adapter = new Adapter(CardView.this, getMyList());
        recyclerView.setAdapter(adapter);

        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardView.this, Home_Main.class);
                startActivity(intent);
            }
        });
    }
    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model model = new Model();
        model.setTitle("Weddings");
        model.setDescription("Price Starts: 20,000");
        model.setImg(R.drawable.wedding);
        models.add(model);

        model = new Model();
        model.setTitle("Self-Portraits");
        model.setDescription("Price Starts: 5,000");
        model.setImg(R.drawable.selfportrait);
        models.add(model);

        model = new Model();
        model.setTitle("Christenings");
        model.setDescription("Price Starts: 5,000");
        model.setImg(R.drawable.christening);
        models.add(model);

        model = new Model();
        model.setTitle("Birthdays");
        model.setDescription("Price Starts: 8,000");
        model.setImg(R.drawable.birthday);
        models.add(model);

        return models;
    }
}

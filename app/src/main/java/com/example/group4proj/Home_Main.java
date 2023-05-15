package com.example.group4proj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home_Main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        //navbar
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(Home_Main.this, drawerLayout, toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(Home_Main.this);


        //imagesSlider
       List<SlideModel> imageList = new ArrayList<>();

       ImageSlider imageSlider = findViewById(R.id.slider);
       imageList.add(new SlideModel("https://iili.io/HoqkN6u.jpg", ScaleTypes.FIT));
       imageList.add(new SlideModel("https://iili.io/HoqvJPn.jpg", ScaleTypes.FIT));
       imageSlider.setImageList(imageList);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.nav_packages:
                Intent intent = new Intent(Home_Main.this, CardView.class);
                startActivity(intent);
                Toast.makeText(this, "PACKAGES", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_about:
                Intent intent_about = new Intent(Home_Main.this, About_us.class);
                startActivity(intent_about);
                Toast.makeText(this, "ABOUT", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_contact:
                Intent intent_contact = new Intent(Home_Main.this, Contact_us.class);
                startActivity(intent_contact);
                Toast.makeText(this, "CONTACT", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_inquiry:
                Intent intent_inquiry = new Intent(Home_Main.this, Inquiry_form.class);
                startActivity(intent_inquiry);
                Toast.makeText(this, "INQUIRY", Toast.LENGTH_SHORT).show();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
package com.example.jhy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private RecyclerView disastersRecyclerView;
    private DisasterAdapter disasterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        disastersRecyclerView=findViewById(R.id.recycler_disaster);
        disastersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        disasterAdapter=new DisasterAdapter(getMyList(), this);
        disastersRecyclerView.setAdapter(disasterAdapter);
    }

    private ArrayList<Disasters> getMyList() {
        ArrayList<Disasters> disasters=new ArrayList<>();

        Disasters d=new Disasters();
        d.setDisasterName("Earthquake");
        d.setDisasterLocation("Muranga");
        d.setDisasterDescription("Strong Earthquake");
        d.setDisasterImage(R.drawable.dis);
        disasters.add(d);

        d=new Disasters();
        d.setDisasterName("Landslide");
        d.setDisasterLocation("Muranga");
        d.setDisasterDescription("Strong Earthquake");
        d.setDisasterImage(R.drawable.dis);
        disasters.add(d);

        d=new Disasters();
        d.setDisasterName("Storm");
        d.setDisasterLocation("Muranga");
        d.setDisasterDescription("Strong Earthquake");
        d.setDisasterImage(R.drawable.dis);
        disasters.add(d);

        d=new Disasters();
        d.setDisasterName("Floods");
        d.setDisasterLocation("Muranga");
        d.setDisasterDescription("Strong Earthquake");
        d.setDisasterImage(R.drawable.dis);
        disasters.add(d);

        return disasters;
    }


}
package com.example.worldcupapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private static WorldCupAdapter adapter;
    ArrayList<WorldCupModel> worldCupModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);


        //add data

        worldCupModels = new ArrayList<>();

        worldCupModels.add(new WorldCupModel("umesh","100",R.drawable.ic_launcher_background));
        worldCupModels.add(new WorldCupModel("d","1",R.drawable.ic_launcher_background));
        worldCupModels.add(new WorldCupModel("d","2",R.drawable.ic_launcher_background));
        worldCupModels.add(new WorldCupModel("dsf","3",R.drawable.ic_launcher_background));
        worldCupModels.add(new WorldCupModel("umesh","5",R.drawable.ic_launcher_background));
        worldCupModels.add(new WorldCupModel("ff","5",R.drawable.ic_launcher_background));
        worldCupModels.add(new WorldCupModel("umesh","100",R.drawable.ic_launcher_background));


        //set adapter
        adapter = new WorldCupAdapter(worldCupModels,getApplicationContext());


        listView.setAdapter(adapter);

        //handle click event on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "name: "+adapter.getItem(i).getCountryName()+" score: "+adapter.getItem(i).getCupWins(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
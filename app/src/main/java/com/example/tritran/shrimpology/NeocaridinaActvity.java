package com.example.tritran.shrimpology;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NeocaridinaActvity extends AppCompatActivity {

    List<Shrimp> lstShrimp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neocaridina);

        lstShrimp = new ArrayList<>();
        lstShrimp.add(new Shrimp("Red Cherry", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.redcherry));

        lstShrimp.add(new Shrimp("Blue Velvet", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.bluevelvet));

        lstShrimp.add(new Shrimp("Red Rili", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.redrili));

        lstShrimp.add(new Shrimp("Blue Rili", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.bluerili));

        lstShrimp.add(new Shrimp("Orange Rili", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.orangerili));

        lstShrimp.add(new Shrimp("Snowball", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.snowball));

        lstShrimp.add(new Shrimp("Yellow Back", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.yellowback));

        lstShrimp.add(new Shrimp("Orange Neo", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.orangeneo));

        lstShrimp.add(new Shrimp("Green Jade", "Neocaridina", "GH: 6-8, KH: 2-5\n PH: 6.5-7.8, " +
                "TDS: 150-250\n Water Temp: 69-75F", R.drawable.greenjade));

        RecyclerView shrimpRecyclerView = findViewById(R.id.recyclerview_neocaridina);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, lstShrimp);

        shrimpRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        shrimpRecyclerView.setAdapter(adapter);
    }
}

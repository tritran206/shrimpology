package com.example.tritran.shrimpology;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CaridinaActivity extends AppCompatActivity {

    List<Shrimp> lstShrimp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caridina);

        lstShrimp = new ArrayList<>();

        lstShrimp.add(new Shrimp("Pinto Boa", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintoboa));

        lstShrimp.add(new Shrimp("Pinto Galaxy", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintogalaxy));

        lstShrimp.add(new Shrimp("Pinto Fishbone/Skunk", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintofishbone));

        lstShrimp.add(new Shrimp("Pinto Nanacy/Nanashi", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintonanacy));

        lstShrimp.add(new Shrimp("Pinto Zebra", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintozebra));

        lstShrimp.add(new Shrimp("Pinto Belly", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintobelly));

        lstShrimp.add(new Shrimp("Pinto Spotted Head", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintospottedhead));

        lstShrimp.add(new Shrimp("Fancy Tiger", "Caridina", "GH: 4-6, KH: 0-4\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.fancytiger));

        lstShrimp.add(new Shrimp("Tangerine Tiger", "Caridina", "GH: 4-10, KH: 0\n PH: 6-7.4, " +
                "TDS: 140-250\n Water Temp: 65-75F", R.drawable.tangerinetiger));

        lstShrimp.add(new Shrimp("Orange Eye Red Ghost", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.orangeeyeredghost));

        lstShrimp.add(new Shrimp("Orange Eye Red Wine", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.orangeeyeredwine));

        lstShrimp.add(new Shrimp("Blue Bolt", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bluebolt));

        lstShrimp.add(new Shrimp("RKK Extreme", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.rkkextreme));

        lstShrimp.add(new Shrimp("RKK Stripe", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.rkkstripe));

        lstShrimp.add(new Shrimp("RKK Panda", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.rkkpanda));

        lstShrimp.add(new Shrimp("RKK No Entry", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.rkknoentry));

        lstShrimp.add(new Shrimp("RKK Mosura", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.rkkmosura));

        lstShrimp.add(new Shrimp("RKK Hinomaru", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.rkkhinomaru));

        lstShrimp.add(new Shrimp("BKK Extreme", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bkkextreme));

        lstShrimp.add(new Shrimp("BKK Stripe", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bkkstripe));

        lstShrimp.add(new Shrimp("BKK Panda", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bkkpanda));

        lstShrimp.add(new Shrimp("BKK Hinomaru", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bkkhinomaru));

        lstShrimp.add(new Shrimp("BKK No Entry", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bkknoentry));

        lstShrimp.add(new Shrimp("BKK Mosura", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bkkmosura));

        lstShrimp.add(new Shrimp("Pinto Nanacy/Nanashi", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.pintonanacy));

        lstShrimp.add(new Shrimp("BKK Flowerhead", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.bkkflowerhead));

        lstShrimp.add(new Shrimp("Crystal Red", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.crystalred));

        lstShrimp.add(new Shrimp("Snow White", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.snowwhite));

        lstShrimp.add(new Shrimp("Crystal Black", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.crystalblack));

        lstShrimp.add(new Shrimp("Super Crystal Red", "Caridina", "GH: 4-6, KH: 0\n PH: 5.5-6.5, " +
                "TDS: 100-150\n Water Temp: 65-75F", R.drawable.supercrystalred));

        RecyclerView shrimpRecyclerView = findViewById(R.id.recyclerview_caridina);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, lstShrimp);

        shrimpRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        shrimpRecyclerView.setAdapter(adapter);
    }
}

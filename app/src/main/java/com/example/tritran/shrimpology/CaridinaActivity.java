package com.example.tritran.shrimpology;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CaridinaActivity extends AppCompatActivity {

    List<Shrimp> mLstShrimp;
    RecyclerView mShrimpRecyclerView;
    RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caridina);

        mLstShrimp = new ArrayList<>();
        initializeData();

        mShrimpRecyclerView = findViewById(R.id.recyclerview_caridina);
        mAdapter = new RecyclerViewAdapter(this, mLstShrimp);

        mShrimpRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mShrimpRecyclerView.setAdapter(mAdapter);
    }

    private void initializeData() {
        //gets data from string resource file
        String[] caridinaName = getResources().getStringArray(R.array.caridina_names);
        String[] caridinaParams = getResources().getStringArray(R.array.caridina_params);
        TypedArray shrimpImageResources = getResources().obtainTypedArray(R.array.caridina_images);

        //clear to prevent duplications
        mLstShrimp.clear();

        for(int i=0; i < caridinaName.length; i++){
            mLstShrimp.add(new Shrimp(caridinaName[i],"Caridina", caridinaParams[i], shrimpImageResources.getResourceId(i, 0)));
        }

        // cleans data
        shrimpImageResources.recycle();

    }
}

package com.example.tritran.shrimpology;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NeocaridinaActvity extends AppCompatActivity {

    private List<Shrimp> mLstShrimp;
    private RecyclerViewAdapter mAdapter;
    private RecyclerView mShrimpRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neocaridina);

        //Initialize the ArrayList that will contain the data
        mLstShrimp = new ArrayList<>();
        initializeData();

        mShrimpRecyclerView = findViewById(R.id.recyclerview_neocaridina);
        mAdapter = new RecyclerViewAdapter(this, mLstShrimp);

        //Sets the look of recycler view and sets adapter to recyclerview
        mShrimpRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        mShrimpRecyclerView.setAdapter(mAdapter);
    }

    private void initializeData() {

        //gets data from string resource file
        String[] neocaridinaName = getResources().getStringArray(R.array.neocaridina_names);
        String[] neocaridinaParams = getResources().getStringArray(R.array.neocaridina_params);
        TypedArray shrimpImageResources = getResources().obtainTypedArray(R.array.neocaridina_images);

        //clear to prevent duplications
        mLstShrimp.clear();

        //creates shrimp objects
        for(int i=0;i<neocaridinaName.length;i++){
            mLstShrimp.add(new Shrimp(neocaridinaName[i],"Neocaridina", neocaridinaParams[i], shrimpImageResources.getResourceId(i,0)));
        }

        // cleans data
        shrimpImageResources.recycle();

        //Notify the adapter of the change
//        mAdapter.notifyDataSetChanged();


    }
}

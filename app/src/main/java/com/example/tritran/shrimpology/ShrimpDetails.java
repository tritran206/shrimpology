package com.example.tritran.shrimpology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ShrimpDetails extends AppCompatActivity {

    private static final String TAG = "ShrimpDetails";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrimp_details);
        Log.d(TAG, "onCreate: started.");
        getIncomingIntent();

    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        Intent intent = getIntent();

        String name = intent.getStringExtra(RecyclerViewAdapter.EXTRA_NAME);
        String photo = intent.getStringExtra(RecyclerViewAdapter.EXTRA_PHOTO);
        String parameters = intent.getStringExtra(RecyclerViewAdapter.EXTRA_PARAMETERS);

        setData(name, photo, parameters);

    }

    private void setData(String name, String photo, String parameters) {
        Log.d(TAG, "setData: setting the name, image, and text");

        TextView textViewName = findViewById(R.id.shrimp_name);
        textViewName.setText(name);

        ImageView image = findViewById(R.id.shrimp_photo);

        //image.setImageResource(Resource.drawable.photo);


        TextView textViewParameters = findViewById(R.id.shrimp_parameters);
        textViewParameters.setText(parameters);


    }
}

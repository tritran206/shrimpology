package com.example.tritran.shrimpology;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ShrimpDetails extends AppCompatActivity {

    private static final String TAG = ShrimpDetails.class.getSimpleName();

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
        Shrimp shrimp = (Shrimp)intent.getSerializableExtra(RecyclerViewAdapter.EXTRA_SHRIMP);

        setData(shrimp);
    }

    private void setData(Shrimp shrimp) {
        Log.d(TAG, "setData: setting the name, image, and text");

        //sets shrimp name to textview
        TextView textViewName = findViewById(R.id.shrimp_name);
        textViewName.setText(shrimp.getName());

        ImageView image = findViewById(R.id.shrimp_photo);
        Glide.with(this).load(shrimp.getPicture()).into(image);

        TextView textViewParameters = findViewById(R.id.shrimp_parameters);
        textViewParameters.setText(shrimp.getParameters());
    }
}

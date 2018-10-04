package com.example.tritran.shrimpology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    public void openAquariums(View view) {
        Log.d(TAG, "openAquariums: button clicked. starting aquariumHome activity");
        Intent intent = new Intent(this, AquariumsHome.class);
        startActivity(intent);
    }

    public void openShrimps(View view) {
        Log.d(TAG, "openShrimps: button clicked. starting shrimpHome activity");
        Intent intent = new Intent(this, ShrimpsHome.class);
        startActivity(intent);
    }

}

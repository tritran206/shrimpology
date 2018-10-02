package com.example.tritran.shrimpology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAquariums(View view) {
        Intent intent = new Intent(this, AquariumsHome.class);
        startActivity(intent);
    }

    public void openShrimps(View view) {
        Intent intent = new Intent(this, ShrimpsHome.class);
        startActivity(intent);
    }

}

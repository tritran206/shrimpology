package com.example.tritran.shrimpology;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ShrimpsHome extends AppCompatActivity {
    private LinearLayout caridina;
    private LinearLayout neocaridina;
    private Activity myActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrimps_home);
        this.myActivity = this;

        caridina = findViewById(R.id.caridinaLayout);
        caridina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(myActivity, CaridinaActivity.class);
                startActivity(intent);
            }
        });

        neocaridina = findViewById(R.id.neocaridinaLayout);
        neocaridina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(myActivity, NeocaridinaActvity.class);
                startActivity(intent);
            }
        });
    }

    public void openNeocaridina(View view) {
        Intent intent = new Intent(this, NeocaridinaActvity.class);
    }

    public void openCaridina(View view) {
        Intent intent = new Intent(this, CaridinaActivity.class);
    }
}

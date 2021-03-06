package com.example.tritran.shrimpology;

import android.content.Intent;
        import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.util.Log;
import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.LinearLayout;
        import android.widget.RadioButton;
        import android.widget.TextView;

        import java.util.ArrayList;

public class AquariumsHome extends AppCompatActivity {

    public static final int INPUT_REQUEST = 3;
    private static final String TAG = AquariumsHome.class.getSimpleName();

    Button save;
    ArrayList<Aquarium> lstAquariums = new ArrayList<>();

    TextView name;
    TextView volume;
    TextView lighting;
    TextView filtration;
    TextView co2;
    TextView substrate;
    TextView inhabitants;
    LinearLayout content;
    Aquarium newAquarium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquarium_home);

        name = findViewById(R.id.tv_name);
        volume = findViewById(R.id.tv_volume);
        lighting = findViewById(R.id.tv_lighting);
        filtration = findViewById(R.id.tv_lighting);
        co2 = findViewById(R.id.tv_co2);
        substrate = findViewById(R.id.tv_substrate);
        inhabitants = findViewById(R.id.tv_inhabitants);
        content = findViewById(R.id.content);

        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("content_visible");


            if(isVisible) {
                Log.d(TAG, "onCreate: retrieving savedinstance state");
                content.setVisibility(View.VISIBLE);
                name.setText(savedInstanceState.getString("name"));
                volume.setText(savedInstanceState.getString("volume"));
                lighting.setText(savedInstanceState.getString("lighting"));
                filtration.setText(savedInstanceState.getString("filtration"));
                co2.setText(savedInstanceState.getString("co2"));
                substrate.setText(savedInstanceState.getString("substrate"));
                inhabitants.setText(savedInstanceState.getString("inhabitants"));
            }
        }



        if (lstAquariums.isEmpty()) {
            Log.d(TAG, "onCreate: lstAquarium array is empty");
            name.setText("No Aquariums Available");
            name.setVisibility(View.VISIBLE);
        }



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), AddAquarium.class);
                startActivityForResult(intent, INPUT_REQUEST);
            }

        });
    }

    public void setAquariumData(Aquarium aquarium) {
        Log.d(TAG, "setting data to view");
        name.setText(aquarium.getName());
        volume.setText(aquarium.getVolume());
        lighting.setText(aquarium.getLighting());
        filtration.setText(aquarium.getFiltration());
        co2.setText(aquarium.getCo2());
        substrate.setText(aquarium.getSubstrate());
        inhabitants.setText(aquarium.getInhabitants());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: saving current state and data");
        super.onSaveInstanceState(outState);

        if (content.getVisibility() == View.VISIBLE) {
            outState.putBoolean("content_visible", true);

            outState.putString("name", name.getText().toString());
            outState.putString("volume", volume.getText().toString());
            outState.putString("lighting", lighting.getText().toString());
            outState.putString("filtration", filtration.getText().toString());
            outState.putString("co2", co2.getText().toString());
            outState.putString("substrate", substrate.getText().toString());
            outState.putString("inhabitants", inhabitants.getText().toString());
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d(TAG, "onActivityResult: started");

        if (requestCode == INPUT_REQUEST) {
            if(resultCode == RESULT_OK) {
                String input_name = data.getStringExtra(AddAquarium.EXTRA_NAME);
                String input_volume = data.getStringExtra(AddAquarium.EXTRA_VOLUME);
                String input_lighting = data.getStringExtra(AddAquarium.EXTRA_LIGHTING);
                String input_filtration = data.getStringExtra(AddAquarium.EXTRA_FILTRATION);
                String input_co2 = data.getStringExtra(AddAquarium.EXTRA_CO2);
                String input_substrate = data.getStringExtra(AddAquarium.EXTRA_SUBSTRATE);
                String input_inhabitants = data.getStringExtra(AddAquarium.EXTRA_INHABITANTS);

                newAquarium = new Aquarium(input_name, input_volume, input_lighting, input_filtration, input_co2, input_substrate, input_inhabitants);
                lstAquariums.add(newAquarium);
                setAquariumData(newAquarium);
                content.setVisibility(View.VISIBLE);
            }
        }

    }
}

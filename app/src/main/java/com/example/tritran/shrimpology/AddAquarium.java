package com.example.tritran.shrimpology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddAquarium extends AppCompatActivity {

    //keys to retrieve collected data
    public final static String EXTRA_NAME = "com.example.tritran.shrimpology.NAME";
    public final static String EXTRA_VOLUME = "com.example.tritran.shrimpology.VOLUME";
    public final static String EXTRA_LIGHTING = "com.example.tritran.shrimpology.LIGHTING";
    public final static String EXTRA_FILTRATION = "com.example.tritran.shrimpology.FILTRATION";
    public final static String EXTRA_CO2 = "com.example.tritran.shrimpology.CO2";
    public final static String EXTRA_SUBSTRATE = "com.example.tritran.shrimpology.SUBSTRATE";
    public final static String EXTRA_INHABITANTS = "com.example.tritran.shrimpology.INHABITANTS";

    EditText name;
    EditText volume;
    EditText lighting;
    EditText filtration;
    RadioButton co2no;
    RadioButton co2yes;
    EditText substrate;
    EditText inhabitants;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_aquarium);

        name = findViewById(R.id.name);
        volume = findViewById(R.id.volume);
        lighting = findViewById(R.id.lighting);
        filtration = findViewById(R.id.filtration);
        co2no = findViewById(R.id.noco2);
        co2yes = findViewById(R.id.yesco2);
        substrate = findViewById(R.id.substrate);
        inhabitants = findViewById(R.id.inhabitants);


    }

    public void saveAquarium(View view) {

        Intent returnIntent = new Intent();
//        Bundle extras = new Bundle();
        returnIntent.putExtra(EXTRA_NAME, name.getText().toString());
        returnIntent.putExtra(EXTRA_VOLUME, volume.getText().toString());
        returnIntent.putExtra(EXTRA_LIGHTING, lighting.getText().toString());
        returnIntent.putExtra(EXTRA_FILTRATION, filtration.getText().toString());
        if (co2yes.isChecked()) {
            returnIntent.putExtra(EXTRA_CO2, "Yes");
        } else {
            returnIntent.putExtra(EXTRA_CO2, "No");
        }
        returnIntent.putExtra(EXTRA_SUBSTRATE, substrate.getText().toString());
        returnIntent.putExtra(EXTRA_INHABITANTS, inhabitants.getText().toString());

//        returnIntent.putExtras(extras);

        setResult(RESULT_OK, returnIntent);
        finish();


    }
}

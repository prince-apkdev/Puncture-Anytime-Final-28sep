package com.prince.punctureanytime;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AvailableServices extends AppCompatActivity {

    CheckBox[] checkBox = new CheckBox[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_services);
        this.getSupportActionBar().setTitle("Available Services");
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        checkBox[0] = findViewById(R.id.checkbox1);
        checkBox[1] = findViewById(R.id.checkbox2);
        checkBox[2] = findViewById(R.id.checkbox3);
        checkBox[3] = findViewById(R.id.checkbox4);
        checkBox[4] = findViewById(R.id.checkbox5);
    }

    public void BtnCont(View view) {

        int n = 0;
        for (CheckBox box : checkBox) {
            if (box.isChecked()) {
                n++;
            }
        }

        String str = String.valueOf(n);
        Toast.makeText(AvailableServices.this, str, Toast.LENGTH_SHORT).show();
    }

}

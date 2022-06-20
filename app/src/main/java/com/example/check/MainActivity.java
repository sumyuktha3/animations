package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkFrance, chkSwiss, chkMumbai, chkUS, chkMaldives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkFrance = findViewById(R.id.chkFrance);
        chkSwiss = findViewById(R.id.chkSwiss);
        chkMumbai = findViewById(R.id.chkMumbai);
        chkUS = findViewById(R.id.chkUS);
        chkMaldives = findViewById(R.id.chkMaldives);
    }
    public void showSelected(View view) {

        String selected = "You selected: \n";

        if(chkFrance.isChecked())
            selected += "France";

        if(chkSwiss.isChecked())
            selected += "\nSwitzerland";

        if(chkMumbai.isChecked())
            selected += "\nMumbai";

        if(chkUS.isChecked())
            selected += "\nCalifornia";

        if(chkMaldives.isChecked())
            selected += "\nMaldives";

        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
    }
}
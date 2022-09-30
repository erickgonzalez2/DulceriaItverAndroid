package com.example.dulceriaitver.Acitivities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.dulceriaitver.R;

public class ManagerActivity extends AppCompatActivity {

    private Toolbar topBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);

        topBar = (Toolbar) findViewById(R.id.topAppBar);
        topBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ManagerActivity.this,"Hola",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
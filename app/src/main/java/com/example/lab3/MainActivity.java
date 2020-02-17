package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview1 = findViewById(R.id.class_schedule);
        final String[] classes = {"CSCI 230", "CSCI 370", "CSCI 250"};
        ArrayAdapter<ListView> lvAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, classes);
        listview1.setAdapter(lvAdapter);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast toast = Toast.makeText(getApplicationContext(), "You Clicked "+ classes[i], Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}

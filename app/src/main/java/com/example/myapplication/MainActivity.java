package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.myListView);
        final ArrayList<String> friendarrayList = new ArrayList<String>();
        friendarrayList.add("Abdullah");
        friendarrayList.add("Azhar");
        friendarrayList.add("Babar");
        friendarrayList.add("Altaf");
        friendarrayList.add("Musa");
        friendarrayList.add("Salman");
        friendarrayList.add("Zahid");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friendarrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("You clicked the name of", friendarrayList.get(i));

            }
        });
    }
}
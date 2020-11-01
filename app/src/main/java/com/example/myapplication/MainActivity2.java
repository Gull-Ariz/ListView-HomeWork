package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView list = findViewById(R.id.listView);
        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        String[] friendsarry = {"Ahsan","imran","Zai"};
        final ArrayList<String> freindsArrayList = new ArrayList<String>(asList( friendsarry));

        final ArrayAdapter<String> friendArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,freindsArrayList);

        list.setAdapter(friendArrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You clicked " + freindsArrayList.get(position),Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                freindsArrayList.add(name);
                friendArrayAdapter.notifyDataSetChanged();
            }
        });
        
    }
}
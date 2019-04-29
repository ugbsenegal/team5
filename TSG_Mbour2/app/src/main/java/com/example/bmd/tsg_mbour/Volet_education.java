package com.example.bmd.tsg_mbour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Volet_education extends AppCompatActivity {


    ListView listViewedu;
    String[] itemsedu = {"PROGRAMME EDUCATION","President: DJIBA","Activite 2","Activite 3","Activite 4","Activite 5","Activite 6","Activite 1","Activite 1","Activite 1",
            "Activite 1","Activite 1","Activite 1","Activite 1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volet_education);

        listViewedu = (ListView) findViewById(R.id.listviewedu);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemsedu);

        listViewedu.setAdapter(adapter);

        listViewedu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;

                String itemValue = (String) listViewedu.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),"Position:"+itemPosition+" Item Clicked" +itemValue, Toast.LENGTH_LONG).show();
            }
        });
    }
}

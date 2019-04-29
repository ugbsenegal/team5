package com.example.bmd.tsg_mbour;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1= findViewById(R.id.btn_acceuil);
        Button btn2= findViewById(R.id.btn_bureau);
        Button btn3= findViewById(R.id.btn_sport);
        Button btn4= findViewById(R.id.btn_education);
        Button btn5= findViewById(R.id.btn_communication);
        Button btn6= findViewById(R.id.btn_butmvt);
        Button btn7= findViewById(R.id.btn_inscription);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG);
                t1.show();
                Log.i("MAINACTIVITY","Acceuil is click");
                Intent it = new Intent(getApplicationContext(), Acceuil.class );
                startActivity(it);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG);
                t1.show();
                Log.i("MAINACTIVITY","Acceuil is click");
                Intent it = new Intent(getApplicationContext(), Bureau.class );
                startActivity(it);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG);
                t1.show();
                Log.i("MAINACTIVITY","Acceuil is click");
                Intent it = new Intent(getApplicationContext(), Volet_sport.class );
                startActivity(it);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG);
                t1.show();
                Log.i("MAINACTIVITY","Acceuil is click");
                Intent it = new Intent(getApplicationContext(), Volet_education.class );
                startActivity(it);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG);
                t1.show();
                Log.i("MAINACTIVITY","Acceuil is click");
                Intent it = new Intent(getApplicationContext(), Volet_communication.class );
                startActivity(it);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG);
                t1.show();
                Log.i("MAINACTIVITY","Acceuil is click");
                Intent it = new Intent(getApplicationContext(), But_du_mvt.class );
                startActivity(it);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t1 = Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_LONG);
                t1.show();
                Log.i("MAINACTIVITY","Acceuil is click");
                Intent it = new Intent(getApplicationContext(), Inscription.class );
                startActivity(it);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.m_apropos) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

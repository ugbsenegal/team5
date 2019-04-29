package com.example.bmd.tsg_mbour;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Bureau extends AppCompatActivity {

    MediaPlayer player;

    ListView listViewbur;
    String[] itemsbur = {"PROGRAMME BUREAU","President: Adbou K SOCK","Vice president: Samba TOP","S.G: Matar NIANG","","Activite 5","Activite 6","Activite 1","Activite 1","Activite 1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bureau);


        listViewbur = (ListView) findViewById(R.id.listviewbur);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemsbur);

        listViewbur.setAdapter(adapter);

        listViewbur.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;

                String itemValue = (String) listViewbur.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),"Position:"+itemPosition+" Item Clicked" +itemValue, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void play (View v)
    {
        if(player==null)
        {
            player= MediaPlayer.create(this, R.raw.audio_prestsg);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    public void pause(View v)
    {
        if(player!=null)
        {
            player.pause();
        }
    }

    public void stop(View v)
    {
        stopPlayer();
    }

    private void stopPlayer()
    {
        if(player!=null)
        {
            player.release();
            player=null;
            Toast.makeText(this,"Player Release", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}

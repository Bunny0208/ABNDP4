package com.example.android.abndp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Lose yourself", "Eminem"));
        songs.add(new Song("Lost in the Echo", "Linkin Park"));
        songs.add(new Song("Rockstar", "Post Malone"));
        songs.add(new Song("Starboy", "The Weekend"));
        songs.add(new Song("Shape of You", "Ed Sheeran"));
        songs.add(new Song("Am I Wrong", "Nicko & Vinz"));
        songs.add(new Song("Smells like team spirit", "Nirvana"));
        songs.add(new Song("Stronger", "Kenny West"));
        songs.add(new Song("Eye of the tiger", "Survivor"));
        songs.add(new Song("Radioactive", "Imagine Dragons"));


        SongAdapter adapter = new SongAdapter(this, songs);


        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);


    }
}

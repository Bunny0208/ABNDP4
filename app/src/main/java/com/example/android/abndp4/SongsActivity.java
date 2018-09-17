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


        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        (String)adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT);
                toast.show();
            }
        });*/
    }
}

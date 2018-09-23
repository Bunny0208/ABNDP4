package com.example.android.abndp4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Song currentSong = getItem(position);


        TextView artistName = (TextView) listItemView.findViewById(R.id.Artist_Name);
        artistName.setText(currentSong.ArtistName());


        TextView songName = (TextView) listItemView.findViewById(R.id.Song_Name);
        songName.setText(currentSong.SongName());


        return listItemView;
    }
}
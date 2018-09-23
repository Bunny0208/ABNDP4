package com.example.android.abndp4;

public class Song {

    private String mSongName;
    private String mArtistName;

    public Song(String SongName, String ArtistName) {
        mSongName = SongName;
        mArtistName = ArtistName;
    }
    public String SongName() {
        return mSongName;
    }
    public String ArtistName() {
        return mArtistName;
    }
}

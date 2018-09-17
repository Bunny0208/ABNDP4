package com.example.android.abndp4;

public class Song {
    /** Song Name */
    private String mSongName;
    /** Artist Name */
    private String mArtistName;

    public Song(String SongName, String ArtistName) {
        mSongName = SongName;
        mArtistName = ArtistName;
    }
    /**
     * Get the name of the song.
     */
    public String SongName() {
        return mSongName;
    }
    /**
     * Get the name of the artist.
     */
    public String ArtistName() {
        return mArtistName;
    }
}

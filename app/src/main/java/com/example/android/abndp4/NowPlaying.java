package com.example.android.abndp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageButton button = findViewById(R.id.play_pause_btn);
        if(button.isActivated())
        {
            button.setImageResource(R.drawable.ic_play_arrow_black_24dp);
        }
    }
}

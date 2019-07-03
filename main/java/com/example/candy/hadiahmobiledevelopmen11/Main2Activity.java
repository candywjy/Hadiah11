package com.example.candy.hadiahmobiledevelopmen11;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private MediaPlayer player;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        playSound(1);
    }
    @Override
    public void onPause(){
        try{
            super.onPause();
            player.pause();
        }catch (Exception e){

        }
    }

    public void playSound(int arg){
        try {
            if (player.isPlaying()){
                player.stop();
                player.release();
            }
        }catch (Exception e){
            Toast.makeText(this, "Masuk Exception", Toast.LENGTH_LONG).show();
        }

        if (arg == 1){
            Toast.makeText(this, "lagu2 main", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this,R.raw.lagu2);
        }
        player.setLooping(false);
        player.start();
    }
}

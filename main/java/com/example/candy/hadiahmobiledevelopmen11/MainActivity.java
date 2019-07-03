package com.example.candy.hadiahmobiledevelopmen11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer audioBackground;
    Button btnPes;
    ImageView imgSt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPes = findViewById(R.id.btnPesan);
        imgSt = findViewById(R.id.imgmama);

        audioBackground = MediaPlayer.create(this, R.raw.lagu1);
        audioBackground.setLooping(true);
        audioBackground.setVolume(1,1);
        audioBackground.start();

        btnPes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioBackground.stop();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    public void imgclick(View view){
        audioBackground.stop();
    }

}

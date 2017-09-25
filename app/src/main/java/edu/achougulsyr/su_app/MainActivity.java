package edu.achougulsyr.su_app;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("CUSE");
        setContentView(R.layout.activity_main);
    }

    public void dome(View v){
        Intent intent = new Intent(this,dome.class);
        startActivity(intent);
    }

    public void bird(View v){
        Intent intent = new Intent(this,bird.class);
        startActivity(intent);
    }

    public void schine(View v){
        Intent intent = new Intent(this,schine.class);
        startActivity(intent);
    }
}

package edu.achougulsyr.su_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("BIRD LIBRARY");
        setContentView(R.layout.activity_bird);
    }

    public void bird_pic(View v){
        Intent intent = new Intent(this,picture_activity.class);
        intent.putExtra("Pic",2);
        startActivity(intent);
    }

    public void bird_vid(View v){
        Intent intent = new Intent(this,VideoActivity.class);
        intent.putExtra("Youtube",2);
        startActivity(intent);
    }

    public void bird_map(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("Loctn",2);
        startActivity(intent);
    }
}

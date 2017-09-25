package edu.achougulsyr.su_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class schine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SCHINE CENTRE");
        setContentView(R.layout.activity_schine);
    }

    public void schine_pic(View v){
        Intent intent = new Intent(this,picture_activity.class);
        intent.putExtra("Pic",3);
        startActivity(intent);
    }

    public void schine_vid(View v){
        Intent intent = new Intent(this,VideoActivity.class);
        intent.putExtra("Youtube",3);
        startActivity(intent);
    }

    public void schine_map(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("Loctn",3);
        startActivity(intent);
    }
}

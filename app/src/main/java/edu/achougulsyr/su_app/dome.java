package edu.achougulsyr.su_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("CAREER DOME");
        setContentView(R.layout.activity_dome);
    }

    public void dome_pic(View v){
        Intent intent = new Intent(this,picture_activity.class);
        intent.putExtra("Pic",1);
        startActivity(intent);
    }

    public void dome_vid(View v){
        Intent intent = new Intent(this,VideoActivity.class);
        intent.putExtra("Youtube",1);
        startActivity(intent);
    }

    public void dome_map(View v){
        Intent intent = new Intent(this,MapsActivity.class);
        intent.putExtra("Loctn",1);
        startActivity(intent);
    }

}

package edu.achougulsyr.su_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class picture_activity extends AppCompatActivity {

    int flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);

        Bundle extra= getIntent().getExtras();
        flag= extra.getInt("Pic");

       getSupportFragmentManager().beginTransaction().replace(R.id.pic_act,pic_recycle_fragment.newInstance(flag)).commit();
    }
}

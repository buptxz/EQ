package com.example.peng.eq;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.SignInAccount;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;


public class MainActivity extends AppCompatActivity {
    private static boolean isParseInitialized = false;
    public final static String EVENT_ID = "";
    public final static String HOST_ID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {



//        ParseObject testObject = new ParseObject("Event");
//        testObject.put("title", "bar");
//        testObject.saveInBackground();
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        ParseUser currentUser = ParseUser.getCurrentUser();
        if(currentUser != null) {
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);
        }

    }

    public void login(View view) {

        Intent intent = new Intent(this, LoginActivity.class);
        // Use TaskStackBuilder to build the back stack and get the PendingIntent

        startActivity(intent);
    }

    public void signup(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }
/**
    //Cizhen 161008
    public void detail(View view) {
        //pass the objectid to the detamilInfoView
        Intent intent = new Intent(this, DetailInfoActivity.class);

        String eventId = "lJVFt0pEtn";
        intent.putExtra(EVENT_ID, eventId);
        intent.putExtra("from", "MainActivity");
        startActivityForResult(intent, 1);
    }

    public void editEvent(View view) {
        //send the hostid
        Intent intent = new Intent(this, EditEventActivity.class);
        String eventId = "HgYsGhz2X7";
        intent.putExtra(EVENT_ID, eventId);
        startActivity(intent);
    }

    public void addEvent2(View view) {
        //send the hostid
        Intent intent = new Intent(this, addEvent2Activity.class);
        String hostId = "HGqjFdtYZz";
        intent.putExtra(HOST_ID, hostId);
        startActivity(intent);
    }

    public void profile(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        String hostId = "HGqjFdtYZz";
        intent.putExtra(HOST_ID, hostId);
        startActivity(intent);
    }
    //Cizhen 161008
**/

    @Override
    public void onBackPressed() {
            moveTaskToBack(true);


    }
}

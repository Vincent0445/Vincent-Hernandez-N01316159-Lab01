package com.example.vincenthernandez_ceng319_lab01_ex1;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class VrActivity extends Activity {
    String tag = "Lifecycle";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aiactivity);
        Log.d(tag, "In the onCreate() event");
        Toast.makeText(getApplicationContext(),"Now onCreate() calls", Toast.LENGTH_LONG).show(); //onCreate Called
    }

    public void onStart() {
        super.onStart();
        Log.d(tag, "In the onStart() event");
        Toast.makeText(getApplicationContext(),"Now onStart() calls", Toast.LENGTH_LONG).show(); //onStart Called
    }

    //
    public void onRestart() {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }

    public void onResume() {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }

    public void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }

    //
    public void onStop() {
        super.onStop();
        Log.d(tag, "In the onStop() event");

    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }
}
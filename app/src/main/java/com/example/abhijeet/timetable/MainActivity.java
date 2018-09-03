
package com.example.abhijeet.timetable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextClock;

public class MainActivity extends Activity {
    private  TextClock  tc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tc=(TextClock) findViewById(R.id.tc1);
    }
}

package com.londonappdeveloper.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startActivity(new Intent(MainActivity.this, TabActivity.class));
        // hello test comment

        // jedfjlks
        //asd fsadf sadf dsaf s
        /// hello branch code
        //asdf kjdfsl
        // deepak
    }
}

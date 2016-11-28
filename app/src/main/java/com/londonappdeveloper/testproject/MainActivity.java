package com.londonappdeveloper.testproject;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

/**
 * sdafasdf
 */
public class MainActivity extends AppCompatActivity {

    private final static String NAME = "NAME";
    private final static String EMAIL = "EMAIL";
    String mNameValue = "", mEmailValue = "";

    private EditText editTextEmail, editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);

        // hello test comment

        // jedfjlks
        //asd fsadf sadf dsaf s
        /// hello branch code
        //asdf kjdfsl
        // deepak
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putString(NAME, editTextName.getText().toString().trim());
        outState.putString(EMAIL, editTextEmail.getText().toString().trim());

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mEmailValue = savedInstanceState.getString(EMAIL);
        mNameValue = savedInstanceState.getString(NAME);
    }

    @Override
    protected void onResume() {
        super.onResume();

        editTextEmail.setText(mEmailValue);
        editTextName.setText(mNameValue);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}

package edu.cvtc.android.simpleapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by lynettekastel on 11/3/16.
 */
public class ResponseActivity extends AppCompatActivity {

    private TextView responseTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("Simple_app_lab", "ResponseActivity was created...");

        setContentView(R.layout.activity_response);

        responseTextView = (TextView) findViewById(R.id.responseTextView);    // find the view

        final Bundle bundle = getIntent().getExtras();      // getExtras gets the bundle
        if (null != bundle) {
            final String name = bundle.getString("name");

            if (null != name && !name.isEmpty()) {
                responseTextView.setText("Hello " + name + "! Thank you for connecting with me.");
            } else {
                responseTextView.setText("Whoops! You didn't enter your name.");
            }


        }
    }
}

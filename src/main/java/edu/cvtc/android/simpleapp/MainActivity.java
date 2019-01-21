package edu.cvtc.android.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Reference variables for the controls in our UI
    private EditText nameEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("simple_app_lab", "MainActivity created...");

        setContentView(R.layout.activity_main);

        // Create a reference to our controls in the UI
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(this);          // this = this class, defined below

    }

    @Override
    public void onClick(View view) {
        Log.d("simple_app_lab", "Submit button was clicked...");

        final String name = nameEditText.getText().toString();      // get the name

        if (null != name && !name.isEmpty()) {                      // validate input
            final Intent intent = new Intent(getApplicationContext(), ResponseActivity.class);
            intent.putExtra("name", name);

            startActivity(intent);
        } else {
            // TODO display a Toast with a validation message...
        }
                                            // passes it to the activity through an "intent", need another activity class to send it to


    }
}

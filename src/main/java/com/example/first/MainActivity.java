package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lblLuckaClick( View v ) {
        ((TextView)findViewById( R.id.lblLucka )).setText( R.string.lblLucka_text );
        Toast.makeText( this, "The label was changed", Toast.LENGTH_LONG ).show();
        
        /* change for github */
    }
}

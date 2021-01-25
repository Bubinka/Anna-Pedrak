package com.example.luasforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        textView = findViewById( R.id.textView );
        textView.setText( "Given I am LUAS passenger\nWhen I open the app from 00:00-12:00\nThen I should see trams forecast from Marlborough LUAS stop towards Outbound" );

        textView2 = findViewById( R.id.textView2 );
        textView2.setText( "Given I am a LUAS passenger\nWhen I open the app from 12:01-23:59\nThen I should see trams forecast from Stillorgan LUAS stop towards Inbound" );

        textView3 = findViewById( R.id.textView3 );
        textView3.setText( "Given I am on the stop forecast info screen\nWhen I tap on the refresh button\nThen the forecast data should be updated" );


    }//end method onCreate
}//end MainActivity class
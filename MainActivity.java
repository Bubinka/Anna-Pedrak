package com.example.dreamtecsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnwebaddress).setOnClickListener(this);
        findViewById(R.id.btnmap).setOnClickListener(this);
        findViewById(R.id.btnphonenumber).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Uri uri = null;
        Intent intent = null;

        switch(view.getId()) {

            case R.id.btnwebaddress:
                uri = Uri.parse("https://dreamtecsystems.com");
                intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

                break;

            case R.id.btnmap:

                uri = Uri.parse("geo:53.318695,-6.438411?q= dreamtecSystems");
                intent = new Intent(Intent.ACTION_VIEW,uri);
              /*  intent.setClassName("com.google.android.apps.map","com.google.maps.MapsActivity");

               */
              intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);

                break;

            case R.id.btnphonenumber:

             /*   String latitude;
                String strUri ="http://maps.google.com/maps?q=loc:" + latitude +"," + longitude + "(" +
                        DreamTechSystem + ")";*/

                uri = Uri.parse("tel:00353 12570400");
                intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);

                break;
            default:

                Log.i(getClass().getName(),"Cannot resolve button click");

        }

    }
}//end class MainActivity
package com.example.eventhandling;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    @Override

    protected void onCreate(@Nullable  Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override

    public void onClick(View view) {

        switch(view.getId()){

            case R.id.button1:
                show("Button One");
                break;

            case R.id.button2:
                show("Button Two");
                break;

            case R.id.button3:
                show("Button Three");
                break;
            default:
                show("This should not happen!");

        }
    }//

    void show(String message) {

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.i(getClass().getName(),message);
    }
}

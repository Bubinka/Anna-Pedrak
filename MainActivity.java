package com.example.eventhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonHandler buttonHandler = new ButtonHandler();

        findViewById(R.id.button1).setOnClickListener(buttonHandler);
        findViewById(R.id.button2).setOnClickListener(buttonHandler);
        findViewById(R.id.button3).setOnClickListener(buttonHandler);
    }//

    private class ButtonHandler implements View.OnClickListener {

        @Override

        public void onClick(View view) {


            switch(view.getId()) {

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
        }
    }//

    void show(String messagr) {

        String message = new String();
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
        Log.i(getClass().getName(),message);
    }
}

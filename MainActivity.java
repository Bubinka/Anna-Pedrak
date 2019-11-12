package com.example.gcf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText fno;
    private EditText sno;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fno = (EditText)findViewById(R.id.firstno);
        sno = (EditText)findViewById(R.id.secondno);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
    }//

    @Override

    protected void onStart(){

        super.onStart();
        fno.setText("");
        sno.setText("");
    }//

    public void onClick(View view){

        boolean a = TextUtils.isEmpty(fno.getText());
        boolean b = TextUtils.isEmpty(sno.getText());

        if(!a & !b) {

            int firstnumber = Integer.parseInt(fno.getText().toString());
            int secondnumber = Integer.parseInt(sno.getText().toString());

            Intent intent = new Intent(this,CalculateActivity.class);

            Bundle bundle = new Bundle();

            bundle.putInt("fno", firstnumber);
            bundle.putInt("sno", secondnumber);
            intent.putExtra("gcfdata",bundle);
            startActivity(intent);

        }
    }
}

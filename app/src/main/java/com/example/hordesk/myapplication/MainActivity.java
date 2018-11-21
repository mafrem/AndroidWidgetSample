package com.example.hordesk.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        final Button button = (Button) findViewById(R.id.button_card_list);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(v);
            }
        });

    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, CardActivity.class);
        intent.putExtra(EXTRA_MESSAGE, "lauch card");
        startActivity(intent);

    }



    public void onClickBtn(View v){
        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
    }



}

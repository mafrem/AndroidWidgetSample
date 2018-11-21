package com.example.hordesk.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hordesk.myapplication.Cards.CardActivity;
import com.example.hordesk.myapplication.Drawer.DrawerActivity;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        final Button buttonCardList = (Button) findViewById(R.id.button_card_list);
        buttonCardList.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(v, CardActivity.class);
            }
        });


        final Button buttonDrawer = (Button) findViewById(R.id.button_drawer);
        buttonDrawer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(v, DrawerActivity.class);
            }
        });

    }


    public void sendMessage(View view, Class classe) {
        Intent intent = new Intent(this, classe);
        intent.putExtra(EXTRA_MESSAGE, "Valeur recuperable de l'autre cote");
        startActivity(intent);
        //this.finish();

    }



    public void onClickBtn(View v){
        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
    }



}

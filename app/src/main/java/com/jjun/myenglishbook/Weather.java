package com.jjun.myenglishbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class Weather extends AppCompatActivity {
    private Toolbar toolbarWeatherList;
    private ListView listViewMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weathers);

        toolbarWeatherList = findViewById(R.id.toolbar_weathers);
        listViewMain = findViewById(R.id.list_view_weathers);

        setSupportActionBar(toolbarWeatherList);
        getSupportActionBar().setTitle("날씨 (Weather)");


        ArrayList<String> data = new ArrayList<>();
        data.add("화창한");
        data.add("바람");
        data.add("구름");
        data.add("번개");
        data.add("비");
        data.add("눈");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                Weather.this, android.R.layout.simple_list_item_1, data);


        listViewMain.setAdapter(adapter);

        listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(Weather.this, Weather1.class);
                    intent.putExtra("1", data.get(0));
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(Weather.this, Weather2.class);
                    intent.putExtra("2", data.get(1));
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(Weather.this, Weather3.class);
                    intent.putExtra("3", data.get(2));
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Weather.this, Weather4.class);
                    intent.putExtra("4", data.get(3));
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(Weather.this, Weather5.class);
                    intent.putExtra("5", data.get(4));
                    startActivity(intent);
                }
                else if (i==5){
                    Intent intent = new Intent(Weather.this, Weather6.class);
                    intent.putExtra("6", data.get(5));
                    startActivity(intent);
                }




            }

        });





    }


}


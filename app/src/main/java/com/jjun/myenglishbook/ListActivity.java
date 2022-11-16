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

public class ListActivity extends AppCompatActivity {

    private Toolbar toolbarMainList;
    private ListView listViewMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_main);

        toolbarMainList = findViewById(R.id.toolbar_main);
        listViewMain = findViewById(R.id.list_view_main);

        setSupportActionBar(toolbarMainList);
        getSupportActionBar().setTitle("목차 (Chapters)");


        ArrayList<String> data = new ArrayList<>();
        data.add("과일 (Fruits)");
        data.add("동물 (Animals)");
        data.add("색 (Colors)");
        data.add("날씨 (Whether)");
        data.add("교통 (Transportation)");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                ListActivity.this, android.R.layout.simple_list_item_1, data);


        listViewMain.setAdapter(adapter);

        listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(ListActivity.this, Fruits.class);
                    intent.putExtra("Fruits", data.get(0));
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(ListActivity.this, Animals.class);
                    intent.putExtra("Animals", data.get(1));
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(ListActivity.this, Colors.class);
                    intent.putExtra("Colors", data.get(2));
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(ListActivity.this, Weather.class);
                    intent.putExtra("Weather", data.get(3));
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(ListActivity.this, Transportations.class);
                    intent.putExtra("Transportations", data.get(4));
                    startActivity(intent);
                }
//                else if (i==5){
//                    Intent intent = new Intent(ListActivity.this, Animals.class);
//                    intent.putExtra("coco", data.get(1));
//                    startActivity(intent);
//                }




            }

        });





    }

    




}

package com.jjun.myenglishbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class Fruits extends AppCompatActivity {
    private Toolbar toolbarFruitsList;
    private ListView listViewMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruits);

        toolbarFruitsList = findViewById(R.id.toolbar_fruits);
        listViewMain = findViewById(R.id.list_view_fruits);

        setSupportActionBar(toolbarFruitsList);
        getSupportActionBar().setTitle("과일 (Fruits)");


        ArrayList<String> data = new ArrayList<>();
        data.add("사과");
        data.add("딸기");
        data.add("바나나");
        data.add("복숭아");
        data.add("포도");
        data.add("수박");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                Fruits.this, android.R.layout.simple_list_item_1, data);


        listViewMain.setAdapter(adapter);

        listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(Fruits.this, FruitsApple.class);
                    intent.putExtra("apple", data.get(0));
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(Fruits.this, FruitsBerry.class);
                    intent.putExtra("berry", data.get(1));
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(Fruits.this, FruitsBanana.class);
                    intent.putExtra("banana", data.get(2));
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Fruits.this, FruitsPeach.class);
                    intent.putExtra("peach", data.get(3));
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(Fruits.this, FruitsGrape.class);
                    intent.putExtra("grape", data.get(4));
                    startActivity(intent);
                }
                else if (i==5){
                    Intent intent = new Intent(Fruits.this, FruitsWatermelon.class);
                    intent.putExtra("watermelon", data.get(5));
                    startActivity(intent);
                }




            }

        });





    }


}


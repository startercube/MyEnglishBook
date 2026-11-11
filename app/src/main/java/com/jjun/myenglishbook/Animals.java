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

public class Animals extends AppCompatActivity {
    private Toolbar toolbarAnimalsList;
    private ListView listViewMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals);

        toolbarAnimalsList = findViewById(R.id.toolbar_animals);
        listViewMain = findViewById(R.id.list_view_animals);

        setSupportActionBar(toolbarAnimalsList);
        getSupportActionBar().setTitle("동물 (Animals)");


        ArrayList<String> data = new ArrayList<>();
        data.add("돼지");
        data.add("닭");
        data.add("토끼");
        data.add("양");
        data.add("오리");
        data.add("카멜레온");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                Animals.this, android.R.layout.simple_list_item_1, data);


        listViewMain.setAdapter(adapter);

        listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(Animals.this, Animals1.class);
                    intent.putExtra("돼지", data.get(0));
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(Animals.this, Animals3.class);
                    intent.putExtra("토끼", data.get(1));
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(Animals.this, Animals2.class);
                    intent.putExtra("닭", data.get(2));
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Animals.this, Animals4.class);
                    intent.putExtra("양", data.get(3));
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(Animals.this, Animals5.class);
                    intent.putExtra("오리", data.get(4));
                    startActivity(intent);
                }
                else if (i==5){
                    Intent intent = new Intent(Animals.this, Animals6.class);
                    intent.putExtra("카멜레온", data.get(5));
                    startActivity(intent);
                }




            }

        });





    }


}


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

public class Transportations extends AppCompatActivity {
    private Toolbar toolbarTransportationsList;
    private ListView listViewMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transportations);

        toolbarTransportationsList = findViewById(R.id.toolbar_transportations);
        listViewMain = findViewById(R.id.list_view_transportations);

        setSupportActionBar(toolbarTransportationsList);
        getSupportActionBar().setTitle("교통수단 (Transportation)");


        ArrayList<String> data = new ArrayList<>();
        data.add("자동차");
        data.add("트럭");
        data.add("기차");
        data.add("구급차");
        data.add("배");
        data.add("비행기");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                Transportations.this, android.R.layout.simple_list_item_1, data);


        listViewMain.setAdapter(adapter);

        listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(Transportations.this, Transportations1.class);
                    intent.putExtra("car", data.get(0));
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(Transportations.this, Transportations2.class);
                    intent.putExtra("truck", data.get(1));
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(Transportations.this, Transportations3.class);
                    intent.putExtra("train", data.get(2));
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Transportations.this, Transportations4.class);
                    intent.putExtra("amb", data.get(3));
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(Transportations.this, Transportations5.class);
                    intent.putExtra("ship", data.get(4));
                    startActivity(intent);
                }
                else if (i==5){
                    Intent intent = new Intent(Transportations.this, Transportations6.class);
                    intent.putExtra("air", data.get(5));
                    startActivity(intent);
                }




            }

        });





    }


}


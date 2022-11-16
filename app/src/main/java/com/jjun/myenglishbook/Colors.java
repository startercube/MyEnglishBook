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

public class Colors extends AppCompatActivity {
    private Toolbar toolbarColorsList;
    private ListView listViewMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);

        toolbarColorsList = findViewById(R.id.toolbar_colors);
        listViewMain = findViewById(R.id.list_view_colors);

        setSupportActionBar(toolbarColorsList);
        getSupportActionBar().setTitle("색 (Colors)");


        ArrayList<String> data = new ArrayList<>();
        data.add("빨강");
        data.add("주황");
        data.add("노랑");
        data.add("초록");
        data.add("파랑");
        data.add("감청");
        data.add("보라");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                Colors.this, android.R.layout.simple_list_item_1, data);


        listViewMain.setAdapter(adapter);

        listViewMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(Colors.this, Colors1.class);
                    intent.putExtra("빨강", data.get(0));
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent = new Intent(Colors.this, Colors2.class);
                    intent.putExtra("주황", data.get(1));
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent = new Intent(Colors.this, Colors3.class);
                    intent.putExtra("노랑", data.get(2));
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Colors.this, Colors4.class);
                    intent.putExtra("초록", data.get(3));
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(Colors.this, Colors5.class);
                    intent.putExtra("파랑", data.get(4));
                    startActivity(intent);
                }
                else if (i==5){
                    Intent intent = new Intent(Colors.this, Colors6.class);
                    intent.putExtra("감청", data.get(5));
                    startActivity(intent);
                }
                else if (i==6){
                    Intent intent = new Intent(Colors.this, Colors7.class);
                    intent.putExtra("보라", data.get(6));
                    startActivity(intent);
                }




            }

        });





    }


}


package com.jjun.myenglishbook;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.speech.tts.TextToSpeech;
//import android.support.v7.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import java.util.Locale;

import static android.speech.tts.TextToSpeech.ERROR;

public class Animals1 extends AppCompatActivity {
    private Intent intent;
    private Toolbar toolbarA;
    private TextView pig;

    private TextToSpeech tts;              // TTS 변수 선언
    private EditText editText;
    private Button button01;



    public Animals1() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals_1);
        toolbarA = findViewById(R.id.toolbar_animals);
        pig = findViewById(R.id.animal1);

        setSupportActionBar(toolbarA);
        getSupportActionBar().setTitle("동물 (Animals)");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        intent = getIntent();
        intent.getStringExtra("돼지");


        editText = (EditText) findViewById(R.id.editText);
        button01 = (Button) findViewById(R.id.button01);




        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {

                    tts.setLanguage(Locale.US);
                }
            }
        });
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tts.setSpeechRate(0.8f);
                tts.speak(editText.getText().toString(),TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(tts != null){
            tts.stop();
            tts.shutdown();
            tts = null;
        }
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
